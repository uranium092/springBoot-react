package com.engineV4.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engineV4.entidades.User;
import com.engineV4.repositorios.UserRepository;

@Service
public class ServiceUser {
	
	@Autowired private UserRepository repositorio;
	
	public User guardar(User u) {
		return repositorio.save(u);
	}
	
	public List<User> existenciaUsuario(String email, String password){
		return repositorio.findByCorreoAndContrasena(email,password);
	}
	 
	
}
