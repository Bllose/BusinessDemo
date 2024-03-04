package org.example.service.channels;

import lombok.extern.slf4j.Slf4j;
import org.example.beans.*;
import org.example.enumerations.ChannelEnum;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Slf4j
public class EqbSignTask implements UnifySignTask{
    @Override
    public Boolean isTheSupportedChannelType(Integer channel) {
        return Objects.equals(channel, ChannelEnum.EQB_H5.getCode());
    }

    @Override
    public SignTaskDto creatTask(SignTaskReq req) {
        return null;
    }

    @Override
    public SignFlowDto getContract(SignFlowReq req) {
        return null;
    }

    @Override
    public SignContractChangeDto getChangeInfo(SignFlowReq req) {
        return null;
    }
}
