package com.dhc.happ.demo.controller;

import com.dhc.happ.demo.mapper.WgKqMeetingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demoController")
public class DemoController {

    @RequestMapping("/index")
    public String index (Model model) {
        model.addAttribute("data", "恭喜你，Spring boot集成 Thymeleaf成sssse5555tets！");
        //return 中就是你页面的名字（不带.html后缀）
        return "demo/index";
    }
}
