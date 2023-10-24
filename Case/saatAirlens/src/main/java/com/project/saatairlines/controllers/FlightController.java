package com.project.saatairlines.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.FlightService;
import entities.Flight;

@RestController
@RequestMapping("/flight")
public class FlightController {

	private FlightService flightService;

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	@GetMapping
	public List<Flight> getAllFlight() {
		return flightService.getAllFlight();
	}

	@PostMapping
	public Flight createFlight(@RequestBody Flight newFlight) {
		return flightService.newFlight(newFlight);
	}

	@GetMapping("/{flightNumber}")
	public Flight getByFlightNumber(@PathVariable String flightNumber) {
		return flightService.getFlightNumber(flightNumber);
	}

	@PutMapping("/{flightNumber}")
	public Flight updateFlight(@PathVariable String flightNumber, @RequestBody Flight newFlight) {
		return flightService.updateFlight(flightNumber,newFlight);
	}

	@DeleteMapping("/{flightNumber}")
	public void deleteByFlightNumber(@PathVariable String flightNumber) {
		flightService.deleteById(flightNumber);
	}

}
