package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.text.TabableView;

import view.Pessoa;
import view.Tabela;

public class Main extends JFrame implements ActionListener{
 
	JLabel lbl_titulo ,lbl_nome, lbl_cpf, lbl_nascimento, lbl_email, lbl_sexo, lbl_celular, 
	lbl_endereco, lbl_numero, lbl_complemento, lbl_bairro, lbl_cidade, lbl_uf, lbl_cep;
	
	
	JTextField tfd_nome, tfd_email, tfd_endereco, tfd_numero, tfd_complemento, tfd_bairro, tfd_cidade, tfd_uf;
	
	JFormattedTextField tfd_nascimento, tfd_cpf, tfd_celular, tfd_cep;
	
	JRadioButton rdb_masc, rdb_fem;
	
	JButton btn_cadastrar, btn_listar, btn_sair;
	
	
	ButtonGroup group;
	
	private Pessoa pessoa;
	private Tabela tabela;
	
	public Main() {
		super("Cadastro de Pessoas");
		
		this.pessoa = new Pessoa();
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(55, 21, 148));
		
		
		//Titulo
		lbl_titulo = new JLabel("CADASTRO DE PESSOA");
		lbl_titulo.setBounds(290, 20, 200, 15);
		lbl_titulo.setForeground(Color.WHITE);
		c.add(lbl_titulo);
		
		
		
		//Campo Nome
		lbl_nome = new JLabel("Nome Completo:");
		lbl_nome.setBounds(40, 60, 120, 15);
		lbl_nome.setForeground(Color.WHITE);
		c.add(lbl_nome);
		
		
		tfd_nome = new JTextField();
		tfd_nome.setBounds(40, 80, 350, 20);
		c.add(tfd_nome);
		
		
		
		
		//Campo Email
		lbl_email = new JLabel("Email:");
		lbl_email.setBounds(440, 60, 120, 15);
		lbl_email.setForeground(Color.WHITE);
		c.add(lbl_email);
		
		
		tfd_email = new JTextField();
		tfd_email.setBounds(440, 80, 320, 20);
		c.add(tfd_email);
		
		
		
		
		
		
		
		//Campo CPF
		
		//Criando Mascara
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		lbl_cpf = new JLabel("CPF:");
		lbl_cpf.setBounds(40, 115, 120, 15);
		lbl_cpf.setForeground(Color.WHITE);
		c.add(lbl_cpf);
		
		
		tfd_cpf = new JFormattedTextField(mascaraCpf);
		//tfd_cpf.setBounds(440, 80, 110, 20);
		tfd_cpf.setBounds(40, 135, 110, 20);
		c.add(tfd_cpf);
		
		
		
		
		
		
		
		
		//Campo Data de Nascimento
		
		//Criando Mascara
		MaskFormatter mascaraNascimento = null;
		try {
			mascaraNascimento = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lbl_nascimento = new JLabel("Data de Nascimento:");
		lbl_nascimento.setBounds(200, 115, 160, 15);
		lbl_nascimento.setForeground(Color.WHITE);
		c.add(lbl_nascimento);
		
		tfd_nascimento = new JFormattedTextField(mascaraNascimento);
		tfd_nascimento.setBounds(200, 135, 80, 20);
		c.add(tfd_nascimento);
		
		
		
		

		//Campo Celular
		
		//Criando Mascara
		
		MaskFormatter mascaraCelular = null;
		try {
			mascaraCelular = new MaskFormatter("(##) #-####-####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lbl_celular = new JLabel("Celular:");
		lbl_celular.setBounds(440, 115, 160, 15);
		lbl_celular.setForeground(Color.WHITE);
		c.add(lbl_celular);
		
		tfd_celular = new JFormattedTextField(mascaraCelular);
		tfd_celular.setBounds(440, 135, 120, 20);
		c.add(tfd_celular);
		
		
		
		
		
		
		
		//Campo Sexo
		lbl_sexo = new JLabel("Sexo:");
		lbl_sexo.setBounds(40, 170, 120, 15);
		lbl_sexo.setForeground(Color.WHITE);
		c.add(lbl_sexo);
		
		rdb_masc = new JRadioButton("Masculino");
		rdb_masc.setBounds(40, 190, 120, 15);
		rdb_masc.setBackground(new Color(55, 21, 148));
		rdb_masc.setForeground(Color.WHITE);
		c.add(rdb_masc);
		
		rdb_fem = new JRadioButton("Feminino");
		rdb_fem.setBounds(40, 210, 120, 15);
		rdb_fem.setBackground(new Color(55, 21, 148));
		rdb_fem.setForeground(Color.WHITE);
		c.add(rdb_fem);
		
		
		group = new ButtonGroup();
		group.add(rdb_masc);
		group.add(rdb_fem);
		
		
		
		
		
		
		//Campo Endereço
		lbl_endereco = new JLabel("Endereço:");
		lbl_endereco.setBounds(40, 260, 120, 15);
		lbl_endereco.setForeground(Color.WHITE);
		c.add(lbl_endereco);
				
				
		tfd_endereco = new JTextField();
		tfd_endereco.setBounds(40, 280, 350, 20);
		c.add(tfd_endereco);
		
		
		
		//Campo Numero
		lbl_numero = new JLabel("Número:");
		lbl_numero.setBounds(420, 260, 120, 15);
		lbl_numero.setForeground(Color.WHITE);
		c.add(lbl_numero);
				
				
		tfd_numero = new JTextField();
		tfd_numero.setBounds(420, 280, 50, 20);
		c.add(tfd_numero);
		
		
		
		
		//Campo Complemento
		lbl_complemento = new JLabel("Complemento:");
		lbl_complemento.setBounds(500, 260, 120, 15);
		lbl_complemento.setForeground(Color.WHITE);
		c.add(lbl_complemento);
				
				
		tfd_complemento = new JTextField();
		tfd_complemento.setBounds(500, 280, 150, 20);
		c.add(tfd_complemento);
		
		
		

		
		//Campo Bairro
		lbl_bairro = new JLabel("Bairro:");
		lbl_bairro.setBounds(40, 310, 120, 15);
		lbl_bairro.setForeground(Color.WHITE);
		c.add(lbl_bairro);
				
				
		tfd_bairro = new JTextField();
		tfd_bairro.setBounds(40, 330, 170, 20);
		c.add(tfd_bairro);
		
		
		
		
		
		
		
		//Campo Cidade
		lbl_cidade = new JLabel("Cidade:");
		lbl_cidade.setBounds(250, 310, 120, 15);
		lbl_cidade.setForeground(Color.WHITE);
		c.add(lbl_cidade);
				
				
		tfd_cidade = new JTextField();
		tfd_cidade.setBounds(250, 330, 170, 20);
		c.add(tfd_cidade);		
		
		
		
		
		
		//Campo Estado
		lbl_uf = new JLabel("UF:");
		lbl_uf.setBounds(460, 310, 120, 15);
		lbl_uf.setForeground(Color.WHITE);
		c.add(lbl_uf);
				
				
		tfd_uf = new JTextField();
		tfd_uf.setBounds(460, 330, 30, 20);
		c.add(tfd_uf);		
		
		
		

		
		
		
		
		
		//Campo CEP
		
		//Criando Mascara
		
		MaskFormatter mascaraCep = null;
		try {
			mascaraCep = new MaskFormatter("#####-###");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		lbl_cep = new JLabel("CEP:");
		lbl_cep.setBounds(520, 310, 120, 15);
		lbl_cep.setForeground(Color.WHITE);
		c.add(lbl_cep);
				
				
		tfd_cep = new JFormattedTextField(mascaraCep);
		tfd_cep.setBounds(520, 330, 80, 20);
		c.add(tfd_cep);	
		
		
		
		
		
		
		
		//Botão Cadastrar
		btn_cadastrar = new JButton("CADASTRAR");
		btn_cadastrar.setBounds(40,510, 130, 30);
		c.add(btn_cadastrar);
		
		
		//Adicionando Ação ao botão
		btn_cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (verificar()) {
					cadastrar();
					JOptionPane.showMessageDialog(null, "Pessoa Cadastrada com Sucesso!" );
					limpar();
				}else if (!verificar()){
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Campo Vazio", 1);
				}
				
			}
		});
		
		
		
		
		
		//Botão Listar
		btn_listar = new JButton("LISTAR");
		btn_listar.setBounds(200,510, 130, 30);
		c.add(btn_listar);	
		
		//Adicionando Ação ao botão
		btn_listar.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				tabela.setVisible(true);
				
			}
		});
		
		
		
		
		//Botão Sair
		btn_sair = new JButton("SAIR");
		btn_sair.setBounds(590,510, 130, 30);
		c.add(btn_sair);
		
		
		//Adicionando Ação ao botão
		btn_sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				tabela.dispose();
			}
		});
		
		
		
		
		
		
		
		//CONFIGS
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(800,600);
		setLocationRelativeTo(null);
		setVisible(true);
		tabela = new Tabela();		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new Main();
		
	}
	
	
	

	//Cadastra os clientes na tabela
	public void cadastrar() {
		pessoa.setNome(tfd_nome.getText());
		pessoa.setEmail(tfd_email.getText());
		pessoa.setCpf(tfd_cpf.getText());
		pessoa.setNasc(tfd_nascimento.getText());
		pessoa.setCelular(tfd_celular.getText());
		
		if (rdb_masc.isSelected()) {
			
			pessoa.setSexo("Masculino");
			
		} if (rdb_fem.isSelected()) {
			pessoa.setSexo("Feminino");
		}
		
		pessoa.setEndereco(tfd_endereco.getText());
		pessoa.setNum(tfd_numero.getText());
		pessoa.setComp(tfd_complemento.getText());
		pessoa.setBairro(tfd_bairro.getText());
		pessoa.setCidade(tfd_cidade.getText());
		pessoa.setUf(tfd_uf.getText());
		pessoa.setCep(tfd_cep.getText());
		
		tabela.addLinha(
				pessoa.getNome(),
				pessoa.getEmail(),
				pessoa.getCpf(),
				pessoa.getNasc(),
				pessoa.getCelular(),
				pessoa.getSexo(),
				pessoa.getEndereco(),
				pessoa.getNum(),
				pessoa.getComp(),
				pessoa.getBairro(),
				pessoa.getCidade(),
				pessoa.getUf(),
				pessoa.getCep()
				);
	}
	
	
	//limpa as informações da parte de cadastro
	public void limpar() {
		tfd_nome.setText(null);
		tfd_email.setText(null);
		tfd_cpf.setText(null);
		tfd_nascimento.setText(null);
		tfd_celular.setText(null);
		
		if (rdb_masc.isSelected()) {
			rdb_masc.setSelected(false);
			
		} if (rdb_fem.isSelected()) {
			rdb_fem.setSelected(false);
		}
		
		tfd_endereco.setText(null);
		tfd_numero.setText(null);
		tfd_complemento.setText(null);
		tfd_bairro.setText(null);
		tfd_cidade.setText(null);
		tfd_uf.setText(null);
		tfd_cep.setText(null);
	}

	//Verifica se as informações estão corretas
	public boolean verificar() {
		
		boolean logica = true;
		
		if (tfd_nome.getText().equals("")) {
			logica = false;
		} else if(tfd_email.getText().equals("")) {
			logica = false;
		} else if(tfd_cpf.getText().length() < 14) {
			logica = false;
		} else if(tfd_nascimento.getText().length() < 10) {
			logica = false;
		} else if(tfd_celular.getText().length() < 15) {
			logica = false;
		} else if(rdb_masc.isSelected() == false && rdb_fem.isSelected() == false ) {
			logica = false;
		} else if(tfd_endereco.getText().equals("")) {
			logica = false;
		} else if(tfd_numero.getText().equals("")) {
			logica = false;
		} else if(tfd_complemento.getText().equals("")) {
			logica = false;
		} else if(tfd_bairro.getText().equals("")) {
			logica = false;
		} else if(tfd_cidade.getText().equals("")) {
			logica = false;
		} else if(tfd_uf.getText().equals("")) {
			logica = false;
		} else if(tfd_cep.getText().equals("")) {
			logica = false;
		} else {
			logica = true;
		}
		
		
		return logica;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
