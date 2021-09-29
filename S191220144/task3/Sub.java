package S191220144.task3;

import S191220144.task3.Matrix.Position;

public class Sub implements Linable {
    private final int num;
    private final int r;
    private final int g;
    private final int b;

    private Position position;

    Sub(int num, int r, int g, int b) {
        this.num=num;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    

    public int rank() {
        return this.num;
    }

    @Override
    public String toString() {
        String ss="";
        if(this.rank()<10){
            ss+="  "+this.rank();
        }
        else if(this.rank()<100){
            ss+=" "+this.rank();
        }
        else
            ss+=this.rank();
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + ss + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Sub another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }

}