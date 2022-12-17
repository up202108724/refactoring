package pt.up.fe.ldts.example5;

public class CommandF extends Command {
    public CommandF(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') {
            getPosition().setRow(getPosition().getRow() - 1);
        }
        if(getPosition().getDirection()=='S'){
            getPosition().setRow(getPosition().getRow()+1);
        }
        if(getPosition().getDirection()=='W'){
            getPosition().setRow(getPosition().getColumn()-1);
        }
        if(getPosition().getDirection()=='E'){
            getPosition().setRow(getPosition().getColumn()+1);
        }
    return getPosition();
    }
}
