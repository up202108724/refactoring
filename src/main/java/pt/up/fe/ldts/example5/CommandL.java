package pt.up.fe.ldts.example5;

public class CommandL extends Command{
    public CommandL(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') {
            getPosition().setDirection('W');
        }
        if(getPosition().getDirection()=='S'){
            getPosition().setDirection('E');
        }
        if(getPosition().getDirection()=='E'){
            getPosition().setDirection('N');
        }
        if(getPosition().getDirection()=='W'){
            getPosition().setDirection('S');
        }
        return getPosition();
    }
}
