package Jobsheet4.Tugas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            RestaurantManager manager = new RestaurantManager("Restoran Bahagia");
        
            manager.addTable(new Meja("T001", "A1", 4, "Dekat Jendela", "Standard"));
            manager.addTable(new Meja("T002", "A2", 6, "Tengah", "Family"));
            manager.addTable(new Meja("T003", "B1", 2, "Dekat Pintu", "Couple"));

            Customer customer1 = new Customer("C001", "Budi Santoso", "08123456789", "budi@email.com");
            Customer customer2 = new Customer("C002", "Sari Indah", "08129876543", "sari@email.com");
            
            manager.addCustomer(customer1);
            manager.addCustomer(customer2);
    
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date tanggalReservasi = sdf.parse("2025-01-15");

            List<Meja> availableTables = manager.checkAvailability(tanggalReservasi, 4);
            System.out.println("Meja tersedia untuk 4 orang:");
            for (Meja table : availableTables) {
                System.out.println("- " + table.getTableInfo());
            }
        
            if (!availableTables.isEmpty()) {
                Reservation reservasi = manager.createReservation(
                    customer1, 
                    availableTables.get(0), 
                    tanggalReservasi, 
                    4
                );
                
                if (reservasi != null) {
            
                    reservasi.confirmReservation();
                    
                    reservasi.addToBill(250000);
                    System.out.println("\nInformasi Reservasi:");
                    System.out.println(reservasi.getReservationInfo());
                }
            }
            System.out.println("\n" + manager.generateDailyReport());
            System.out.println("\nInformasi Customer:");
            System.out.println(customer1.getCustomerInfo());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
