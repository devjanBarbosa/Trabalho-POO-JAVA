package Entities;

public class Motor {
	public String Marca;
	public Integer Rpm;
	public Integer RpmMaximo;
	public String TipoCombustivel;
	public Motor(String marca, Integer rpm, Integer rpmMaximo, String tipoCombustivel) {
		
		this.Marca = marca;
		this.Rpm = rpm;
		this.RpmMaximo = rpmMaximo;
		this.TipoCombustivel = tipoCombustivel;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public Integer getRpm() {
		return Rpm;
	}
	public void setRpm(Integer rpm) {
		Rpm = rpm;
	}
	public Integer getRpmMaximo() {
		return RpmMaximo;
	}
	public void setRpmMaximo(Integer rpmMaximo) {
		RpmMaximo = rpmMaximo;
	}
	public String getTipoCombustivel() {
		return TipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		TipoCombustivel = tipoCombustivel;
	}
	
	

}
