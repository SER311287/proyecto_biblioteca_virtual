package biblioteca.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libro {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id_libro;

	@Column(name ="isbn",nullable=false, length=13)
	String  isbn;    
	
	
	@Column(name ="titulo",nullable=false, length=100)
	String titulo;
	
	 
	@Column(name ="autor",nullable=false, length=100)
	String autor;
	
	
	@Column(name ="categoria",nullable=false, length=100)
	String categoria;
	
	

	@Column(name ="precio",nullable=false, length=10)
	Integer precio;
	
	@Column(name ="copias",nullable=false, length=10)
	Integer copias;

	public Integer getId_libro() {
		return id_libro;
	}

	public void setId_libro(Integer id_libro) {
		this.id_libro = id_libro;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getCopias() {
		return copias;
	}

	public void setCopias(Integer copias) {
		this.copias = copias;
	}

	
	
	
	
	
	
}
