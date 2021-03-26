/**
 * Author: Zihao Xu
 * Class: CST338
 * Date: 3/24
 */
public class MeleeAttack implements Attack {

    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker =attacker;
    }


    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on "+target;
        System.out.println(message);
        return null;
    }
}


