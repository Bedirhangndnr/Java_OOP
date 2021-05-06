package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Products;

/** TIP: BIR PROJEDE ENTITIYLER HARIC NEWLIYORSANIZ, BILIN KI ILERIDE PROBLEM YASAYACAKSINIZ..!!!!!*/
public class main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new AbcProductDao()
				, new JLoggerManagerAdapter());
		Products product= new Products (1,2,"elma",23,44);
		productService.add(product);
		
	
	
	}

}
