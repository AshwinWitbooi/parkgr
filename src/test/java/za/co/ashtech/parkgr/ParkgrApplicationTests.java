package za.co.ashtech.parkgr;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.net.URISyntaxException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.co.ashtech.parkgr.controller.models.RandomResource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkgrApplicationTests {
	
    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate testRestTemplate;

	@Test
	void testGetRandomParkRun() throws URISyntaxException {		
	    // Set up the headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("txId", TestUtils.testUUID());
        headers.set("senderId", TestUtils.SENDER_ID);
        headers.set("externalRef", TestUtils.externalRef());
        
        // Create an HttpEntity with headers
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        // Send the request with headers
        ResponseEntity<RandomResource> response = testRestTemplate.exchange("http://localhost:"+port+"/parkgr/parkrun/random", HttpMethod.GET, entity, RandomResource.class);
        assertNotNull(response.getBody().getParkrun());
	
	}
}
