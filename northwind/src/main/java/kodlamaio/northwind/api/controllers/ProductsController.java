package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //Sen bir RestControllersin
@RequestMapping("/api/products") //kodlama.io(domain)/api/products isteği gelirse bu controller karar verecek
public class ProductsController {
	//Controller nedir? 
	/*Java ve React anlaşamıyor. Bu iletişimi API ile sağlıyoruz.Controller dediğimiz havaalanı iniş izni gibi düşün
	 * İstek geliyor Controller isteği alıyor ne yapılacağını karar veriyor.Dış dünyanını bizim sistemimizle iletişim kurduğu yer:CONTROLLER
	 * Rest Controlleri kullnacağız.
	 */
	
	//Katmanlar arası haberleşmeler interfacelerle yapılır. Benim apimin haberlşemesi gerekiyor.
	private ProductService productService;
	@Autowired //Benim yerime newleyip projeyi tarıyor kim productService implement ediyor diye arıyor
	//Bakıyor arkada Product Manageri buluyor. Bizim newlememize gerek kalmıyor!!!
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}



	//İstekler iki türlüdür. Bana veri ver yada şu veriyi değiştir. HTTP Request denir
	//Veri isterseniz GetMAPPİNG
	@GetMapping("/getall")
	public List<Product> getAll(){
		
		return this.productService.getAll();
		
		
	}
	
	
	

}
