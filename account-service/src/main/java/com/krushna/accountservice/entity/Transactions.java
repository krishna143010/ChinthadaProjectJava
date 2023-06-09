package com.krushna.accountservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transId;
    @ManyToOne
    private Clients fromClientId;
    @ManyToOne
    private Clients toClientId;
    @ManyToOne
    private Accounts fromAccountId;
    @ManyToOne
    private Accounts toAccountId;
    private String remarks;
    private Date date;
    @Column(name = "timestamp", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    public Timestamp timestamp;
}
