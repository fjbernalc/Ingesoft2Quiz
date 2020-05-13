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
public abstract class RestaurantAbstractFactory {
    
    abstract FastFood getFastFood(String type);
    abstract Drink getDrink(String type);
    
}
