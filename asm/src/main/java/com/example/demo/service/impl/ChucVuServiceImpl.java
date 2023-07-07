package com.example.demo.service.impl;

import com.example.demo.entity.ChucVu;
import com.example.demo.repository.ChucVuRepository;
import com.example.demo.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    private ChucVuRepository chucVuRepository;

    @Override
    public List<ChucVu> getAll() {
        return chucVuRepository.findAll();
    }

    @Override
    public void addCV(ChucVu cv) {
        chucVuRepository.save(cv);
    }

    @Override
    public ChucVu detail(UUID id) {
        return chucVuRepository.findById(id).orElse(null);
    }

    @Override
    public void update(ChucVu cv) {
        chucVuRepository.save(cv);
    }

    @Override
    public void delete(UUID id) {
        chucVuRepository.deleteById(id);
    }

    @Override
    public Page<ChucVu> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return chucVuRepository.findAll(pageable);
    }
}
