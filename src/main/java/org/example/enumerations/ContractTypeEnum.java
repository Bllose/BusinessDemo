package org.example.enumerations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ContractTypeEnum {
    GRB_V1("GRB", "v1", "合同A类型版本1_20230101"),
    GRB_V2("GRB", "v2", "合同A类型版本2_20230504"),
    GXB_V1("GXB", "v1", "合同B类型_20240102");

    String code;
    String version;
    String name;
}
