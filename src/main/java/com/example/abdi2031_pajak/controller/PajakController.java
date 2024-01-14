/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abdi2031_pajak.controller;

import com.example.abdi2031_pajak.entity.Pajak;
import com.example.abdi2031_pajak.service.PajakService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author M.ABDI
 */
@RestController
@RequestMapping("/api/v1/pajak")
public class PajakController {
    @Autowired
    private PajakService pajakService;
    
    @GetMapping
    public List<Pajak> getAll(){
        return pajakService.getAll();
    }
    
    @GetMapping(path = "{id}")
    public Pajak getPajakById(@PathVariable("id") Long id){
        return pajakService.getPajakById(id); 
    }
    
    @PostMapping
    public void insert(@RequestBody Pajak pajak){
        pajakService.insert(pajak); 
    }
    
    @DeleteMapping(path = "{id}")
    public void delete(@PathVariable("id") Long id){
        pajakService.delete(id);
     }
}