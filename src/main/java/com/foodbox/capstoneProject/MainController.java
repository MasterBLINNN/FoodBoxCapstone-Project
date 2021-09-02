package com.foodbox.capstoneProject;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {

	
	 int min = 10;
     int max = 10000;
	
		@Autowired
		UserService userservice;
		
		 @Autowired
		    private ProductsService productsService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	     public String Hello()
	     {
	             return("index");
	     }
    
          
     @RequestMapping(value="/login", method = RequestMethod.GET)
 	public String showLogin(ModelMap model)
 	{
 		model.addAttribute("message", "Welcome!");
 		return("login");
 	}   
     
     @RequestMapping(value="/register", method = RequestMethod.GET)
  	public String showRegister(ModelMap model)
  	{
  		model.addAttribute("message", "Welcome!");
  		return("register");
  	}   
     
     @RequestMapping(value="/welcome", method = RequestMethod.GET)
   	public String showWelcome(ModelMap model)
   	{
   		model.addAttribute("message", "Welcome!");
   		return("welcome");
   	}  
     

@RequestMapping(value="/register", method = RequestMethod.POST)
public String handleRegistration(
		@RequestParam(value = "email", required = true) String email,
		@RequestParam(value = "name", required = true) String name,
		@RequestParam(value = "password", required = true) String password,
		ModelMap model) {
	//TODO: Handle empty or invalid UserId
	try {
		User user = new User();
	    
		user.getId();
		
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	      System.out.println(random_int);
		
		user.setId(user.getId()+random_int);
	
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		
		userservice.RegisterUser(user);
		model.addAttribute("message", "User Successfully Created. Feel free to login in to FoodBox");
	}
	catch (Exception ex) {
    	model.addAttribute("message", "User NOT Created Successful");

	}
	return("login");
}
     
     
     
     @RequestMapping(value="/login", method = RequestMethod.POST)
     public String handleLogin(
     		@RequestParam(value = "username", required = true) String username,
     		@RequestParam(value = "password", required = true) String password,

     		ModelMap model) { 
     	
     	User user;
     	try {
     		System.out.println("User: " + username);
     		System.out.println("Pass: " + password);
     		
     		user = userservice.GetUserByName(username);
     	}
     	catch(Exception ex) {
     		model.addAttribute("message", "ERROR: Unknown user!");
     		return("login");
     	}
     	
     	if (userservice.ConfirmUserPassword(user, password)) {
     		//TODO: Check user and password
     		//model.addAttribute("user", user);
     		model.addAttribute("message", "Success!");
     		return("users");
     	}
     	else {
     		model.addAttribute("message", "Invalid Password, Try again!");
     		return("login");
     	}
     }
       
     @RequestMapping(value="/products", method = RequestMethod.GET)
     public String showProducts(ModelMap model)
     {
     	Iterable<Products> products = productsService.GetAllProducts();
      
     	model.addAttribute("products", products);
     	
     	return("products");
     }
     
     @RequestMapping(value="/products", method = RequestMethod.POST)
 	public String handleQuery(
 			@RequestParam(value = "id", required = true) Integer id,
 			ModelMap model) {
 	
 		
 		try {
 		//TODO: Handle empty or invalid UserId
 			Products product = productsService.GetProductsById(id);
 		
 			model.addAttribute("products", product);
 	
 			return("products");
 		}
 		catch(Exception ex) {
 			model.addAttribute("message", "ERROR: Unknown userid");
 			return("products");
 		}
 	}

     
     @RequestMapping(value="/productdetailsedit", method = RequestMethod.GET)
 	public String showProductsDetailsEdit(ModelMap model)
 	{
 		model.addAttribute("message", "Welcome!");
 		return("productdetailsedit");
 	}   
     
     @RequestMapping(value="/productdetailsedit", method = RequestMethod.POST)
     public String handleEdit(
     		@RequestParam(value = "id", required = true) Integer id,
     		@RequestParam(value = "name", required = true) String name,
     		@RequestParam(value = "price", required = true) String price,
     		@RequestParam(value = "cuisine", required = true) String cuisine,
     		@RequestParam(value = "quantity", required = true) Integer quantity,
     		@RequestParam(value = "description", required = true) String description,
     		ModelMap model) {
     	//TODO: Handle empty or invalid UserId
     	try {
     		Products products = productsService.GetProductsById(id);
     	    
     		products.setName(name);
     		products.setPrice(price);
     		products.setCuisine(cuisine);
     		products.setQuantity(quantity);
     		products.setDescription(description);
     	
     		productsService.EditProduct(products);
     		model.addAttribute("message", "Product Edited Successfully");
     	}
     	catch (Exception ex) {
         	model.addAttribute("message", "Product Edit NOT Successful");

     	}
     	return("productdetailsedit");
     }


     @RequestMapping(value="/payment", method = RequestMethod.GET)
  	public String goToPayment(ModelMap model)
  	{
  		model.addAttribute("message", "Welcome!");
  		return("payment");
  	}   
        

@RequestMapping(value="/paymentConfirmation", method = RequestMethod.GET)
	public String goToPaymentConfirm(ModelMap model)
	{
		model.addAttribute("message", "Welcome!");
		return("paymentConfirmation");
	}   
    
}
