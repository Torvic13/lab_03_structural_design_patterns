/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Torvic PC
 */
public class Cliente {
    public static void main(String[] args) {
        GameSession session = new GameSession();
        NetworkManager network = new NetworkManager();
        DatabaseManager database = new DatabaseManager();

        session.startSession();
        network.connect();
        database.saveData();
    }
}