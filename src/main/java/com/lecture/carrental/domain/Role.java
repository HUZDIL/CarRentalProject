package com.lecture.carrental.domain;

import com.lecture.carrental.domain.enumaration.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private UserRole name;

    @Override
    public String toString() {
        return "" + name + '}';
    }
}

//Rollerimizi enum klasindan alacagiz. bu yuzden enumareted diye anatasyon yazdik