/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Torvic PC
 */
public class GameSession {

    private GameConfig config;

    public GameSession() {
        this.config = GameConfig.getInstance(); 
        config.setMaxPlayers(50);
    }

    public void startSession() {
        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}