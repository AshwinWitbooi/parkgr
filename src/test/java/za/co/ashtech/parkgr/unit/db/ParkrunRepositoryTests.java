package za.co.ashtech.parkgr.unit.db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.ashtech.parkgr.db.repository.ParkrunRepository;

@SpringBootTest
class ParkrunRepositoryTests {

	@Autowired
	ParkrunRepository parkrunRepository;

	@BeforeEach
	void verifyConfig() {
		assertNotNull(parkrunRepository);
	}


	@Test
	void getRandomParkrunTest() {
		assertEquals(true, parkrunRepository.findAll().iterator().hasNext());
	}

}
