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
        Residencial r=new Residencial();
        Edificio e=new Edificio();
        Scanner lea=new Scanner(System.in);
        int opcion=69;
        while(opcion!=0){
           opcion=Integer.parseInt(
           JOptionPane.showInputDialog("0-Salida\n"
                   + "1-Agregar Casa\n"
                   + "2-Agregar Edificio\n"
                   + "3-Agregar Apartamneto\n"
                   + "4-Modificar Casa\n"
                   + "5-Modificar Edificio"
                   + "6-Modificar Apartamentos\n"
                   + "7-Listar Casas\n"
                   + "8-Listar Edificio\n"
                   + "9-Listar Apartamentos\n"
                   + "10-Eliminar Casas\n"
                   + "11-Eliminar Edificios\n"
                   + "12-Eliminar Apartamentos\n"
                   + "13-Agregar Compradores\n"
                   + "14-Agregar Residenciales"));
           if(opcion==1){
               System.out.println("Ingrese la posicion de la casa: ");
               int pos=lea.nextInt();
               System.out.println("Ingrese la Identidad de la casa: ");
               int id=lea.nextInt();
               System.out.println("Ingrese el numero de casa: ");
               int num=lea.nextInt();
               System.out.println("Ingrese la Direccion: ");
               String dir=lea.next();
               System.out.println("Ingrese la referencia: ");
               String ref=lea.next();
               propiedad.add(new Casa(num, ref, dir,id));
               r.getCasas().add(new Casa(num, ref, dir, id));
           }if(opcion==2){
               System.out.println("Ingrese la Cantidad de locales: ");
               int loc=lea.nextInt();
               System.out.println("Ingrese el nombre:");
               String nom=lea.next();
               System.out.println("Ingrese la dirreccion del edificio: ");
               String dir=lea.next();
               System.out.println("Ingrese el id del edificio: ");
               int id=lea.nextInt();
               r.getEdificio().add(new Edificio(loc,nom,dir,id));
               propiedad.add(new Edificio(loc,nom,dir,id));
           }if(opcion==3){
               System.out.println("Ingrese la posicion de el dificio al cual pertenece al apartamento: ");
               int pos=lea.nextInt();
               System.out.println("ingrese el numero de apartamento: ");
               int numlocal=lea.nextInt();
               System.out.println("Ingrese la dirreccion del apartamento: ");
               String dir=lea.next();
               System.out.println("Ingrese la referencia del apartamento: ");
               String ref=lea.next();
               System.out.println("Ingrese el id del apartamento: ");
               int id=lea.nextInt();
               r.getEdificio().get(pos).getAparts().add(new Apartamento(numlocal, ref, dir, id));
           }if(opcion==4){
               System.out.println("Ingrese la posicion de la casa a modificar: ");
               int pos=lea.nextInt();
               System.out.println("Ingrese la Identidad de la casa: ");
               int id=lea.nextInt();
               r.getCasas().get(pos).setId(pos);
               System.out.println("Ingrese el numero de casa: ");
               int num=lea.nextInt();
               r.getCasas().get(pos).setNumerocasa(num);
               System.out.println("Ingrese la Direccion: ");
               String dir=lea.next();
               r.getCasas().get(pos).setDirrecion(dir);
               System.out.println("Ingrese la referencia: ");
               String ref=lea.next();
               r.getCasas().get(pos).setReferencia(ref);
           }if(opcion==5){
               System.out.println("Ingrese la posicion de la casa a modificar: ");
               int pos=lea.nextInt();
               System.out.println("Ingrese la Cantidad de locales: ");
               int loc=lea.nextInt();
               r.getEdificio().get(pos).setCantidadlocales(loc);
               System.out.println("Ingrese el nombre:");
               String nom=lea.next();
               r.getEdificio().get(pos).setNombre(nom);
               System.out.println("Ingrese la dirreccion del edificio: ");
               String dir=lea.next();
               r.getEdificio().get(loc).setDirrecion(dir);
               System.out.println("Ingrese el id del edificio: ");
               int id=lea.nextInt();
               r.getEdificio().get(pos).setId(id);
           }if(opcion==6){
               System.out.println("Ingrese la posicion de el dificio al cual pertenece al apartamento: ");
               int posedi=lea.nextInt();
               System.out.println("Ingrese la posicion del Apartamento: ");
               int pos=lea.nextInt();
               System.out.println("ingrese el numero de apartamento: ");
               int numlocal=lea.nextInt();
               r.getEdificio().get(posedi).getAparts().get(pos).setNumerolocal(numlocal);
               System.out.println("Ingrese la dirreccion del apartamento: ");
               String dir=lea.next();
               r.getEdificio().get(posedi).getAparts().get(pos).setDirrecion(dir);
               System.out.println("Ingrese la referencia del apartamento: ");
               String ref=lea.next();
               r.getEdificio().get(posedi).getAparts().get(pos).setReferencia(ref);
               System.out.println("Ingrese el id del apartamento: ");
               int id=lea.nextInt();
               r.getEdificio().get(posedi).getAparts().get(pos).setId(id);
           }if(opcion==7){
               for(int i=0;i<r.getCasas().size();i++){
                   System.out.println(r.casas);
               }
           }if(opcion==8){
               for(int i=0;i<r.getEdificio().size();i++){
                   System.out.println(r.edificio);
               }
           }if(opcion==9){
               for(int i=0;i<e.getAparts().size();i++){
                   System.out.println(r.getEdificio().get(i).getAparts());
               }
           }if(opcion==10){
               System.out.println("Ingrese la posicion de la casa a eliminar: ");
               int pos=lea.nextInt();
               r.getCasas().remove(pos);
           }if(opcion==11){
               System.out.println("Ingrese la posicion de el edificio a eliminar: ");
               int pos=lea.nextInt();
               r.getEdificio().remove(pos);
           }if(opcion==12){
               System.out.println("Ingrese la posicion del edifcio del apartamento: ");
               int pos=lea.nextInt();
               System.out.println("Ingrese la posicion del apartamento a eliminar: ");
               int posedi=lea.nextInt();
               r.getEdificio().get(pos).getAparts().remove(posedi);
           }if(opcion==13){
               
           }if(opcion==14){
               String nombre=lea.next();
               r.setNombre(nombre);
           }
        }
    }
    
}
