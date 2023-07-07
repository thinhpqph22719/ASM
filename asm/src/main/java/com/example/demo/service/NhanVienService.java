package com.example.demo.service;

import com.example.demo.entity.NhanVien;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface NhanVienService {
    List<NhanVien> getAll();
    void addNV(NhanVien nv);
    void update(NhanVien nv);
    void delete(UUID id);
    NhanVien detail(UUID id);
    Page<NhanVien> findPage(Integer pageNo, Integer pageSize);
}
