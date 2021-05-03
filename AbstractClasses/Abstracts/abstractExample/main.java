package AbstractClasses.Abstracts.abstractExample;
/**Bir musterinin veri tabanına kaydedilmesi */
public class main {
    public static void main(String[] args){
        CustomerManager cm=new CustomerManager();
        cm.dataBaseManager=new OracleDataBaseManager();
        cm.getCustomers();
    }
}
