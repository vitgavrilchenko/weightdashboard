package com.vitprojects.weightdashboard.repositories;

import com.vitprojects.weightdashboard.entity.Weight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeightRepository extends CrudRepository<Weight, Long> {
}
