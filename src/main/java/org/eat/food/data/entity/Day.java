package org.eat.food.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity

public class Day {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "date")
    private LocalDate date = LocalDate.now();

}
