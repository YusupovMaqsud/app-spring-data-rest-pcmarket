package uz.pdp.appspringdatarestpcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Monoblock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String model;

    private Integer processor;

    private Integer screen;

    private Integer ssd;

    private Integer hardDisk;

    private Integer price;

    @ManyToOne
    private Attachment photo;

    @ManyToOne
    private Inbasket inbasket;
}
