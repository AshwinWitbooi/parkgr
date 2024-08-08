package za.co.ashtech.parkgr.db.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Parkrun {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String street_name;
	private String street_number;
	private String suburb;
	private String city;
	private String province;
	
	public Parkrun(String name, String street_name, String street_number, String suburb, String city, String province) {
		super();
		this.name = name;
		this.street_name = street_name;
		this.street_number = street_number;
		this.suburb = suburb;
		this.city = city;
		this.province = province;
	}	

}
