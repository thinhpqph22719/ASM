package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "Ma")
    private String ma;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "Ten")
    private String ten;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "TenDem")
    private String tenDem;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "Ho")
    private String ho;
    @NotNull(message = "Không được bỏ trống")

    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @NotEmpty(message = "Tối đa 12 số")
    @Column(name = "Sdt")
    private String sdt;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "ThanhPho")
    private String thanhPho;

    @Column(name = "QuocGia")
    private String quocGia;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "MatKhau")
    private String matKhau;

}
