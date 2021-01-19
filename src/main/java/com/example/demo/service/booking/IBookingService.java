package com.example.demo.service.booking;

import com.example.demo.model.Booking;
import com.example.demo.service.IGeneralService;

import java.util.Optional;

public interface IBookingService extends IGeneralService<Booking> {
    Iterable<Booking> findBookingByHouseId(Long id);
    Iterable<Booking> findBookingByUserId(Long id);

    void delete(Long id);
}
