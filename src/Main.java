import model.entities.Account;
import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (var sc = new Scanner(System.in)) {
            System.out.println("""

                    Confira o enunciado completo no arquivo PDF
                    localizado no pacote 'documentação'.
                    """);
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int accountNumber = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            var account = new Account(accountNumber, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            account.withdraw(withdraw);

            System.out.printf("New balance: %.2f", account.getBalance());

        } catch (WithdrawLimitExceededException | InsufficientBalanceException ex) {
            System.out.println("Withdraw error: " + ex.getMessage());
        } catch (RuntimeException ex) {
            throw new RuntimeException("unexpected error: " + ex.getMessage());
        }
    }
}