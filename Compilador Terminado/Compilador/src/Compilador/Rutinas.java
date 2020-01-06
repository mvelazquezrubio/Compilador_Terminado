package Compilador;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Rutinas {
	static Random R = new Random();

	public static String PonBlancos(String Texto, int Tama�o) {
		while (Texto.length() < Tama�o)
			Texto += " ";
		return Texto;
	}

	public static String PonCeros(int valor, int Tama�o) {
		String Texto = valor + "";
		while (Texto.length() < Tama�o) {
			Texto = "0" + Texto;
		}
		return Texto;
	}

	public static int nextInt(int Valor) {
		return R.nextInt(Valor);
	}

	public static ImageIcon AjustarImagen(String ico, int Ancho, int Alto) {
		ImageIcon tmpIcoAux = new ImageIcon(ico);
		ImageIcon tmpIcon = new ImageIcon(tmpIcoAux.getImage().getScaledInstance(Ancho, Alto, Image.SCALE_SMOOTH));
		return tmpIcon;
	}

	public static int nextInt(int Inicia, int Final) {
		return R.nextInt(Final - Inicia + 1) + Inicia;
	}
}
