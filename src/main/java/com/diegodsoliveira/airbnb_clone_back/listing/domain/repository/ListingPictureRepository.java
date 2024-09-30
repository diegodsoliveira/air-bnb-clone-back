package com.diegodsoliveira.airbnb_clone_back.listing.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegodsoliveira.airbnb_clone_back.listing.domain.ListingPicture;

@Repository
public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {

}
