package Payment;

public class CardPayment extends Payment implements Payable {
    private String cardNumber;
    private String cardHolderName;
    private Date expiryDate;
    private String cvv;

    public CardPayment(String paymentID, Date paymentDate, String paymentStatus, int productAmount,
                       String cardNumber, String cardHolderName, Date expiryDate, String cvv) {
        super(paymentID, paymentDate, paymentStatus, productAmount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public boolean validateCardDetails() {
      return true;
    }

    @Override
    public double calculatedPrice(double productPrice) {
        return super.calculatedPrice(productPrice);
    }

    @Override
    public void paymentDetail(String productId, String userId) {
        super.paymentDetail(productId, userId);
        System.out.println("Nama pemilik kartu: " + cardHolderName);
        System.out.println("Nomor kartu: " + cardNumber);
    }
}
