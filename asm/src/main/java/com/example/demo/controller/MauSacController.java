package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.MauSac;
import com.example.demo.service.ChucVuService;
import com.example.demo.service.MauSacService;
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
public class MauSacController {
    @Autowired
    private MauSacService mauSacService;
    @GetMapping("/mau-sac/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo, Model model){
        Page<MauSac> page = mauSacService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("view","/WEB-INF/view/MauSac/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/mau-sac/view-add")
    public String viewadd(@ModelAttribute("ms") MauSac ms){
        return "/MauSac/add";
    }
    @PostMapping("/mau-sac/add")
    public String add(@Valid @ModelAttribute("ms") MauSac ms, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/MauSac/add";
        }
        mauSacService.addMS(ms);
        return "redirect:/mau-sac/hien-thi";
    }
    @GetMapping("/mau-sac/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        mauSacService.delete(id);
        return "redirect:/mau-sac/hien-thi";
    }
    @GetMapping("/mau-sac/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        MauSac ms = mauSacService.detail(id);
        model.addAttribute("ms",ms);
        return "/MauSac/detail";
    }
    @GetMapping("/mau-sac/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        MauSac ms = mauSacService.detail(id);
        model.addAttribute("ms",ms);
        return "/MauSac/update";
    }
    @PostMapping("/mau-sac/update/{id}")
    public String update(@ModelAttribute("ms") MauSac ms, Model model){
        mauSacService.update(ms);
        return "redirect:/mau-sac/hien-thi";
    }
}
