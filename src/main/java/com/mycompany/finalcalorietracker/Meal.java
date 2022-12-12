/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalcalorietracker;



/**
 *
 * @author aidentrundy
 */
public class Meal {
    public String name;
    public int numCals;
    
    
    public Meal (String name, int numCals){
        this.name = name;
        this.numCals = numCals;
    }

    public String getName(){
        return this.name;
    }
    
    public int getNumCals(){
        return this.numCals;
    }
}
