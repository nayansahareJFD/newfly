package com.simplilearn.demo;

import java.math.BigDecimal;

public class FlightDetails {
	
	@Override
	public String toString() {
		return "FlightDetails [id=" + id + ", source=" + source + ", destination=" + destination + ", airline="
				+ airline + ", time=" + time + ", price=" + price + ", date=" + date + "]";
	}

	private long id;
    private String source;
    private String destination;
    private String airline;
    private String time;
    private BigDecimal price;
    private String date;

    public FlightDetails() {
    	
    }
     
    public FlightDetails(String source, String destination,
    		String airline, String time, BigDecimal price, String date) {
        super();
        this.source = source;
        this.destination = destination;
        this.airline = airline;
        this.time = time;
        this.price = price;
        this.date = date;
    }
    
    
    public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}