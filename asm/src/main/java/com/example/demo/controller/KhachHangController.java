package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.KhachHang;

import com.example.demo.service.KhachHangService;
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
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/khach-hang/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo, Model model){
        Page<KhachHang> page = khachHangService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("view","/KhachHang/hienthi");
        model.addAttribute("view","/WEB-INF/view/KhachHang/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/khach-hang/view-add")
    public String viewadd(@ModelAttribute("kh") KhachHang kh){
        return "/KhachHang/add";
    }
    @PostMapping("/khach-hang/add")
    public String add(@Valid @ModelAttribute("kh") KhachHang kh, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/KhachHang/add";
        }
        khachHangService.addKH(kh);
        return "redirect:/khach-hang/hien-thi";
    }
    @GetMapping("/khach-hang/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        khachHangService.delete(id);
        return "redirect:/khach-hang/hien-thi";
    }
    @GetMapping("/khach-hang/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        KhachHang kh = khachHangService.detail(id);
        model.addAttribute("kh",kh);
        return "/KhachHang/detail";
    }
    @GetMapping("/khach-hang/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        KhachHang kh = khachHangService.detail(id);
        model.addAttribute("kh",kh);
        return "/KhachHang/update";
    }
    @PostMapping("/khach-hang/update/{id}")
    public String update(@ModelAttribute("kh") KhachHang kh, Model model){
        khachHangService.update(kh);
        return "redirect:/khach-hang/hien-thi";
    }
}
