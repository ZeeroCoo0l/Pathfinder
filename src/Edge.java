import java.io.Serializable;
import java.util.Objects;

public class Edge <T> implements Serializable {
    private final T destination;
    private final String name;
    private int weight;

    public Edge(T destination, String name, int weight) {
        this.destination = destination;
        this.name = name;
        this.weight = weight;
    }

    public T getDestination(){
        return destination;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        if (weight < 0){
            throw new IllegalArgumentException("The weight is negative");
        }
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Edge edge) {
            return destination.equals(edge.destination) && name.equals(edge.name) && weight == edge.getWeight();
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(destination, name, weight);
    }
    @Override
    public String toString() {
        return "till " + destination + " med " + name + " tar " + weight;
    }

}
