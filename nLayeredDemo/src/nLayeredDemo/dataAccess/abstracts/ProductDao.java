package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Products;

/**ürünle ilgili yapýlabilecek iþlemlerin mottlarý neler?*/
public interface ProductDao {
	void add(Products products);
	void update(Products products);
	void delete(Products products);
	Products get(int id);
	List<Products>getAll();// Products array'i dondur.
	
}
