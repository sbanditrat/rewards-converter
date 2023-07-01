public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);

    }

    public double getCashValue(){
        return cashValue;
    }

    public double convertToCash(int miles){
        return miles *0.0035;
    }

    public int convertToMiles(double cash){
        return (int) (cash/0.0035);
    }


    public int getMilesValue(){
        return milesValue;
    }

}

