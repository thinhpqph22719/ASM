package com.example.demo.service;

import com.example.demo.entity.MauSac;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface MauSacService {
    List<MauSac> getAll();
    void addMS(MauSac ms);
    MauSac detail(UUID id);
    void update(MauSac ms);
    void delete(UUID id);
    Page<MauSac> findPage(Integer pageNo,Integer pageSize);
}
