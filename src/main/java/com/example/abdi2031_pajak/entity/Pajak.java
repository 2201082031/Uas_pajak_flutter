/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.abdi2031_pajak.entity;

/**
 *
 * @author M.ABDI
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Pajak {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nopolisi;
   private String jeniskendaraan;
   private int tarifpajak;
   private int terlambat;
   private double denda;
   private double total;

    public Pajak() {
    }

    public Pajak(Long id, String nopolisi, String jeniskendaraan, int tarifpajak, int terlambat, double denda, double total) {
        this.id = id;
        this.nopolisi = nopolisi;
        this.jeniskendaraan = jeniskendaraan;
        this.tarifpajak = tarifpajak;
        this.terlambat = terlambat;
        this.denda = denda;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNopolisi() {
        return nopolisi;
    }

    public void setNopolisi(String nopolisi) {
        this.nopolisi = nopolisi;
    }

    public String getJeniskendaraan() {
        return jeniskendaraan;
    }

    public void setJeniskendaraan(String jeniskendaraan) {
        this.jeniskendaraan = jeniskendaraan;
    }

    public int getTarifpajak() {
        return tarifpajak;
    }
    
    public int getTerlambat() {
        return terlambat;
    }
    
    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = 0.2*tarifpajak;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = tarifpajak+denda;
    }
}
