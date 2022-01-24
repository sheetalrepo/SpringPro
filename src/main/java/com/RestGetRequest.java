package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Demo REST API Class
 * 
 * 
 * @ResponseBody  : Jackson convert Java object into JSON
 * @GetMapping : For URL Mappings
 * @Controller : All request comes to controllers, its MVC controller
 * @RestController : Specific to REST calls, not MVC type
 * @RequestBody :  To convert JSON to Java Object. 
 * 
 * @author Sheetal_Singh
 *
 */
@Controller
//@RestController
public class RestGetRequest {
/*
	@Autowired
	RepoClass repo;    // Class which connect to DB
	
	//GET /product
	@GetMapping("product")  
	@ResponseBody           
	public List<Product> getAllProduct(){
		return repo.findAll();         //It will fetch all rows from DB
	}
	
	//GET /product/102
	@GetMapping("product/{pid}")  
	@ResponseBody           
	public Product getProduct(@PathVariable("pid") int pid){
		return repo.findById(pid)         
	}
	
	//POST /product
	@PostMapping("product")
	public void addProduct(@RequestBody Product product){
		repo.save(product)
	}
	
	
*/	
}
