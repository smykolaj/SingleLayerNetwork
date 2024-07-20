import java.util.*;

public class Perceptron
{
    double bias;
    ArrayList<Double> weightsV;
    Layer layer;
    String name;


    public Perceptron(Layer layer, String name)
    {
        this.layer = layer;
        this.name = name;
        weightsV = new ArrayList<>(layer.size);
        for (int i = 0; i < layer.size; i++)
        {
            weightsV.add(-1+ Math.random()*2);
        }
        bias = Math.random();
    }



    public void train()
    {
        for (int i = 0; i < layer.epochs; i++)
        {
            for (Vector v : layer.vectors)
            {
                double desired = Objects.equals(v.name, this.name) ? 1 : 0;
                double res = activationFunc(net(v));
                double helperProduct = layer.learningRate * (desired - res);
                bias -= helperProduct;
                for (int j = 0; j < weightsV.size(); j++)
                {
                    weightsV.set(j, weightsV.get(j) + (helperProduct * v.values.get(j)));
                }
            }

        }

    }

    public double net(Vector v)
    {
        double sum = 0;
        for (int i = 0; i < weightsV.size()-1; i++)
        {
            sum += weightsV.get(i) * v.values.get(i);
        }
        sum -= bias;
        return sum;

    }

    public double activationFunc(double net)
    {
        if (net >= 0.0)
            return 1.0;
        return 0.0;
    }

}