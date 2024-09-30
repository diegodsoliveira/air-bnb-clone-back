package com.diegodsoliveira.airbnb_clone_back.sharedkernel.domain;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAuditingEntity<T> implements Serializable {

  public abstract T getId();

  @CreatedDate
  @Column(updatable = false, name = "created_date")
  private Instant createdDate = Instant.now();

  @LastModifiedDate
  @Column(name = "last_modified_date")
  private Instant lastModifiedDate = Instant.now();


}
