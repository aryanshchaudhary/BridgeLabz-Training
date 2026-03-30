package model;

public class Bill {

    private int billId;
    private int visitId;
    private double totalAmount;
    private String paymentStatus;
    private String paymentDate;

    public Bill(int visitId, double totalAmount) {
        this.visitId = visitId;
        this.totalAmount = totalAmount;
        this.paymentStatus = "UNPAID";
    }

    public int getBillId() { return billId; }
    public int getVisitId() { return visitId; }
    public double getTotalAmount() { return totalAmount; }
    public String getPaymentStatus() { return paymentStatus; }
    public String getPaymentDate() { return paymentDate; }
}
