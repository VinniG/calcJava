package calc;

// import SWING E ACTIONLISTENER
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class Calculadora extends JFrame implements ActionListener {

    // DECLARANDO OS COMPONENTES

        private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9; // BOTÕES DE NÚMERO
        private JButton btnMais, btnMenos, btnMult, btnDiv, btnIgual, btnLimpar; // BOTÕES DE OP, IGUAL E LIMPAR
	private JTextField display; // Criando o Display do JFrame - Janela
	private double valor1 = 0, valor2 = 0, resultado = 0; // Variáveis de Valor e Resultado
	private char operacao = ' '; // Variável de inserção de operação

// ============================================================== CONFIGURANDO A JANELA ========================================================//

    public Calculadora() {
	setTitle("Calculadora");
	setSize(300, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);

    // COMPONENTES DA CALCULADORA (DECLARANDO OS BOTÕES DENTRO DA JANELA)

	 // DISPLAY NUMERICO
	 display = new JTextField(19);
	 display.setEditable(false);
	 display.setFont(new Font("Arial", Font.PLAIN, 16));
	 display.setPreferredSize(new Dimension (0, 40));
	
	 // BOTÕES
	 btn0 = new JButton("0");
	 btn1 = new JButton("1");
	 btn2 = new JButton("2");
	 btn3 = new JButton("3");
	 btn4 = new JButton("4");
	 btn5 = new JButton("5");
	 btn6 = new JButton("6");
	 btn7 = new JButton("7");
	 btn8 = new JButton("8");
	 btn9 = new JButton("9");
	 btnMais = new JButton("+");
	 btnMenos = new JButton("-");
	 btnMult = new JButton("*");
	 btnDiv = new JButton("/");
	 btnIgual = new JButton("=");
	 btnLimpar = new JButton("C");
	 
	 // ADICIONANDO OS COMPONENTES À JANELA
	 
	 setLayout(new BorderLayout());
	 JPanel pnlDisplay = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	 pnlDisplay.setBackground(Color.WHITE);
	 pnlDisplay.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	 pnlDisplay.add(display);
	 add(pnlDisplay, BorderLayout.NORTH);
	
	 // COR PARA BACKGROUND
	
	 btn0.setBackground(new Color(245, 245, 245));
	 btn1.setBackground(new Color(245, 245, 245));
	 btn2.setBackground(new Color(245, 245, 245));
	 btn3.setBackground(new Color(245, 245, 245));
	 btn4.setBackground(new Color(245, 245, 245));
	 btn5.setBackground(new Color(245, 245, 245));
	 btn6.setBackground(new Color(245, 245, 245));
	 btn7.setBackground(new Color(245, 245, 245));
	 btn8.setBackground(new Color(245, 245, 245));
	 btn9.setBackground(new Color(245, 245, 245));
	 btnMais.setBackground(new Color(68, 138, 255));
	 btnMenos.setBackground(new Color(68, 138, 255));
	 btnMult.setBackground(new Color(68, 138, 255));
	 btnDiv.setBackground(new Color(68, 138, 255));
	 btnIgual.setBackground(new Color(68, 138, 255));
	 btnLimpar.setBackground(new Color(68, 138, 255));
	
	 // COR PARA FOREGROUND (Cor do Numero)
	
	 btn0.setForeground(Color.BLACK);
	 btn1.setForeground(Color.BLACK);
	 btn2.setForeground(Color.BLACK);
	 btn3.setForeground(Color.BLACK);
	 btn4.setForeground(Color.BLACK);
	 btn5.setForeground(Color.BLACK);
	 btn6.setForeground(Color.BLACK);
	 btn7.setForeground(Color.BLACK);
	 btn8.setForeground(Color.BLACK);
	 btn9.setForeground(Color.BLACK);
	 btnMais.setForeground(Color.WHITE);
	 btnMenos.setForeground(Color.WHITE);
	 btnMult.setForeground(Color.WHITE);
	 btnDiv.setForeground(Color.WHITE);
	 btnIgual.setForeground(Color.WHITE);
	 btnLimpar.setForeground(Color.WHITE);
	 
	 // FONTE PARA OS BOTÕES
	
	 btn0.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn1.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn2.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn3.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn4.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn5.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn6.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn7.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn8.setFont(new Font("Arial", Font.PLAIN, 16));
	 btn9.setFont(new Font("Arial", Font.PLAIN, 16));
	 btnMais.setFont(new Font("Arial", Font.PLAIN, 16));
	 btnMenos.setFont(new Font("Arial", Font.PLAIN, 16));
	 btnMult.setFont(new Font("Arial", Font.PLAIN, 16));
	 btnDiv.setFont(new Font("Arial", Font.PLAIN, 16));
	 btnIgual.setFont(new Font("Arial", Font.PLAIN, 16));
	 btnLimpar.setFont(new Font("Arial", Font.PLAIN, 16));
	
	 JPanel pnlBotoes = new JPanel(new GridLayout(4, 4, 5, 5)); // Funciona semelhante ao GridLayout do CSS
	
	 //FILA 1
	
	 pnlBotoes.add(btn7);
	 pnlBotoes.add(btn8);
	 pnlBotoes.add(btn9);
	 pnlBotoes.add(btnDiv);
	
	 //FILA 2
	
	 pnlBotoes.add(btn4);
	 pnlBotoes.add(btn5);
	 pnlBotoes.add(btn6);
	 pnlBotoes.add(btnMult); 
	
	 //FILA 3
	
	 pnlBotoes.add(btn1);
	 pnlBotoes.add(btn2);
	 pnlBotoes.add(btn3);
	 pnlBotoes.add(btnMenos);
	
	 //FILA 4
	
	 pnlBotoes.add(btn0);
	 pnlBotoes.add(btnIgual);
	 pnlBotoes.add(btnLimpar);
	 pnlBotoes.add(btnMais);
	 
	 add(pnlBotoes, BorderLayout.CENTER);
	
	 // ADICIONANDO AS ACTIONS PARA OS BOTÕES
	
	 btn0.addActionListener(this);
	 btn1.addActionListener(this);
	 btn2.addActionListener(this);
	 btn3.addActionListener(this);
	 btn4.addActionListener(this);
	 btn5.addActionListener(this);
	 btn6.addActionListener(this);
	 btn7.addActionListener(this);
	 btn8.addActionListener(this);
	 btn9.addActionListener(this);
	 btnMais.addActionListener(this);
	 btnMenos.addActionListener(this);
	 btnMult.addActionListener(this);
	 btnDiv.addActionListener(this);
	 btnIgual.addActionListener(this);
	 btnLimpar.addActionListener(this);
	
	 // EXIBINDO A JANELA
	
	 setVisible(true);
	 } 
	
	// =============================================================== LÓGICA DO PROGRAMA ========================================================= //
	
	 public void actionPerformed(ActionEvent e) { 
	
	 // actionPeformed(ActionEvent e) = Método (CHAMADO TODA VEZ QUE UM EVENTO É DISPARADO 
	 // e = parametro (REPRESENTA O EVENTO DISPARADO)
	 // (e.getSource()) (MÉTODO PARA OBTER O EVENTO DISPARADO)
	
	 // ESTRUTURA IF-ELSE PARA IDENTIFICAR SE O BOTÃO QUE FOI CLICADO É O MESMO DETECTADO PELO ACTIONLISTENER
	
		 if (e.getSource() == btn0) {
			 display.setText(display.getText() + "0");
		
		 } else if (e.getSource() == btn1) {
			 display.setText(display.getText() + "1");
		
		 } else if (e.getSource() == btn2) {
			 display.setText(display.getText() + "2");
		
		 } else if (e.getSource() == btn3) {
			 display.setText(display.getText() + "3");
		
		 } else if (e.getSource() == btn4) {
			 display.setText(display.getText() + "4");
		
		 } else if (e.getSource() == btn5) {
			 display.setText(display.getText() + "5");
		
		 } else if (e.getSource() == btn6) {
			 display.setText(display.getText() + "6");
		
		 } else if (e.getSource() == btn7) {
			 display.setText(display.getText() + "7");
		
		 } else if (e.getSource() == btn8) {
			 display.setText(display.getText() + "8");
		
		 } else if (e.getSource() == btn9) {
			 display.setText(display.getText() + "9");
		
			// BOTÕES DE OPERAÇÃO
		
		 } else if (e.getSource() == btnMais) {
			 operacao = '+';
			 valor1 = Double.parseDouble(display.getText());
			 display.setText("");
		
		 } else if (e.getSource() == btnMenos) {
			 operacao = '-';
			 valor1 = Double.parseDouble(display.getText());
			 display.setText("");
		
		 } else if (e.getSource() == btnMult) {	
			 operacao = '*';
			 valor1 = Double.parseDouble(display.getText());
			 display.setText("");
		
		 } else if (e.getSource() == btnDiv) {
			 operacao = '/';
			 valor1 = Double.parseDouble(display.getText());
			 display.setText("");
		
			// BOTÃO + LÓGICA PARA O CÁLCULO FINAL
		
		 } else if (e.getSource() == btnIgual) {
			 valor2 = Double.parseDouble(display.getText());
		
			// ESTRUTURA SWITCH-CASE (+, -, *, /) --> ESCOLHA DAS OPERAÇÕES
		
			switch (operacao) {
		
				case '+':
					resultado = valor1 + valor2;
					break;
				case '-':
					resultado = valor1 - valor2;
					break;
				case '*':
					resultado = valor1 * valor2;
					break;
				case '/':
					resultado = valor1 / valor2;
					break;
			}
		
			// MOSTRAR RESULTADO NA TELA
		
			display.setText(Double.toString(resultado));
			valor1 = 0;
			valor2 = 0;
			resultado = 0;
			operacao = ' ';
		
			// BOTÃO LIMPAR
		
			} else if (e.getSource() == btnLimpar) {
				display.setText("");
				valor1 = 0;
				valor2 = 0;
				resultado = 0;
				operacao = ' ';
				
				}
			}	
	 // CRIA UMA NOVA INSTÂNCIA DA CLASSE `CALCULADORA` E INICIA A EXECUÇÃO DA INTERFACE GRÁFICA
	
		public static void main(String[] args) {
                new Calculadora();
		}
	}
