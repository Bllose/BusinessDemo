package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.beans.SignTaskDto;
import org.example.beans.SignTaskReq;
import org.example.enumerations.BusinessErrorEnum;
import org.example.errors.BusinessException;
import org.example.service.channels.UnifySignTask;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UnifyEntry {

    List<UnifySignTask> signTaskSupportedList;

    UnifyEntry(List<UnifySignTask> signTaskSupportedList) {
        this.signTaskSupportedList = signTaskSupportedList;
    }


    /**
     * 以渠道区分每一个签约路线，将不同的签约逻辑独立开来
     * 对于主要流程由外部控制的签约流程会非常方便
     * 正如{@link UnifySignTask}中描述的一样，如果我们仅仅是发起、查询等等简单操作，
     * 那么所有类型的签约任务都去实现这个方法， 调用不同主题，对返回结果做些许调整即可。
     * 及对不同渠道代码做了隔离，又对程序员清晰地描述了业务功能。
     *
     * 对于主要签约流程由我们自己的代码逻辑控制，就会导致很多相同的逻辑控制代码冗余出现。
     *
     *
     * @param req
     * @return
     * @throws BusinessException
     */
    public SignTaskDto createTask(SignTaskReq req) throws BusinessException {
        UnifySignTask curTask = signTaskSupportedList
                .stream()
                .filter(x -> x.isTheSupportedChannelType(req.getChannel()))
                .findFirst()
                .orElseThrow(() ->
                        new BusinessException(BusinessErrorEnum.CHANNEL_NOT_BE_SUPPORTED.getCode(),
                                              BusinessErrorEnum.CHANNEL_NOT_BE_SUPPORTED.getMsg()));

        return curTask.creatTask(req);
    }
}
