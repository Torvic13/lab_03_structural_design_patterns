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
import ejercicio_02.problema.Weapon;

public class Cliente {
    public static void main(String[] args) {
        // Usamos la fábrica de PC
        GameElementFactory pcFactory = new PCFactory();
        Character pcWarrior = pcFactory.createWarrior();
        Weapon pcSword = pcFactory.createWeapon();

        pcWarrior.attack();
        pcSword.use();

        System.out.println();

        // Usamos la fábrica de Mobile
        GameElementFactory mobileFactory = new MobileFactory();
        Character mobileWarrior = mobileFactory.createWarrior();
        Weapon mobileSword = mobileFactory.createWeapon();

        mobileWarrior.attack();
        mobileSword.use();
    }
}