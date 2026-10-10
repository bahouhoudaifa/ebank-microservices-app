package net.houdaifa.customerservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Builder
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Customer {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;


}
