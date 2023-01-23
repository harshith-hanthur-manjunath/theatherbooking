package com.movie.booking.app.bookingapplication.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.booking.app.bookingapplication.datamodel.City;
import com.movie.booking.app.bookingapplication.datamodel.Theathers;
import com.movie.booking.app.bookingapplication.service.LocationService;
import com.movie.booking.app.bookingapplication.service.TheatherService;


@RestController
public class LocationController {
	 @Autowired
	    private LocationService locationService;
	 
	 
	    public LocationService(LocationService locationService) {
	        this.locationService = locationService;
	    }

	    @GetMapping("/getTheathers")
	    public List<Theathers> getAllTheatres(City city) {
	        return locationService.getAllTheatres(city);
	    }
	    
	    @GetMapping("/getShowsInTheathers")
	    public List<Theathers> getShowsInTheathers(Theathers theathers) {
	        return locationService.getShowsInTheathers(theathers);
	    }
}
