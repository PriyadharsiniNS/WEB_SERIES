package com.example.webseries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSeriesController {

	@Autowired
	public WebSeriesService wbs;
	
	@PostMapping("/addSeries")
	public void addseries(@RequestBody WebSeries b)
	{
		wbs.addwb(b);
	}
	
	@GetMapping("/series")
	public List<WebSeries> getAllSeries()
	{
		return wbs.getAllSeries();
	}
	
	@GetMapping("/series/id/{id}")
	public WebSeries getById(@PathVariable String id, @RequestBody WebSeries b)
	{
		return wbs.getSeriesById(id,b);
	}
	
	@GetMapping("/series/name/{name}")
	public List<WebSeries> getByName(@PathVariable String name, @RequestBody WebSeries b)
	{
		return wbs.getSeriesByName(name,b);
	}
	
	@PutMapping("/update")
	public void updateSeries(@RequestBody WebSeries b)
	{
		wbs.updateSeries(b);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSeries(@PathVariable String id)
	{
		return wbs.deleteSeriesById(id);
	}
}
