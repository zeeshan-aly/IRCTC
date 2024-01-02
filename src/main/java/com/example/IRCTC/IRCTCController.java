package com.example.IRCTC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.PathContainer;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/irctc")
public class IRCTCController {
    @Autowired
    private IRCTCService irctcService;

    @PostMapping("/addPassenger")
    public Passenger addPassenger(@RequestBody Passenger passenger){
        return irctcService.addPassenger(passenger);
    }
    @PostMapping("/addTrain")
    public Train addTrain(@RequestBody Train train){
        return irctcService.addTrain(train);
    }

    @GetMapping("/passengersByCityAndDate")
    public long getPassengersByCityAndDate(@RequestParam String source,
                            @RequestParam String destination,
                            @RequestParam Date travelDate){
        return irctcService.getPassengersByCityAndDate(source,destination,travelDate);
    }
    @GetMapping("/trainWithMaxOrders")
    public Long getTrainIdWithMaxOrders(){
        return irctcService.getTrainIdWithMaxOrders();
    }
}
