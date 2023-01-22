/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnego01;

import Controller.ProjectController;
import Controller.TaskController;
import Model.Project;
import Model.Task;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.util.Date;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import jdk.dynalink.linker.support.Guards;



/**
 *
 * @author giova
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* funcionando 
      //cria uma conexão com o banco de dados 
      Connection  c = ConnectionFactory.getConnection();
     // fecha a conexão com o banco de dados 
      ConnectionFactory.closeConnection(c);
    **/
      
  
    
    /* funcionando
      //> cria duas variaveis,chama elas e executa 
    	ProjectController projectController = new ProjectController();;
        Project project = new Project();
       
     //> é para adiconar um projeto na base de dados,com nome,descrição, etc.. 
        project.setName("teste 6 ");
        project.setDescription(" olá bom dia, já é 13;00 ");
      
     //>  salva o projeto na base de dados, (projeto)
        projectController.save(project);
      **/
     
      
      
     
       /*funcionando
      //>>> atualizar o projeto
    //> cria duas novas variaveis , chama ela para executar elas e passar seus dados  
        ProjectController projectController = new ProjectController();;
        Project project = new Project();
       
      //> escolhe qual o id ,será modificado
        project.setId(4);
      
      //> quais itens desse id será modificado
        project.setName("atualizando");
        project.setDescription("teste de update no id  4 ");
      
      //> salva as mudanças no id escolhido .
        projectController.update(project);
       **/
       
     
     
      /*funcionando
       //>>>  saber a quantidade de projetos 
  //cria duas novas variaveis , chama ela para executar elas e passar seus dados 
        ProjectController projectController = new ProjectController();;
        Project project = new Project();
       // para saber quantos projetos há no banco de dados 
        List<Project>projects= projectController.getAll();
        System.out.println("O total de projetos = "+projects.size());
     **/ 
     
      
      
      /*funcionando
              // para excluir projeto
    //cria duas novas variaveis , chama ela para executar elas e passar seus dados 
     ProjectController projectController = new ProjectController();;
     
     //>>  remove o projeto no banco de dados, de acordo com o " id " do projeto
     projectController.removeById(27);
    **/
     
     //>>>>>>>>>> tarefas  <<<<<<<<<
     
      /* funcionando
     //>>>>>  adicionar tarefas no projeto 
     //cria duas novas variaveis , chama ela para executar elas e passar seus dados 
     TaskController taskController = new TaskController();;
     Task task = new Task();
  
      //> passando qual id de projeto é para adicionar tarefa 
     task.setIdPoject(2);
     task.setName("teste de tarefas");
     task.setDescription("teste de tarefas  ");
     task.setNotes("teste 2");
     task.setIsCompleted(false);
     task.setDeadline(new Date());
     // salvando a tarefa adicionada ao id do projeto 
     taskController.save(task);
      
       **/
     
    
    /*
           // >>> testar se está salvando a tarefa 
       //>>>>   funcionando  
     //cria duas novas variaveis , chama ela para executar elas e passar seus dados 
     TaskController taskController = new TaskController();;
     Task task = new Task();
     
     // para salvar a tarefa no banco de dados 
     task.setIdProject(36);
     task.setName("teste salvar tarefa");
     task.setDescription(" salvar");
     task.setNotes("teste salvar");
     task.setIsCompleted(false);
     task.setDeadline(new Date());
     
     taskController.save(task);
     
     **/

 
     /*         //>>>>   atualizar a tarefa 
    
     //cria duas novas variaveis , chama ela para executar elas e passar seus dados 
     TaskController taskController = new TaskController();;
     Task task = new Task();
     
    //  task.setIdPoject(34);
    // task.setName("teste");
     
     
     taskController.update(task);
     **/
     
    /* funcionando
         //saber quantas tarefas tem, de acordo com "idprojeto"
        TaskController taskController = new TaskController();;
        List<Task> tasks = taskController.getAll(29);;
        System.out.println("O total de tarefas é = "+tasks.size());
    **/
     
    
     /* funcionando
     //remover tarefas "tasks"
     TaskController taskController = new TaskController();;
     Task task = new Task();
     
     taskController.removeById(82);
     **/         
   
     
     
    }//FIMMETODO 
               
  
  }//fimclasse
