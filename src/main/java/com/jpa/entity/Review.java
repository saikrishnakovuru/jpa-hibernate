package com.jpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Review {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String rating;
  private String description;

  @ManyToOne(cascade = CascadeType.ALL)
  private Course course;
}
