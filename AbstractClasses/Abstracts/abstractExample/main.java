package AbstractClasses.Abstracts.abstractExample;
import inherit1.Logger; 
/**Bir musterinin veri tabanına kaydedilmesi */
public class main {
    public static void main(String[] args){
        CustomerManager cm=new CustomerManager();
        cm.dataBaseManager=new OracleDataBaseManager();
        cm.getCustomers();
    }
}
