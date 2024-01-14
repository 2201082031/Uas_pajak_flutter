/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abdi2031_pajak.repository;


import com.example.abdi2031_pajak.entity.Pajak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * * @author M.ABDI
 */
@Repository
public interface PajakRepository extends JpaRepository<Pajak , Long> {
    
}
