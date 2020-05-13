/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingesoft2;

/**
 *
 * @author Pacho
 */
public class RestaurantFactoryProducer {
    
    public RestaurantAbstractFactory getRestaurantAbstractFactory(int numRestaurant){
        
        switch(numRestaurant){
            
            case 1: 
                System.out.println("Restaurant 1 Factory");
                return new Restaurant1Factory();
            case 2: 
                System.out.println("Restaurant 2 Factory");
                return new Restaurant2Factory();
            default:return null;
            
        }
        
    }
    
}
