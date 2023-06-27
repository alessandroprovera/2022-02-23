package it.polito.tdp.yelp.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.yelp.db.YelpDao;

public class Model {
	YelpDao dao = new YelpDao();
	
	public List<String> getCities(){
		List<String> cities = new ArrayList<>();
		for(Business b: dao.getAllBusiness()) {
			cities.add(b.getCity());
		}
		return cities;
	}
	
	
}
