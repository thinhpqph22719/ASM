package com.example.demo.controller;

import com.example.demo.entity.ChiTietSanPham;
import com.example.demo.entity.ChucVu;
import com.example.demo.service.ChiTietSanPhamService;
import com.example.demo.service.DongSanPhamService;
import com.example.demo.service.MauSacService;
import com.example.demo.service.NhaSanXuatService;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Controller
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;
    @Autowired
    private SanPhamService sanPhamService;
    @Autowired
    private NhaSanXuatService nhaSanXuatService;
    @Autowired
    private MauSacService mauSacService;
    @Autowired
    private DongSanPhamService dongSanPhamService;

    @GetMapping("/chi-tietsp/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo,Model model){
        Page<ChiTietSanPham> page = chiTietSanPhamService.findPage(pageNo,2);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("dsSanPham",sanPhamService.getAll());
        model.addAttribute("dsNSX",nhaSanXuatService.getAll());
        model.addAttribute("dsMauSac",mauSacService.getAll());
        model.addAttribute("dsDongSP",dongSanPhamService.getAll());
        model.addAttribute("list",chiTietSanPhamService.getAll());
        model.addAttribute("view","/WEB-INF/view/ChiTietSP/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/chi-tietsp/view-add")
    public String viewadd(@ModelAttribute("ctsp") ChiTietSanPham ctsp, Model model){
        model.addAttribute("dsSanPham",sanPhamService.getAll());
        model.addAttribute("dsNSX",nhaSanXuatService.getAll());
        model.addAttribute("dsMauSac",mauSacService.getAll());
        model.addAttribute("dsDongSP",dongSanPhamService.getAll());
        return "/ChiTietSP/add";
    }
    @PostMapping("/chi-tietsp/add")
    public String add(@ModelAttribute("ctsp") ChiTietSanPham ctsp, Model model){
        model.addAttribute("dsSanPham",sanPhamService.getAll());
        model.addAttribute("dsNSX",nhaSanXuatService.getAll());
        model.addAttribute("dsMauSac",mauSacService.getAll());
        model.addAttribute("dsDongSP",dongSanPhamService.getAll());
        chiTietSanPhamService.addCTSP(ctsp);
        return "redirect:/chi-tietsp/hien-thi";
    }
    @GetMapping("/chi-tietsp/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model){
        ChiTietSanPham chiTietSanPham = chiTietSanPhamService.detail(id);
        model.addAttribute("dsSanPham",sanPhamService.getAll());
        model.addAttribute("dsNSX",nhaSanXuatService.getAll());
        model.addAttribute("dsMauSac",mauSacService.getAll());
        model.addAttribute("dsDongSP",dongSanPhamService.getAll());
        model.addAttribute("ctsp",chiTietSanPham);
        return "/ChiTietSP/detail";
    }
    @GetMapping("/chi-tietsp/delete/{id}")
    public String delete(@PathVariable("id") UUID id, Model model){
        chiTietSanPhamService.delete(id);
        return "redirect:/chi-tietsp/hien-thi";
    }
    @GetMapping("/chi-tietsp/view-update/{id}")
    public String viewupdate(@ModelAttribute("ctsp") ChiTietSanPham ctsp,@PathVariable("id") UUID id, Model model){
        ChiTietSanPham chiTietSanPham = chiTietSanPhamService.detail(id);
        model.addAttribute("dsSanPham",sanPhamService.getAll());
        model.addAttribute("dsNSX",nhaSanXuatService.getAll());
        model.addAttribute("dsMauSac",mauSacService.getAll());
        model.addAttribute("dsDongSP",dongSanPhamService.getAll());
        model.addAttribute("ctsp",chiTietSanPham);
        return "/ChiTietSP/update";
    }
    @PostMapping("/chi-tietsp/update/{id}")
    public String update(@ModelAttribute("ctsp") ChiTietSanPham ctsp, Model model){
        model.addAttribute("dsSanPham",sanPhamService.getAll());
        model.addAttribute("dsNSX",nhaSanXuatService.getAll());
        model.addAttribute("dsMauSac",mauSacService.getAll());
        model.addAttribute("dsDongSP",dongSanPhamService.getAll());
        chiTietSanPhamService.update(ctsp);
        return "redirect:/chi-tietsp/hien-thi";
    }
}
