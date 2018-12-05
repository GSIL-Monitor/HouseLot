package com.github.zhuozi.houselot.service.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Email: zhuozi@meili-inc.com
 * Datetime: 2018-12-05 22:02
 */
@Getter
@Setter
@ToString
public class IntentionEntity {

    private Long id;

    /**
     * 楼盘名称
     */
    private Long housingId;

    /**
     * 购房ID
     */
    private String buyerId;

    /**
     * 申请编号
     */
    private String applyId;

    /**
     * 选房顺序
     */
    private String orderId;

    /**
     * 创建时间
     */
    private Integer created;
}
