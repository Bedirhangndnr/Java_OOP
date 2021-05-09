package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

/* Note: Product"S" taki "s" api isimlendirme kuralidiri 
 * api isimlendirmelerinin sununa eklenir.*/

@RestController /*sen bir rest controlsun, yani android de ios ta sana iletişimde bulunabilir.!*/
@RequestMapping("/api/products") /*1 den fazla kontroller olabilir. 
Siparis icin, sepet icin, kayit icin... gibi. Yani /api... seklinde bir 
istek gelirse, bu controller saglayaacak. bu kadar.*/
public class ProductsController {
	
	private ProductService productService;	
	@Autowired /*Ne diyor? --> Bana productservice lazım diyor*/
	public ProductsController(ProductService productservice) {
		super();
		this.productService = productservice;
	}


	
	/*operasyonları yazalım.*/
	
	/** bu controller ile birlikte boyle bir metot desteği veriyoruz dedik.*/
	@GetMapping("/getall") /**Bu ne demek? proje/api.products/getall seklinde bir istekte bulunursam bu çalisacak.*/
	public List<Product> getAll(){
		/**genel olarak 2 tür istek vardır. 1- veriyi ver, 2 veriyi degistir.*/
		/*ve veri istedigimiz icin bunun basıne @getmapping yazariz*/
		return this.productService.getAll();
	}; 
}
