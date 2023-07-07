package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ChucVu")
public class ChucVu {
    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotEmpty(message = "Không được bỏ trống")
    @Column(name = "Ma")
    private String ma;
    @NotEmpty(message = "Không được bỏ trống")
    @Column(name = "Ten")
    private String ten;

    @OneToMany(
            mappedBy = "chucVu",
            fetch = FetchType.LAZY
    )
    private List<NhanVien> listNv;
}
