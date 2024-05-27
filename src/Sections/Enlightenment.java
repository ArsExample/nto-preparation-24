package Sections;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Enlightenment")
@Data
public class Enlightenment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
}
