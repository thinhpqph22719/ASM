package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.SanPham;
import com.example.demo.service.ChucVuService;
import com.example.demo.service.SanPhamService;
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
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;
    @GetMapping("/san-pham/hien-thi")
    public String hienthi(@RequestParam(name = "page", defaultValue = "0") Integer pageNo, Model model){
        Page<SanPham> page = sanPhamService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage", page.getNumber());
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("view","/WEB-INF/view/SanPham/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/san-pham/view-add")
    public String viewadd(@ModelAttribute("sp") SanPham sp){
        return "/SanPham/add";
    }
    @PostMapping("/san-pham/add")
    public String add(@Valid @ModelAttribute("sp") SanPham sp, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/SanPham/add";
        }
        sanPhamService.addSP(sp);
        return "redirect:/san-pham/hien-thi";
    }
    @GetMapping("/san-pham/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        sanPhamService.delete(id);
        return "redirect:/san-pham/hien-thi";
    }
    @GetMapping("/san-pham/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        SanPham sp = sanPhamService.detail(id);
        model.addAttribute("sp",sp);
        return "/SanPham/detail";
    }
    @GetMapping("/san-pham/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        SanPham sp = sanPhamService.detail(id);
        model.addAttribute("sp",sp);
        return "/SanPham/update";
    }
    @PostMapping("/san-pham/update/{id}")
    public String update(@ModelAttribute("sp") SanPham sp, Model model){
        sanPhamService.update(sp);
        return "redirect:/san-pham/hien-thi";
    }
}
