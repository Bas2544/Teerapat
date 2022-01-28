package nvc.bcit.icefactory.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/factory")
    public String getFactories(){
        return "factory";
    }

    @GetMapping("/factory/{id}")
    public String getFactory(){
        return "factory-detail";
    }

    
    // @GetMapping("/customer/{id}")
    // public  ModelAndView getCustomerById(@PathVariable int id){
    //     Customer customers = customerService.getById(id);
    //     return new ModelAndView( "customer", "customers",customers);
    // }

}
