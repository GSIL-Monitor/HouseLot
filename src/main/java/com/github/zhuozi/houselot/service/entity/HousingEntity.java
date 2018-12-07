package com.github.zhuozi.houselot.service.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Email: zhuozi@meili-inc.com
 * Datetime: 2018-12-05 20:57
 */
@Getter
@Setter
@ToString
public class HousingEntity {

    private Long id;

    /**
     * 所在的区
     */
    private String area;

    /**
     * 楼盘名称
     */
    private String name;

    /**
     * 集团名称
     */
    private String groupName;

    /**
     * 楼盘描述
     */
    private String description;

    /**
     * 售卖状态
     * @see com.github.zhuozi.houselot.domain.constants.SaleStatus
     */
    private Integer saleStatus;

    /**
     * 号码前缀
     */
    private String prefix;

    /**
     * 房源总数
     */
    private String total;

    /**
     * 创建时间
     */
    private Integer created;
}
