package com.example.springbootcompleteproject.controller;

import com.example.springbootcompleteproject.model.Boy;
import com.example.springbootcompleteproject.service.BoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class BoyController {


    @Autowired
    BoyService service;

    @RequestMapping(value = "add_boy_db", method = RequestMethod.POST)
    public String add(@RequestBody Boy boy){
     return service.add(boy);

    }

    @RequestMapping(value = "get_boy_db", method = RequestMethod.GET)
    public List<Boy> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "update_boy_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        service.update("Balram", 303);
        return "boy updated in db";
    }


    @RequestMapping(value = "delete_boy_db", method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        service.delete(304);
        return "boy deleted in db";
    }
}
