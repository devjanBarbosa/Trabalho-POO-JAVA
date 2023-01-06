package Trabalho;

public class Iate extends Automovel {
	Integer NumTripulante, Numcabine;
	Boolean Piscina;
	
	public Iate(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação, Double comprimento,
			Integer numTripulante, Integer numcabine, Boolean piscina) {
		super(marca, modelo, cor, numeroPassageiros, preco, peso, velocidadeMaxima, alturaCalado, identificação,
				comprimento);
		this.NumTripulante = numTripulante;
		this.Numcabine = numcabine;
		this.Piscina = piscina;
	}

	public Integer getNumTripulante() {
		return NumTripulante;
	}

	public void setNumTripulante(Integer numTripulante) {
		NumTripulante = numTripulante;
	}

	public Integer getNumcabine() {
		return Numcabine;
	}

	public void setNumcabine(Integer numcabine) {
		Numcabine = numcabine;
	}

	public Boolean getPiscina() {
		return Piscina;
	}

	public void setPiscina(Boolean piscina) {
		Piscina = piscina;
	}
	
	public void cadastrar(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação, Double comprimento,
			Integer numTripulante, Integer numcabine, Boolean piscina) {
			super.Cadastrar(marca, modelo, cor, numeroPassageiros, preco, peso, velocidadeMaxima, alturaCalado, identificação,
					comprimento);
		this.setNumTripulante(numTripulante);
		this.setNumcabine(numcabine);
		this.setPiscina(piscina);
			
	}
	
	public void imprimir(){
		super.imprimir(2);
		System.out.println("Numero de tripulantes:  ");
		System.out.println("Numero de cabines: ");
		System.out.println("Tem Piscina? ");
	}

	public void inserirdados(){
		super.entradadados();
		System.out.println("Qual o numero de tripulantes? ");
		setNumTripulante(Integer.parseInt(sc.nextLine()));
		System.out.println("Qual o numero de cabines? ");
		setNumcabine(Integer.parseInt(sc.nextLine()));
		System.out.println("Tem piscina? ");
		setPiscina(Boolean.parseBoolean(sc.nextLine()));
	}
	
	public double desconto() {
		return super.desconto(0.8);
	}
}