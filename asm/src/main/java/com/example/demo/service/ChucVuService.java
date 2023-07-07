package com.example.demo.service;

import com.example.demo.entity.ChucVu;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface ChucVuService {
    List<ChucVu> getAll();
    void addCV(ChucVu cv);
    ChucVu detail(UUID id);
    void update(ChucVu cv);
    void delete(UUID id);
    Page<ChucVu> findPage(Integer pageNo,Integer pageSize);
}
