public abstract class Investimento {

    public double valorInicial;
    public double jurosMensais;

    public Investimento(double valorInicial, double jurosMensais) {

    }
	
    public Investimento(){}

    public abstract double calculaLucro(int mes);

    public double getValorInicial() {
		
        return valorInicial;
		
    }

    public void setValorInicial(double valorInicial) {
		
        this.valorInicial = valorInicial;
		
    }

    public double getJurosMensais() {
		
        return jurosMensais;
		
    }

    public void setJurosMensais(double jurosMensais) {
		
        this.jurosMensais = jurosMensais;
		
    }
}