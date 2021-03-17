package springboot.mybatis.po;

public class TPhysicalFitnessCustom extends TPhysicalFitness {
    private Double stature;

    private Double weight;

    public Double getStature() {
        return stature;
    }

    public void setStature(Double stature) {
        this.stature = stature;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
