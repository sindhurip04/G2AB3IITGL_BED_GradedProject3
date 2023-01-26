package com.greatlearning.ticket.Service;

import com.greatlearning.ticket.Entity.Ticket;

public interface CreateTicketService {

	Ticket createTicket(Ticket ticket);

	void saveTicket(Ticket ticket);

}