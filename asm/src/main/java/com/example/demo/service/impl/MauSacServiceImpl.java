package com.example.demo.service.impl;

import com.example.demo.entity.MauSac;
import com.example.demo.repository.MauSacRepository;
import com.example.demo.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MauSacServiceImpl implements MauSacService {
    @Autowired
    private MauSacRepository mauSacRepository;

    @Override
    public List<MauSac> getAll() {
        return mauSacRepository.findAll();
    }

    @Override
    public void addMS(MauSac ms) {
        mauSacRepository.save(ms);
    }

    @Override
    public MauSac detail(UUID id) {
        return mauSacRepository.findById(id).orElse(null);
    }

    @Override
    public void update(MauSac ms) {
        mauSacRepository.save(ms);
    }

    @Override
    public void delete(UUID id) {
        mauSacRepository.deleteById(id);
    }

    @Override
    public Page<MauSac> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return mauSacRepository.findAll(pageable);
    }
}
