package eurekaserver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
@RefreshScope
public class EurekaServer {
		
	@Value("${message: Hello default}")
	public String message;
	
	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServer.class, args);
	}
	
	@RequestMapping("/hi")
	public String getHi() {
		return this.message;
	}
}
