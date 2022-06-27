package uz.pdp.appspringdatarestpcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String model;

    private Integer ram;

    private Integer processor;

    private Integer ssd;

    private Integer videoCard;

    private Integer hardDisk;

    private Integer price;

    @ManyToOne
    private Attachment photo;

    @ManyToOne
    private Inbasket inbasket;
}
