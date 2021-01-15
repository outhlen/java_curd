package com.example.demo.dao;

import com.example.demo.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    

    /**
     * 查询全部用户
     * @return
     */
    List<SysUser> selectAll();
    
    /**
     * 分页查询用户
     * @return
     */
    List<SysUser> selectPage();
}