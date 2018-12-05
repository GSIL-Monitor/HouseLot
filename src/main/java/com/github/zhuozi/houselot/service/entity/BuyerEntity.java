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
public class BuyerEntity {

    private Long id;

    /**
     * 身份证号
     */
    private String citizenId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 来源，用HousingId
     */
    private Long housingId;

    /**
     * 是否有房
     */
    private Integer owned;

    /**
     * 创建时间
     */
    private Integer created;
}
