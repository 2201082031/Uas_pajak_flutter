/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abdi2031_pajak.service;
import com.example.abdi2031_pajak.entity.Pajak;
import com.example.abdi2031_pajak.repository.PajakRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author M.ABDI
 */
@Service
public class PajakService {

    @Autowired
    private PajakRepository pajakRepository;
    
    public List<Pajak> getAll(){
        return pajakRepository.findAll();
    }
    
    public Pajak getPajakById(Long idpajak){
        return pajakRepository.findById(idpajak).get();
    } 
    
    public void insert(Pajak pajak){
        pajakRepository.save(pajak);
    }
    
    public void delete(Long idpajak){
        pajakRepository.deleteById(idpajak); 
    }
}