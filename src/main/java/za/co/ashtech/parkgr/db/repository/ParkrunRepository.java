package za.co.ashtech.parkgr.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import za.co.ashtech.parkgr.db.entities.Parkrun;

@Repository
public interface ParkrunRepository extends CrudRepository<Parkrun, Long> {
}