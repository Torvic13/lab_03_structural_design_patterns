/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Torvic PC
 */
import ejercicio_02.problema.Character;

public class MobileWarrior extends Character {
    public MobileWarrior() {
        this.name = "Guerrero";
        this.platform = "Mobile";
    }

    @Override
    public void attack() {
        System.out.println("Guerrero Mobile ataca con efectos básicos");
    }
}