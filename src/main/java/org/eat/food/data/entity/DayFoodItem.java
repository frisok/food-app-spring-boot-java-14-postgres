package org.eat.food.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@Table(name = "day_food_item")
public class DayFoodItem {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "day_id")
    private Day day;

    @Column(name = "food_item_id")
    private FoodItem foodItem;



}
