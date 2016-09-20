/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author a120104
 */
public class TelaPrincipal extends JFrame  {
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem;
       
    Object [][] dados = {
        {"Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com", "2", "3", "4"},
        {"João da Silva", "48 8890-3345", "joaosilva@hotmail.com", "2", "3", "4" },
        {"Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com" , "2", "3", "4"}
    };
    
    String [] colunas = {"Ide", "Nome", "Tipos", "X", "Y", "Z"}; 
    

    public TelaPrincipal() {
        super ("Contatos");
    }
    
    public void criaJanela(){
        
        painelFundo = new JPanel();
        painelFundo.setLayout(new GridLayout(1, 1));
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        painelFundo.add(barraRolagem); 
        
        getContentPane().add(painelFundo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        TelaPrincipal lc = new TelaPrincipal();
        lc.criaJanela();
    }
}