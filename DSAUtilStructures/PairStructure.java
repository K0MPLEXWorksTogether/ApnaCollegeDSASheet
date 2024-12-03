package DSAUtilStructures;

public class PairStructure <Key, Value>{
    private final Key key;
    private final Value value;

    public PairStructure(Key key, Value value){
        this.key = key;
        this.value = value;
    }

    public Key getkey(){
        return key;
    }

    public Value getValue(){
        return value;
    }
}
