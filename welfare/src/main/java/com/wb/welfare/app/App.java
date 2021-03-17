package com.wb.welfare.app;



import com.wb.welfare.dominio.Cliente;
import com.wb.welfare.dominio.Funcionario;
import com.wb.welfare.dominio.Gestor;
import com.wb.welfare.dominio.Pessoa;
import com.wb.welfare.processadores.Cadastrador;

public class App {

	public static void main(String[] args) {
		Pessoa cl = new Cliente("Barbara","Bidetti","377686055","21/10/91","129634658","feminino","Senhorita","cart�o");
		Pessoa func = new Funcionario("Edna","Luzia","356456554","13/11/54","1236458945","feminino","Cabeleireira","01/01/2000","senior");
		Pessoa gt = new Gestor("Honoria","Benetti","01254556","10/12/1925","1823555552","feminino","total","proprietaria","01/01/1950","senior");
		
		Cadastrador cd = new Cadastrador();
		cd.pessoas.add(cl);cd.pessoas.add(func);cd.pessoas.add(gt);
		cd.detalhar();
		
		

	}

}
