import java.util.Scanner;



    public class App {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            try {

                System.out.println("==================================");
                System.out.println("      WELCOME TO SMART GARAGE");
                System.out.println("==================================");

                System.out.print("Enter Customer Name : ");
                String name = sc.nextLine();

                System.out.print("Enter Car Number : ");
                String carNo = sc.nextLine();

                System.out.print("Enter Car Type : ");
                String carType = sc.nextLine();

                Customer customer = new Customer(name, carNo, carType);

                Service[] services = {

                        new Service(1, "Car Wash", 300),
                        new Service(2, "Oil Change", 400),
                        new Service(3, "Brake Check", 150),
                        new Service(4, "Coolant Change", 500),
                        new Service(5, "Full Service", 10000)

                };

                boolean[] selected = new boolean[services.length];

                while (true) {

                    System.out.println("\n========== AVAILABLE SERVICES ==========");

                    for (Service s : services) {

                        System.out.println(
                                s.getId() + ". "
                                        + s.getName()
                                        + " - ₹"
                                        + s.getPrice());

                    }

                    System.out.print("\nEnter Service ID : ");
                    int choice = sc.nextInt();

                    if (choice < 1 || choice > services.length) {

                        System.out.println("Invalid Service ID!");
                        continue;
                    }

                    selected[choice - 1] = true;

                    System.out.println(
                            services[choice - 1].getName()
                                    + " Added Successfully.");

                    System.out.print("Do you want to add another service? (Y/N): ");

                    char ch = sc.next().charAt(0);

                    if (ch == 'N' || ch == 'n') {
                        break;
                    }

                }

                int total = BillCalculation.calculatorTotal(services, selected);

                System.out.println("\n=====================================");
                System.out.println("           FINAL BILL");
                System.out.println("=====================================");

                System.out.println("Customer Name : " + customer.getName());
                System.out.println("Car Number    : " + customer.getCarNo());
                System.out.println("Car Type      : " + customer.getCarType());

                System.out.println("\nSelected Services");

                for (int i = 0; i < selected.length; i++) {

                    if (selected[i]) {

                        System.out.println(
                                services[i].getName()
                                        + " - ₹"
                                        + services[i].getPrice());

                    }

                }

                System.out.println("-------------------------------------");
                System.out.println("TOTAL AMOUNT : ₹" + total);
                System.out.println("-------------------------------------");
                System.out.println("THANK YOU FOR VISITING SMART GARAGE");

            } catch (Exception e) {

                System.out.println("Error : " + e.getMessage());

            } finally {

                sc.close();

            }

        }


    }