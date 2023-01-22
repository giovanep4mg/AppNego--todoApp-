/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Model.Task;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author giova
 */
//classe que vai modificar o deadline, dentro da table
public class DeadlineColumnCellRender extends DefaultTableCellRenderer {
    //polimorfismo
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
               boolean isSelected, boolean hasFocus, int row, int column){
     
        //
        JLabel label = 
        label = (JLabel) super.getTableCellRendererComponent(table, value, 
        isSelected, hasFocus, row, column);
         
        // centralizar a label 
        label.setHorizontalAlignment(CENTER);
         
        //pega as linhas da table, e salva na variável "taskModel"
         TaskTableModel taskModel = (TaskTableModel) table.getModel();
         
        //pega a linha, dentro da tarefa, e salva na "task"
        Task task = taskModel.getTask().get(row);
         
        // se (pega a data do dia, se for "depois de" , data da "tarefa")
        if(task.getDeadline().after(new Date())){
           //coloca uma cor verde, e seta o background "fundo" verde, na "label". 
           label.setBackground(Color.green);
        //senão
        }else {
           //se for no mesmo dia ou já passou do dia
           //a cor vermelha , será colocada no fundo , da label.
           label.setBackground(Color.red);
         }
           
         //vai retorna a "label", modificada.
         return label;
     }// fim metodo
    
      
}// fim classe
