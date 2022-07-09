package semonster2;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;

public class PlayerTest {
  @Test
  public void test() {
    String playerName = "aaa";

    Player p = new Player(playerName);
    int a[] = { 0, 1, 2, 3, 4, 0, 1, 2, };
    p.drawMonsters(a, a);

    assertEquals("ドラゴン",
        p.toString());
  }
}
