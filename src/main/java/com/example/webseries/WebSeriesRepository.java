package com.example.webseries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSeriesRepository extends CrudRepository<WebSeries,String>{

}
