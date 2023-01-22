/*
Classe de modelo do Projeto = project
 */
package Model;

import java.util.Date;
import java.util.List;
import Model.Project;

/**
 *
 * @author giova
 */
//classe projeto, uma tabela do banco da dados!
public class Project {
	
    // atributos de acordo com o banco de dados
    private int id;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private List<Task> tasks;
    
    //metodo construtor
    public Project(int id, String name, String description, Date createdAt, Date updatedAt, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tasks = tasks;
    }// fim metodo
  
    // usado para modificar a data
    public Project() {
		this.createdAt = new Date();
		this.updatedAt = new Date();
    }// fim metodo
    
    // metodos acessores, para acessar os atributos 	
    public int getId() {
	return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Task> getTasks() {
        return tasks;
    }

  
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    // polimorfismo
    
    // retorna somente o nome do projeto
    @Override
    public String toString() {
        
        return this.name;
    }

    // adicionar projetos . usado na lista de projetos
    public void add(Project project) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public void add(List<Project> projects) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
    
}// fim da classe
