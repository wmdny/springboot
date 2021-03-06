package com.vuedemo.service.system.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vuedemo.core.model.PageData;
import com.vuedemo.core.model.PageWrap;
import com.vuedemo.dao.system.SystemDictDataMapper;
import com.vuedemo.dao.system.dto.QuerySystemDictDataDTO;
import com.vuedemo.dao.system.model.SystemDictData;
import com.vuedemo.dao.system.vo.SystemDictDataListVO;
import com.vuedemo.service.system.SystemDictDataService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 字典数据Service实现
 * @author Eva.Caesar Liu
 * @date 2022/05/09 11:26
 */
@Service
public class SystemDictDataServiceImpl implements SystemDictDataService {

    @Autowired
    private SystemDictDataMapper systemDictDataMapper;

    @Override
    public Integer create(SystemDictData systemDictData) {
        systemDictDataMapper.insert(systemDictData);
        return systemDictData.getId();
    }

    @Override
    public void deleteById(Integer id) {
        SystemDictData systemDictData = new SystemDictData();
        systemDictData.setId(id);
        systemDictData.setDeleted(Boolean.TRUE);
        this.updateById(systemDictData);
    }

    @Override
    @Transactional
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (Integer id : ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(SystemDictData systemDictData) {
        systemDictDataMapper.updateById(systemDictData);
    }

    @Override
    @Transactional
    public void updateByIdInBatch(List<SystemDictData> systemDictDatas) {
        if (CollectionUtils.isEmpty(systemDictDatas)) return;
        for (SystemDictData systemDictData: systemDictDatas) {
            this.updateById(systemDictData);
        }
    }

    @Override
    public SystemDictData findById(Integer id) {
        return systemDictDataMapper.selectById(id);
    }

    @Override
    public SystemDictData findOne(SystemDictData systemDictData) {
        Wrapper<SystemDictData> wrapper = new QueryWrapper<>(systemDictData);
        return systemDictDataMapper.selectOne(wrapper);
    }

    @Override
    public List<SystemDictData> findList(SystemDictData systemDictData) {
        Wrapper<SystemDictData> wrapper = new QueryWrapper<>(systemDictData);
        return systemDictDataMapper.selectList(wrapper);
    }
  
    @Override
    public PageData<SystemDictDataListVO> findPage(PageWrap<QuerySystemDictDataDTO> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());
        return PageData.from(new PageInfo<>(systemDictDataMapper.selectManageList(pageWrap.getModel())));
    }

    @Override
    public long count(SystemDictData systemDictData) {
        Wrapper<SystemDictData> wrapper = new QueryWrapper<>(systemDictData);
        return systemDictDataMapper.selectCount(wrapper);
    }
}
