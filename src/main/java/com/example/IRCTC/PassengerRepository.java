package com.example.IRCTC;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    long countBySourceAndTrainDestinationTravelDate(String source, String destination, Date travelDate);
    long countByGenderAndAge(String gender,int minAge, int maxAge,String destination);

}
