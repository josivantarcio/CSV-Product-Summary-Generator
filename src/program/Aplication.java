package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;

import entities.Product;

public class Aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String path = "/home/josivan/Downloads/tmp/itens.csv";
		String newPath = "/home/josivan/Downloads/tmp/out";

		boolean newPast = new File(newPath).mkdir();
		if (newPast) {
			System.out.println("Pasta criada com Sucesso!");
		} else {
			System.out.println("Problema na criação da Pasta ou ela já existe.");
		}

		String newFile = "Summary.csv";
		String summary = newPath + "/" + newFile;

		try (BufferedReader br = new BufferedReader(new FileReader(path));
				BufferedWriter bw = new BufferedWriter(new FileWriter(summary))) {

			String linha = br.readLine();
			while (linha != null) {

				String[] linhas = linha.split(",");

				String nome = linhas[0];
				Double valor = Double.parseDouble(linhas[1]);
				Integer quantidade = Integer.valueOf(linhas[2]);

				Product product = new Product(nome, valor, quantidade);

				bw.write(product.toString());

				linha = br.readLine();
			}

		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		} finally {
			System.out.println("Fim");
		}

	}
}
