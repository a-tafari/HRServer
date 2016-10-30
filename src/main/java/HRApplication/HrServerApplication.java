package HRApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HrServerApplication implements CommandLineRunner {

	@Autowired
	TimeCardRepository timeCardRepository;

	public static void main(String[] args) {
		SpringApplication.run(HrServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		TimeCard timeCard = new TimeCard("abijah.tafari@gmail.com", "9:00am", "9:00pm");
		timeCardRepository.save(timeCard);
	}
}
