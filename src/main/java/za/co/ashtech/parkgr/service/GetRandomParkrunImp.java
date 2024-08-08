package za.co.ashtech.parkgr.service;

import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.ashtech.parkgr.controller.models.RandomResource;
import za.co.ashtech.parkgr.db.entities.Parkrun;
import za.co.ashtech.parkgr.db.repository.ParkrunRepository;

/**
 * @author Ashwin
 *
 */

@Service
public class GetRandomParkrunImp implements GetRandomParkrun {

	@Autowired
	private ParkrunRepository parkrunRepository;

	@Override
	public RandomResource getRandomParkrun() {
		RandomResource randomResource = new RandomResource();
		Stream<Parkrun> parkrunRecordsStream = StreamSupport.stream(parkrunRepository.findAll().spliterator(), false);

		Parkrun randomParkrun = parkrunRecordsStream.findAny().get();
		
		randomResource.setExternalRef("externalRef"); // This will be handled with AOP TX logging
		randomResource.setTxId(UUID.randomUUID());  // This will be handled with AOP TX logging
		randomResource.setSenderId("senderId");  // This will be handled with AOP TX logging
		randomResource.setParkrun(new za.co.ashtech.parkgr.controller.models.Parkrun());
		randomResource.getParkrun().setCity(randomParkrun.getCity());
		randomResource.getParkrun().setName(randomParkrun.getName());
		randomResource.getParkrun().setProvince(randomParkrun.getProvince());
		randomResource.getParkrun().setStreetName(randomParkrun.getStreet_name());
		randomResource.getParkrun().setStreetNumber(randomParkrun.getStreet_number());
		randomResource.getParkrun().setSuburb(randomParkrun.getSuburb());

		return randomResource;

	}

}
