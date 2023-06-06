/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lomboo;

/**
 *
 * @author OWNER
 */
public class Lomboo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase cl = new Clase(1, "Eddy", "0958810670", "Av de las Americas");
        
        System.out.println("Nombre: "+ cl.getNombre());
        System.out.println("Direccion: "+ cl.getDireccion());
        
        cl.setTelefono("0965554552");
        cl.setId(5);
        
        System.out.println(cl.toString());
    }
    
}
