/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Torvic PC
 */
import ejercicio_02.problema.Weapon;

public class MobileSword extends Weapon {
    public MobileSword() {
        this.name = "Espada";
        this.platform = "Mobile";
    }

    @Override
    public void use() {
        System.out.println("Espada Mobile con gráficos simples");
    }
}