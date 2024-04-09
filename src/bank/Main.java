package bank;

import java.util.Scanner;

public class Main {

    private static int type;

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // tạo đối tượng(tk)
            Account account = new Account();

            // ask tk cn
            account.input();

            // ask nạp or rút
            System.out.print("Bạn muốn gửi tiền hay rút tiền? (Nhập '0 để gửi tiền' hoặc '1 để rút tiền'): ");
            String action = scanner.nextLine();
            System.out.print("Nhập số tiền: ");
            long money = (long) scanner.nextDouble();
            if (action.equals("deposit")) {
                long newAmount = account.depositAndWithdraw(money, 0);
                System.out.println("New amount after deposit: " + newAmount);
//                account.depositAndWithdraw(money, 0);
            } else if (action.equals("withdraw")) {
                long newAmount = account.depositAndWithdraw(money, 1);
                System.out.println("New amount after withdrawal: " + newAmount);
//                account.depositAndWithdraw(money, 1);
            }

            // in chi tiết tk
            
            account.depositAndWithdraw(money, type);
            System.out.println("Chi tiết tài khoản:\n" + account.toString());
        }

    }

