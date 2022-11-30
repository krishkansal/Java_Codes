package Inheritance;

 class Payment {
	 	void PaymentCredit() {
		 
	 }
 }
 class Paytm extends Payment{
	 void PaymentCredit() {
		 System.out.print("Payment done via Paytm");
	 }
 }
 class UPI extends Payment{
	 void PaymentCredit() {
		 System.out.print("Payment done via UPI");
	 }
 }
 class PhonePe extends Payment{
	 void PaymentCredit() {
		 System.out.print("Payment done via PhonePe");
	 }
 }
 class GooglePay extends Payment{
	 void PaymentCredit() {
		 System.out.print("Payment done via GooglePay");
	 }
 }
 class Internet_Banking extends Payment{
	 void PaymentCredit() {
		 System.out.print("Payment done via Internet_Banking");
	 }
 }


public class Q2 {

	public static void main(String[] args) {
		Payment obj=new Paytm();
		

	}

}
