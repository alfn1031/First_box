package com.kh.cahp07.controller;

import com.kh.cahp07.model.service.TicketService;
import com.kh.cahp07.model.vo.Ticket;

public class TicketController {
	private TicketService ts = new TicketService();
	
	public int saveTicket(Ticket ticket) {
		// System.out.println("Controller : " + ticket);
		ts.saveTicket(ticket);
		return ts.saveTicket(ticket);
	}
	
	public Ticket printTicket() {
		// 서비스야 티켓 남느거 있으면 하나만...
		Ticket ticket = ts.printTicket();
		return ticket;
	}
	
	public Ticket[] findAll() {
		Ticket[] tickets = ts.findAll();
		return tickets;
	}
	
}


