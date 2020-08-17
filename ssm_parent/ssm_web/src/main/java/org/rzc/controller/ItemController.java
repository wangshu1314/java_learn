package org.rzc.controller;

import org.rzc.pojo.Items;
import org.rzc.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {
    @Resource
    ItemsService itemsService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Items> allItems = itemsService.findAll();
        model.addAttribute("items", allItems);
        return "items";
    }

    @PostMapping("/save")
    public String save(Items items) {
        // 日期这里有bug怎么解决
        itemsService.save(items);
        return "redirect:/items/list";
    }
}
