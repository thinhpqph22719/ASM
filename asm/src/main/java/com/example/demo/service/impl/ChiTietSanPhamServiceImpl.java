package com.example.demo.service.impl;

import com.example.demo.entity.ChiTietSanPham;
import com.example.demo.repository.ChiTietSanPhamRepository;
import com.example.demo.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepository;
    @Override
    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamRepository.findAll();
    }

    @Override
    public void addCTSP(ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public void update(ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public void delete(UUID id) {
        chiTietSanPhamRepository.deleteById(id);
    }

    @Override
    public ChiTietSanPham detail(UUID id) {
        return chiTietSanPhamRepository.findById(id).orElse(null);
    }

    @Override
    public Page<ChiTietSanPham> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return chiTietSanPhamRepository.findAll(pageable);
    }
}
