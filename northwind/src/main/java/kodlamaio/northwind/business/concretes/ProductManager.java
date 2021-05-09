package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //Bu class projede Services katmanı görecek . BUsinnes katmanı görecek diyoruz. Springe
public class ProductManager implements ProductService{

	
	private ProductDao productDao;
	
	//productDao injeksiyonu yapıyoruz. ProductDao bir interface onu implemente eden 
	//JPA bir  İnterface. Burada bir class yok.Generic çalışıyor.Spring arka tarafta bir repository classı oluşturuyor.
	//Bir tane instance oluşturuyor. Bu instance bilgisini Autowired springden geliyor.Dependency Injection arka planda
	//Fabrika tasarımı dediğimiz bir yapıyı çalıştırır.Instance yapısı. Autowired arka planda ProductDaonun arka planda ınstance
	//olabilecek bir sınıf oluşturuyor.
	@Autowired   //Projeyi tarıyor buna karşılık gelen sınıfı oluşturuyor.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
		//Parametre vermedik bizim için bütün datayı getirecek.
		
	}

}
