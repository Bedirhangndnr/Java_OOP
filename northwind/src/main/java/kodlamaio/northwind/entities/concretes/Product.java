package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "products") /**veri tabaninda hangi taboya karsilik geldigi.*/
@Data
public class Product {
	/**Ve tablodaki id alanının ne oldupunu söylemememiz gerekiyor.
	 * cünkü islemlerini id'ye gore yapacak.*/
	@Id
	/*ve veri tabanlarında id alanları bazen manuel bazen manuel bazen otomatik(bu durumda öyle +1+1) olarak artabilir. dolayısıyla bu id'nin nasıl üretildiğini de belirtmeliyiz. */
	@GeneratedValue
	
	@Column(name="product_id") /**veri tabanında hangi alana karşılık geliyor?*/
	private int id;
	public Product() {
	}
	@Column
	(name="category_id")
	private int categoryId;
	@Column
	(name="product_name")
	private String productName;
	@Column
	(name="unit_price")
	private double unitPrice;
	@Column
	(name="units_in_stock")
	private short unitsInStock;
	@Column
	(name="quantify_per_unit")
	private  String quantifyPerUnit;
}
