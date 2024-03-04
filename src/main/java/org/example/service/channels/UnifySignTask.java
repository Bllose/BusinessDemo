package org.example.service.channels;

import org.example.beans.*;

/**
 * 没一个渠道作为一个独立的任务来执行
 */
public interface UnifySignTask {

    /**
     * 当前类是否是用于当前渠道的
     *
     * @param channel
     * @return
     */
    Boolean isTheSupportedChannelType(Integer channel);

    /**
     *  签约任务发起
     *
     * @param req
     * @return
     */
    SignTaskDto creatTask(SignTaskReq req);

    /**
     * 查询签约现状
     *
     * @param req
     * @return
     */
    SignFlowDto getContract(SignFlowReq req);

    /**
     * 查询合同变更情况
     *
     * @param req
     * @return
     */
    SignContractChangeDto getChangeInfo(SignFlowReq req);
}
