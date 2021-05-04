package InterfacesAbstractInRealLife;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import InterfacesAbstractInRealLife.Abstract.BaseCustomerManager;
import InterfacesAbstractInRealLife.Abstract.ICustomerCheckService;
import InterfacesAbstractInRealLife.Concrete.StarbucksCustomerManager;
import InterfacesAbstractInRealLife.Entities.Customer;

public class InterfacesAbstractDemo {
    public static void main(String[]args){
        

        StarbucksCustomerManager sM = new StarbucksCustomerManager(null);
        sM.Save(new Customer("moonlord", "dayturn", 20));
        
    }
}
