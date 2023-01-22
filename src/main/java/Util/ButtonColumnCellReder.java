/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;


import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author giova
 */
//classe que vai modificar os botoes 
public class ButtonColumnCellReder extends DefaultTableCellRenderer  {
    //atributos
    private String buttonType;
    
        // metodo construtor
        public ButtonColumnCellReder(String buttonType) {
            
            this.buttonType = buttonType;
    
        }
        
     //polimorfismo
     // faz modificações na label   
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        //cria uma variável, que vai da acesso a table 
        JLabel label = (JLabel)
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        // centraliza a label
        label.setHorizontalAlignment(JLabel.CENTER);
        
        //endereço da imagem, colocando o nome da imagem que você quer pegar, e coloca dentro da var "icon"
        ImageIcon icon = new ImageIcon ("C:\\Users\\giova\\Documents\\NetBeansProjects\\appnego01\\resources\\"+buttonType);
        
        //pega a imagem dentro da "icon" e coloca na label
        label.setIcon(icon);
       
        // vai retorna a label, modificada com a imagem escolhida
        return label;
    }//fim metodo

    
    
    //metodos acessores
    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
  
}//fim da classe
    
       