package controller;


import DTO.*;
import models.*;
import services.*;

public class TicketController {
	 private TicketService ticketService;
	//DTO - data transfer object 
	// data transer from client to system .
	private GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto) {
		Ticket ticket = ticketService.generateTicket(
				generateTicketRequestDto.getVehicleNumber(),
				generateTicketRequestDto.getVehicleType(),
				generateTicketRequestDto.getGateId()
				);
	}

}
