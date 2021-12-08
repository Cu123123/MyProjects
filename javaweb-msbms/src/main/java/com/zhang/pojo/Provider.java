package com.zhang.pojo;

import lombok.Data;
@Data
public class Provider {
    private Integer id;
    private String proCode;  //供应商编码
    private String proName;
    private String proDesc;
    private String proContact;  //供应商联系人
    private String proPhone;
    private String proAddress;
    private String proFax; //供应商传真
    private Integer createdBy;  //创建者
    private Data creationDate;  //创建时间
    private Integer modifyBy;  //更新者
    private Data modifyDate;   //更新时间
}
