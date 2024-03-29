package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;
import com.nageoffer.shortlink.admin.dto.req.ShortLinkGroupSortReqDTO;
import com.nageoffer.shortlink.admin.dto.req.ShortLinkUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

public interface GroupService extends IService<GroupDO> {

    //新增短链接分组名
    void saveGroup(String groupName);

    List<ShortLinkGroupRespDTO> listGroup();
    /*
    修改短链接分组名
     */
    void updateGroup(ShortLinkUpdateReqDTO requestParam);
    /*
    删除短链接分组
     */
    void deleteGroup(String gid);

    /**
     * 短链接分组排序
     * @param requestParam 排序参数
     */
    void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam);

}
