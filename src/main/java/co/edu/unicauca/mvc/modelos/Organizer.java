/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.modelos;

/**
 *
 * @author santi
 */
public class Organizer {
    private String nanme;
    private int id;
    //Lista de conferencias 

    public Organizer(String nanme, int id) {
        this.nanme = nanme;
        this.id = id;
    }

    /**
     * @return the nanme
     */
    public String getNanme() {
        return nanme;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    
}
