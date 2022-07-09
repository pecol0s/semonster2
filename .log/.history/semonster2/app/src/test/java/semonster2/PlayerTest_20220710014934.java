package semonster2;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;

public class PlayerTest {
  @Test
  public void test() {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(0);
    String playerName = "aaa";

    Player p = new Player(list, playerName);
    p.drawMonsters();
    System.out.println(p.toString());
  }
}