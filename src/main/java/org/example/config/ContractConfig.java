package org.example.config;

import org.example.enumerations.ContractTypeEnum;

import java.util.Map;

/**
 * 合同创建配置入口
 */
public interface ContractConfig {

    /**
     * 校验当前合同配置所属合同类型、版本
     *
     * @param type
     * @return
     */
    Boolean supported(ContractTypeEnum type);


    /**
     * 创建签约模版
     *
     * @return
     */
    Object buildTemplate(Object param);


    /**
     * 创建签约人账户
     *
     * @param param
     * @return
     */
    Object createPersonAccount(Object param);


    /**
     * 收集合同签约要素
     *
     * @param param
     * @return
     */
    Map<String, Object> filledElements(Object param);
}
