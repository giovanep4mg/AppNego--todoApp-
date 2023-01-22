/*
classe respons�vel para fazer a conex�o com o banco de dados 
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author giova
 */
//faz a conex�o com o banco de dados
public class ConnectionFactory {
    // passa o endere�o, nome  de qual banco de dados ser� usado.
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    // passa o link "url", para se conectar ao banco de dados 
    public static final String URL = "jdbc:mysql://localhost:3306/appnego";
    
    //passa nome de usu�rio, para o banco de dados , neste caso est� vazio
    public static final String USER = "root";
    
    //passa a senha do usu�rio, para o banco de dados , neste caso est� vazio
    public static final String PASS = "";
    
    //>>> static <<>> nao precisar criar um objeto para poder chamar ele 
    
    //devolve uma conexao com o banco de dados
    public static Connection getConnection() {
        
        //try..>> para tratar possiveis erros
        try {
            //passa o endere�o, que voc� quer se conectar ao banco de dados 
            Class.forName(DRIVER);
            
            //passa o url,user,pass para conectar, e retorna a conex�o com  banco de dados 
            return DriverManager.getConnection(URL, USER, PASS);
        
        // verifica se tem erro, se tiver vai d� essa mensagem de Erro.
        } catch (Exception ex) {
            throw new RuntimeException(" Erro na conex�o com o banco de dados "+ex.getMessage(), ex);
        }
    }//fim metodo
    
    // fecha as conex�es com o banco de dados 
    public static void closeConnection(Connection connection) {
        //try..catch >>>  para tratar possiveis erros
        try {
          //se (conex�o n�o foi feita)
            if (connection != null) {
                //fecha a conex�o
                connection.close();
            }
            
        //se deu algum erro, vai exibir essa mensagem    
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados "+ex.getMessage(), ex);
        }
    }// fim metodo
    
    public static void closeConnection(Connection connection,
            PreparedStatement statement) {
        //tratar erros
        try {
            //se (conex�o n�o foi feita)
            if (connection != null) {
                //fecha a conex�o
                connection.close();
            }
            //se (conex�o n�o foi feita)
            if (statement != null) {
                //fecha a conex�o
                statement.close();
            }
        // se deu algum erro, vai exibir essa mensagem  
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar a conex�o statement com "
                    + "o banco de dados"+ex.getMessage(), ex);
        }
        
    }//fim metodo

    //fecha conex�o
    public static void closeConnection(Connection connection, PreparedStatement
            statement,ResultSet resultSet) {
        
      // tratar possiveis erros 
        try {
          // se a conex�o est� aberta 
            if (connection != null) {
                connection.close();// fecha ela
            }
          // se statement estiver aberto
            if (statement != null) {
                statement.close();// fecha ele
            }
          // se o result estiver aberto
            if (resultSet != null) {
                resultSet.close();// fecha ele
                
            }
           
        } catch (SQLException ex) {
            // se deu algum erro, exibi essa mensagem 
            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados "+ex.getMessage(), ex);
        }
        
    }//fim metodo

}//fim classe
