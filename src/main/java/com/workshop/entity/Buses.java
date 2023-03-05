package com.workshop.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "bustime7")
public class Buses {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fromCity")
	private String from;
	@Column(name = "toCity")
	private String to;
	@Column(name = "timeOfArrival")

	private String timeOfArrival;
	
	@Column(name = "via")

	private String via;
	
	
	
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "web")
    private String web;
	
	
	
	
	
	
	
	
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getTimeOfArrival() {
		return timeOfArrival;
	}
	public void setTimeOfArrival(String timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public Buses(String from, String to, String timeOfArrival, String via, String type, String url,String price,String web) {
		super();
		
		this.from = from;
		this.to = to;
		this.timeOfArrival = timeOfArrival;
		this.via = via;
		this.type = type;
		this.url = url;
		this.price = price;
		this.web = web;
	}
	public Buses() {
		
	}

	
}
