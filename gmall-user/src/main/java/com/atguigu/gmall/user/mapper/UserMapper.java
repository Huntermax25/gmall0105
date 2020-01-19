package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: Huntermax Lc
 * @Date: 2020/1/18
 * @Description: com.atguigu.gmall.user.mapper
 * @version: 1.0
 */
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
}
