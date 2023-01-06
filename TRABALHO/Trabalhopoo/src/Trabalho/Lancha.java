package Trabalho;

public class Lancha extends Automovel {
	
	String TipoCasco;
	Boolean Banheiro;
	public Lancha(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação, Double comprimento, String tipoCasco,
			Boolean banheiro){
			super(marca, modelo, cor, numeroPassageiros, preco, peso, velocidadeMaxima, alturaCalado, identificação,comprimento);
			this.TipoCasco = tipoCasco;
			this.Banheiro = banheiro;
	}
	
	public String getTipoCasco() {
		return TipoCasco;
	}
	public void setTipoCasco(String tipoCasco) {
		TipoCasco = tipoCasco;
	}
	public Boolean getBanheiro() {
		return Banheiro;
	}
	public void setBanheiro(Boolean banheiro) {
		Banheiro = banheiro;
	}
	
	public void cadastrar(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação, Double comprimento, String tipoCasco,
			Boolean banheiro) {
		super.Cadastrar(marca, modelo, cor, numeroPassageiros, preco, peso, velocidadeMaxima, alturaCalado, identificação,
				comprimento);
		this.setBanheiro(banheiro);
		this.setTipoCasco(tipoCasco);
	}
		
		public void imprimir(){
			super.imprimir(1);
			System.out.println("Tipo de casco: "  + this.getTipoCasco());
			System.out.println("Tem Banheiro: " + this.getBanheiro());
		}
		
		public void entradadados() {
			super.entradadados();
			System.out.println("Qual o tipo do casco?");
			setTipoCasco(sc.nextLine());
			System.out.println("Tem banheiro? ");
			setBanheiro(Boolean.parseBoolean(sc.nextLine()));
		}
		public double desconto() {
			return super.desconto(0.10);
		}
	
}
