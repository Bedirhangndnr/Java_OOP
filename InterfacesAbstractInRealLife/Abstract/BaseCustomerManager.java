package InterfacesAbstractInRealLife.Abstract;
import InterfacesAbstractInRealLife.Entities.Customer;
/**SAve islemi iki kahve dükkanında da aynı sekilde yonetildiği icin
 * save islemlerini tek bir class ile yapmalıyız:
 */
public abstract class BaseCustomerManager implements ICustomerServices {

    @Override
    public void Save(Customer customer) {
        System.out.println("Savet to Database: Name: "+customer.getName());
    }
    
}
