package com.example.demo.service.impl;

import com.example.demo.entity.KhachHang;
import com.example.demo.repository.KhachHangRepository;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void addKH(KhachHang kh) {
        khachHangRepository.save(kh);
    }

    @Override
    public KhachHang detail(UUID id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void update(KhachHang kh) {
        khachHangRepository.save(kh);
    }

    @Override
    public void delete(UUID id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public Page<KhachHang> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return khachHangRepository.findAll(pageable);
    }
}
