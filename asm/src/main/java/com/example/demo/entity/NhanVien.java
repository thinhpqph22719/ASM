package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "Ma")
    private String ma;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "Ho")
    private String ho;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "TenDem")
    private String tenDem;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "Ten")
    private String ten;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;

    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "DiaChi")
    private String diaChi;
    @NotEmpty(message = "Không được bỏ trống")
    @Column(name = "Sdt")
    private String sdt;
    @NotEmpty(message = "Không được bỏ trống")

    @Column(name = "MatKhau")
    private String matKhau;

    @Column(name = "TrangThai")
    private Integer trangThai;

    @ManyToOne()
    @JoinColumn(
            name = "IdCV",
            referencedColumnName = "Id"
    )
    private ChucVu chucVu;

    @ManyToOne()
    @JoinColumn(
            name = "IdCH",
            referencedColumnName = "Id"
    )
    private CuaHang cuaHang;
}
