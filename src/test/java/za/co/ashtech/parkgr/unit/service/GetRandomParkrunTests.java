package za.co.ashtech.parkgr.unit.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import za.co.ashtech.parkgr.db.entities.Parkrun;
import za.co.ashtech.parkgr.db.repository.ParkrunRepository;
import za.co.ashtech.parkgr.service.GetRandomParkrunImp;

@ExtendWith(MockitoExtension.class)
class GetRandomParkrunTests {

	@Mock
	ParkrunRepository parkrunRepository;
 
	@InjectMocks
	GetRandomParkrunImp getRandomParkrun;

	@BeforeEach
	void verifyConfig() {
		assertNotNull(getRandomParkrun);
		
		Parkrun parkrun = new Parkrun("Belhar", "Adam Tas Street", "1", "Belhar", "Cape Town", "WC");
		Parkrun parkrun1 = new Parkrun("Brackenfell", "Old Paarl Road", "111", "Brackenfell", "Cape Town", "WC");
		
		List<Parkrun> parkruns = Arrays.asList(parkrun,parkrun1);
		// When
		when(parkrunRepository.findAll()).thenReturn(parkruns);

	}
	
	@Test
	void getRandomParkrunTest() {
		assertNotNull(getRandomParkrun.getRandomParkrun());
	}

}
