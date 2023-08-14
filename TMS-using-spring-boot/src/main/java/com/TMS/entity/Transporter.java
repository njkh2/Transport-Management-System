package com.TMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transporterId;
    private String transporterName;
    private String Mobile;
    private String address;

//    @OneToMany(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name="transporter_id",
//            referencedColumnName = "transporterId"
//    )
//    private List<Bill> bills;

}
