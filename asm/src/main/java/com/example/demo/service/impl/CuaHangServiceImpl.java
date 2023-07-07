package com.example.demo.service.impl;

import com.example.demo.entity.CuaHang;
import com.example.demo.repository.CuaHangRepository;
import com.example.demo.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class CuaHangServiceImpl implements CuaHangService {
    @Autowired
    private CuaHangRepository cuaHangRepository;
    @Override
    public List<CuaHang> getAll() {
        return cuaHangRepository.findAll();
    }

    @Override
    public void addCV(CuaHang ch) {
    cuaHangRepository.save(ch);
    }

    @Override
    public CuaHang detail(UUID id) {
        return cuaHangRepository.findById(id).orElse(null);
    }

    @Override
    public void update(CuaHang ch) {
    cuaHangRepository.save(ch);
    }

    @Override
    public void delete(UUID id) {
    cuaHangRepository.deleteById(id);
    }

    @Override
    public Page<CuaHang> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return cuaHangRepository.findAll(pageable);
    }
}
