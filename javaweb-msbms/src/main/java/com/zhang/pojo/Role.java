package com.zhang.pojo;

import lombok.Data;

@Data
public class Role {
    private Integer id;
    private String roleCode;
    private String roleName;
    private Integer createdBy;
    private Data creationDate;
    private Integer modifyBy;
    private Data modifyDate;
}
