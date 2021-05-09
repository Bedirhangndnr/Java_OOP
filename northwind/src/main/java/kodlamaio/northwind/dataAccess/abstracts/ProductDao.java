package kodlamaio.northwind.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

/** JpaRepository: an interface | note: An interface, can extents another interface. */
/** What Does jpa repository: verdigin veri icin, yani entitiy anotasyonu 
 * ile süslenmis nesne icin(product), priminidaki(burada ne dediğini anlamadım .d)
 *  alanının ne olduğunu bana ver ki sorguları, intelicence i ona göre 
 *  hazırlayayım der. ve priminicy alanımız intager olduğundan intager veriyoruz.   */

/* kısacası Jp aRepository ile hangi entitiy e, yani hangi tabloya hangi id veri tipi ile sorguların ahzırlanması gerektiğini repository'e söylemiş oluyoruz.*/
public interface ProductDao extends JpaRepository<Product, Integer> {
	
}
