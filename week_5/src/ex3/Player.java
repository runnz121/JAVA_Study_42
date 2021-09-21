package ex3;

public class Player {
  private PlayerLevel playerLevel;

  //Main method에 beginnerlevel 생성자가 없음으로 여기서 생성
    public Player(){
     playerLevel = new BeginnerLevel();
    }

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel){
        this.playerLevel = playerLevel;
    }

    public void play(int count) {
        playerLevel.go(count);
    }
}
