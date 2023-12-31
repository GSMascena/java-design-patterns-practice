package gsm.designpatterns.gof.strategy;

public class Robot {
    private Behaviour behaviour;

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move() {
        behaviour.move();
    }
}
