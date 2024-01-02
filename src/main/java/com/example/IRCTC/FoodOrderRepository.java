package com.example.IRCTC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FoodOrderRepository extends JpaRepository<FoodOrder,Long> {
    @Query("SELECT f.trainID From FoodOrder f GROUP BY f.trainId ORDER BY COUNT(f.trainID) DESC LIMIT 1")
    Long findTrainWithMaxOrders();
}
