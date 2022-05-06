/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab3p2;

/**
 *
 * @author dcasc
 */
public class BienesRaices {
    private String dirrecion;
    private int id;

    public BienesRaices(String dirrecion, int id) {
        this.dirrecion = dirrecion;
        this.id = id;
    }

    public BienesRaices() {
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BienesRaices{" + "dirrecion=" + dirrecion + ", id=" + id + '}';
    }
    
}
