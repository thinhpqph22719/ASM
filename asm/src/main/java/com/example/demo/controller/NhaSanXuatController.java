package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.NhaSanXuat;
import com.example.demo.service.NhaSanXuatService;
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
public class NhaSanXuatController {
    @Autowired
    private NhaSanXuatService nsxService;
    @GetMapping("/nsx/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo, Model model){
        Page<NhaSanXuat> page = nsxService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("view","/WEB-INF/view/NSX/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/nsx/view-add")
    public String viewadd(@ModelAttribute("nsx") NhaSanXuat nsx){
        return "/NSX/add";
    }
    @PostMapping("/nsx/add")
    public String add(@Valid @ModelAttribute("nsx") NhaSanXuat nsx, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/NSX/add";
        }
        nsxService.addNSX(nsx);
        return "redirect:/nsx/hien-thi";
    }
    @GetMapping("/nsx/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        nsxService.delete(id);
        return "redirect:/nsx/hien-thi";
    }
    @GetMapping("/nsx/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        NhaSanXuat nsx = nsxService.detail(id);
        model.addAttribute("nsx",nsx);
        return "/NSX/detail";
    }
    @GetMapping("/nsx/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        NhaSanXuat nsx = nsxService.detail(id);
        model.addAttribute("nsx",nsx);
        return "/NSX/update";
    }
    @PostMapping("/nsx/update/{id}")
    public String update(@ModelAttribute("nsx") NhaSanXuat nsx, Model model){
        nsxService.update(nsx);
        return "redirect:/nsx/hien-thi";
    }
}
