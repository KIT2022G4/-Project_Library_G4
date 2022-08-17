package com.projectcapstone.library.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "bookentry")
public class BookEntry implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long identry;

    private String bookname;

    private String author;

//    date of requirements
    @Column(columnDefinition = "DATE DEFAULT (CURRENT_DATE)")
    private Date dor;

    @ManyToOne
    @JoinColumn(name = "codeuser", nullable = false, referencedColumnName="codeuser")
    private User user;


}
