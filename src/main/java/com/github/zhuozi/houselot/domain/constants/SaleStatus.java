package com.github.zhuozi.houselot.domain.constants;

import lombok.Getter;

/**
 * Email: zhuozi@meili-inc.com
 * Datetime: 2018-12-06 12:17
 */
@Getter
public enum SaleStatus {

    REGISTER_FINISH(1, "登记结束"),

    LOT_FINISH(2, "摇号结束"),

    CHOICE_FINISH(3, "选房结束");

    private Integer value;

    private String desc;

    SaleStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
