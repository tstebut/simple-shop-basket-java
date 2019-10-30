package com.company.item;

/**
 * Implémentation intitiale d'Item, à savoir un Fruit, ou plutôt une famille de Fruit
 * Il peut s'agir d'une pomme, d'une orange ou encore d'un Melon
 * 
 * @author tstebut
 * @see com.company.item.Fruits pour la liste des familles de Fruit supportées
 */
public class Fruit extends Item{
    
    /**
     * Seule surcharge de cette classe, le setter du nom, dont le rôle est de garantir
     * qu'il s'agit bien du nom d'une famille de Fruit supportée
     * 
     * @param String le nom du Fruit 
     * 
     */
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
