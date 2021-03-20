package com.dorian.PortalWebBack.dto;

public class EmpresaDto {

	public String NombreDeEmpresa;
	
    public String Locacion;
    
    public long RUC;
    
    public String SitioWeb;
    
    public String Descripcion;
    
    public String Correo;
    
    public String Contrasenia;
    
    public EmpresaDto() {
    	
    }

	public String getNombreDeEmpresa() {
		return NombreDeEmpresa;
	}

	public void setNombreDeEmpresa(String nombreDeEmpresa) {
		NombreDeEmpresa = nombreDeEmpresa;
	}

	public String getLocacion() {
		return Locacion;
	}

	public void setLocacion(String locacion) {
		Locacion = locacion;
	}

	public long getRUC() {
		return RUC;
	}

	public void setRUC(long rUC) {
		RUC = rUC;
	}

	public String getSitioWeb() {
		return SitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		SitioWeb = sitioWeb;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
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
