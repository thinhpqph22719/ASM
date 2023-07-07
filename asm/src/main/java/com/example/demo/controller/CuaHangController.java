package com.example.demo.controller;

import com.example.demo.entity.ChucVu;
import com.example.demo.entity.CuaHang;
import com.example.demo.service.CuaHangService;
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
public class CuaHangController {
    @Autowired
    private CuaHangService cuaHangService;
    @GetMapping("/cua-hang/hien-thi")
    public String hienthi(@RequestParam(name = "page",defaultValue = "0") Integer pageNo, Model model){
        Page<CuaHang> page = cuaHangService.findPage(pageNo,3);
        model.addAttribute("list",page.getContent());
        model.addAttribute("currentPage",page.getNumber());
        model.addAttribute("totalPages",page.getTotalPages());
        model.addAttribute("view","/WEB-INF/view/CuaHang/hienthi.jsp");
        return "/layout/layout1";
    }
    @GetMapping("/cua-hang/view-add")
    public String viewadd(@ModelAttribute("ch") CuaHang ch){
        return "/CuaHang/add";
    }
    @PostMapping("/cua-hang/add")
    public String add(@Valid @ModelAttribute("ch") CuaHang ch, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/CuaHang/add";
        }
        cuaHangService.addCV(ch);
        return "redirect:/cua-hang/hien-thi";
    }
    @GetMapping("/cua-hang/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        cuaHangService.delete(id);
        return "redirect:/cua-hang/hien-thi";
    }
    @GetMapping("/cua-hang/detail/{id}")
    public String detail(@PathVariable("id") UUID id,Model model){
        CuaHang ch = cuaHangService.detail(id);
        model.addAttribute("ch",ch);
        return "/CuaHang/detail";
    }
    @GetMapping("/cua-hang/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        CuaHang ch = cuaHangService.detail(id);
        model.addAttribute("ch",ch);
        return "/CuaHang/update";
    }
    @PostMapping("/cua-hang/update/{id}")
    public String update(@ModelAttribute("ch") CuaHang ch, Model model){
        cuaHangService.update(ch);
        return "redirect:/cua-hang/hien-thi";
    }
}
