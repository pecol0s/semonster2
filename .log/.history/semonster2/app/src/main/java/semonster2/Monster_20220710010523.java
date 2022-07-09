package semonster2;
import java.util.Random;

public class Monster{
  String name;
  int rare;

  public String toStoring(){
    return this.name + ":レア度["+this.rare+"]";
  }

  String summonMonster(int number){


    String monster[] = {"スライム","サハギン","ドラゴン","デュラハン","シーサーペント"};
    return monster[number];
  }

  String evoMonster(String name){

    return "キング"+name;
  }

  Monster(int nameNum, int rareNum){

    this.name = this.summonMonster(nameNum);
    this.rare = in
    if(this.rare>=3){
      this.name=this.evoMonster(this.name);
    }
  }
}
