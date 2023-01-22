/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Project;
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
public class ProjectController {
    //salvar projeto
    public void save(Project project ) {
        
        // cria variável "sql", salva esses dados dentro dela,colunas do banco de dados da tabela projeto
        String sql = "INSERT INTO project (name,"
            + " description, "
            + "createdAt, "
            + "updatedAt) VALUES (?, ?, ?, ?)";
      
        //cria uma variável "con..",  iniciando com nada dentro "null"
        Connection connection = null;
        //cria uma variável "state..",  iniciando com nada dentro "null"
        PreparedStatement statement = null;
        
        //trata erros     
        try {
            /*
            Cria uma variável "connection" ,
            ConnectionFactory >> que tem os dados para acesar o banco de dados.
            getConnection >> vai fazer a conexão com o banco de dados. 
            **/
            connection = ConnectionFactory.getConnection();
            
            /*
            ** dentro da "statement" já vai ter a "conexão" com o banco de dados,
            e os dados que será "modificado".
            */
            statement = connection.prepareStatement(sql);
            
            //vai "seta" colocar, na classe "project", na variável "name", o nome do projeto.
            //vai salvar esse nome na tabela "project", na coluna nome.
            statement.setString(1, project.getName());
            
            //dentro da classe "project", vai pegar a variável "description" ,
            //e vai "setar" o que foi adicionado pelo usuário dentro dela 
            statement.setString(2, project.getDescription());
            
            /*dentro da classe "project", vai pegar a variável "creatdAt", dentro dela vai pegar o formato da data
            vai fazer uma formatação dessa data, para ser diferente "java.util.Date;" para "java.sql.Date"
            e vai "setar" o que foi adicionado pelo usuário dentro dela    */
            statement.setDate(3, new Date (project.getCreatedAt().getTime()));
            
             /*dentro da classe "project", vai pegar a variável "updatedAt", dentro dela vai pegar o formato da data
            vai fazer uma formatação dessa data, para ser diferente "java.util.Date;" para "java.sql.Date"
            e vai "setar" o que foi adicionado pelo usuário dentro dela    */
            statement.setDate(4, new Date (project.getUpdatedAt().getTime()));
            
            //vai executar os comados da variável "statement"
            // vai fazer a conexão com o banco de dados, e coloca os valores setados no banco de dados
            statement.execute();
        
        // se deu "erro" vai exibir essa mensagem
        } catch (SQLException ex) {
             throw new RuntimeException("Erro ao salvar o projeto "+ex.getMessage(), ex);
        } finally {
               // fecha a conexão com o banco de dados e a conexão dos dados da sql
               ConnectionFactory.closeConnection( connection, statement);
        }    

}//fim metodo      
    //fazer atualização do projeto
    public void update(Project project){
        //cria uma variável "sql", vai guarda esses dados.
        String sql = "UPDATE project SET"
            + " name = ?,"
            + " description = ?,"
            + " createdAt = ?,"
            + " updatedAt = ?"
            + " WHERE id = ?";
      
        //cria uma var "connection", vazia.
        Connection connection =null;
      
        // ciar uma var "statement", vazia. 
        PreparedStatement statement = null;
      
        //para trata erros
        try {
            //gera conexão com o banco de dados.
            connection = ConnectionFactory.getConnection();
            
            //faz a conexão, com os dados  , da variável "SQL"
            statement = connection.prepareStatement(sql);
          
            //vai pegar o "nome", setar o nome que está no dados do sql 
            statement.setString(1, project.getName());
            //vai pegar a "descrição", setar na descrição que está no dados do sql
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date (project.getCreatedAt().getTime()));
            statement.setDate(4, new Date (project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
          
            //vai executar os dados 
            statement.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o projeto "+ex.getMessage(), ex);
        } finally {
               // fecha a conexão com o banco de dados e o statement           
               ConnectionFactory.closeConnection( connection, statement);
        }   
}//fim metodo
    
    
    //gerar uma lista de todos os projetos
    public List<Project> getAll()  {
        //salva na variável SQL  
        String sql = "SELECT * FROM project ";
        
        //cria uma lista de projetos, que já vai iniciar ao iniciar o programa       
        List<Project> projects = new ArrayList<>();
        
        //cria uma variável "connection", iniciada com nada.
        Connection connection = null;
        
        //cria uma variável "statement", iniciada com nada.
        PreparedStatement statement = null;
       
        //cria uma variável "resultSet" , iniciada com nada.
        ResultSet resultSet = null;
        
        //tratar possiveis erros
        try {
        //retorna a conexão, com o banco de dados e salva na var "connection".
        connection = ConnectionFactory.getConnection();
        
        //retorna a conexão, usando os dados "sql" e salva na variável "statement".
        statement = connection.prepareStatement(sql);
        
        //retorna o valor da execução da Query, e salva na var "resultSet".
        resultSet = statement.executeQuery();
     
        //enquanto  
        while (resultSet.next()){
            //criou uma nova tarefa 
            Project project = new Project();
            /*
            vai pegar esses dados de cada leitura, se tiver tres vai fazer isso tres vezes
            e guarda o resultado, depois vai encerrar se nao tiver mais o que fazer.
            */
            
            //Pega na variável "id", o valor que está lá dentro, seta na var "id do project".
            project.setId(resultSet.getInt("id"));
            //Pega na variável "name", o valor que está lá dentro, seta na var "name do project".
            project.setName(resultSet.getString("name"));
            project.setDescription(resultSet.getString("description"));
            project.setUpdatedAt(resultSet.getDate("createdAt"));
            project.setUpdatedAt(resultSet.getDate("updatedAt"));
            
            //pega os valores do "projeto" que é uma "tabela" do banco de dados,
            //Esse valores serão adicionados na lista criada "projects"
            projects.add(project);
        }
     
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar o projeto"+ex.getMessage(), ex);
        }   finally {
        // fecha a conexão , com o banco de dados, statement e resultSet.    
        ConnectionFactory.closeConnection( connection, statement, resultSet);
        }
        //vai retorna toda lista criada , e salvar no projects.    
         return projects; 
}//fim metodo
    
    
    // para remover, projetos 
    public void removeById(int idProject)  {
        //salvar esses dados, na variável "sql"
        // É um comando da tabela de dados para deletar.
        String sql = "DELETE FROM project WHERE id = ?";
        
        
        // variáveis para fazer conexão, iniciando com  = nada!
        Connection connection  = null;
        PreparedStatement statement = null;
        
        //trata possivel erros
        try {
            //criacao da conexao com o banco de dados     
            connection = ConnectionFactory.getConnection();
        
            //faz a conexão ,já com os comandos para deletar 
            statement =  connection.prepareStatement(sql);
        
            //vai deletar, de acordo com o número do id do projeto, já passado pelo usuário   
            statement.setInt(1, idProject);
            
            // já está deletando o id do projeto, adicionado pelo usuário.
            statement.execute();
        
        // se der erro , vai exibir a mensagem abaixo
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar o "
                    + "projeto "+ex.getMessage(), ex);
        } finally {
          // fecha a conexão com o banco de dados e o sql
          ConnectionFactory.closeConnection( connection, statement);
        }
            
      }//fim metodo
        
}//fim da classe   

 
