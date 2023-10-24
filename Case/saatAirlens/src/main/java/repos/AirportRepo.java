package repos;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Airport;

public interface AirportRepo extends JpaRepository<Airport	,Integer> {

}
