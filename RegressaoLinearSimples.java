import java.util.Arrays;


public class RegressaoLinearSimples {
	
	
	public static double calculaCoef(double[] x, double[] y) {
		
		double coef = (covariancia(x, y) / variancia(x));
		
		return coef;
		
	}
	
	public static double calculaIntercepto(double[] x, double[] y) {
		
		double coef = (covariancia(x, y) / variancia(x));
		
		double intercepto = (media(y) - (coef * media(x)));
		
		return intercepto;
	}
	
	public static double media(double[] array_mean_get) {
	
		double soma = 0;
	
		for (int i = 0; i < array_mean_get.length; i++) {
			soma += array_mean_get[i];
		}
	
		double media = (soma / array_mean_get.length);
	
		return media;
	
	}
	
	public static double variancia(double[] array_variancia_get) {
		
		double soma = 0;
		
		for (int i = 0; i < array_variancia_get.length; i++) {
			soma += Math.pow((array_variancia_get[i] - media(array_variancia_get)), 2);
		}
		
		
		return (soma/array_variancia_get.length);
		
	}
	
	public static double covariancia(double[] x, double[] y) {
		
		int tamanho = x.length;
		
		if (tamanho != y.length) {
			throw new IllegalArgumentException("Os dados precisam ter o mesmo tamanho/formato.");
		}
		
		// Medias
		double media_x = media(x);
		double media_y = media(y);
		
		double cov = 0;
		
		for (int i = 0; i < tamanho; i++) {
			cov += ((media_x - x[i]) * (media_y - y[i]));
		}
		
		cov /= (tamanho);
		return cov;
				
	}
	
	
	
		
	public static void main(String[] args) {
		double[] caralho = {1, 5, 1}; 
		double[] porra = {2, 10, 2};
		double nam = calculaCoef(caralho, porra);
		double cam = calculaIntercepto(caralho, porra);
		System.out.println(nam);
		System.out.println(cam);
	}
}
