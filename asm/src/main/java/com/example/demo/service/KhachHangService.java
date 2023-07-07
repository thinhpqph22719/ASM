package com.example.demo.service;

import com.example.demo.entity.KhachHang;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface KhachHangService {
    List<KhachHang> getAll();
    void addKH(KhachHang kh);
    KhachHang detail(UUID id);
    void update(KhachHang kh);
    void delete(UUID id);
    Page<KhachHang> findPage(Integer pageNo , Integer pageSize);
}
