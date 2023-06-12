import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("br.com.worldsgeek.demo.repository")
public class DatabaseConfig {
}
