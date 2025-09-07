/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Torvic PC
 */
public class NetworkManager {
    private GameConfig config;

    public NetworkManager() {
        this.config = GameConfig.getInstance();
        config.setDebugMode(true);
    }

    public void connect() {
        System.out.println("Conectando a: " + config.getDatabaseUrl());
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}