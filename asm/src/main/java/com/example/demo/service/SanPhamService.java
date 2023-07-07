package com.example.demo.service;


import com.example.demo.entity.SanPham;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAll();
    void addSP(SanPham sp);
    SanPham detail(UUID id);
    void update(SanPham sp);
    void delete(UUID id);
    Page<SanPham> findPage(Integer pageNo, Integer pageSize);
}
