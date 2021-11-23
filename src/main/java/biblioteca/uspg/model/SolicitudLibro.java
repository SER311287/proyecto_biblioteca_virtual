package biblioteca.uspg.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solicitud_libro")
public class SolicitudLibro {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id_solicitud;
	
	@Column(name ="nombre_usuario",nullable=false, length=25)
	String username;
	
	@Column(name ="isbn_libro",nullable=false, length=13)
	String isbn_libro; 
	
	@Column(name ="fecha",nullable=false)
	LocalDateTime fecha;

	public Integer getId_solicitud() {
		return id_solicitud;
	}

	public void setId_solicitud(Integer id_solicitud) {
		this.id_solicitud = id_solicitud;
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

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	

}
