/**
 * 
 */
package fr.hoc.dap.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.util.store.DataStore;


/**
 * @author djer1
 *
 */
@Controller
public class Hello2Controller {
    
    GoogleService gService = new GoogleService();
    
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
    
    
    
    @RequestMapping("/admin")
    public String admin(ModelMap model) throws IOException {
        DataStore<StoredCredential> users = gService.getUsers();
        
        Map<String, StoredCredential> usersMap = new HashMap<>();
        Set<String> allKeys = users.keySet();
        
        //Modif
        
        for(String aKey : allKeys) {
            StoredCredential value = users.get(aKey);
            usersMap.put(aKey, value);
        }
        
        model.addAttribute("allUsers", usersMap);
        
        return "admin";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @RequestMapping("/hello25")
    public String hello25(ModelMap  model) {
        model.addAttribute("maVar", "toto");
        return "hello";
    }

}
