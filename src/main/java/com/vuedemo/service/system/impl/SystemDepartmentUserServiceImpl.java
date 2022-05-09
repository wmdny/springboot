package com.vuedemo.service.system.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.vuedemo.dao.system.SystemDepartmentUserMapper;
import com.vuedemo.dao.system.model.SystemDepartmentUser;
import com.vuedemo.service.system.SystemDepartmentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 部门用户Service实现
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Service
public class SystemDepartmentUserServiceImpl implements SystemDepartmentUserService {

    @Autowired
    private SystemDepartmentUserMapper systemDepartmentUserMapper;

    @Override
    public Integer create(SystemDepartmentUser systemDepartmentUser) {
        systemDepartmentUserMapper.insert(systemDepartmentUser);
        return systemDepartmentUser.getId();
    }

    @Override
    public void deleteById(Integer id) {
        SystemDepartmentUser systemDepartmentUser = new SystemDepartmentUser();
        systemDepartmentUser.setId(id);
        systemDepartmentUser.setDeleted(Boolean.TRUE);
        systemDepartmentUserMapper.updateById(systemDepartmentUser);
    }

    @Override
    public void delete(SystemDepartmentUser dto) {
        SystemDepartmentUser newDepartmentUser = new SystemDepartmentUser();
        newDepartmentUser.setDeleted(Boolean.TRUE);
        UpdateWrapper<SystemDepartmentUser> updateWrapper = new UpdateWrapper<>(dto);
        systemDepartmentUserMapper.update(newDepartmentUser, updateWrapper);
    }

    @Override
    @Transactional
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (Integer id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(SystemDepartmentUser systemDepartmentUser) {
        systemDepartmentUserMapper.updateById(systemDepartmentUser);
    }

    @Override
    @Transactional
    public void updateByIdInBatch(List<SystemDepartmentUser> systemDepartmentUsers) {
        if (CollectionUtils.isEmpty(systemDepartmentUsers)) return;
        for (SystemDepartmentUser systemDepartmentUser: systemDepartmentUsers) {
            this.updateById(systemDepartmentUser);
        }
    }

    @Override
    public SystemDepartmentUser findById(Integer id) {
        return systemDepartmentUserMapper.selectById(id);
    }

    @Override
    public SystemDepartmentUser findOne(SystemDepartmentUser systemDepartmentUser) {
        Wrapper<SystemDepartmentUser> wrapper = new QueryWrapper<>(systemDepartmentUser);
        return systemDepartmentUserMapper.selectOne(wrapper);
    }

    @Override
    public List<SystemDepartmentUser> findList(SystemDepartmentUser systemDepartmentUser) {
        Wrapper<SystemDepartmentUser> wrapper = new QueryWrapper<>(systemDepartmentUser);
        return systemDepartmentUserMapper.selectList(wrapper);
    }

    @Override
    public long count(SystemDepartmentUser systemDepartmentUser) {
        Wrapper<SystemDepartmentUser> wrapper = new QueryWrapper<>(systemDepartmentUser);
        return systemDepartmentUserMapper.selectCount(wrapper);
    }
}
