package polymorphism;

public class InsuredShippingItem extends ShippingItem {
    private double insuredAmount;

    public InsuredShippingItem(double w, double insAmt) {
        /* TO BE IMPLEMENTED IN PART B */
        super(w);
        this.insuredAmount = insAmt;
    }

    public double getInsuredAmount() {
        return insuredAmount;
    }

    public double getCost() {
        /* TO BE IMPLEMENTED IN PART C */
        return super.getCost() + insuredAmount;
    }

    public void addMoreInsurance(double amt) {
        insuredAmount += amt;
    }
}

