package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import entities.Flight;
import repos.FlightRepo;

@Service
public class FlightService {
	FlightRepo flightRepo;

	public FlightService(FlightRepo flightRepo) {
		super();
		this.flightRepo = flightRepo;
	}

	public List<Flight> getAllFlight() {

		return flightRepo.findAll();
	}

	public Flight newFlight(Flight newFlight) {
		return flightRepo.save(newFlight);
	}

	public Flight getFlightNumber(String flightNumber) {
		return flightRepo.findById(flightNumber).orElse(null);
	}

	public Flight updateFlight(String flightNumber, Flight newFlight) {
		Optional<Flight> flight = flightRepo.findById(flightNumber);
		if (flight.isPresent()) {
			Flight foundFlight = flight.get();
			foundFlight.setFlightNumber(newFlight.getFlightNumber());
			foundFlight.setRoute(newFlight.getRoute());
			foundFlight.setPrice(newFlight.getPrice());
			foundFlight.setDepartureTime(newFlight.getDepartureTime());
			foundFlight.setArrivalTime(newFlight.getArrivalTime());
			foundFlight.setStatus(newFlight.getStatus());
			flightRepo.save(foundFlight);
			return foundFlight;
		} else {
			return null;
		}
	}

	public void deleteById(String flightNumber) {
		flightRepo.deleteById(flightNumber);

	}

}
