package com.waq.training.place;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<PlaceP, String> {
	
	//List<PlaceP> findByUserId(String userId); //For getting the places by specifying user id, wouldnt work
	
	List<PlaceP> findByUserUserId(String userId); //For getting the places by specifying user id
	
}
