class PaytmRunner {

    public static void main(String[] pay) {

        Paytm paytm = new Paytm();

        Transcation txnOne = new Transcation();
        txnOne.setTxnId(1);
        txnOne.setUserName("Rahul");
        txnOne.setAmount(1000);
        txnOne.setStatusCode(1);
        txnOne.setDate("2026-04-07");
        txnOne.setBalance(5000);

        boolean isTransactionAdded = paytm.addTransaction(txnOne);
        System.out.println(isTransactionAdded);

        Transcation txnTwo = new Transcation();
        txnTwo.setTxnId(2);
        txnTwo.setUserName("Amit");
        txnTwo.setAmount(2000);
        txnTwo.setStatusCode(1);
        txnTwo.setDate("2026-04-07");
        txnTwo.setBalance(7000);

        isTransactionAdded = paytm.addTransaction(txnTwo);
        System.out.println(isTransactionAdded);

        Transcation txnThree = new Transcation();
        txnThree.setTxnId(3);
        txnThree.setUserName("Sneha");
        txnThree.setAmount(1500);
        txnThree.setStatusCode(1);
        txnThree.setDate("2026-04-07");
        txnThree.setBalance(6500);

        isTransactionAdded = paytm.addTransaction(txnThree);
        System.out.println(isTransactionAdded);

        Transcation txnFour = new Transcation();
        txnFour.setTxnId(4);
        txnFour.setUserName("Priya");
        txnFour.setAmount(2500);
        txnFour.setStatusCode(1);
        txnFour.setDate("2026-04-07");
        txnFour.setBalance(8000);

        isTransactionAdded = paytm.addTransaction(txnFour);
        System.out.println(isTransactionAdded);

        Transcation txnFive = new Transcation();
        txnFive.setTxnId(5);
        txnFive.setUserName("Kiran");
        txnFive.setAmount(3000);
        txnFive.setStatusCode(1);
        txnFive.setDate("2026-04-07");
        txnFive.setBalance(9000);

        isTransactionAdded = paytm.addTransaction(txnFive);
        System.out.println(isTransactionAdded);

        paytm.getTransactionDetails();
    }
}