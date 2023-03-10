/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria Camila Guzman, Alejandra ALvarado y Johan Herrera
 */
public class ObjetoCalculadora {
   //Declaración de los atributos de la clase
    private double numero1;
    private double numero2;
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
        if(this.numero1<=0){
            JOptionPane.showMessageDialog(null, "Error: El numero tiene que ser mayor a 0!");
        }
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
        if(this.numero2<=0){
          JOptionPane.showMessageDialog(null, "Error: El numero tiene que ser mayor a 0!"); 
        }
    }
    //Se inicializa el contructor de la clase padre, en este caso de la superclase "Object"
    public ObjetoCalculadora() {
        super();
    }
    //Se crean los metodos del programa Calculadora. 
    public double calcularSuma ()
    {
        return numero1+numero2;
    }
    public double calcularResta ()
    {
        return numero1-numero2;
    }
    public double calcularMultiplicacion ()
    {
        return numero1*numero2;
    }
    public double calcularDivision ()
    {
        double resultado=0; 
        if (numero2 != 0)
        {
        resultado = numero1 / numero2;
        }
        return (resultado);
    }
   //Funcion para capturar los datos
   public double datos(String mensaje){
    return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }
   //Funcion para imprimir los funciones 
   public void impresion(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
   }
}
