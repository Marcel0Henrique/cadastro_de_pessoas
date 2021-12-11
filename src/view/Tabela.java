package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabela extends JFrame{

	String[] colunas = new String[]{"Nome","Email","CPF","Nascimento","Celular","Sexo","Endereço","Número", "Complemento","Bairro","Cidade","UF","CEP"};
	String[][] dados = new String[][]{};
	  
	JTable tabela = new JTable();
	DefaultTableModel model = new DefaultTableModel(dados , colunas );
	
	
	public Tabela() {
		super("Lista");
		
		
		tabela.setModel(model);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(tabela);
		this.add(scroll);
		
		
		
		
		
		//CONFIGS
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(1400,381);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		new Tabela();
	}
	
	//Adicionar linha com as informações
	public void addLinha(String nome, String email, String cpf, String nasc, String celular, String sexo, String  endereco, String num, String comp, String bairro, String cidade, String uf,String cep) {
		
		String[] linha = new String[]{nome, email, cpf, nasc, celular, sexo,  endereco, num, comp, bairro, cidade, uf,cep};
		model.addRow(linha);
	}  	
	
	
}
