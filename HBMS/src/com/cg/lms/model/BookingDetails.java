package com.cg.lms.model;

import java.sql.Date;

public class BookingDetails {
	private int bookingId;
	private int roomId;
	private int userId;
	private Date bookedFrom;
	private Date bookedTo;
	private int noOfAdults;
	private int noOfChild;
	private double amount;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getBookedFrom() {
		return bookedFrom;
	}
	public void setBookedFrom(Date bookedFrom) {
		this.bookedFrom = bookedFrom;
	}
	public Date getBookedTo() {
		return bookedTo;
	}
	public void setBookedTo(Date bookedTo) {
		this.bookedTo = bookedTo;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChild() {
		return noOfChild;
	}
	public void setNoOfChild(int noOfChild) {
		this.noOfChild = noOfChild;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
