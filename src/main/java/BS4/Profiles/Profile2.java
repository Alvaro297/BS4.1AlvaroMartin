package BS4.Profiles;

import BS4.Profiles.Profile;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@org.springframework.context.annotation.Profile("perfil2")
@Data
public class Profile2 implements Profile {

    @Value("${perfil2}")
    public String perfil2;
    @Override
    public String function() {
        return perfil2;
    }
}