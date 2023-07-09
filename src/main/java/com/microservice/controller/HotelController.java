package com.microservice.controller;

import com.microservice.entities.Hotel;
import com.microservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    //create
    @PostMapping
    public ResponseEntity<Hotel>createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }
    //getSingle
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel>getSingleHotel(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getSingleHotel(hotelId));
    }
    //getAll
    @GetMapping
    public ResponseEntity<List<Hotel>>getAllHotels(){

        return ResponseEntity.ok(hotelService.getAll());
    }

}
