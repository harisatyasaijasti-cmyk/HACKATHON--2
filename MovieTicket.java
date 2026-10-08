import java.util.Scanner;
class MovieTicket {
String movieName;
double ticketPrice;
int numberOfTickets;
public MovieTicket(String name, double price, int tickets) {
movieName = name;
ticketPrice = price;
numberOfTickets = tickets;
}
public double calculateTotal() {
return ticketPrice * numberOfTickets;
}
public double calculateDiscount() {
if (numberOfTickets >= 5) {
return calculateTotal() * 0.10;
}
return 0.0;
}
public double calculateFinalAmount() {
return calculateTotal() - calculateDiscount();
}
public void displayBill() {
System.out.println("\n--- Booking Bill ---");
System.out.println("Movie Name: " + movieName);
System.out.printf("Ticket Price: %.2f\n", ticketPrice);
System.out.println("Number of Tickets: " + numberOfTickets);
System.out.printf("Total Amount: %.2f\n", calculateTotal());
System.out.printf("Discount: %.2f\n", calculateDiscount());
System.out.printf("Final Amount: %.2f\n", calculateFinalAmount());
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Movie Name: ");
String name = sc.nextLine();
System.out.print("Enter Ticket Price: ");
double price = sc.nextDouble();
System.out.print("Enter Number of Tickets: ");
int tickets = sc.nextInt();
MovieTicket ticket = new MovieTicket(name, price, tickets);
ticket.calculateTotal();
ticket.calculateDiscount();
ticket.calculateFinalAmount();
ticket.displayBill();
sc.close();
}
}