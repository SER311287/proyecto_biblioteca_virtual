package biblioteca.uspg.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud_Usuario")
public class SolicitudUsuario {
	
	@Id		
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String username;    
	
	@Column(name = "clave", nullable = false)
	String password;
	
	@Column(name = "correo_electronico", nullable = false, unique = true, length=100)
	String mail;
	
	@Column(name ="nombre",nullable=false, length=100)
	String nombre;
	
	@Column(name ="saldo",nullable=false, length=5)
	Integer saldo;
	
	@Column(name ="fecha",nullable=false)
	LocalDateTime fecha;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
