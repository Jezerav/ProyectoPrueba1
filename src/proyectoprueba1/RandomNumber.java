/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprueba1;
import java.util.Random;
public class RandomNumber {
        public static void main(String[] args) {
    Random random = new Random();
    int random_number = random.nextInt(1,10);
    System.out.println("Numero generado: "+random_number);
}
}
