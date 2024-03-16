package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 排序参数
 */
@Data
public class ShortLinkGroupSortReqDTO {
    //分组ID
    private String gid;
    // 排序
    private Integer sortOrder;
}
