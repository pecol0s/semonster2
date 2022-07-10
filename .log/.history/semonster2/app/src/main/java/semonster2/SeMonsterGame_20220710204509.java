package semonster2;

import java.util.ArrayList;
import java.util.HashMap;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();
  ArrayList<Monster> randomNumList = new ArrayList<>();

  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(randomNumberList, playerName));
  }
}
