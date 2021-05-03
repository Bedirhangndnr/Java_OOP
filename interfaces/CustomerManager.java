package interfaces;

public class CustomerManager {
    ICustomerDal customerDal;
    public void Add(){
        /** iş kodları */ 
        customerDal.Add();
    };
}
