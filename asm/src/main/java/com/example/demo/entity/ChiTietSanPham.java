package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ChiTietSP")
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @ManyToOne()
    @JoinColumn(name = "IdSP", referencedColumnName = "Id")
    private SanPham sanPham;

    @ManyToOne()
    @JoinColumn(name = "IdNsx", referencedColumnName = "Id")
    private NhaSanXuat nsx;

    @ManyToOne()
    @JoinColumn(name = "IdMauSac", referencedColumnName = "Id")
    private MauSac mauSac;

    @ManyToOne()
    @JoinColumn(name = "IdDongSP", referencedColumnName = "Id")
    private DongSanPham dongSP;

    @Column(name = "NamBH")
    private Integer namBH;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "GiaNhap")
    private Float giaNhap;

    @Column(name = "GiaBan")
    private Float giaBan;
}
