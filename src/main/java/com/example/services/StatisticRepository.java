package com.example.services;


import com.example.entities.Method;
import com.example.entities.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Mateusz on 2016-03-03.
 */
@RepositoryRestResource(path = "/statistic")
public interface StatisticRepository extends JpaRepository<Statistic, Long> {

    public List<Statistic> findByExecutionId(Long executionId);
}
