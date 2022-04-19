package BS4.Profiles;

import BS4.Profiles.Profile;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@org.springframework.context.annotation.Profile("perfil1")
@Data
public class Profile1 implements Profile {

    @Value("${perfil1}")
    public String perfil1;
    @Override
    public String function() {
        return perfil1;
    }
}