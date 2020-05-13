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
public class Restaurant2Factory extends RestaurantAbstractFactory{

    @Override
    FastFood getFastFood(String type) {
        switch(type){
            
            case "pizza": 
                System.out.println("I give you a Pizza");
                return new Pizza();
            
            default: return null;
            
        }
    }

    @Override
    Drink getDrink(String type) {
        switch(type){
            
            case "juice": 
                System.out.println("What flavor do you want for your Juice?");
                return new Juice();
            
            case "beer": 
                System.out.println("Please don't get drunk");
                return new Beer();
            
            default: return null;
            
        }
    }
    
}
