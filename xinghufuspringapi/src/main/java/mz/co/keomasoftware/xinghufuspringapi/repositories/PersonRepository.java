package mz.co.keomasoftware.xinghufuspringapi.repositories;

import mz.co.keomasoftware.xinghufuspringapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
