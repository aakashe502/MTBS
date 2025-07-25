package com.mtbs.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BookingRedisParent implements Serializable {

	private static final long serialVersionUID = -4529395733586171543L;

	public BookingRedisParent(){}
	/**
	 * Unique id for request for that millisecond
	 * @param bookingModel
	 */
	String id;
	public BookingRedisParent(BookingModel bookingModel) { 
		this.id = new StringBuffer().append(bookingModel.getTheaterId()).append(bookingModel.getScreenId()).append(bookingModel.getBranchId())
				.append(new Timestamp(System.currentTimeMillis()).getTime())+"";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<BookingRedisChild> getBookingRedisChild() {
		return bookingRedisChild;
	}

	public void setBookingRedisChild(List<BookingRedisChild> bookingRedisChild) {
		this.bookingRedisChild = bookingRedisChild;
	}

	List<BookingRedisChild> bookingRedisChild = new ArrayList<>();
}
