package InterfacesAbstractInRealLife.Concrete;

import InterfacesAbstractInRealLife.Abstract.ICustomerCheckService;
import InterfacesAbstractInRealLife.Abstract.ICustomerServices;
import InterfacesAbstractInRealLife.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }



    
}
