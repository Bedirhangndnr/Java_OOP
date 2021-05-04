package interfaces;

public class CustomerManager {

    /**1. Yontem: */
    private ICustomerDal customerDal;
    public void Add(){
        /** iş kodları */ 
        customerDal.Add();
    };
    /**2. Yontem: */
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }



}
