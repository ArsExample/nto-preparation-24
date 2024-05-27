package Sections;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Table(name="Education")

@Entity
@Data
@NoArgsConstructor
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String a;
}
