package com.example.webseries;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebSeriesService {

	@Autowired
	private WebSeriesRepository wbr;

	public void addwb(WebSeries b) {
		wbr.save(b);
	}

	public List<WebSeries> getAllSeries() {
		List<WebSeries> h = new ArrayList<WebSeries>();
		wbr.findAll().forEach(h::add);
		return h;
	}

	public WebSeries getSeriesById(String id, WebSeries b) {
		return wbr.findById(id).get();
	}

	public List<WebSeries> getSeriesByName(String name, WebSeries b) {
		List<WebSeries> r = new ArrayList<WebSeries>();
		b.setName(name);
		if(b.getName().toString()==name)
			r.add(b);
		return r;
	}

	public void updateSeries(WebSeries b) {
		wbr.save(b);
	}

	public String deleteSeriesById(String id) {
		wbr.deleteById(id);
		return "Series Removed !" + id;
	}

	 
}
