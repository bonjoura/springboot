package top.vulcanus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String inex() {return "index";}
//    public  String hello(@RequestParam(name = "name") String name , Model model){
//        model.addAttribute("name",name);//kv pair
//        return "hello";
//    }
}
