package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Products;

/** is sinifi interfacelerimizi service olarak veririr. */
/* eger 1service" g�r�rse �u anla��lmal�: i� s�n�f�n�n interfacesi
 * */

public interface ProductService {
	void add(Products product);
	List <Products> getAll();}
