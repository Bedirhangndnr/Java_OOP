package InterfacesAbstractInRealLife.Entities;

import java.util.stream.BaseStream;

import InterfacesAbstractInRealLife.Abstract.IEntitiy;


public class Customer implements IEntitiy{
    private String name;
    private String lastName;
    private int yas;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }

    public Customer(String name, String lastName, int yas) {
        this.name = name;
        this.lastName = lastName;
        this.yas = yas;
    }
    
}
