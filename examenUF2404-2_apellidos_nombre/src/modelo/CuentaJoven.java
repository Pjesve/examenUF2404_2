package modelo;

public class CuentaJoven extends Cuenta  {
	  double bonificacion;
	private boolean estudiante;
	
	
	
	public CuentaJoven(Persona titular, double bonificacion, boolean estudiante) {
		super(titular);
		this.bonificacion = bonificacion;
		this.estudiante = estudiante;
		
		if Persona edad >=26) {
			return this.bonificacion, this.estudiante
	}

	}


	public double getBonificacion() {
		return bonificacion;
	}


	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}


	public boolean isEstudiante() {
		return estudiante;
	}


	public void setEstudiante(boolean estudiante) {
		this.estudiante = estudiante;
	}


	@Override
	public String toString() {
		return "CuentaJoven [bonificacion=" + bonificacion + ", estudiante=" + estudiante + "]";
	}
	
	public double calculaIntereses() {
		calculaInteres= bonificacion ;
		
		
		
		
	
	
	
	}

}

