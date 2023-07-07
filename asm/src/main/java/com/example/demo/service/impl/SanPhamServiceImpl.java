package com.example.demo.service.impl;

import com.example.demo.entity.SanPham;
import com.example.demo.repository.SanPhamRepository;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void addSP(SanPham sp) {
        sanPhamRepository.save(sp);
    }

    @Override
    public SanPham detail(UUID id) {
        return sanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public void update(SanPham sp) {
        sanPhamRepository.save(sp);
    }

    @Override
    public void delete(UUID id) {
        sanPhamRepository.deleteById(id);
    }

    @Override
    public Page<SanPham> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return sanPhamRepository.findAll(pageable);
    }
}
