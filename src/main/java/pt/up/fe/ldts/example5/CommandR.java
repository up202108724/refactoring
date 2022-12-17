package pt.up.fe.ldts.example5;

public class CommandR extends Command{
    public CommandR(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') {
            getPosition().setDirection('E');
        }
        if(getPosition().getDirection()=='S'){
            getPosition().setDirection('W');
        }
        if(getPosition().getDirection()=='E'){
            getPosition().setDirection('S');
        }
        if(getPosition().getDirection()=='W'){
            getPosition().setDirection('N');
        }
        return getPosition();
    }
}
