package homeWorkLesson5;

public class FinancialRecord {
    int incomes = 500;
    int outcomes = 300;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }
    String getInfo(){
        return "Доходы = " + incomes + " Расходы = " + outcomes;
    }
    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
}
