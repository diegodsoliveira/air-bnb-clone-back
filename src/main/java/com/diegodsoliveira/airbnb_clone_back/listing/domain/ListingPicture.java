package com.diegodsoliveira.airbnb_clone_back.listing.domain;

import com.diegodsoliveira.airbnb_clone_back.sharedkernel.domain.AbstractAuditingEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "listing_picture")
@Data
public class ListingPicture extends AbstractAuditingEntity<Long> {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "listingPictureSequenceGenerator")
  @SequenceGenerator(name = "listingPictureSequenceGenerator", sequenceName = "listing_picture_generator", allocationSize = 1)
  @Column(name = "id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "listing_fk", referencedColumnName = "id")
  private Listing listing;

  @Lob
  @Column(name = "file", nullable = false)
  private byte[] file;

  @Column(name = "file_content_type")
  private String fileContentType;

  @Column(name = "is_cover")
  private boolean isCover;
}
