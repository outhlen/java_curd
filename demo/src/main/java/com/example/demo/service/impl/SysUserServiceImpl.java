package com.example.demo.service.impl;
import java.util.List;

import com.example.demo.dao.SysUserMapper;
import com.example.demo.model.SysUser;
import com.example.demo.service.SysUserService;
import com.example.demo.util.PageRequest;
import com.example.demo.util.PageResult;
import com.example.demo.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public Integer addUser(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public Integer deleteUserById(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateUser(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    @Override
    public SysUser findByUserId(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }
    
    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }
    
    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<SysUser> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysUser> sysMenus = sysUserMapper.selectPage();
        return new PageInfo<SysUser>(sysMenus);
    }
}