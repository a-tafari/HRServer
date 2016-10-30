package HRApplication;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:9000")
public class TimeCardController {

    @Autowired
    TimeCardRepository timeCardRepository;

    @RequestMapping(value = "/timecard", method = RequestMethod.GET)
    public Iterable<TimeCard> getAllTimeCard(){
        return timeCardRepository.findAll();
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.POST)
    public TimeCard submitTimeCard(@RequestBody TimeCard timeCard){
        timeCardRepository.save(timeCard);
        return timeCard;
    }

    @RequestMapping(value = "/timecard" , method = RequestMethod.OPTIONS)
    public ResponseEntity handle(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value ="/timecard/delete/{id}", method=RequestMethod.POST)
    public Iterable<TimeCard> remove(@PathVariable long id){
        timeCardRepository.delete(id);
        return timeCardRepository.findAll();

    }
}