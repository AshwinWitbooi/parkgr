package za.co.ashtech.parkgr.unit.db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import za.co.ashtech.parkgr.db.entities.Parkrun;
import za.co.ashtech.parkgr.db.repository.ParkrunRepository;

@ExtendWith(MockitoExtension.class)
class ParkrunRepositoryTests {

	@Mock
	ParkrunRepository parkrunRepository;

	@BeforeEach
	void verifyConfig() {
		assertNotNull(parkrunRepository);
		
		Parkrun parkrun = new Parkrun("Belhar", "Adam Tas Street", "1", "Belhar", "Cape Town", "WC");
		Parkrun parkrun1 = new Parkrun("Brackenfell", "Old Paarl Road", "111", "Brackenfell", "Cape Town", "WC");
		
		List<Parkrun> parkruns = Arrays.asList(parkrun,parkrun1);
		// When
		when(parkrunRepository.findAll()).thenReturn(parkruns);
	}


	@Test
	void getRandomParkrunTest() {
		assertEquals(true, parkrunRepository.findAll().iterator().hasNext());
	}

}
