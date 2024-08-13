package za.co.ashtech.parkgr.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import za.co.ashtech.parkgr.controller.models.Parkrun;
import za.co.ashtech.parkgr.controller.models.RandomResource;
import za.co.ashtech.parkgr.service.GetRandomParkrun;
import za.co.ashtech.parkgr.utils.ParkrunNotFoundException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-06T14:52:13.057490747Z[GMT]")
@RestController
public class ParkrunApiController implements ParkrunApi {

	private static final Logger parkrunApiControllerLog = LoggerFactory.getLogger(ParkrunApiController.class);
	
	@Autowired
	private GetRandomParkrun getRandomParkrun;
	
	public ResponseEntity<RandomResource> getRandomParkrun(HttpServletRequest request,
			@Parameter(in = ParameterIn.HEADER, description = "Transaction ID", required = true, schema = @Schema()) @RequestHeader(value = "txId", required = true) UUID txId,
			@Parameter(in = ParameterIn.HEADER, description = "Name of sender", required = true, schema = @Schema()) @RequestHeader(value = "senderId", required = true) String senderId,
			@Parameter(in = ParameterIn.HEADER, description = "External reference for consuming client", schema = @Schema()) @RequestHeader(value = "externalRef", required = false) String externalRef) {
		parkrunApiControllerLog.debug("Enter ParkrunApiCntroller");
		String accept = request.getHeader("Accept");
		parkrunApiControllerLog.debug("Get Accept header");
		if (accept != null && accept.contains("application/json") || accept.contains("*/*")) {
			parkrunApiControllerLog.info("Accept header is valid");

			RandomResource randomParkrun = null;
			try {
				randomParkrun = getRandomParkrun.getRandomParkrun();
			} catch (ParkrunNotFoundException e) {
//				This need to be handled
				e.printStackTrace();
			}

			return new ResponseEntity<RandomResource>(randomParkrun, HttpStatus.OK	);
		}else {
//			Throw exception indicating invalid Accept header received and return 400
		}

		return new ResponseEntity<RandomResource>(HttpStatus.NOT_IMPLEMENTED);
	}

}
