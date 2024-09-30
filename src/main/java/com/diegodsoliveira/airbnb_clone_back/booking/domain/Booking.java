package com.diegodsoliveira.airbnb_clone_back.booking.domain;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import com.diegodsoliveira.airbnb_clone_back.sharedkernel.domain.AbstractAuditingEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "booking")
@Data
public class Booking extends AbstractAuditingEntity<Long> {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingSequenceGenerator")
  @SequenceGenerator(name = "bookingSequenceGenerator", sequenceName = "booking_generator", allocationSize = 1)
  @Column(name = "id")
  private Long id;

  @UuidGenerator
  @Column(name = "public_id", nullable = false)
  private UUID publicId;

  @Column(name = "start_date", nullable = false)
  private OffsetDateTime startDate;

  @Column(name = "end_date", nullable = false)
  private OffsetDateTime endDate;

  @Column(name = "total_price", nullable = false)
  private int totalPrice;

  @Column(name = "nb_of_travelers", nullable = false)
  private int numberOfTravelers;

  @Column(name = "fk_tenant", nullable = false)
  private UUID fkTenant;

  @Column(name = "fk_listing", nullable = false)
  private UUID fkListing;
}
