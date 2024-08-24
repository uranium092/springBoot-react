package com.engineV4.entidades;
import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class User {

	public User() {
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [clave=" + clave + ", correo=" + correo + ", contrasena=" + contrasena + "]";
	}




	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int clave;
	
	@Column(name="email")
	private String correo;
	
	@Column(name="password_")
	private String contrasena;

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}