package com.TMS.repository;

import com.TMS.entity.Bill;
import com.TMS.entity.Transporter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransporterRepositoryTest {

    @Autowired
    private TransporterRepository transporterRepository;

    @Test
    public void saveTransporter(){
        Bill bill = Bill.builder()
                .transporterName("Ram krishna transport")
                .billNumber(101)
                .build();
        Transporter transporter = Transporter.builder()
                .transporterName("Ram Krishna Transport")
                .address("Vashi")
                .Mobile("54666")
                .bills(List.of(bill))
                .build();
    }

}