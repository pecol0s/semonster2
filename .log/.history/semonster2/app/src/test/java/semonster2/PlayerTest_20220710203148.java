package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void test() {
    String playerName = "aaa";
    int hp = 50;

    Player p = new Player(playerName, hp);
    int a[] = { 0, 1, 2, 3, 4, 0, 1, 2, };
    p.drawMonsters(a, a);

    assertEquals("Deck:aaa\n" + "Deck's HP:50\n" + "スライム:レア度[0]\n" + "サハギン:レア度[1]\n" + "ドラゴン:レア度[2]\n"
        + "キングデュラハン:レア度[3]\n" +
        "キングシーサーペント:レア度[4]\n" +
        "スライム:レア度[0]\n" +
        "サハギン:レア度[1]\n" +
        "ドラゴン:レア度[2]\n",
        p.toString());
  }
}
