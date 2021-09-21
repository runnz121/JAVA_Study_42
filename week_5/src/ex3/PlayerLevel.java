package ex3;

public abstract class PlayerLevel {

    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();


    public final void go(int count){
        showLevelMessage();
        run();
        for (int i = 0; i < count; i++){
            jump();
        }
        turn();
    }
}
