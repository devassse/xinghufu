package mz.co.keomasoftware.xinghufuspringapi.controllers;

import mz.co.keomasoftware.xinghufuspringapi.entities.Person;
import mz.co.keomasoftware.xinghufuspringapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> listPersons(){
        return personService.listAll();
    }

    @GetMapping( "/person/{id}")
    public ResponseEntity<Person> get(@PathVariable Long id){
        try{
            Person person = personService.get(id);
            return new ResponseEntity<Person>(person, HttpStatus.OK);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/person")
    public void add(@RequestBody Person person){
        personService.save(person);
    }

    @PutMapping("/person/{id}")
    public ResponseEntity<?> update(@RequestBody Person person,@PathVariable Long id){
        try{
            Person existPerson = personService.get(id);
            existPerson = person;
            personService.save(existPerson);
            return new ResponseEntity<Person>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<Person> delete(@PathVariable Long id){
        try {
            personService.delete(id);
            return new ResponseEntity<Person>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }

}
