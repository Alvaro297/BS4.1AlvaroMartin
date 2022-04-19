package BS4;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:miconfiguracion.properties")
public class MyConfiguration {

    @Value("${var1}")
    private String var1;

    @Value("${var2}")
    private String var2;


}