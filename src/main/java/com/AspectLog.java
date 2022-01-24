package com;

import org.springframework.stereotype.Component;

/**
 * 
 * Syntax:
 * 
 * @Before(execution( <packagename><classname><methodname>))
 * 
 * Pointcut : syntax defined inside execution()
 * Advice:  @Before define Advice
 * 
 * 
 * 
 * 
 * @author Sheetal_Singh
 *
 */

//@Aspect
@Component
public class AspectLog {
/*

	
	//This method map the particular method and do logging
	@Before("execution(public * com.example.demo.RestGetRequest.addProduct(@RequestBody Product product))")
	public void log(){
		log.info("");
	}
	

*/
}
