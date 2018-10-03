package com.cg.lms.service;

import java.util.List;

import com.cg.lms.dao.IRegisterEntryDao;
import com.cg.lms.dao.RegisterEntryDaoImpl;
import com.cg.lms.exception.LMSException;
import com.cg.lms.model.BookingDetails;

public class RegisterEntryServiceImpl implements IRegisterEntryService {

	private IRegisterEntryDao entryDao;
	
	public RegisterEntryServiceImpl() {
		entryDao=new RegisterEntryDaoImpl();
	}
	
	@Override
	public List<BookingDetails> listReservedBooks() throws LMSException {
		return entryDao.listReservedBooks();
	}

	@Override
	public List<BookingDetails> listIssuedBooks() throws LMSException {
		return entryDao.listIssuedBooks();
	}

	@Override
	public boolean reserveBook(BookingDetails regEntry) throws LMSException {
		return entryDao.reserveBook(regEntry);
	}

	@Override
	public boolean issueBook(BookingDetails regEntry) throws LMSException {
		return entryDao.issueBook(regEntry);
	}

	@Override
	public boolean returnBook(BookingDetails regEntry) throws LMSException {
		return entryDao.returnBook(regEntry);
	}

	@Override
	public BookingDetails findEntry(int logid) throws LMSException {
		return entryDao.findEntry(logid);
	}
}
