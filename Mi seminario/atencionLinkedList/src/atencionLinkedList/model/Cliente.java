package atencionLinkedList.model;

public class Cliente {
 private String nombre;
 private String apellido;
 
 
 
public Cliente(String string, String string2) {
	// TODO Auto-generated constructor stub
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
	
	
}
@Override
public String toString() {
	return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]";
}
 
 
}
