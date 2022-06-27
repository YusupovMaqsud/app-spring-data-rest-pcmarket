package uz.pdp.appspringdatarestpcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Monitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String model;

    private Integer screen;

    private Integer price;

    @ManyToOne
    private Attachment photo;

    @ManyToOne
    private Inbasket inbasket;
}
