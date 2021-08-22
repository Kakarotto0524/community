package com.haiping.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kakarotto
 * @create 2021-08-21-10:44
 * @Description:
 * @Modified By:
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){ return "index"; }
}
