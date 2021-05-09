package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	//İnterface interfacesi implement edebilir. JPA repository verdiğin veri tipi için 
	//Entity için product için primary key alanını ver ben ona göre sorgularımı hazırlayayım diyor.
	//Ürünle ilgili CRUD operasyonlarınız hazır.
	
	//JPA repositort hangi tabloya hangi ID tipiyle sorguların hazırlandığını söylemiş olduk!!!
	

}
