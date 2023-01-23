package com.movie.booking.app.bookingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.booking.app.bookingapplication.datamodel.City;
import com.movie.booking.app.bookingapplication.datamodel.Seats;
import com.movie.booking.app.bookingapplication.datamodel.Theathers;
import com.movie.booking.app.bookingapplication.service.TheatherService;

import java.util.List;

@RestController
public class TheatherController {
	 @Autowired
    private TheatherService theatherService;

   
    public TheatherController(TheatherService theatherService) {
        this.theatherService = theatherService;
    }

    @GetMapping("/getTheatherSeats")
    public List<Theathers> getTheatherSeats(Seats seats) {
        return theatherService.getTheatherSeats(seats);
    }
}
