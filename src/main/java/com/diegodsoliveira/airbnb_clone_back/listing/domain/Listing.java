package com.diegodsoliveira.airbnb_clone_back.listing.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import com.diegodsoliveira.airbnb_clone_back.booking.BookingCategory;
import com.diegodsoliveira.airbnb_clone_back.sharedkernel.domain.AbstractAuditingEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "listing")
@Data
public class Listing extends AbstractAuditingEntity<Long> {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "listingSequenceGenerator")
  @SequenceGenerator(name = "listingSequenceGenerator", sequenceName = "listing_generator", allocationSize = 1)
  @Column(name = "id")
  private Long id;

  @UuidGenerator
  @Column(name = "public_id", nullable = false)
  private UUID publicId;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "guests")
  private int guests;

  @Column(name = "bedrooms")
  private int bedrooms;

  @Column(name = "beds")
  private int beds;

  @Column(name = "bathrooms")
  private int bathrooms;

  @Column(name = "price")
  private int price;

  @Enumerated(EnumType.STRING)
  @Column(name = "category")
  private BookingCategory bookingCategory;

  @Column(name = "location")
  private String location;

  @Column(name = "landlord_public_id")
  private UUID landlordPublicId;

  @OneToMany(mappedBy = "listing", cascade = CascadeType.REMOVE)
  private Set<ListingPicture> pictures = new HashSet<>();
}
