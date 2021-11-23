package biblioteca.uspg.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservacion")
public class Reservacion {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id_reservacion;
	

	@Column(name ="nombre_usuario",nullable=false, length=20)
	String username;
	
	@Column(name ="isbn_libro",nullable=false, length=13)
	String isbn_libro;
	
	
	@Column(name ="fecha_entrega",nullable=false)
	LocalDate fecha_entrega	;
	
	@Column(name ="fecha_recordatorio",nullable=false)
	LocalDate  fecha_recordatorio;
 
	

	
	

	public Integer getId_reservacion() {
		return id_reservacion;
	}

	public void setId_reservacion(Integer id_reservacion) {
		this.id_reservacion = id_reservacion;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getIsbn_libro() {
		return isbn_libro;
	}

	public void setIsbn_libro(String isbn_libro) {
		this.isbn_libro = isbn_libro;
	}

	public LocalDate getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(LocalDate fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public LocalDate getFecha_recordatorio() {
		return fecha_recordatorio;
	}

	public void setFecha_recordatorio(LocalDate fecha_recordatorio) {
		this.fecha_recordatorio = fecha_recordatorio;
	}
	
	
		
}
