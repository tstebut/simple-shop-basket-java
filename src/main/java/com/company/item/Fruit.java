package com.company.item;

public class Fruit extends Item{
    public void setName(String name){
        try{
            Fruits.valueOf(name.toUpperCase());
        } 
        catch(Exception e){
            System.out.println("IllegalArgument will be thrown...this is expected ;)");
            throw e;
        } 
        super.setName(name);
        
    }   
}
