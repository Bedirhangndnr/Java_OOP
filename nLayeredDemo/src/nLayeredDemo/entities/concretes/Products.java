package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entitiy;

/**nesnelerin hangi gruba dahil oldu�unu nesneye anlatmam�z�n �o kavantaj� vard�r | Best Practice*/
/*"Sen bir api nesnesisisn!!!" gibi.*/

/* Alt�n Kural: bir class bir inheritance, implementasyon alm�yorsa, bir g�n sorun ya�ayacaks�nd�r, b�y�k ihtimalle.*/
/**o y�zden entitity inteface olusturacag�z.*/


public class Products implements Entitiy{
	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unitInStock;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	public Products() {
	}
	public Products(int id, int categoryId, String name, double unitPrice, int unitInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}
	
	
	
	
}
