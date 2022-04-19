package BS4;

import BS4.Profiles.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    public Profile profile;

    @Autowired
    public MyConfiguration configuration;

    @Value("${url}")
    public String url;

    @Value("${password}")
    public String password;

    @GetMapping("/parameters")
    public String parameters() {
        return "La url es: " + url + " y password es: " + password;
    }

    @GetMapping("/myconfiguration")
    public String configuration() {
        return "Var1 es : " + configuration.getVar1() + " Var2 es: " + configuration.getVar2();
    }

    @GetMapping("/profile")
    public String returnProfile() {
        return profile.function();
    }
}