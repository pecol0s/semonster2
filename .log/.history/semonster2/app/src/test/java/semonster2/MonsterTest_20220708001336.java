package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void summonMonsterGreeting() {
    Monster classUnderTest = new summonMonster();
    
    assertNotNull("summonMonster should have a greeting",
        classUnderTest.getGreeting());
  }
}
