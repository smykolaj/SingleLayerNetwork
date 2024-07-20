import java.util.ArrayList;

public class Vector
{
    public String name;
    public ArrayList<Double> values = new ArrayList<>();

    public Vector(String info)
    {
        String[] splittedInfo = info.split(",", 2);
        name = splittedInfo[0];


        int[] counts = new int[26];
        int length = splittedInfo[1].length();


        for (char c : splittedInfo[1].toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        if (length > 0) {
            for (int count : counts) {
                values.add((double) count / length);
            }
        }

    }


    public int getLength(){
        return values.size();
    }
}
