/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab3p2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dcasc
 */
public class DiegoCasco_Lab3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList propiedad=new ArrayList();
        ArrayList comprador=new ArrayList();
        Scanner lea=new Scanner(System.in);
        int opcion=69;
        while(opcion!=0){
           opcion=Integer.parseInt(
           JOptionPane.showInputDialog("0-Salida\n"
                   + "1-Agregar Propiedad\n"
                   + "2-Agregar Comprador\n"
                   + "3-Modificar Propiedades\n"
                   + "4-Eliminar Propiedades\n"
                   + "5-Comprar Propiedades\n"
                   + ""));
           if(opcion==1){
               
           }
        }
    }
    
}
