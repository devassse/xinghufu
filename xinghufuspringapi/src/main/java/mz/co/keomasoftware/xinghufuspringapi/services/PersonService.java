package mz.co.keomasoftware.xinghufuspringapi.services;

import mz.co.keomasoftware.xinghufuspringapi.entities.Person;
import mz.co.keomasoftware.xinghufuspringapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> listAll(){
        return personRepository.findAll();
    }

    public void save(Person person){
        personRepository.save(person);
    }

    public Person get(Long id){
        return personRepository.findById(id).get();
    }

    public void delete(Long id){
        personRepository.deleteById(id);
    }
}
