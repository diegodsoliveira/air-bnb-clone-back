package com.diegodsoliveira.airbnb_clone_back.listing.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegodsoliveira.airbnb_clone_back.listing.domain.Listing;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long>{

}
