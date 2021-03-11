package simple.code;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Date;


@SpringBootApplication
public class CodingMonksK8Application {

	private final Logger logger = LogManager.getLogger(CodingMonksK8Application.class);
	public static void main(String[] args) {
		SpringApplication.run(CodingMonksK8Application.class, args);
	}

	@PostConstruct
	public void AfterConstruction()
	{
		logger.info("AfterConstruction "+new Date());
	}

	@PreDestroy
	public void PreDestroyImpl()
	{

		logger.info("PreDestroyImpl "+new Date());
	}

}
