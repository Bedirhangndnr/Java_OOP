package interfaces;
/** İnterfaces, bir class olarak kabul edilmez, ama aynen normal classlar gibi referans tutabilir.*/
/**classlardan farklı olarak, bir interface birden faza sayıda interfacei mplemente edebilir. */
public class main {
	public static void main(String[] args) {
		/*şunu yapamayız:*/
		/*ICustomerDal customerDal= new ICustomerDal()*/
		CustomerManager cm=new CustomerManager();
		cm.customerDal=new MySqlCustomerDal();
		cm.Add();
	}

}
