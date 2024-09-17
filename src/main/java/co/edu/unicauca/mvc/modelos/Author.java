/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.mvc.modelos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 * @vari
 */
public class Author {
    private String nanme;
    private int id;

    /** 
     * @param nanme nombre del Usuario
     * @param id identificacion del usuario (digitada por el mismo o colocada en automatico por discutir)

     * El atributo isRevisor siempre sera declarado como false, se cambiara cuando se solicite
     */
    public Author(String nanme, int id) {
        this.nanme = nanme;
        this.id = id;
        
    } 
    public String getNanme() {
        return nanme;
    }
    public void setNanme(String nanme) {
        this.nanme = nanme;
    }
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    

    /**
     * @return the articles
     */
    

    
}
