package com.example.demo.service;


import com.example.demo.entity.CuaHang;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface CuaHangService {
    List<CuaHang> getAll();
    void addCV(CuaHang ch);
    CuaHang detail(UUID id);
    void update(CuaHang ch);
    void delete(UUID id);
    Page<CuaHang> findPage(Integer pageNo,Integer pageSize);
}
