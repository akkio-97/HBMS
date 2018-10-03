package com.cg.lms.model;

public class RoomDetails {
	private int hotelId;
	private int roomId;
	private int roomNo;
	private String roomType;
	private double amountPerNight;
	private String availability;
	
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getAmountPerNight() {
		return amountPerNight;
	}
	public void setAmountPerNight(double amountPerNight) {
		this.amountPerNight = amountPerNight;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
}
