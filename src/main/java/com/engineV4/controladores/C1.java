package com.engineV4.controladores;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineV4.entidades.User;
import com.engineV4.servicios.ServiceUser;
import java.util.*;

@RestController
@RequestMapping("/dan")
@CrossOrigin
public class C1 { // @GetMapping @PostMapping @DeleteMapping @PutMapping
	
	@Autowired private ServiceUser servicio;
	
	@GetMapping("/saludar/{edad}")
	public String sayHello(@PathVariable("edad")int age) {
		System.out.println("Tienes "+age);
		return "sdnksbhsibgushgbsghbgshj"; 
	}
	
	
	
	@PostMapping("/insertar")
	public String nndsg( @RequestBody User cuerpo ) {
		servicio.guardar(cuerpo);
		return "";
	}
	
	@PostMapping("/existenciaUsuario")
	public ResponseEntity<?> exists(@RequestBody User user){
		List<User> coincidencias=servicio.existenciaUsuario(user.getCorreo(),user.getContrasena());
		if(coincidencias.size()==0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.status(HttpStatus.OK).build();
		} 
	}
	
}