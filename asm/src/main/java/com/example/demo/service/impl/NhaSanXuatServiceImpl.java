package com.example.demo.service.impl;

import com.example.demo.entity.NhaSanXuat;
import com.example.demo.repository.NhaSanXuatRepository;
import com.example.demo.service.NhaSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NhaSanXuatServiceImpl implements NhaSanXuatService {
    @Autowired
    private NhaSanXuatRepository nsxRepository;

    @Override
    public Page<NhaSanXuat> findPage(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return nsxRepository.findAll(pageable);
    }

    @Override
    public List<NhaSanXuat> getAll() {
        return nsxRepository.findAll();
    }

    @Override
    public void addNSX(NhaSanXuat nsx) {
        nsxRepository.save(nsx);
    }

    @Override
    public NhaSanXuat detail(UUID id) {
        return nsxRepository.findById(id).orElse(null);
    }

    @Override
    public void update(NhaSanXuat nsx) {
        nsxRepository.save(nsx);
    }

    @Override
    public void delete(UUID id) {
        nsxRepository.deleteById(id);
    }
}
