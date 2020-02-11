/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesclient;

/**
 *
 * @author DavidX2X
 */
public class VehiclesClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MotorizedVehicle car = new MotorizedVehicle("Brian Peppers",4,1000);
        Bicycle bike = new Bicycle("Pepe");
        System.out.println(car.ToString());
        System.out.println(car.getHorsePower());
        System.out.println(bike.ToString());
    }
    
}
