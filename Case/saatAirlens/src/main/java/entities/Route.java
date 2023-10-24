package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Route")
@Data
public class Route {
	@ManyToOne
	@JoinColumn
	Airport source;
	Airport destination;
	Integer distanceInMiles;
	public Airport getSource() {
		return source;
	}
	public void setSource(Airport source) {
		this.source = source;
	}
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	public Integer getDistanceInMiles() {
		return distanceInMiles;
	}
	public void setDistanceInMiles(Integer distanceInMiles) {
		this.distanceInMiles = distanceInMiles;
	}
	
	
	
}
