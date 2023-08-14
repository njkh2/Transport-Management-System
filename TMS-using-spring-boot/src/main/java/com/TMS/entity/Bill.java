package com.TMS.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bill {
    @Id
    private int billNumber;
    @ManyToOne(
            cascade =CascadeType.ALL
    )
    @JoinColumn(
            name = "transporter_id",
            referencedColumnName = "id"
    )
    private Transporter transporter;
    private String sourceAndDestination;
    private int truckCharge;
    private int LessAdvance;
    private int extra;
    private int balance;
    private String truckNumber;
    private String ContainerNumber;
    private String pickupDate;
    private String emptyDate;

}
