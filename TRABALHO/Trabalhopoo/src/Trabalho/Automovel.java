package Trabalho;
import java.util.Scanner;

public class Automovel {
	Scanner sc = new Scanner(System.in);

	String marca;
    String Modelo;
    String cor;
    Integer NumeroPassageiros;
    Double Preco;
    Double peso;
    Integer VelocidadeMaxima;
    Double AlturaCalado;
    String Identificação;
    Double Comprimento;
    
    public Automovel() {}
	
	public Automovel(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação,
			Double comprimento) {
		this.marca = marca;
		this.Modelo = modelo;
		this.cor = cor;
		this.NumeroPassageiros = numeroPassageiros;
		this.Preco = preco;
		this.peso = peso;
		this.VelocidadeMaxima = velocidadeMaxima;
		this.AlturaCalado = alturaCalado;
		this.Identificação = identificação;
		this.Comprimento = comprimento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getNumeroPassageiros() {
		return NumeroPassageiros;
	}

	public void setNumeroPassageiros(Integer numeroPassageiros) {
		NumeroPassageiros = numeroPassageiros;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getVelocidadeMaxima() {
		return VelocidadeMaxima;
	}

	public void setVelocidadeMaxima(Integer velocidadeMaxima) {
		VelocidadeMaxima = velocidadeMaxima;
	}




	public Double getAlturaCalado() {
		return AlturaCalado;
	}




	public void setAlturaCalado(Double alturaCalado) {
		AlturaCalado = alturaCalado;
	}




	public String getIdentificação() {
		return Identificação;
	}




	public void setIdentificação(String identificação) {
		Identificação = identificação;
	}


	public Double getComprimento() {
		return Comprimento;
	}


	public void setComprimento(Double comprimento) {
		Comprimento = comprimento;
	}

	protected void Cadastrar(String marca, String modelo, String cor, Integer numeroPassageiros, Double preco, Double peso,
			Integer velocidadeMaxima, Double alturaCalado, String identificação,
			Double comprimento) {
				this.setMarca(marca);
				this.setModelo(modelo);
				this.setNumeroPassageiros(numeroPassageiros);
				this.setPreco(preco);
				this.setPeso(peso);
				this.setVelocidadeMaxima(velocidadeMaxima);
				this.setAlturaCalado(alturaCalado);
				this.setIdentificação(identificação);

	}
				
				public void imprimir(int i) {
					switch(i) {
					case 1 -> System.out.println("###  Lancha ###");
					case 2 -> System.out.println("###   Iate  ###");
					case 3 -> System.out.println("###  JetSki ###");	
					}
					System.out.println("Numero de passageiros: " + this.getNumeroPassageiros());
					System.out.println("Modelo: "+this.getModelo());
					System.out.println("Marca: " + this.getMarca());
					System.out.println("Cor: " + this.getCor());
					System.out.println("Preco: " + this.getPreco());
					System.out.println("Peso: " + this.getPeso());
					System.out.println("Velocidade Maxima: " + this.getVelocidadeMaxima());
					System.out.println("Altura calado: " + this.getAlturaCalado());
					System.out.println("identificação: " + this.getIdentificação());
					System.out.println("Comprimento: " + this.getComprimento());
					
				}
				
				public void entradadados() {
					System.out.println("Nome do passageiro ");
					setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
					System.out.println("Nome do Modelo: ");
					setModelo(sc.nextLine());
					System.out.println("Nome da Marca: ");
					setMarca(sc.nextLine());
					System.out.println("Nome da Cor: ");
					setCor(sc.nextLine());
					System.out.println("Qual o Preco: ");
					setPreco(Double.parseDouble(sc.nextLine()));
					System.out.println("Qual o Peso: " );
					setPeso(Double.parseDouble(sc.nextLine()));
					System.out.println("Qual a Velocidade Maxima: ");
					setVelocidadeMaxima(Integer.parseInt(sc.nextLine()));	
					System.out.println("Qual a Altura calado: " );
					setAlturaCalado(Double.parseDouble(sc.nextLine()));
					System.out.println("Qual a identificação: " );
					setIdentificação(sc.nextLine());
					System.out.println("Qual o Comprimento: ");
					setComprimento(Double.parseDouble(sc.nextLine()));
				}
				
				public double desconto(double i) {
					double preco = this.getPreco();
					double desconto = preco * i;
					double valor = preco - desconto;
					return valor;
				}
	}
					
					
						
					
				
		
		
	
