package coordinate.model;

public class Value {

    private String value;

    public Value(String value) {
        this.value = value;
    }

    public Point createPoint(){
        String[] values = value.substring(1,value.length()-1).split(",");
        return new Point(toInt(values[0]),toInt(values[1]));
    }

    public int toInt(String value){
        return Integer.parseInt(value);
    }
}
