package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.service.ChucVuService;
import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;
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
public class ChucVuController {
    @Autowired
    private ChucVuService chucVuService;
    @GetMapping("/chuc-vu/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo, Model model){
        Page<ChucVu> page = chucVuService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("view","/WEB-INF/view/ChucVu/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/chuc-vu/view-add")
    public String viewadd(@ModelAttribute("cv") ChucVu cv){
        return "/ChucVu/add";
    }
    @PostMapping("/chuc-vu/add")
    public String add(@Valid @ModelAttribute("cv") ChucVu cv, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/ChucVu/add";
        }
        chucVuService.addCV(cv);
        return "redirect:/chuc-vu/hien-thi";
    }
    @GetMapping("/chuc-vu/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        chucVuService.delete(id);
        return "redirect:/chuc-vu/hien-thi";
    }
    @GetMapping("/chuc-vu/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        ChucVu cv = chucVuService.detail(id);
        model.addAttribute("cv",cv);
        return "/ChucVu/detail";
    }
    @GetMapping("/chuc-vu/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        ChucVu cv = chucVuService.detail(id);
        model.addAttribute("cv",cv);
        return "/ChucVu/update";
    }
    @PostMapping("/chuc-vu/update/{id}")
    public String update(@ModelAttribute("cv") ChucVu cv, Model model){
        chucVuService.update(cv);
        return "redirect:/chuc-vu/hien-thi";
    }
}
