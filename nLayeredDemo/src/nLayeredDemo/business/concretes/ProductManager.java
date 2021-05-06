package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Products;

public class ProductManager implements ProductService {
	/**injection ile, manager, hibernetten haberdar olmuyori yaln�zca kullan�ca��m�z dataacces interfaceinden haberdar olur*/
	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Products product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
		}
		this.productDao.add(product); /* bu �ekilde, hi�bir �ekilde hibernate'e ba��ml�l���m�z kalmaz.*/
		this.loggerService.logRoSystem("Urun eklendi:"+product.getName());
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
