public class Rating{
  private Date ratingDate;
  private int ratingValue;

  public Rating(String productName, double productPrice, String productSize, String productColor, String userId,Date ratingDate, int ratingValue){
    this.ratingDate = ratingDate;
    this.ratingValue = ratingValue;
  }

   public int getRatingByProduct(String productId) {
        System.out.println("Mencari rating untuk product ID: " + productId);
        return this.ratingValue;
    }
    public int ratingCalculation() {
        return this.ratingValue;
    }

    public String toString() {
        return "Rating{" + "ratingDate=" + ratingDate + ", ratingValue=" + ratingValue + "}";
    }
}
