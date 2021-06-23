package study.day19_Interfaces;

import java.util.Random;

public class StarWarsInterfacePractice {

    public static Character summonCharacter(){
        Random random = new Random();
        if (Math.abs(random.nextInt()) % 2 == 0){
            return new Enemy();
        }else {
            return new Hero();
        }
    }

    public static void main(String[] args){
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println("Enemy weapon: "+darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
