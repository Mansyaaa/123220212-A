/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kitchen;
import Waiters.Service;
/**
 *
 * @author Lenovo
 */
public class Mainchef {
    public static void main(String[] args) {
        
        Chef c = new Chef();
        System.out.println("Nama : " + c.nama);
        System.out.println("Tugas : " + c.bagian);
        
        Service s = new Service();
        String Menudipesan= s.bacamenu();
        
        System.out.println("Nama menu yang dipesan : "+ Menudipesan);
      
    }
    
}
