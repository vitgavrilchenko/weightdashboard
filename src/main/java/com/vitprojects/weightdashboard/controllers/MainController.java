package com.vitprojects.weightdashboard.controllers;

import com.vitprojects.weightdashboard.entity.Weight;
import com.vitprojects.weightdashboard.repositories.WeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MainController {
    @Autowired
    private WeightRepository weightRepository;
    @RequestMapping
    public String getWeight() {
        Weight weight = new Weight();
        weight.setWeight(81.90);
        weight.setDateTime(LocalDateTime.now());

        weightRepository.save(weight);
        return "weigth";
    }
}
