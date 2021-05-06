package InterfacesAbstractInRealLife.Concrete;
import InterfacesAbstractInRealLife.Abstract.BaseCustomerManager;
import InterfacesAbstractInRealLife.Entities.Customer;
import InterfacesAbstractInRealLife.Abstract.ICustomerCheckService;



public class StarbucksCustomerManager extends BaseCustomerManager{

    private ICustomerCheckService _icustomercheckservice;
    
    public StarbucksCustomerManager(ICustomerCheckService _icustomercheckservice) {
        this._icustomercheckservice = _icustomercheckservice; 
    }
s
    @Override
	public void Save(Customer customer) { 
        if(_icustomercheckservice.CheckIfRealPerson(customer)){
            System.out.println("yeeeeeeeee Kaydedildi :):):):): \n");
            super.Save(customer);
        }else{
            throw new Exception("Not a valid person");
        }
	}

}
