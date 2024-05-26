package Sections;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Education")
@Data
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
}
