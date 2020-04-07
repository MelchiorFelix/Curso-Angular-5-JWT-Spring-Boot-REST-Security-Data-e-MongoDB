package com.melchior.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.melchior.helpdesk.api.entity.ChangeStatus;

public interface ChangesStatusRepository extends MongoRepository<ChangeStatus, String>{
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
	
}
