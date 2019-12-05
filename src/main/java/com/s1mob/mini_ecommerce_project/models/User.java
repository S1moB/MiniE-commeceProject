package com.s1mob.mini_ecommerce_project.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
  @Id
  String username;

  String password;

  boolean enabled;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
  Set<Authorities> authorities = new HashSet<>();

}