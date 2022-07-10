package semonster2;

import java.util.Random;
import java.util.HashMap;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();
  Random rand = new Random();

  void addPlayer(String playerName) {
    // hpは10以上150未満
    this.playerMap.put(playerName, new Player(playerName, rand.nextInt(150) + 10));
  }

  void draw(String playerName) {
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int b[] = {2,1,3,4,1,1,4,2}
    Player player = this.playerMap.get(playerName);
    player.drawMonsters();
  }
}
