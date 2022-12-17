package pt.up.fe.ldts.example5;

public abstract class Command {

    Position position;
    public Command(Position position){
        this.position=position;
    }
    public void setPosition(Position position){
        this.position=position;
    }
    public Position getPosition(){
        return this.position;
    }
    public abstract Position execute();
}
