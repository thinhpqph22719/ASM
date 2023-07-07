package com.example.demo.service;

import com.example.demo.entity.DongSanPham;
import org.springframework.data.domain.Page;


import java.util.List;
import java.util.UUID;

public interface DongSanPhamService {
    List<DongSanPham> getAll();
    void addDSP(DongSanPham dsp);
    DongSanPham detail(UUID id);
    void update(DongSanPham dsp);
    void delete(UUID id);
    Page<DongSanPham> findPage(Integer pageNo,Integer pageSize);
}
