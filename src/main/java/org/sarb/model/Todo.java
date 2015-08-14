package org.sarb.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by chazz on 5/27/2015.
 */
@Entity
@Table(name = "Todo")
@Data
@ToString
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String details;

    @Version
    private Long version;

    public Todo(String title, String details) {
        this.title = title;
        this.details = details;
    }

	public Todo(){}

}

