package interfaces;
/** İnterfaces, bir class olarak kabul edilmez, ama aynen normal classlar gibi referans tutabilir.*/
/**classlardan farklı olarak, bir interface birden faza sayıda interfacei mplemente edebilir. */
public class main {
	public static void main(String[] args) {
		/*şunu yapamayız:*/
		/*ICustomerDal customerDal= new ICustomerDal()*/
		/* Asagidaki islem, Add() isleminin 1. yoludur.
		Bu yolun ufak bir problemi; 2. satırı yazmasak ta progrma bize kızmaz, ama çalışma anında problem çıakrtır. 
		Unutmayacağımız bir yapıkurabiliriz.  */
		/**
		CustomerManager cm=new CustomerManager();
		cm.customerDal=new MySqlCustomerDal();
		cm.Add();
		 */
		/**2.yol:  */
		CustomerManager cm=new CustomerManager(new MySqlCustomerDal());
		cm.Add();

	}

}
