package com.cg.lms.dao;

import java.time.LocalDate;
import java.util.List;

import com.cg.lms.exception.LMSException;
import com.cg.lms.model.BookingDetails;

public interface IRegisterEntryDao {
	List<BookingDetails> listReservedBooks() throws LMSException;

	List<BookingDetails> listIssuedBooks() throws LMSException;
	BookingDetails findEntry(int logid) throws LMSException;
	
	boolean reserveBook(BookingDetails regEntry) throws LMSException;
	boolean issueBook(BookingDetails regEntry) throws LMSException;
	boolean returnBook(BookingDetails regEntry) throws LMSException;	
}
