package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.DongSanPham;
import com.example.demo.service.DongSanPhamService;
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
public class DongSanPhamController {
    @Autowired
    private DongSanPhamService dongSanPhamService;
    @GetMapping("/dong-sp/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo, Model model){
        Page<DongSanPham> page = dongSanPhamService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("view","/WEB-INF/view/DongSP/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/dong-sp/view-add")
    public String viewadd(@ModelAttribute("dsp") DongSanPham dsp){
        return "/DongSP/add";
    }
    @PostMapping("/dong-sp/add")
    public String add(@Valid @ModelAttribute("dsp") DongSanPham dsp, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/DongSP/add";
        }
        dongSanPhamService.addDSP(dsp);
        return "redirect:/dong-sp/hien-thi";
    }
    @GetMapping("/dong-sp/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        dongSanPhamService.delete(id);
        return "redirect:/dong-sp/hien-thi";
    }
    @GetMapping("/dong-sp/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        DongSanPham dsp = dongSanPhamService.detail(id);
        model.addAttribute("dsp",dsp);
        return "/DongSP/detail";
    }
    @GetMapping("/dong-sp/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        DongSanPham dsp = dongSanPhamService.detail(id);
        model.addAttribute("dsp",dsp);
        return "/DongSP/update";
    }
    @PostMapping("/dong-sp/update/{id}")
    public String update(@ModelAttribute("dsp") DongSanPham dsp, Model model){
        dongSanPhamService.update(dsp);
        return "redirect:/dong-sp/hien-thi";
    }
}
