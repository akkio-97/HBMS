package com.cg.lms.dao;

import java.util.List;

import com.cg.lms.exception.LMSException;
import com.cg.lms.model.Hotel;

public interface IBookDao {

	String saveBook(Hotel book) throws LMSException;
	List<Hotel> listBooks() throws LMSException;
	Hotel findBook(String bcode) throws LMSException;
}
