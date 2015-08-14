package org.sarb.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by chazz on 7/18/2015.
 */
@Entity
@Table
@Data
@ToString
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String firstName;

	@Column
	private String lastName;

}
