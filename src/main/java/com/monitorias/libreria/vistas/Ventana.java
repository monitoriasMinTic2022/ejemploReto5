/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitorias.libreria.vistas;

import javax.swing.JFrame;
import com.monitorias.libreria.LibreriaApplication;
import com.monitorias.libreria.repos.ClienteRepo;
import com.monitorias.libreria.Extractor;
import java.util.Optional;
import com.monitorias.libreria.modelos.Cliente;

/**
 *
 * @author clases
 */
public class Ventana extends JFrame {
    ClienteRepo repo;
    
    public Ventana(){
        initComponents();
        String[] args = {};
        LibreriaApplication.runSpringServer(args);
        
        repo = Extractor.getBean(ClienteRepo.class);
    }
    
    private void initComponents() {
        
        jButton1 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField("Introduzca el ID");
        clienteNombre = new javax.swing.JTextField("Nombre cliente");
        clienteNombre.setBounds(200, 1000, 350, 1160);
        clienteEmail = new javax.swing.JTextField("Email");
        clienteEmail.setBounds(160, 1000, 150, 60);
        clienteTel = new javax.swing.JTextField("Telefono");
        clienteTel.setBounds(330, 1000, 150, 60);
        jTextField1.setBounds(0, 0, 150, 60);
        jButton1.setBounds(0, 0, 250, 60);
        jButton1.setLocation(250, 150);
        guardar.setBounds(0, 0, 150, 60);
        guardar.setLocation(200, 1000);
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLabel1.setText("Buscar cliente");
        this.setSize(1390, 1300);
        this.setLocation(100, 150);
        this.add(jButton1);
        this.add(jTextField1);
        this.add(clienteNombre);
        this.add(jLabel1);
        this.add(clienteEmail);
        this.add(clienteTel);
        this.add(guardar);
        
        
    }
        
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
        
        Long id = Long.parseLong(jTextField1.getText());
        Optional<Cliente> result = repo.findById(id);
        Cliente uno;
        if(result.isPresent()){
            uno = result.get();
            System.out.println("Funciona!!" + uno.getNombres());
            clienteNombre.setText(uno.getNombres());
        }
        
    }       
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField clienteNombre;
    private javax.swing.JTextField clienteTel;
    private javax.swing.JTextField clienteEmail;
}
