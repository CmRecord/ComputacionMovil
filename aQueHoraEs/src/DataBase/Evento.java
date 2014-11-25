package DataBase;

import java.sql.Date;
import java.sql.Time;

public class Evento {
	String Nombre;
	int id;
	String Salon;
	Time Hora;
	Date Dia;
	String Director;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalon() {
		return Salon;
	}

	public void setSalon(String salon) {
		Salon = salon;
	}

	public Time getHora() {
		return Hora;
	}

	public void setHora(Time hora) {
		Hora = hora;
	}

	public Date getDia() {
		return Dia;
	}

	public void setDia(Date dia) {
		Dia = dia;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

}
