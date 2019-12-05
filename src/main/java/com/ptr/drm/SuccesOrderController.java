package com.ptr.drm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homeSuccesOrder")
public class SuccesOrderController {

    @GetMapping
    public String succesOrder(Model model) {
        model.addAttribute("order", new Order());
        return "homeSuccesOrder";
    }
}
