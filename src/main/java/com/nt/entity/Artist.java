package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity  //to mark java bean as the entity class( entity class to mapping the db table
@Table(name="ARTIST_INFO") //here this is optional,if u do not give table class name as the table name
@NoArgsConstructor  //to create 0-param contructor 
@AllArgsConstructor  //all args constructor here 4
@RequiredArgsConstructor // if u want to 2 or 3 like that param contructor u can use Nonnull 
@Data
public class Artist {
	@Column(name="AID")  //here this is optional 
	@Id  //to mark the property as identity property( its mapped with primary column of db table)
	@GeneratedValue(strategy = GenerationType.AUTO)//here this is optional, default is auto(1,2,52,102,152,....)
	private Integer aid;// u cann't control the length for numeric column oracle , default length is 11
	@NonNull
	@Column(name="ANAME", length =40)
	private String aname;// u can control the length for String columns ,default is 250
	@NonNull
	@Column(length=30)
	private String category;
	@NonNull
	private Double fee;
}
