package com.example.demo.service.impl;

import com.example.demo.entity.DongSanPham;
import com.example.demo.repository.DongSanPhamRepository;
import com.example.demo.service.DongSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DongSanPhamServiceImpl implements DongSanPhamService {
    @Autowired
    private DongSanPhamRepository dongSPRepository;

    @Override
    public List<DongSanPham> getAll() {
        return dongSPRepository.findAll();
    }

    @Override
    public void addDSP(DongSanPham dsp) {
        dongSPRepository.save(dsp);
    }

    @Override
    public DongSanPham detail(UUID id) {
        return dongSPRepository.findById(id).orElse(null);
    }

    @Override
    public void update(DongSanPham dsp) {
        dongSPRepository.save(dsp);
    }

    @Override
    public void delete(UUID id) {
        dongSPRepository.deleteById(id);
    }

    @Override
    public Page<DongSanPham> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return dongSPRepository.findAll(pageable);
    }
}
