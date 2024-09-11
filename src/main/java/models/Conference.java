/**
 * @file Conference.jva
 * @author Miguel Calambas
 * @brief Class of the abstaction of conference
 */

package models;

import java.util.Date;


public class Conference {
    private String nombre;
    private Date startDate;
    private Date endDate;
    private float price;
    
    public Conference(String nombre, Date startDate, Date endDate, float price){
        this.nombre = nombre;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
