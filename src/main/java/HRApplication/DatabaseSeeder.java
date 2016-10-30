package HRApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abijah on 10/28/16.
 */
@Component
public class DatabaseSeeder implements CommandLineRunner {
    private  TimeCardRepository timeCardRepository;

    @Autowired
    public DatabaseSeeder(TimeCardRepository timeCardRepository){
        this.timeCardRepository= timeCardRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        List<TimeCard> timeCards = new ArrayList<>();
        timeCards.add(new TimeCard("ata.Gmail@com", "9:00am", "5:00pm"));
        timeCards.add(new TimeCard("luke.cage@Gmail.com", "12:00am", "12:00pm"));
        timeCards.add(new TimeCard("bruce.wayne@Gmail.com", "12:00am", "12:00pm"));
        timeCards.add(new TimeCard("guyoncouch@Halfbaked.com", "1:00pm", "2:00pm"));
        timeCards.add(new TimeCard("Oscar@Grouchmail.com", "9:00am", "5:00pm"));
        timeCardRepository.save(timeCards);

    }
}
