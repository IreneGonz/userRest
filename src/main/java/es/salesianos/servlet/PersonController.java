package es.salesianos.servlet;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.salesianos.model.User;
import es.salesianos.service.Service;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/api/v1/user")
public class PersonController {

	List<User> users = new ArrayList<User>();

	@Autowired
	private Service service;

	// http://localhost:8080/api/v1/user/delete/equipo/
	@RequestMapping(value = "/delete/{tablename}/", method = RequestMethod.GET)
	public ResponseEntity delete(@PathVariable String tablename, @RequestParam(required = false) Integer id) {
		service.delete(tablename, id);
		return new ResponseEntity(HttpStatus.OK);
	}

//	@PostMapping
//	@RequestMapping(value = "/create")
//	public ResponseEntity<User> create(@RequestBody User person) {
//		service.insertOrupdateUser(person);
//		return new ResponseEntity<>(person, HttpStatus.CREATED);
//	}

//	@PostMapping
//	@RequestMapping(value = "/create")
//	public void create() {
//		User u1 = new User();
//		User u2 = new User();
//		User u3 = new User();
//
//		u1.setNombre("nom");
//		u1.setApellido("ape");
//		u1.setDni("111");
//
//		u2.setNombre("nom2");
//		u2.setApellido("ape2");
//		u2.setDni("222");
//
//		u3.setNombre("nom3");
//		u3.setApellido("ape3");
//		u3.setDni("333");
//
//		users.add(u1);
//		users.add(u2);
//		users.add(u3);
//	}

	@PostMapping
	@RequestMapping(value = "/create")
	public ResponseEntity<User> create(@RequestBody User person) {
//		User u1 = new User();
//		User u2 = new User();
//		User u3 = new User();

//		u1.setNombre("nom");
//		u1.setApellido("ape");
//		u1.setDni("111");
//
//		u2.setNombre("nom2");
//		u2.setApellido("ape2");
//		u2.setDni("222");
//
//		u3.setNombre("nom3");
//		u3.setApellido("ape3");
//		u3.setDni("333");

//		users.add(u1);
//		users.add(u2);
//		users.add(u3);

		users.add(person);

		return new ResponseEntity<>(person, HttpStatus.CREATED);
	}

//	@PostMapping
//	@RequestMapping(value = "/list")
//	public ResponseEntity<List<User>> ListWithFilter(@RequestParam String filter) {
//		return new ResponseEntity<>(service.listAllUser(), HttpStatus.OK);
//	}

	@PostMapping
	@RequestMapping(value = "/list")
	public ResponseEntity<List<User>> ListAll() {
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

}
