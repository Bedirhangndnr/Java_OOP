package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Products;

/** Hibernate: veri taban� ile ileti�im kuran java yap�s�*/
public class HibernateProductDao implements ProductDao {
	/**Hen�z bir �ey yaz�lmayacak. 6. ders ile birlikt ebir �eyler yaz�lacak. (ger�ek veri taban�na gidilercek vs)*/

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
