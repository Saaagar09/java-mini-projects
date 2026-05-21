public class Main {
    public static void main(String[] args) {

        PayPal paypal = new PayPal();
        Upi upi = new Upi();
        CreditCard creditcard = new CreditCard();

        paypal.pay(700);
        upi.pay(900);
        creditcard.pay(200);
    }

}
