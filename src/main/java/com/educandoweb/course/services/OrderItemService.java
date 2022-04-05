package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
	}
	
	public OrderItem findById(Long id) {
	
		//ele vai pegar o objeto que retornar e guardar em Optional
		Optional<OrderItem> obj = repository.findById(id);
		
		//esse metodo vai retornar o objeto que estiver em Optional
		return obj.get();
	}
}
