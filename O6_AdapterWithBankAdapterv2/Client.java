package O6_AdapterWithBankAdapterv2;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.rechargeFastTag(100);
        phonePe.upiTransfer(100);
    }
}
