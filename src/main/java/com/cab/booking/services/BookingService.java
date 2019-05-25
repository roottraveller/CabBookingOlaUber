package main.java.com.cab.booking.services;

import main.java.com.cab.booking.domain.DestinationNode;
import main.java.com.cab.booking.domain.RatingNode;
import main.java.com.cab.booking.domain.user.Customer;

import java.util.List;

public class BookingService {
    private BookingManager bookingManager;

    public BookingService() {
        bookingManager = new BookingManager();
    }

    public double getCustomerAvgRating(Customer customer){
            return bookingManager.getCustomerAvgRating(customer);
    }

    public List<RatingNode> fetchEligibleDrivers(Customer customer, DestinationNode destinationNode, long seatRequired){
        return bookingManager.getEligibleDrivers(customer, destinationNode, seatRequired);
    }

    public long getCustomerRequestedRidesCount(Customer customer){
        return bookingManager.getCustomerRequestedRidesCount(customer);
    }
}
