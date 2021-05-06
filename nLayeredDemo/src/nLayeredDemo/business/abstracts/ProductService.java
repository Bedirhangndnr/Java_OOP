package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Products;

/** is sinifi interfacelerimizi service olarak veririr. */
/* eger 1service" görðrse þu anlaþýlmalý: iþ sýnýfýnýn interfacesi
 * */

public interface ProductService {
	void add(Products product);
	List <Products> getAll();}
