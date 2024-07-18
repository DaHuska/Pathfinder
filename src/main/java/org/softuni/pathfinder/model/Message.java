package org.softuni.pathfinder.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "messages")
public class Message extends BaseEntity {
    @Column
    private Date date;

    @Column
    private String content;

    @ManyToOne
    private User author;

    @OneToOne
    private User recipient;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}