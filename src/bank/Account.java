package bank;

import java.util.Scanner;

        class Account {
            private String customerCode;
            private String customerName;
            private String accNumber;
            private long amount;

            public Account() {
                this.amount = 0;
            }

            public void input() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập mã khách hàng (5 ký tự): ");
                this.customerCode = scanner.nextLine();
                while (this.customerCode.length() != 5) { //độ dài mã số khách hàng
                    System.out.print("Mã khách hàng phải có 5 kí tự. Xin hãy nhập lại!");
                    this.customerCode = scanner.nextLine();
                }

                System.out.print("Nhập tên khách hàng: ");
                this.customerName = scanner.nextLine();

                System.out.print("Nhập số tài khoản (6 chữ số, bắt đầu bằng '100'): ");
                this.accNumber = scanner.nextLine();
                // xác thực định dạng stk
                while (this.accNumber.length() != 6 || !this.accNumber.startsWith("100")) {
                    System.out.print("Số tài khoản khách hàng phải có 6 chữ số và bắt đầu bằng '100'. Xin hãy nhập lại!: ");
                    this.accNumber = scanner.nextLine();
                }
            }

            public long depositAndWithdraw(long money, int type) {
                if (type == 0) { // nạp
                    if (money > 0) {
                        this.amount += money;
                        System.out.println("Gửi tiền thành công.");
                    } else {
                        System.out.println("Số tiền gửi không hợp lệ.");
                    }
                } else if (type == 1) { // rút
                    if (money > 0 && money <= this.amount) {
                        this.amount -= money;
                        System.out.println("Rút tiền thành công.");
                    } else {
                        System.out.println("Không đủ số dư.");
                    }
                }
                return this.amount;
            }

            public String toString() {
                return "Mã số khách hàng: " + this.customerCode + "\nTên khách hàng: " + this.customerName +
                        "\nTài Khoản khách hàng: " + this.accNumber + "\nSố dư: " + this.amount;
            }
        }






