import java.util.ArrayList;
import java.util.Collections;

public class RandomOTron {

    private ArrayList<String> names;

    public RandomOTron() {
        this.names = new ArrayList<>();
        this.names.add("Sarah");
        this.names.add("Daniel");
        this.names.add("Stuart");
        this.names.add("Andrew");
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public String getRandomName(){
        Collections.shuffle(names);
        String randomName = names.get(0);
        return randomName;
    }

    public ArrayList<String> getTwoNames(){
        ArrayList<String> twoNames = new ArrayList<>();
        Collections.shuffle(names);
        String randomName1= names.get(0);
        String randomName2 = names.get(1);
        twoNames.add(randomName1);
        twoNames.add(randomName2);

        return twoNames;
    }











}
