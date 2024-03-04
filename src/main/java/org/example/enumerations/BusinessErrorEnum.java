package org.example.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BusinessErrorEnum {
    CHANNEL_NOT_BE_SUPPORTED("900001", "签约渠道不被支持");

    String code;
    String msg;
}
