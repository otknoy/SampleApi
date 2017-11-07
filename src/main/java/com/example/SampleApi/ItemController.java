package com.example.SampleApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @RequestMapping("item")
    public List<Item> item() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("任天堂 switch", 30000));
        items.add(new Item("PlayStation 4", 35000));
        items.add(new Item("iPhone X", 100000));
        items.add(new Item("iPhone 8", 80000));

        return items;
    }
}
