/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbrown65
 */
public class Store {
    protected String Name;
    final double Taxrate = .08;
    
    public Store(String newName)
    {
        Name = newName;
        //Taxrate = newTaxrate;
    } 
    public String getName()
    {
       return Name; 
    }
    public void setName( String newName)
    {
        Name  = newName;
    }
    public String ToString()
    {
       return Name +" " + Taxrate; 
    }
    public boolean Equals(Store b)
    {
        if(this.Name.equals(b.Name))
            return true;
        
        return false;
    }
    
}
