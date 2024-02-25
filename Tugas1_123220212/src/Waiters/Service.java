/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Waiters;

/**
 *
 * @author Lenovo
 */
public class Service {
    public Service(){
       nama = "Putra";
       tugas = "Mengambil makanan";
       menu = "Nasi Goreng";
               
    }
    public String nama = "";
    public String tugas = "";
    public String menu = "";
    
    public Service (String nama, String tugas, String menu){
        this.nama += nama;
        this.tugas += tugas;
        this.menu += menu;
    }
    
    
    public String bacamenu(){
        return menu;
    }
}
