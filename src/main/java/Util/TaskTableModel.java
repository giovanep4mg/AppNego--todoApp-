
package Util;

import Model.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

// nova classe que vai herda tudo o que o abstract.. tiver , já é uma classe padrão
public class TaskTableModel extends AbstractTableModel{
    
    /*
    Criar um vetor , de colunas 
    será as colunas que irao aparecer no grid
    **/
    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluida", "Editar", "Excluir"};
    
    
    // cria uma lista, para  guarda as tarefas , iniciando vazia
    List<Task>task = new ArrayList();
    
    //  metodos sobreescrever , polimorfismo, 
    // quantas linhas terá
    @Override
    public int getRowCount() {
        // vai retorna o numero de linhas de acordo com as tarefas que tem no banco de dados 
        return task.size();
    }//fim metodo
 
    //quantas colunas terá 
    @Override 
    public int getColumnCount() {
        // vai retorna o tamanho das colunas
        return columns.length;
        
    }

    @Override//
    public String getColumnName(int columnIndex){
        //retorna , o indice das colunas 
        return columns[columnIndex];
    }// fim metodo
   
    // QUAL  coluna POSSO EDITAR ou não 
    @Override 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // se for a coluna 3 , vai poder editar 
        return columnIndex == 3;
    }//fim metodo
    
    // vai retorna qual classe está em determinada coluna 
    @Override 
    public Class<?> getColumnClass(int columnIndex) {
        // se ( estiver vazia a lista de "tarefas") 
        if(task.isEmpty()){
            // não vai mostra nada na jtable.
            return Object.class;
        }// fim metodo
        
        /*
        Se tiver algum dado, vai pegar a tarefa de acordo com a linha e coluna 
        vai pegar a classe e informa qual é o tipo "String,int,Date,..."
        **/
        return this.getValueAt(0, columnIndex).getClass();
        
    }//fim metodo
    
    // para dizer se é verdadeiro ou nao
    @Override 
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //muda a variável "completed"  para true ou false, de acordo com a linha escolhida,
        task.get(rowIndex).setIsCompleted((boolean)aValue);
        
    }//fim metodo
   
    // retorna informação expecifica, sobre a linha e coluna 
    @Override 
    public Object getValueAt(int rowIndex, int columnIndex) {
        //escolha ( indice da coluna)
        switch (columnIndex) {
            //caso = coluna 0 "primeira coluna" é o nome
            case 0:
                //retorna o nome, que está na linha selecionada, na tarefa 
                return task.get(rowIndex).getName();
                
            //caso = coluna 1 "segunda Coluna" é a descrição
            case 1:
            //retorna descrição, da linha selecionada, na tarefa
                return task.get(rowIndex).getDescription();
                
            //caso = coluna 3 "terceira coluna" == data de criação
            case 2:
                // formatando a data, para outro formato
                SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
                //retorna a "deadline" da linha selecionada, na tarefa
                return dateFormat.format(task.get(rowIndex).getDeadline());
                
            //caso = coluna 4 "quarta coluna" == tarefa concluida
            case 3:
                //retorna se foi completado ou não, da linha selecionada, na tarefa 
                return task.get(rowIndex).isIsCompleted();
                
            //caso = coluna 4 "quinta coluna" == editar
            case 4:
                //retorna a "nota", da linha selecionada, na tarefa
                return "";
                
            //caso = coluna 4 "quinta coluna" == excluir     
            case 5:
                 return "";
                 
            default:
                return "Dados não encontrados";
        }//fim switch
    }   

    //metodo acessores
    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTasks(List<Task> task) {
        this.task = task;
    }

}//fim classe

