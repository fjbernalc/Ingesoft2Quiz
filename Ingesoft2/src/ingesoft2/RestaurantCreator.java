/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingesoft2;

import java.util.Scanner;

/**
 *
 * @author Pacho
 */
public class RestaurantCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        RestaurantFactoryProducer restaurantProducer = new RestaurantFactoryProducer();
        
        System.out.println("Please enter the number of the restaurant you want to create:");
        
        RestaurantAbstractFactory restaurant = restaurantProducer.getRestaurantAbstractFactory(s.nextInt());
        
        System.out.println("Please enter the Fast Food that you want");
        restaurant.getFastFood(s.next());
        
        System.out.println("Please enter the Drink that you want");
        restaurant.getFastFood(s.next());
        
    }
    
}
