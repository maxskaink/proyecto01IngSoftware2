/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Santiago Escandon
 */
public class Author {
    private String nanme;
    private int id;

    /** 
     * @param name nombre del Usuario
     * @param id identificacion del usuario (digitada por el mismo o colocada en automatico por discutir)

     * El atributo isRevisor siempre sera declarado como false, se cambiara cuando se solicite
     */
    public Author(String name, int id) {
        this.nanme = name;
        this.id = id;
        
    }
    public Author copy(){
        return new Author(
                this.getName(),
                this.getId()
        );
    }
    public String getName() {
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

    
}
