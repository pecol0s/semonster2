package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void summonMonsterGreeting() {
    Monster summonMonster = new Monster();
    if(summonMonster.rare<3){
      assertEquals("ドラゴン",
      summonMonster.summonMonster(2));
    }
    else {
      assertEquals("キングドラゴン",
          summonMonster.evoMonster(summonMonster.summonMonster(2)));
    }
    println("")
  }
}
