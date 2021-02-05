package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {
    
    public abstract String speak();
//test
    public int getValue(){
        return 10;
    }
}
