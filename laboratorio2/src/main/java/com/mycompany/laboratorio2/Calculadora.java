/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.laboratorio2;
/**
 *
 * @author Maria Camila Guzman Bello, Johan Alexander Herrera Morales, Alejandra Alvarado
 */
public class Calculadora {

    public static void main(String[] args) {
         //Se crea el objeto de la clase ObjetoCalculadora 
         ObjetoCalculadora calculadora = new ObjetoCalculadora();
         //Se asignan valores a los atributos de la clase a traves de los metodos set. 
         do{
            calculadora.setNumero1(calculadora.datos("Digite el numero 1")); 
         }while(calculadora.getNumero1()<=0); 
         do{
            calculadora.setNumero2(calculadora.datos("Digite el numero 2"));  
         }while(calculadora.getNumero2()<=0); 
         //Se ejecutan las operaciones que en este caso son funciones y se imprimen
         //Suma
         calculadora.impresion("El resultado de la SUMA es: "+calculadora.calcularSuma());
         //Resta
         calculadora.impresion("El resultado de la RESTA es: "+calculadora.calcularResta());
         //Multiplicacion
         calculadora.impresion("El resultado de la MULTIPLICACION es: "+calculadora.calcularMultiplicacion());
         //División
         calculadora.impresion("El resultado de la DIVISION es: "+calculadora.calcularDivision());
    }
}
