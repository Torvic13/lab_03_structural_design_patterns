/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.solucion;

/**
 *
 * @author Torvic PC
 */
import ejercicio_01.problema.Game;
import ejercicio_01.problema.FPSGame;

public class FPSFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new FPSGame();
    }
}