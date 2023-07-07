package com.example.demo.service;

import com.example.demo.entity.ChiTietSanPham;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface ChiTietSanPhamService {
    List<ChiTietSanPham> getAll();
    void addCTSP(ChiTietSanPham chiTietSanPham);
    void update(ChiTietSanPham chiTietSanPham);
    void delete(UUID id);
    ChiTietSanPham detail(UUID id);
    Page<ChiTietSanPham> findPage(Integer pageNo, Integer pageSize);
}
