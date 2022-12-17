package pt.up.fe.ldts.example5;

public class Turtle {
    private Position position;

    public Turtle(int row, int column, char direction) {
        position= new Position(row,column, direction);
    }
    public void setRow( int row){
        position.setRow(row);
    }
    public void setColumn( int column){
        position.setColumn(column);
    }
    public void setDirection( char direction){
        position.setDirection(direction);
    }
    public int getRow() {
        return position.getRow();
    }

    public int getColumn() {
        return position.getColumn();
    }

    public char getDirection() {
        return position.getDirection();
    }

    public void setPosition(Position p){
        this.position=p;
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            setPosition(new CommandL(position).execute());
        } else if (command == 'R') { // ROTATE RIGHT
            setPosition(new CommandR(position).execute());
        } else if (command == 'F'){ // MOVE FORWARD
            setPosition(new CommandF(position).execute());
        }
    }
}
