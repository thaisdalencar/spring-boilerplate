package com.thaisdalencar.bookapi.book;

import com.thaisdalencar.bookapi.Data.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Book extends BaseEntity {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
