package O6_AdapterWithBankAdapterDInjv3;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = scanner.nextLine();
        PhonePeBankAPI bankAdapter = BankAdapterFactory.getAdapter(bankName);
        PhonePe phonePe = new PhonePe(bankAdapter);
        phonePe.rechargeFastTag(100);
        phonePe.upiTransfer(100);
    }
}
