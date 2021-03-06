package com.vitprojects.weightdashboard.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Weight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double weight;
    private LocalDateTime dateTime;
}
