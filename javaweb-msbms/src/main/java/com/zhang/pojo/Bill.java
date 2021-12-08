package com.zhang.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Bill {
    private String productName;
    private String productDesc;
    private String productUnit;  //商品单位
    private BigDecimal productCount;
    private BigDecimal totalPrice;
    private Integer isPayment;   //是否支付
    private Integer providerId;  //供应商Id
    private Integer createdBy;   //创建者
    private Data creationDate;  //创建时间
    private Integer modifyBy;   //更新者
    private Data modifyDate;  //更新时间
    private String providerName;  //供应商名称
}
