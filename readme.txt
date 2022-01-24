# Spring #
Note: Spring Boot is adv version of Spring. Spring Boot have very less configuration
      and mainly work with annotations @Autowiring, @Component
https://github.com/navinreddy20/Spring_Course

#Spring Application Context
1. Spring Container get created inside JVM
2. All Beans(Class objects) get stored inside container
3. On execution of main method (ApplicationContext) 
	a. All beans which has been mentioned inside spring.xml will be initialized, 
	   respective constructor will be executed.
	b. In case bean scope="prototype", default bean will not be created. 
	   <bean id="appleBean" class="com.Apple" scope="prototype"></bean>
	   
	   It will only be created once we ask via context.getBean() method
	   Apple apple = (Apple) context.getBean("appleBean");
	   
	c. Setter Injection: If we set member value from xml then Setters will also be called by default  
     	<property name="price" value="10"></property>
     	public void setPrice(int price){}


#Singleton vs Prototype	
1. By default Spring is Singleton i.e. only one object get created inside Spring Container
   for one class; Bean is defined by its id in xml
2. In case we don't want Singleton behavior then we can change its scope
   	<bean id="appleBean" class="com.Apple"></bean>  //default scope="singleton"
   	<bean id="appleBean" class="com.Apple" scope="prototype"></bean>
3. Two object of same class can also be created by adding another 'id' of same class
	<bean id="appleBean" class="com.Apple"></bean>
	<bean id="appleBean2" class="com.Apple"></bean>
	

#How to pass another class object
	<bean id="appleBean" class="com.Apple">
     	<property name="market" ref="mkt"></property>
	</bean>

	<bean id="mkt" class="com.Market"></bean>	
      
#Setter Injection:      
   <bean id="appleBean" class="com.Apple">
		<property name="price" value="50"></property>
   </bean>
    
    
#Constructor Injection:
	<bean id="appleBean" class="com.Apple">
     	<constructor-arg value="100"></constructor-arg>
	</bean>


#Auto wiring
1. In Spring Boot we have @Autowire
2. autowire= byName is same as using ref tag
3. autowire= byType check for anything which implement particular interface
   in case of conflicts like laptop and desktop both implement computer, 
   'primary' tag will be given preference
   
	<bean id="dev" class="com.B_Developer" autowire="byType">
	</bean>
	
	<bean id="laptop" class="com.B_Laptop"></bean>
	<bean id="desktop" class="com.B_Desktop" primary="true"></bean>

============================================================================

#MVC
Model View Controller (Spring Boot)

#Controller
Controller handle request from client (browser). 
Controller divided based on diff functionality

@RequestParam : To map input fields on UI to controller

@Controller
class HomePageController{

	@RequestMapping("/path")
	public String someMethod(@RequestParam("num1") int i){
  		return "homepage.jsp"
	}
	
	@RequestMapping("/path")
	public String someMethod(@ModelAttribute("num1") int i){
  		return "homepage.jsp"
	}
	
	@ModelAttribute
	public String someMethod(Model m){
		m.addAttribute();
	}
	
}


#Model:
To map a DB Table, we create POJOs and every DB column will have corresponding 
fields in class
 
@Entity
Mentioned on top of POJO class which define a Table in DB

@Id
Mentioned on top of a field which is mapped to primary key in DB Table

@Transactional
Generally mentioned on top of method which handles DB queries

@Query("from Tablename where aname = :name")	
public void abc(@Param(name) String name){}


===========================================================================

# AOP Aspect Oriented Programming
https://docs.spring.io/spring-framework/docs/2.5.x/reference/aop.html
AOP is general term and Spring using AOP concepts. Its not mandatory to use AOP
refer: AspectLog.java

Aspect: Like Java is based on OOPs and based on classses. 
  Similarly Spring based on AOP and based on Aspects. So logging is an Aspect for us.

Cross cutting concerns: 
Anything which is common and can be extracted outside business logic of methods
e.g. logging in every method can be extracted as Aspect

Join Point: Its represent a particular method on which we want our Aspect to run.
    If we want logging for only few methods then all those methods are join points

Advice: Action taken by Aspect at a particular Join Point. 
   Types of Advices are:
   1. @Before
   2. @Around (during the execution)
   3. @AfterReturning : only after successful execution of method
   4. @AfterThrowing : runs only if method throw some exceptions
   5. @AfterFinally : runs in both above case
   
Pointcut: An expression that matches Join Point. Advices connect with pointcut.
    The regex we write is pointcut 

Weaving: It link Advice to a method. Spring AOP perform Weaving at Runtime.
         

===========================================================================

#Spring Security:
https://github.com/navinreddy20/Spring_Course/tree/master/33%20SecureApp

Spring boot maintain Session and Login

We can also use BCrypt algo or use Oauth2
BCrypt https://www.browserling.com/tools/bcrypt
OAuth2


===========================================================================




    