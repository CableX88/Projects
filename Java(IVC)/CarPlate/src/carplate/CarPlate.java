/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carplate;

import java.io.Serializable;

/**
 *
 * @author DavidX2X
 */
public class CarPlate implements Serializable {
   private String number;
   private String state;
   private String color;

    public CarPlate(String number, String state, String color) {
        this.number = number;
        this.state = state;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
   public String toString()
    {
       return number +" " + state + " "+ color; 
    }
}
