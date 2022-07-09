package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void summonMonsterGreeting() {
    Monster classUnderTest = new summonMonster();
    assertEquals("デュラハン[2]",
        classUnderTest.summonMonster(2));
  }
}
