package com.mycompany.vehiculos;

import controller.FuncionariosiudController;
import domain.Funcionariosiud;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AppFuncionariosiud {
    
    public static void crear(FuncionariosiudController funcionariosiudController) {
        
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite la cédula: ");
            String cedulaf = sc.nextLine();
            System.out.println("La cédula es: " + cedulaf);
            System.out.println(" -----------------------");
            
            System.out.println("Digite los nombres: ");
            String nombres = sc.nextLine();
            System.out.println("El nombre es: " + nombres);
            System.out.println(" -----------------------");
            
            System.out.println("Digite el apellido: ");
            String apellidos = sc.nextLine();
            System.out.println("El apellido es: " + apellidos);
            System.out.println(" -----------------------");
            
            System.out.println("Digite el estado civil: ");
            String estadocivil = sc.nextLine();
            System.out.println("El estado civil es: " + estadocivil);
            System.out.println(" -----------------------");
            
            System.out.println("Digite el sexo: ");
            String sexo = sc.nextLine();
            System.out.println("El sexo es: " + sexo);
            System.out.println(" -----------------------");
            
            System.out.println("Digite la dirección: ");
            String direccion = sc.nextLine();
            System.out.println("La dirección es: " + direccion);
            System.out.println(" -----------------------");
            
            System.out.println("Digite el teléfono: ");
            String telefono = sc.nextLine();
            System.out.println("El reléfono es: " + telefono);
            System.out.println(" -----------------------");
            
            System.out.println("Digite la fecha de nacimiento: ");
            String fnacimiento = sc.nextLine();
            System.out.println("La fenacha de nacimiento es: " + fnacimiento);
            System.out.println(" -----------------------");
            
            Funcionariosiud funcionariosiud = new Funcionariosiud();
            funcionariosiud.setCedulaf(cedulaf);
            funcionariosiud.setNombres(nombres);
            funcionariosiud.setApellidos(apellidos);
            funcionariosiud.setEstadocivil(estadocivil);
            funcionariosiud.setSexo(sexo);
            funcionariosiud.setDireccion(direccion);
            funcionariosiud.setTelefono(telefono);
            funcionariosiud.setFnacimiento(fnacimiento);
            funcionariosiudController.crear(funcionariosiud);
            System.out.println("Funcionario creado con éxito");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static void obtenerFuncionariosiud(FuncionariosiudController funcionariosiudController) {
        try {
            List<Funcionariosiud> funcionariosiud = funcionariosiudController.obtenerFuncionariosiud();
            if (funcionariosiud.isEmpty()) {
                System.out.println("No hay funcionarios");
            } else{
                funcionariosiud.forEach(funcionarios -> {
                    System.out.println("Cédula: " + funcionarios.getCedulaf());
                    System.out.println("Nombres: " + funcionarios.getNombres());
                    System.out.println("Apellidos: " + funcionarios.getApellidos());
                    System.out.println("Estado civil: " + funcionarios.getEstadocivil());
                    System.out.println("Sexo: " + funcionarios.getSexo());
                    System.out.println("Dirección: " + funcionarios.getDireccion());
                    System.out.println("Teléfono: " + funcionarios.getTelefono());
                    System.out.println("Fecha de nacimiento: " + funcionarios.getFnacimiento());
                    System.out.println("---------------------------");
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        
        FuncionariosiudController funcionariosiudController = new FuncionariosiudController();
        crear(funcionariosiudController);
        obtenerFuncionariosiud(funcionariosiudController);
    }
    
}
