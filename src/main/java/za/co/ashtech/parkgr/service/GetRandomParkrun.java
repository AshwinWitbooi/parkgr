/**
 * 
 */
package za.co.ashtech.parkgr.service;

import za.co.ashtech.parkgr.controller.models.RandomResource;
import za.co.ashtech.parkgr.utils.ParkrunNotFoundException;

/**
 * @author Ashwin
 *
 */
public interface GetRandomParkrun {
	public RandomResource getRandomParkrun() throws ParkrunNotFoundException;
}
