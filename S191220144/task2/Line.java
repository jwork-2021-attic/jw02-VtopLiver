package S191220144.task2;

public class Line {

    public Line(int length) {
        this.positions = new Position[length];
    }

    private Position[] positions;

    public void put(Linable linable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setLinable(linable);
    }

    public Linable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].linable;
        }
    }

    class Position {

        private Linable linable;

        Position(Linable linable) {
            this.linable = linable;
        }

        public void setLinable(Linable linable) {
            this.linable = linable;
            linable.setPosition(this);
        }

    }

    @Override
    public String toString() {
        String lineString = "\t";
        //int cnt=0;
        for (Position p : positions) {
            lineString += p.linable.toString();
            //cnt++;
            //if(cnt%16==0){
            //    lineString+="\n";
            //}
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;

    }

}
