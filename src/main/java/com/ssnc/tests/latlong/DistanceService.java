package com.ssnc.tests.latlong;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DistanceService {
	private Map<String,City> cityLocations = new HashMap<>();
	private static final double RADIUS_OF_THE_EARTH = 6371.0;
	
	public DistanceService(Set<City> cities) {
		cities.stream().forEach( city -> cityLocations.put( city.getName(), city) );
	}
		
	public Pair<City> findClosestCities(Set<String> cityNames) throws LatLongException {
		//TODO: add code here - you may add other classes/methods as you wish
		return null;
	}
	
}
