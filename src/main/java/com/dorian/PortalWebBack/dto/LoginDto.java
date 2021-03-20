package com.dorian.PortalWebBack.dto;

public class LoginDto {

	public String Correo;
	
	public String Contrasenia;

	public LoginDto(String correo, String contrasenia) {
		Correo = correo;
		Contrasenia = contrasenia;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}
}
