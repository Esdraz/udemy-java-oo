package ExerciciosFixacao.Exercicio_11;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double taxValor = 0;
        if (numberOfEmployees <= 10) {
            taxValor = getAnualIncome() * 0.16;
        } else {
            taxValor = getAnualIncome() * 0.14;
        }
        return taxValor;
    }
}
