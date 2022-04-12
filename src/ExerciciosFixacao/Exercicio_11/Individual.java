package ExerciciosFixacao.Exercicio_11;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double taxValue = 0.0;
        if (getAnualIncome() <= 20000.00) {
            taxValue = (getAnualIncome() * 15 / 100) - (healthExpenditures * 50 / 100);
        } else {
            taxValue = (getAnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
        }
        return taxValue;
    }
}
