package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Products;

/** Hibernate: veri tabaný ile iletiþim kuran java yapýsý*/
public class HibernateProductDao implements ProductDao {
	/**Henüz bir þey yazýlmayacak. 6. ders ile birlikt ebir þeyler yazýlacak. (gerçek veri tabanýna gidilercek vs)*/

	@Override
	public void add(Products products) {
		System.out.println("Hibernate ile eklendi"+ products.getName());
	}

	@Override
	public void update(Products products) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Products products) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Products get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
