import java.nio.file.Path;
import java.util.*;

public class Layer
{
    long epochs;
    Path trainSet;
    Path testSet;
    double learningRate = 0.01;
    HashSet<String> uniqueNames = new HashSet<>();
    ArrayList<Vector> vectors = new ArrayList<>();
    int size;
    ArrayList<Perceptron> perceptrons = new ArrayList<>();

    public Layer(String trainSet, String testSet, int epochs)
    {
        this.epochs = epochs;
        this.trainSet = Path.of(trainSet);
        this.testSet = Path.of(testSet);
        this.size = readFile();
        initialisePerceptrons();
        classifyTestSet();


    }

    private int readFile()
    {
        Scanner sc;
        try
        {
            sc = new Scanner(trainSet);
            while (sc.hasNextLine())
            {

                String data = sc.nextLine();
                Vector v = new Vector(data);
                vectors.add(v);

            }
        } catch (Exception e)
        {
            System.out.println("File not found");
        }
        for (Vector v : vectors)
        {
            uniqueNames.add(v.name);
        }
        return vectors.get(0).getLength();

    }

    private void initialisePerceptrons()
    {
        for (String name : uniqueNames)
        {
            Perceptron p = new Perceptron(this, name);
            p.train();
            perceptrons.add(p);

        }
    }


    public String classifyVector(Vector data)
    {
        //Vector v = new Vector("unknown, "+data);
        double biggestNet = perceptrons.get(0).net(data);
        String perceptronName = perceptrons.get(0).name;
        for (int i = 1; i < perceptrons.size(); i++)
        {
            double net = perceptrons.get(i).net(data);
            if (net > biggestNet)
            {
                biggestNet = net;
                perceptronName = perceptrons.get(i).name;
            }
        }
        return perceptronName;


    }

    public void classifyText(String text){
        System.out.println("Expected output: " + "unknown" + " Resulted output: " + classifyVector(new Vector("Unknown , "+ text)));
    }

    public ArrayList<Vector> returnTestSet()
    {
        Scanner sc = null;
        ArrayList<Vector> testData = new ArrayList<>();
        try
        {
            sc = new Scanner(testSet);
            while (sc.hasNextLine())
            {
                String data = sc.nextLine();
                testData.add(new Vector(data));
            }
        } catch (Exception e)
        {
            System.out.println("File not found");
        }
        return testData;
    }

    public void classifyTestSet()
    {
        double correct = 0.0;
        double total = 0.0;
        for (Vector v : returnTestSet())
        {
            String classifiedRes = classifyVector(v);
            if (classifiedRes.equals(v.name))
                correct++;
            total++;
            //System.out.println("Expected output: " + v.name + " Resulted output: " + classifiedRes);
        }
        System.out.println("Accuracy for test set: " + correct / total * 100);

    }

}
