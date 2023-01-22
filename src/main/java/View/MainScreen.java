/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ProjectController;
import Controller.TaskController;
import Model.Project;
import Model.Task;
import Util.ButtonColumnCellReder;
import Util.DeadlineColumnCellRender;
import Util.TaskTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;


/**
 *
 * @author giova
 */
//classe da tela "principal"
public class MainScreen extends javax.swing.JFrame {
    // criando duas vari�vel
    ProjectController projecController;
    TaskController taskController;
    
    //cria vari�vel para trabalhar com get list.
    DefaultListModel projectsModel;
    
    //cria uma vari�vel para trabalhar com o "taskModel"
    TaskTableModel taskModel;
        
    //metodo construtor
    public MainScreen() {
        initComponents();
         
        //para iniciar os controllers
        initDataController();
        
        //inicia os models
        initComponentsModel();
        
        //inicia os decorate tables task
        decorateTableTask();
        
    }//fimmetodo

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTooBar = new javax.swing.JPanel();
        jLabeltooBarTitle = new javax.swing.JLabel();
        jLabelTooBarSubTitle = new javax.swing.JLabel();
        jPanelProject = new javax.swing.JPanel();
        jLabelProjectTitle = new javax.swing.JLabel();
        jLabel4ProjectAdd = new javax.swing.JLabel();
        jPanel3Task = new javax.swing.JPanel();
        jLabel5TaskTitle = new javax.swing.JLabel();
        jLabel6TaskAdd = new javax.swing.JLabel();
        jPanel4ProjecList = new javax.swing.JPanel();
        jScrollPane1Project = new javax.swing.JScrollPane();
        jList1Project = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel1EmptyList = new javax.swing.JPanel();
        jLabel7EmptyListIcon = new javax.swing.JLabel();
        jLabel9EmptyListTitle = new javax.swing.JLabel();
        jLabel8EmptyLisSubTitle = new javax.swing.JLabel();
        jScrollPaneTask = new javax.swing.JScrollPane();
        jTableTask = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));

        jPanelTooBar.setBackground(new java.awt.Color(0, 204, 102));
        jPanelTooBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabeltooBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabeltooBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltooBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/tick.png"))); // NOI18N
        jLabeltooBarTitle.setText("APPNEGO");

        jLabelTooBarSubTitle.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabelTooBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTooBarSubTitle.setText("Anote tudo n�o esque�a de nada !!");

        javax.swing.GroupLayout jPanelTooBarLayout = new javax.swing.GroupLayout(jPanelTooBar);
        jPanelTooBar.setLayout(jPanelTooBarLayout);
        jPanelTooBarLayout.setHorizontalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTooBarLayout.createSequentialGroup()
                        .addComponent(jLabelTooBarSubTitle)
                        .addGap(0, 279, Short.MAX_VALUE))
                    .addComponent(jLabeltooBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTooBarLayout.setVerticalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltooBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTooBarSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProject.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProject.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelProjectTitle.setForeground(new java.awt.Color(0, 204, 102));
        jLabelProjectTitle.setText("Projetos");

        jLabel4ProjectAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/add.png"))); // NOI18N
        jLabel4ProjectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4ProjectAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectLayout = new javax.swing.GroupLayout(jPanelProject);
        jPanelProject.setLayout(jPanelProjectLayout);
        jPanelProjectLayout.setHorizontalGroup(
            jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4ProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProjectLayout.setVerticalGroup(
            jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4ProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProjectTitle))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3Task.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3Task.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5TaskTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5TaskTitle.setForeground(new java.awt.Color(0, 204, 102));
        jLabel5TaskTitle.setText("Tarefas");

        jLabel6TaskAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/add.png"))); // NOI18N
        jLabel6TaskAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6TaskAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3TaskLayout = new javax.swing.GroupLayout(jPanel3Task);
        jPanel3Task.setLayout(jPanel3TaskLayout);
        jPanel3TaskLayout.setHorizontalGroup(
            jPanel3TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3TaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5TaskTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6TaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3TaskLayout.setVerticalGroup(
            jPanel3TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3TaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5TaskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6TaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4ProjecList.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4ProjecList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1Project.setFixedCellHeight(50);
        jList1Project.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1ProjectMouseClicked(evt);
            }
        });
        jScrollPane1Project.setViewportView(jList1Project);

        javax.swing.GroupLayout jPanel4ProjecListLayout = new javax.swing.GroupLayout(jPanel4ProjecList);
        jPanel4ProjecList.setLayout(jPanel4ProjecListLayout);
        jPanel4ProjecListLayout.setHorizontalGroup(
            jPanel4ProjecListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4ProjecListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1Project)
                .addContainerGap())
        );
        jPanel4ProjecListLayout.setVerticalGroup(
            jPanel4ProjecListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4ProjecListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1Project, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel1EmptyList.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1EmptyList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7EmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7EmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/lists.png"))); // NOI18N

        jLabel9EmptyListTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9EmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9EmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9EmptyListTitle.setText("Para adicionar um projeto clique no \"+\"  . ");

        jLabel8EmptyLisSubTitle.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel8EmptyLisSubTitle.setForeground(new java.awt.Color(0, 204, 102));
        jLabel8EmptyLisSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8EmptyLisSubTitle.setText("Nenhum projeto adicionado :D");

        javax.swing.GroupLayout jPanel1EmptyListLayout = new javax.swing.GroupLayout(jPanel1EmptyList);
        jPanel1EmptyList.setLayout(jPanel1EmptyListLayout);
        jPanel1EmptyListLayout.setHorizontalGroup(
            jPanel1EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9EmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7EmptyListIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1EmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8EmptyLisSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1EmptyListLayout.setVerticalGroup(
            jPanel1EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1EmptyListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7EmptyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8EmptyLisSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9EmptyListTitle)
                .addGap(25, 25, 25))
        );

        jPanel5.add(jPanel1EmptyList, java.awt.BorderLayout.CENTER);

        jTableTask.setBackground(new java.awt.Color(255, 255, 255));
        jTableTask.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableTask.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTableTask.setForeground(new java.awt.Color(0, 0, 0));
        jTableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Tarefa concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTask.setRowHeight(50);
        jTableTask.setSelectionBackground(new java.awt.Color(51, 204, 0));
        jTableTask.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTask.setShowVerticalLines(false);
        jTableTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTaskMouseClicked(evt);
            }
        });
        jScrollPaneTask.setViewportView(jTableTask);

        jPanel5.add(jScrollPaneTask, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTooBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4ProjecList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3Task, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTooBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3Task, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4ProjecList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4ProjectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4ProjectAddMouseClicked
            // criar um objeto "uma janela"
            ProjectDialogonSkin projectDialogonSkin = new ProjectDialogonSkin(this, rootPaneCheckingEnabled);
            // se vai deixar ou n�o a janela visivel para o  usu�rio 
            projectDialogonSkin.setVisible(true);
            
            /*
            pegando a janela criada e colocando um ouvinte,
            � um objeto, que quando a janela for fechada ,
            vai executar esse c�digo, atualizando a lista de projetos 
            */
            projectDialogonSkin.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e){
                        loadProjecs();
                }
            });

            
    }//GEN-LAST:event_jLabel4ProjectAddMouseClicked
   //quando clica em adicionar tarefas 
    private void jLabel6TaskAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6TaskAddMouseClicked
      // cria objeto "janela task"    
        TaskDialogonSkin taskDialogScreen = new TaskDialogonSkin(this, rootPaneCheckingEnabled);
        
        //pega o indice adicionado, e salva na vari�vel "projectIndex"
        int projectIndex = jList1Project.getSelectedIndex();
        
        //pega o indice dentro da var= "projectIndex", trasnforma ele, e salva na var= "project"
        Project project = (Project) projectsModel.get(projectIndex);
        
        // vai pegar o valor adicionado dentro da var"project" e colocar na janela 
        taskDialogScreen.setProject(project);
                
        // mostra a janela 
        taskDialogScreen.setVisible(true);
        
        //
        taskDialogScreen.addWindowListener(new WindowAdapter() {
            public void windosClosed(WindowEvent e){
                //pega o indice dentro da jlist..., e salva na var"projectIndex"
                int projectIndex = jList1Project.getSelectedIndex();
                
                //pega o indice dentra da projectsmodel, e salva na var"project"
                Project project = (Project) projectsModel.get(projectIndex);
                
                //pega o id dentro do project, e salva na var"task"(tarefa) 
                loadTask(project.getId());
            }
        });
         
    }//GEN-LAST:event_jLabel6TaskAddMouseClicked

    private void jTableTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTaskMouseClicked
       
        //pega um ponto, na linha dentro da jTableTask, e salva na var"rowIndex" 
        int rowIndex = jTableTask.rowAtPoint(evt.getPoint());
        
        //pega o ponto, na coluna dentro da jTableTask, e salva na var"columnIndex"
        int columnIndex = jTableTask.columnAtPoint(evt.getPoint());
        
        //pega a "rowIndex", pega a task dentro da taskModel, e coloca na var"task".
        Task task = taskModel.getTask().get(rowIndex);

        //escolha ( indice coluna )
        switch (columnIndex) {
            //caso, coluna 3 == "tarefa concluida"
            case 3:
                // vai atualizar o banco de dados "tarefa"
                taskController.update(task);
            break;
            
            case 4:{
                //cria uma janela 
                TaskDialogonSkin taskDialogScreen = new TaskDialogonSkin(this, rootPaneCheckingEnabled);
                //pega o indice, dentro da lista do projeto, e salva na var"projectIndex"
                int  projectIndex = jList1Project . getSelectedIndex ();
                //pega o indice  dentro do projectmodel,transforma ele , e salva na vari�vel project.
                Project  project = ( Project ) projectsModel.get( projectIndex );
                //pega o project e seta ele na janela
                taskDialogScreen . setProject ( project );
                // na var"task", vai atualizar os dados dela e colocar na janela 
                taskDialogScreen . setTasksUpdate(task );
                //seta que vai ficar visivel, a janela
                taskDialogScreen . setVisible ( true );
                //pega o id na var"project" e salva nas task(tarefas).
                loadTask( project.getId());
            break;}
            
            // caso,coluna "Excluir"   
            case 5:
                //pega o id da tarefa, e remove a tarefa  que tem esse id
                taskController.removeById(task.getId());
                //pega a tarefa ,removida dentro da "tabela" tarefa
                taskModel.getTask().remove(task);
                
                //pega o indice selecionado,dentro da jlistaprojeto, salva na var"projectIndex"
                int projectIndex = jList1Project.getSelectedIndex();
                //pega o indice selecionado dentro o projectsModel e salva na var"project"
                Project project = (Project) projectsModel.get(projectIndex);
                //pega o id dentro da var"projeto" e salva na tabela "tarefa".
                loadTask(project.getId());
                break;
        }
        
    }//GEN-LAST:event_jTableTaskMouseClicked

    
    
   //para carregar a lista de acordo como projeto escolhido 
    private void jList1ProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1ProjectMouseClicked
  
        //pega o indice, da lista projetos, e salva na var"projectIndex"
        int projectIndex = jList1Project.getSelectedIndex();
        
        //pega o indice do projeto, do projectsModel, e salva na var"project"
        Project project = (Project) projectsModel.get(projectIndex);
        
        //pega o id do project, e salva na tabela "tarefa" 
        loadTask(project.getId());
    }//GEN-LAST:event_jList1ProjectMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4ProjectAdd;
    private javax.swing.JLabel jLabel5TaskTitle;
    private javax.swing.JLabel jLabel6TaskAdd;
    private javax.swing.JLabel jLabel7EmptyListIcon;
    private javax.swing.JLabel jLabel8EmptyLisSubTitle;
    private javax.swing.JLabel jLabel9EmptyListTitle;
    private javax.swing.JLabel jLabelProjectTitle;
    private javax.swing.JLabel jLabelTooBarSubTitle;
    private javax.swing.JLabel jLabeltooBarTitle;
    private javax.swing.JList<String> jList1Project;
    private javax.swing.JPanel jPanel1EmptyList;
    private javax.swing.JPanel jPanel3Task;
    private javax.swing.JPanel jPanel4ProjecList;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelProject;
    private javax.swing.JPanel jPanelTooBar;
    private javax.swing.JScrollPane jScrollPane1Project;
    private javax.swing.JScrollPane jScrollPaneTask;
    private javax.swing.JTable jTableTask;
    // End of variables declaration//GEN-END:variables


public void decorateTableTask(){
    // CUSTOMIZANDO A HEADER DA TABLE DE TAREFAS
  jTableTask.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
  jTableTask.getTableHeader().setBackground(new Color(0, 153, 102));
  jTableTask.getTableHeader().setForeground(new Color(255, 255, 255));
  
  //CRIANDO UM SHORTS AUTOMATICO PARA A COLUNA DE TAREFAS
  jTableTask.setAutoCreateRowSorter(true);
  
  /*
  vai na "jTableTask" , vai abrir a colunas, e pega a " 2 coluna" 
  vai "setCellRenderer", modificar ela, colocando a "DeadlineColumnCellRender" que eu criei
  */
  jTableTask.getColumnModel().getColumn(2).
          setCellRenderer(new DeadlineColumnCellRender());
  
 
  /*
  vai na "jTableTask" , vai abrir a colunas, e pega a " 4 coluna" 
  vai "setCellRenderer", modificar ela, colocando o "BotonColorCell" que eu adicionei
  **/
    jTableTask.getColumnModel().getColumn(4).
          setCellRenderer(new ButtonColumnCellReder("edit.png"));
  
  
  /*
  vai na "jTableTask" , vai abrir a colunas, e pega a " 5 coluna" 
  vai "setCellRenderer", modificar ela, colocando o "BotonColorCell" que eu adicionei
  */
  jTableTask.getColumnModel().getColumn(5).
          setCellRenderer(new ButtonColumnCellReder("delete.png"));
  
  
}


public void initDataController(){
   // instancia as duas vari�veis  criadas no come�o
   projecController = new ProjectController();
   taskController = new TaskController();
  
}

    private void initComponentsModel() {
       //   
       projectsModel = new DefaultListModel();
        loadProjecs();
      
        // inicia novo model quando � iniciado 
        taskModel = new TaskTableModel();
        
        // ser� exibida a nova model que criamos na classe tasktablemodel
        jTableTask.setModel(taskModel);
   
        // se , estiver projetos 
        if (!projectsModel.isEmpty()) {
            
            // vai na lista e seleciona o primeiro 
            jList1Project.setSelectedIndex(0);
            
            // pega o projeto 
            Project project = (Project) projectsModel.get(0);
            loadTask(project.getId());
        }

    }

 //vai carregar as tarefas do bancos de dados e vai setar as tarefas dentro do tablemodel    
public void loadTask(int idProject){
    
    // vai carrega todas as tarefas do projeto, de acordo com seu id. 
    List<Task> task = taskController.getAll(idProject);

    // vai setar as tarefas, com essas tarefas carregadas
        taskModel.setTasks(task);
        
        // mostra jtable de tarefas, tem ou n�o tarefas, est� ou n�o vazia 
        showjTableTask(!task.isEmpty());
    
    
}

// se vai mostra ou n�o a lista de tarefas 
public void showjTableTask(boolean hastasks){
  // SE EXITEM TAREFAS    
    if(hastasks){   ///>> PARA REMOVER A "tela que tem mensagem" DE QUE N�O TEM TAREFAS <<//
         
            // SE a mensagem est� visivel para o usu�rio
            if(jPanel1EmptyList.isVisible()){
                // VAI PEGAR E ESCONDER ESSAS TAREFAS 
                jPanel1EmptyList.setVisible(false);
                //E VAI REMOVER DA TELA 
                jPanel5.remove(jPanel1EmptyList);
            }
            //se tiver tarefas, coloca esse painel aqui dentro
            jPanel5.add(jScrollPaneTask);
            // deixa ele visivel
            jScrollPaneTask.setVisible(true);
            // e deixa ela do tamanho da tela 
            jScrollPaneTask.setSize(jPanel5.getWidth(),jPanel5.getHeight());
            
         // senao  
         } else {
            // se N�O  tiver tarefas , vai deixar esse painel invisivel
               if(jScrollPaneTask.isVisible()){
                // VAI PEGAR E ESCONDER ESSE PAINEL
                jScrollPaneTask.setVisible(false);
                //E VAI REMOVER DA TELA 
                jPanel5.remove(jScrollPaneTask);
            }
            //se N�O tiver tarefas, coloca esse painel aqui dentro
            jPanel5.add(jPanel1EmptyList);
            // deixa ele visivel
            jPanel1EmptyList.setVisible(true);
            // e deixa ela do tamanho da tela 
            jPanel1EmptyList.setSize(jPanel5.getWidth(),jPanel5.getHeight());
    }

}



 
public void loadProjecs(){
   // criando uma lista que vai carregar todos os projetos 
    List<Project> projects = projecController.getAll();

       // vai limpar o projectmodel   
        projectsModel.clear();
         //para
        for (int i = 0; i < projects.size(); i++) {
            //
            Project project = projects.get(i);
            //vai adicionar um projeto
            projectsModel.addElement(project);
        }
        jList1Project.setModel(projectsModel);
        
}//fim metodo





private void centralizeMainScreen() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
 private void setApplicationIcon() {
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\inspect1\\Desktop\\L�gica de programa��o III\\Workspace\\TodoApp\\bin\\resources\\tick\\tick.png");
        this.setIconImage(icon);
    }


    
    
    
    
    
}





