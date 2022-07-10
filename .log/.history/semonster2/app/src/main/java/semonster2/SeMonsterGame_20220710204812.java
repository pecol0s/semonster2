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
}
