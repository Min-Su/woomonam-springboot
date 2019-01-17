package com.woomonam.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class webController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
