package Trabalho;

public class JetSki extends Automovel {
	
	Boolean Reboque;
	String TipoCasco;
	
	
	public JetSki(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação, Double comprimento, Boolean reboque,
			String tipoCasco) {
		super(marca, modelo, cor, numeroPassageiros, preco, peso, velocidadeMaxima, alturaCalado, identificação,
				comprimento);
		this.Reboque = reboque;
		this.TipoCasco = tipoCasco;
	}
	public Boolean getReboque() {
		return Reboque;
	}
	public void setReboque(Boolean reboque) {
		Reboque = reboque;
	}
	public String getTipoCasco() {
		return TipoCasco;
	}
	public void setTipoCasco(String tipoCasco) {
		TipoCasco = tipoCasco;
	}
	
	public void cadastrar(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação, Double comprimento, Boolean reboque,
			String tipoCasco) {
		super.Cadastrar(marca, modelo, cor, numeroPassageiros, preco, peso, velocidadeMaxima, alturaCalado, identificação,
				comprimento);
			this.setReboque(reboque);
			this.setTipoCasco(tipoCasco);
	}	
	
	public void imprimir() {
		super.imprimir(3);
		System.out.println("Tem reboque?" + this.getReboque());
		System.out.println("Qual o tipo do casco? " + this.TipoCasco);
	}
	
	public void inserirdados() {
		super.entradadados();
		System.out.println("Tem reboque? ");
		this.setReboque(Boolean.parseBoolean(sc.nextLine()));
		System.out.println("Qual o tipo do casco? ");
		this.setTipoCasco(sc.nextLine());
	}
	public double desconto() {
		return super.desconto(0.15);
	}
}
