/**
 * 
 */
package fr.hoc.dap.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author djer1
 *
 */
@Controller
public class Hello2Controller {
    
    @RequestMapping("/hello2")
    public String hello(ModelMap model) {
        model.addAttribute("maVar", "toto");
        
        List<String> bestioles = new ArrayList<>();
        
        bestioles.add("Chien");
        bestioles.add("Zebre");
        bestioles.add("Suricate");
        bestioles.add("Méchant chat");
        
        model.addAttribute("bebetes", bestioles);
        
        return "hello";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @RequestMapping("/hello25")
    public String hello25(ModelMap  model) {
        model.addAttribute("maVar", "toto");
        return "hello";
    }

}
