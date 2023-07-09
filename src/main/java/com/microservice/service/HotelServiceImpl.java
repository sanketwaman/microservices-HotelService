package com.microservice.service;

import com.microservice.entities.Hotel;
import com.microservice.exception.ResourceNotFoundException;
import com.microservice.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getSingleHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel with given id not found"));
    }
}
