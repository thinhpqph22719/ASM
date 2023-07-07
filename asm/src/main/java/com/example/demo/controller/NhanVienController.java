package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.NhanVien;
import com.example.demo.service.ChucVuService;
import com.example.demo.service.CuaHangService;
import com.example.demo.service.NhanVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;
@Controller
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private ChucVuService chucVuService;
    @Autowired
    private CuaHangService cuaHangService;
    @GetMapping("/nhan-vien/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo, Model model){
        Page<NhanVien> page = nhanVienService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("view","/WEB-INF/view/NhanVien/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/nhan-vien/view-add")
    public String viewadd(@ModelAttribute("nv") NhanVien nv,Model model){
        model.addAttribute("dsChucVu",chucVuService.getAll());
        model.addAttribute("dsCuaHang",cuaHangService.getAll());
        return "/NhanVien/add";
    }
    @PostMapping("/nhan-vien/add")
    public String add(@Valid @ModelAttribute("nv") NhanVien nv, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/NhanVien/add";
        }
        model.addAttribute("dsChucVu",chucVuService.getAll());
        model.addAttribute("dsCuaHang",cuaHangService.getAll());
        nhanVienService.addNV(nv);
        return "redirect:/nhan-vien/hien-thi";
    }
    @GetMapping("/nhan-vien/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        nhanVienService.delete(id);
        return "redirect:/nhan-vien/hien-thi";
    }
    @GetMapping("/nhan-vien/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        NhanVien nv = nhanVienService.detail(id);
        model.addAttribute("dsChucVu",chucVuService.getAll());
        model.addAttribute("dsCuaHang",cuaHangService.getAll());
        model.addAttribute("nv",nv);
        return "/NhanVien/detail";
    }
    @GetMapping("/nhan-vien/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        NhanVien nv = nhanVienService.detail(id);
        model.addAttribute("dsChucVu",chucVuService.getAll());
        model.addAttribute("dsCuaHang",cuaHangService.getAll());
        model.addAttribute("nv",nv);
        return "/NhanVien/update";
    }
    @PostMapping("/nhan-vien/update/{id}")
    public String update(@ModelAttribute("nv") NhanVien nv, Model model){
        model.addAttribute("dsChucVu",chucVuService.getAll());
        model.addAttribute("dsCuaHang",cuaHangService.getAll());
        nhanVienService.update(nv);
        return "redirect:/nhan-vien/hien-thi";
    }
}
