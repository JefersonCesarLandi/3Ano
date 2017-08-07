/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author jefer
 */
public class Formulario extends JPanel {
        JLabel contatoLabel;
        JLabel nomeLabel;
        JLabel enderecoLabel;
        JLabel cidadeLabel;
        JLabel estadoLabel;
        JLabel dataLabel;
        JLabel veiculoLabel;
        JLabel problemaLabel;
        
        JLabel fabricaçaoLabel;
        JLabel modeloLabel;
        JLabel descriçaoLabel;
        JLabel chassiLabel;
        
        JLabel motorLabel;
        JLabel suspensaoLabel; 
        JLabel latariaLabel;
        JLabel estofamentoLabel;
        
        JTextField nomeText;
        JTextField enderecoText;
        JSpinner estadoSpinner;
        JTextField cidadeText;
        JFormattedTextField dataText;
        
        JSpinner fabricaçaoSpinner;
        JSpinner modeloSpinner;
        JTextField descriçaoText;
        JTextField chassiText;
        
        
        
    public Formulario() {
    super(new BorderLayout());
        contatoLabel = new JLabel();
        contatoLabel.setText("Informaçoes de Contato");
        veiculoLabel = new JLabel();
        veiculoLabel.setText("Informaçoes do Veiculo");
        problemaLabel = new JLabel ();
        problemaLabel.setText ("Identifique o Problema");
        nomeLabel = new JLabel();
        nomeLabel.setText("Nome: ");
        enderecoLabel = new JLabel();
        enderecoLabel.setText("Endereço: ");
        cidadeLabel = new JLabel();
        cidadeLabel.setText("Cidade: ");
        estadoLabel = new JLabel();
        estadoLabel.setText("Estado: ");
        dataLabel = new JLabel();
        dataLabel.setText("Data Nascimento: ");
        fabricaçaoLabel = new JLabel();
        fabricaçaoLabel.setText("Ano Fabricaçao");
        modeloLabel = new JLabel();
        modeloLabel.setText("Ano Modelo");
        descriçaoLabel = new JLabel();
        descriçaoLabel.setText("Descriçao Veiculo");
        chassiLabel = new JLabel();
        chassiLabel.setText("Chassi");
        motorLabel = new JLabel();
        motorLabel.setText("Motor");
        suspensaoLabel = new JLabel();
        suspensaoLabel.setText("Suspensao");
        latariaLabel = new JLabel();
        latariaLabel.setText("Lataria");
        estofamentoLabel = new JLabel();
        estofamentoLabel.setText("Estofamento");
        
        nomeText = new JTextField();
        nomeText.setColumns(30);
        enderecoText = new JTextField();
        enderecoText.setColumns(30);
        String[] estadoStrings = {
            "Acre(AC)",
            "Alagoas (AL)",
            "Amapà (AP)",
            "Goiàs (GO)",
            "Minas Gerais (MG)",
            "Sao Paolo (SP)",
            "Tocantins (TO)"
        };
        String[] anosStrings = {
            "1920",
            "1921",
            "1922",
            "1923",
            "1924",
            "1925",
            "1926",
            "1927",
            "1928",
            "1929",
            "1930",
            "1931",
            "1932",
            "1933",
            "1934",
            "1935",
            "1936",
            "1937",
            "1938",
            "1939",
            "1940",
            "1941",
            "1942",
            "1943",
            "1944",
            "1945",
            "1946",
            "1947",
            "1948",
            "1949",
            "1950",
            "1951",
            "1952",
            "1953",
            "1954",
            "1955",
            "1956",
            "1957",
            "1958",
            "1959",
            "1960",
            "1961",
            "1962",
            "1963",
            "1964",
            "1965",
            "1966",
            "1967",
            "1968",
            "1969",
            "1970",
            "1971",
            "1972",
            "1973",
            "1974",
            "1975",
            "1976",
            "1977",
            "1978",
            "1979",
            "1980",
            "1981",
            "1982",
            "1983",
            "1984",
            "1985",
            "1986",
            "1987",
            "1988",
            "1989",
            "1990",
            "1991",
            "1992",
            "1993",
            "1994",
            "1995",
            "1996",
            "1997",
            "1998",
            "1999",
            "2000",
            "2001",
            "2002",
            "2003",
            "2004",
            "2005",
            "2006",
            "2007",
            "2008",
            "2009",
            "2010",
            "2011",
            "2012",
            "2013",
            "2014",
            "2015",
            "2016",
            "2017",
            "2018",
            "2019",
            "2020",
            "2021",
            "2022",
            "2023",
            "2024",
            "2025",
            "2026",
            "2027",
            "2028",
        };
        estadoSpinner = new JSpinner(new SpinnerListModel(estadoStrings));
        cidadeText = new JTextField();
        cidadeText.setColumns(20);
        dataText = new JFormattedTextField(formatador("##/##/####"));
        
        fabricaçaoSpinner = new JSpinner(new SpinnerListModel(anosStrings));
        modeloSpinner = new JSpinner(new SpinnerListModel(anosStrings));
        descriçaoText = new JTextField();
        descriçaoText.setColumns(20);
        chassiText = new JTextField();
        chassiText.setColumns(20);
        
    JPanel ContatoPanel = new JPanel(new GridLayout (0, 2));
    ContatoPanel.add(contatoLabel);
    JPanel titulosPanel = new JPanel(new GridLayout(0, 1));
    titulosPanel.add(nomeLabel);
    titulosPanel.add(enderecoLabel);
    titulosPanel.add(estadoLabel);
    titulosPanel.add(cidadeLabel);
    titulosPanel.add(dataLabel);
    JPanel textoPanel = new JPanel(new GridLayout(0, 1));
        textoPanel.add(nomeText);
        textoPanel.add(enderecoText);
        textoPanel.add(estadoSpinner);
        textoPanel.add(cidadeText);
        textoPanel.add(dataText);
    JPanel VeiculoPanel = new JPanel(new GridLayout(0, 2));
        VeiculoPanel.add(veiculoLabel);
    JPanel titulos2Panel = new JPanel(new GridLayout(0, 1));
        titulos2Panel.add(fabricaçaoLabel);
        titulos2Panel.add(modeloLabel);
        titulos2Panel.add(descriçaoLabel);
        titulos2Panel.add(chassiLabel);
    JPanel texto2Panel = new JPanel(new GridLayout(0, 1));
        texto2Panel.add(fabricaçaoSpinner);
        texto2Panel.add(modeloSpinner);
        texto2Panel.add(descriçaoText);
        texto2Panel.add(chassiText);
    JPanel ProblemaPanel = new JPanel (new GridLayout(0,2));
         ProblemaPanel.add(problemaLabel);
    JPanel titulos3Panel = new JPanel(new GridLayout(0, 1));
        titulos3Panel.add(motorLabel);
        titulos3Panel.add(suspensaoLabel);
        titulos3Panel.add(latariaLabel);
        titulos3Panel.add(estofamentoLabel);
    //JPanel texto3Panel = new JPanel(new GridLayout(0, 1));
        //texto3Panel.add(motor);
        //texto3Panel.add(suspensao);
        //texto3Panel.add(lataria);
        //texto3Panel.add(estofamento);
    JPanel botaoPanel = new JPanel(new GridLayout(0, 1));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(ContatoPanel, BorderLayout.LINE_START);
        add(titulosPanel, BorderLayout.LINE_START);
        add(textoPanel, BorderLayout.LINE_END);
        add(botaoPanel, BorderLayout.PAGE_END);
    }
    
    private static void criarEmostrarGUI() {
        JFrame janela = new JFrame("Formulario Simples");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Formulario painelForm = new Formulario();
        painelForm.setOpaque(true);
        janela.setContentPane(painelForm);
        janela.pack();
        janela.setVisible(true);
    }
            
    
    protected MaskFormatter formatador(String s){
    MaskFormatter formatter = null;
    try {
      formatter = new MaskFormatter(s);
    } catch (java.text.ParseException exc){
System.err.println("formatter is bad: " + exc.getMessage());
System.exit(-1);
}
    return formatter;
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            criarEmostrarGUI();
        }
        });
    }
}
