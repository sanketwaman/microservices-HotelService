package com.microservice.service;

import com.microservice.entities.Hotel;

import java.util.List;

public interface HotelService {

    //Create
    Hotel createHotel(Hotel hotel);

    //getAll
    List<Hotel> getAll();

    //get Single
    Hotel getSingleHotel(String id);
}
