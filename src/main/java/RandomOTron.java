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
        this.names.add("Kelsie");
        this.names.add("Ed");
        this.names.add("Connor");
        this.names.add("Liam");
        this.names.add("Chris");
        this.names.add("Lyle");
        this.names.add("Paul");
        this.names.add("Fraser");
        this.names.add("Roberto");
        this.names.add("Patrick");
        this.names.add("Nikhil");
        this.names.add("Callum");
        this.names.add("Brian");
        this.names.add("Ruaridh");
        this.names.add("Scott");

    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
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

    public String findByIndex(int index){
        return this.names.get(index);
    }












}
