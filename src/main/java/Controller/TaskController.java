/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Task;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giova
 */
public class TaskController {

  
    
 //qual tarefa voce quer salvar , o que quer salvar ,dentro do objeto tasks 
  public void save (Task task ) {
  // colocar os campos da tabela tarefa
    String sql = "INSERT INTO task (idProject,"
            + "name,"
            + "description,"
            + "completed,"
            + "notes,"
            + "deadline,"
            + "createdAt,"
            + "updatedAt) VALUES (?,?,?,?,?,?,?,?)";
      
    // criando uma variável 
    Connection connection = null;
    // criando uma variável
    PreparedStatement statement = null;
    
    //para tratar possiveis erros
        try {
             
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
          
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
           
         /*
         Faça uma conversão para usar uma data diferente, pois são pacotes diferentes
         Date Sql e tem o Date do Java
         **/
           statement.setDate(6, new Date(task.getDeadline().getTime()));
           statement.setDate(7, new Date(task.getCreatedAt().getTime()));
           statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
           
           statement.execute();
           
        } catch (SQLException ex) {
                // se deu algum erro, exibir essa mensagem 
                throw new RuntimeException("Erro ao salvar a tarefa "+ ex.getMessage(), ex);
        } finally {
               // fecha a conexão 
               ConnectionFactory.closeConnection( connection, statement);
        }   
  
  }//fim metodo
  
  
  //qual tarefa quer atualizar, no tasks
    public void update (Task task) {
        //cria uma variável "sql", que vai guarda esses dados 
        String sql = "UPDATE task SET "
            + " idProject = ?, "
            + " name = ?, "
            + " description = ?, "
            + " notes = ?, "
            + " completed = ?,"
            + " deadline = ?, "
            + " createdAt = ?, "
            + " updatedAt = ?"
            + " WHERE id = ? ";
             
        
        // variáveis 
        Connection connection = null;
        PreparedStatement statement = null;
      
        //tratar possiveis erros
        try {
            //estabelecendo conexao com o banco de dados
            connection = ConnectionFactory.getConnection();
          
            //preparando a query
            statement = connection.prepareStatement(sql);
          
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
          
            //executando a query
            statement.execute();
          
        } catch (SQLException ex) {
          // se deu erro exibi essa mensagem
            throw new RuntimeException("Erro ao atualizar a "
                    + "tarefa "+ex.getMessage(), ex);
        }finally {
        ConnectionFactory.closeConnection( connection, statement);
        }
  
  }//fim metodo  
  
   
 
// vai gerar uma lista de tarefas, e buscar a tarefa de acordo com o id do projeto 
public List<Task> getAll(int idProject) {
  
        String sql = "SELECT * FROM task WHERE idProject = ? ";
        
        
        //variáveis
        Connection connection = null;
        PreparedStatement statement = null;
        
        // vai guarda o resultado do banco de dados 
        ResultSet resultSet = null;
        
    //LISTA DE TAREFAS QUE SERÁ DEVOLVIDA QUANDO A CHAMADA DO METODO ACONTECER       
        List<Task> tasks = new ArrayList<>();
        
        // tratar possiveis erros 
        try {
            
            //criando a conexão
            connection = ConnectionFactory.getConnection();
            
            //preparando a execução do query
            statement = connection.prepareStatement(sql);
        
            //setando o valor que corresponde ao filtro de busca
            statement.setInt(1, idProject);
        
            //valor retornado pela execução da query, vai ser guardada no resultset
            resultSet = statement.executeQuery();
     
            //vai fazer varias vezes a leitura no banco de dados 
        while (resultSet.next()){
         
            //criou uma nova tarefa 
            Task task = new Task();
            
/*
 vai pegar esses dados de cada leitura, se tiver tres vai fazer isso tres vezes
  e guarda o resultado, depois vai encerrar se nao tiver mais o que fazer.*/
            
            task.setId(resultSet.getInt("id"));
            task.setIdProject(resultSet.getInt("idProject"));
            task.setName(resultSet.getString("name"));
            task.setDescription(resultSet.getString("description"));
            task.setNotes(resultSet.getString("notes"));
            task.setIsCompleted(resultSet.getBoolean("completed"));
            task.setDeadline(resultSet.getDate("deadline"));
            task.setCreatedAt(resultSet.getDate("createdAt"));
            task.setUpdatedAt(resultSet.getDate("updatedAt"));
            
            //pegando as tarefas e colocando no banco de dados dentro da lista de tarefas
            tasks.add(task);
            
        }//fim while
        
        
        
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir a tarefa "+ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection( connection, statement, resultSet);
        }
        
        
        
        //lista de tarefas que foi criada e carregada do banco de dados     
        return tasks; 
}//fim metodo  
  
 //vai passar o id da task, e  remover do banco de dados 
 public void removeById( int taskId) {
    //comando para  ,deletar da tabela tarefa "task"
    String sql = "DELETE FROM task WHERE id = ?";
    
    //variável , para criar uma conexão com o banco de dados 
    Connection connection  = null;
    
    //variável, para  preparar a query
    PreparedStatement statement = null;
    
        try {//<< trata possivel erros
         
            //criacao da conexao com o banco de dados     
            connection = ConnectionFactory.getConnection();
        
            //preparando o comando da sql que será executada no banco de dados.
            statement =  connection.prepareStatement(sql);
        
            //pra substituir o sinal de ? no comeco do codigo, pelo valor recebido no paramentro   
            statement.setInt(1, taskId);
        
            //executando a query
            statement.execute();
        
        } catch (SQLException ex) {
        //exibi essa mensagem, se deu algum erro.
         throw new RuntimeException("Erro ao deletar a tarefa "+ex.getMessage(), ex);
        }finally {
            // vai fechar a conexão 
            ConnectionFactory.closeConnection(connection, statement);
        }
            
}//fim metodo
        
 
 
}//<< fim classe


   
  
  

