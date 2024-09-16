interface SalesItem {
    void recordSale(double amount);
    double calculateTotalSales();
}
class Hardware implements SalesItem {
    private String category;
    private String manufacturer;
    private double totalSales;

    // Constructor
    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.totalSales = 0; // Initialize totalSales to 0
    }
    public void recordSale(double amount) {
        this.totalSales += amount;
    }

    public double calculateTotalSales() {
        return this.totalSales;
    }

    // Method to display hardware details
    public void displayInfo() {
        System.out.printf("Hardware - Category: %s, Manufacturer: %s, Total Sales: inr %.2f%n",
                          category, manufacturer, calculateTotalSales());
    }
}
class Software implements SalesItem {
    private String typeOfSoftware;
    private String operatingSystem;
    private double totalSales;

    // Constructor
    public Software(String typeOfSoftware, String operatingSystem) {
        this.typeOfSoftware = typeOfSoftware;
        this.operatingSystem = operatingSystem;
        this.totalSales = 0; // Initialize totalSales to 0
    }

    public void recordSale(double amount) {
        this.totalSales += amount;
    }

    public double calculateTotalSales() {
        return this.totalSales;
    }

    // Method to display software details
    public void displayInfo() {
        System.out.printf("Software - Type: %s, Operating System: %s, Total Sales: inr %.2f%n",
                          typeOfSoftware, operatingSystem, calculateTotalSales());
    }
}
class DemoSales {
    public static void main(String[] args) {
        // Create hardware and software items
        Hardware hardwareItem = new Hardware("Laptop", "HP");
        Software softwareItem = new Software("Antivirus", "Windows 10");

        // Record some sales
        hardwareItem.recordSale(120050.00);
        hardwareItem.recordSale(95000.50);
        hardwareItem.recordSale(80000.00);

        softwareItem.recordSale(3000.00);
        softwareItem.recordSale(5600.50);
        softwareItem.recordSale(29500.00);

        // Display detailed information
        hardwareItem.displayInfo();
        softwareItem.displayInfo();
    }
}

