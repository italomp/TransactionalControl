package com.example.transactionalControl.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "venda_id")
    private Sale sale;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(String name, Sale sale) {
        this.name = name;
        this.sale = sale;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
