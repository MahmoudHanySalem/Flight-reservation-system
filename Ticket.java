/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Mahomod
 */
public class Ticket {
    public static int ticketNum=1;
    int flightNumber,ticketNumber;
    double cost;
    String FlayingClass,ownerName,phoneNumber;

    public Ticket(){}
    public Ticket(int flightNumber,String ownerName,String phoneNumber, String FlayingClass, double cost) {
        this.flightNumber=flightNumber;
        this.ticketNumber =ticketNum;
        this.cost = cost;
        this.FlayingClass = FlayingClass;
        this.ownerName = ownerName;
        this.phoneNumber=phoneNumber;
        ticketNum++;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public double getCost() {
        return cost;
    }

    public String getFlayingClass() {
        return FlayingClass;
    }

    public void setFlayingClass(String FlayingClass) {
        this.FlayingClass = FlayingClass;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public static int getTicketNum() {
        return ticketNum;
    }

    public static void setTicketNum(int ticketNum) {
        Ticket.ticketNum = ticketNum;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

}
