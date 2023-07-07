package com.example.demo.service;

import com.example.demo.entity.NhaSanXuat;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface NhaSanXuatService {
    Page<NhaSanXuat> findPage(Integer pageNo, Integer pageSize);
    List<NhaSanXuat> getAll();
    void addNSX(NhaSanXuat nsx);
    NhaSanXuat detail(UUID id);
    void update(NhaSanXuat nsx);
    void delete(UUID id);
}
