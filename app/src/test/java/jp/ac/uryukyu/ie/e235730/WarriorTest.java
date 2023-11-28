package jp.ac.uryukyu.ie.e235730;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWWSTest(){
        Warrior warrior = new Warrior("デモ勇者",100,100);
        Enemy enemy = new Enemy("スライムもどき",10000,100);
        int originHP=enemy.getHitPoint();
        for(int i=0;i<3;i++){
            warrior.attackWithWeponSkill(enemy);
            assertEquals(warrior.getAttack()*1.5,originHP-enemy.getHitPoint());
            originHP=enemy.getHitPoint();
    } 
  }
}
