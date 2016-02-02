package bharath.demofirebase;

/**
 * Created by shashankm on 02/02/16.
 */
public class FbData {
    private String name, id;

    public FbData(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}
