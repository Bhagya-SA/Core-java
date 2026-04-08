class Paytm {

    Transcation transcations[] = new Transcation[5];
    int index;

    public boolean addTransaction(Transcation transcation) {

        boolean isTransactionAdded = false;

        boolean isTxnIdValid = false;
        boolean isUserNameValid = false;
        boolean isAmountValid = false;
        boolean isStatusCodeValid = false;
        boolean isDateValid = false;
        boolean isBalanceValid = false;

        int txnId = transcation.getTxnId();
        if (txnId > 0) {
            isTxnIdValid = true;
        }

        String userName = transcation.getUserName();
        if (userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }

        double amount = transcation.getAmount();
        if (amount > 0) {
            isAmountValid = true;
        }

        int statusCode = transcation.getStatusCode();
        if (statusCode >= 0) {
            isStatusCodeValid = true;
        }

        String date = transcation.getDate();
        if (date != null && !date.isEmpty()) {
            isDateValid = true;
        }

        double balance = transcation.getBalance();
        if (balance >= 0) {
            isBalanceValid = true;
        }

        if (isTxnIdValid && isUserNameValid && isAmountValid &&
            isStatusCodeValid && isDateValid && isBalanceValid) {

            isTransactionAdded = true;
            transcations[index++] = transcation;
        }

        return isTransactionAdded;
    }

    public void getTransactionDetails() {

        System.out.println("The transaction details are as follows :");

        for (Transcation transcation : transcations) {

            if (transcation != null) {
                System.out.println("--------------------------------------------");
                System.out.println("Transaction Id is : " + transcation.getTxnId());
                System.out.println("User Name is : " + transcation.getUserName());
                System.out.println("Amount is : " + transcation.getAmount());
                System.out.println("Status Code is : " + transcation.getStatusCode());
                System.out.println("Date is : " + transcation.getDate());
                System.out.println("Balance is : " + transcation.getBalance());
                System.out.println("--------------------------------------------");
            }
        }
    }
}