package org.example.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChannelEnum {
    EQB_H5(3, "e签宝", "e签宝通过H5页面进行签约"),
    SSQ_H5(4, "上上签", "上上签通过H5页面进行签约");

    Integer code;
    String type;
    String describe;
}
