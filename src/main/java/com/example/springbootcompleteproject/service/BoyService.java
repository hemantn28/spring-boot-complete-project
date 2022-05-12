package com.example.springbootcompleteproject.service;

import com.example.springbootcompleteproject.model.Boy;
import com.example.springbootcompleteproject.repository.BoyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class BoyService {

    @Autowired
    BoyRepository repository;

    public String add(Boy boy){
        repository.save(boy);
        return "boy added to db";
    }


    public List<Boy> getAll(){
        return repository.findAll();

    }


    public String update(@RequestParam String name,@RequestParam Integer id){
        Boy boy=repository.getById(id);
        boy.setName("Balram");
        repository.save(boy);
        return "boy updated to db";

    }


    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "boy deleted in db";
    }
}
