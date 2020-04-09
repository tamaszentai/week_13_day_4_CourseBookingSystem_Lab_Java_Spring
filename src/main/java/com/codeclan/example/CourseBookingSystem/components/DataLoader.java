package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = new Customer("Tamas", "Edinburgh", 30);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Balazs", "Edinburgh", 28);
        customerRepository.save(customer2);

        Course course1 = new Course("Intro to Python", "Edinburgh", 2);
        courseRepository.save(course1);

        Course course2 = new Course("Intro to Java", "Edinburgh", 3);
        courseRepository.save(course2);

        Booking booking1 = new Booking("01-04-2020", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-04-2020", course1, customer2);
        bookingRepository.save(booking2);

    }
}
