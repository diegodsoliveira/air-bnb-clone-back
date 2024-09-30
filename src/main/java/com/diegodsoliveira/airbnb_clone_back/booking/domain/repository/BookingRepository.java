package com.diegodsoliveira.airbnb_clone_back.booking.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegodsoliveira.airbnb_clone_back.booking.domain.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
