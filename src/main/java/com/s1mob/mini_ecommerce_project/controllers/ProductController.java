package com.s1mob.mini_ecommerce_project.controllers;

import com.s1mob.mini_ecommerce_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public ModelAndView products(ModelMap model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("products");
        model.put("products", productService.getAllProducts());
        return mv;
    }
}
