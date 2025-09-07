/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.solucion;

/**
 *
 * @author Torvic PC
 */

public class Cliente {
    public static void main(String[] args) {
        GameFactory rpgFactory = new RPGFactory();
        GameFactory fpsFactory = new FPSFactory();

        rpgFactory.playGame();
        fpsFactory.playGame();
    }
}