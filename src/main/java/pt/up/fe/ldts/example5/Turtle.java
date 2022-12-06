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



    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            if (direction == 'N') direction = 'W';
            else if (direction == 'W') direction = 'S';
            else if (direction == 'S') direction = 'E';
            else if (direction == 'E') direction = 'N';
        } else if (command == 'R') { // ROTATE RIGHT
            if (direction == 'N') direction = 'E';
            else if (direction == 'E') direction = 'S';
            else if (direction == 'S') direction = 'W';
            else if (direction == 'W') direction = 'N';
        } else if (command == 'F'){ // MOVE FORWARD
            if (direction == 'N') row--;
            if (direction == 'S') row++;
            if (direction == 'W') column--;
            if (direction == 'E') column++;
        }
    }
}
