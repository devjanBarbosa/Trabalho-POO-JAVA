
package Entities;

public abstract class Veiculo {
	
    protected Integer Numpass;
    protected Double preco;
    protected String proprietario;
    protected Integer VolumeMaia;
    protected Motor Motor;
    protected Integer TempoMaxUso = 30;
    protected String Marca;
    protected Integer IdadeMinimaMotorista = 18;
    protected String Placa;
	public Integer getNumpass() {
		return Numpass;
	}
	public void setNumpass(Integer numpass) {
		Numpass = numpass;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public Integer getVolumeMaia() {
		return VolumeMaia;
	}
	public void setVolumeMaia(Integer volumeMaia) {
		VolumeMaia = volumeMaia;
	}
	public Motor getMotor() {
		return Motor;
	}
	public void setMotor(Motor motor) {
		Motor = motor;
	}
	public Integer getTempoMaxUso() {
		return TempoMaxUso;
	}
	public void setTempoMaxUso(Integer tempoMaxUso) {
		TempoMaxUso = tempoMaxUso;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public Integer getIdadeMinimaMotorista() {
		return IdadeMinimaMotorista;
	}
	public void setIdadeMinimaMotorista(Integer idadeMinimaMotorista) {
		IdadeMinimaMotorista = idadeMinimaMotorista;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public Veiculo(Integer numpass, Double preco, String proprietario, Integer volumeMaia, Motor motor,
			Integer tempoMaxUso, String marca, Integer idadeMinimaMotorista, String placa) {
		Numpass = numpass;
		this.preco = preco;
		this.proprietario = proprietario;
		VolumeMaia = volumeMaia;
		Motor = motor;
		TempoMaxUso = tempoMaxUso;
		Marca = marca;
		IdadeMinimaMotorista = idadeMinimaMotorista;
		Placa = placa;
	}
    
    
    


    

}
