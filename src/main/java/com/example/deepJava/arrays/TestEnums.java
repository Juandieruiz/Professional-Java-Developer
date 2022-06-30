package com.example.deepJava.arrays;

enum PayMode {
    CASH("{{CASH_KEY}}",0.0f), BIZUM("{{BIZUM_KEY}}",0.5f), CREDIT_CARD("{{CREDIT_KEY}}",2.50f), DEBIT_CARD("{{DEBIT_KEY}}",9.99f);

    private final String codeBank;
    private final float commission;
    private PayMode(String codeBank,float commission) {
        this.codeBank = codeBank;
        this.commission = commission;
    }

    public float getCommission() {
        return commission;
    }

    public String getcodeBank() {
        return codeBank;
    }
}
public class TestEnums {
    public static void main(String[] args) {
        PayMode user1 = PayMode.CASH;
        PayMode user2 = PayMode.BIZUM;
        PayMode user3 = PayMode.CREDIT_CARD;
        PayMode user4 = PayMode.BIZUM;
        PayMode user5 = PayMode.DEBIT_CARD;

        System.out.println("El usuario pago en modo: " + user1);
        System.out.println("El usuario pago en modo: " + user2);
        System.out.println("El usuario pago en modo: " + user3);
        System.out.println("El usuario pago en modo: " + user4);
        System.out.println("\n");
        System.out.println("passwdPay: " + user1.getcodeBank());
        System.out.println("passwdPay: " + user2.getcodeBank());
        System.out.println("passwdPay: " + user3.getcodeBank());
        System.out.println("passwdPay: " + user4.getcodeBank());
        System.out.println("\n");
        System.out.println("commission de pago: " + user1.getCommission());
        System.out.println("commission de pago: " + user2.getCommission());
        System.out.println("commission de pago: " + user3.getCommission());
        System.out.println("commission de pago: " + user4.getCommission());
        System.out.println("commission de pago: " + user5.getCommission());
    }
}
