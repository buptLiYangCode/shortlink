package com.nageoffer.shortlink.project.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 短链接响应对象
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShortLinkCreateRespDTO {
    /**
     * 分组信息
     */
    private String gid;

    /**
     * 原始连接
     */
    private String originUrl;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

}