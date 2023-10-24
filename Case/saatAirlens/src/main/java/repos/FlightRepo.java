package repos;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Flight;

public interface FlightRepo extends JpaRepository<Flight, String> {

}
