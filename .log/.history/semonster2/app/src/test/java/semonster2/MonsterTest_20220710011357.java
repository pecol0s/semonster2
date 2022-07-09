package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void summonMonsterGreeting() {
    Monster summonMonster = new Monster(2, 3);
    if (summonMonster.rare < 3) {
      assertEquals("ドラゴン",
          summonMonster.summonMonster(2));
    } else {
      assertEquals("キングドラゴン",
          summonMonster.evoMonster(summonMonster.summonMonster(2)));
    }

  }
}
