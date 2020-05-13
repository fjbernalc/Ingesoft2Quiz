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
public class Restaurant1Factory extends RestaurantAbstractFactory{

    @Override
    FastFood getFastFood(String type) {
        
        switch(type){
            
            case "hamburguer": 
                System.out.println("Enjoy your Hamburguer");
                return new Hamburguer();
                
            case "sandwich": 
                System.out.println("Do you want any sauce for your Sandwich?");
                return new Sandwich();
                
            case "hot dog": 
                System.out.println("You can eat your Hot Dog with some chips");
                return new HotDog();
            
            default: return null;
            
        }
        
    }

    @Override
    Drink getDrink(String type) {
        
        switch(type){
            
            case "soda": return new Soda();
            
            default: return null;
            
        }
        
    }
    
}
