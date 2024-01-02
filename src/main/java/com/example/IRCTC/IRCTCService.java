package com.example.IRCTC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class IRCTCService {
    @Autowired
    private PassengerRepository passsengerRepository;

    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    private FoodOrderRepository foodOrderRepository;

    public Passenger addPassenger(Passenger passenger){
        return passsengerRepository.save(passenger);
    }
    public Train addTrain(Train train){
        return trainRepository.save(train);
    }
    public long getPassengersByCityAndDate(String source, String destination, Date travelDate){
        return passsengerRepository.countBySourceAndTrainDestinationTravelDate(source,destination,travelDate);
    }
    public long getFemalePassengersByAgeAndDestination(int minAge, int maxAge, String destinatiion){
        return passsengerRepository.countByGenderAndAge("Female",minAge,maxAge,destinatiion);
    }
    public Long getTrainIdWithMaxOrders(){
        return foodOrderRepository.findTrainWithMaxOrders();
    }
}
