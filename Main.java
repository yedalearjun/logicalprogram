import java.util.Scanner;


           class DayofWeek {
            public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                boolean keepGoing = true;

                while(keepGoing) {
                    System.out.println("Month");
                    int m = scanner.nextInt();
                    if (m < 1 || m > 12) {
                        System.out.println("Months are between 1 and 12");
                        continue;
                    }

                    System.out.println("Day");
                    int d = scanner.nextInt();
                    if (d < 1 || d > 31) {
                        System.out.println("Days are between 1 and 31");
                        continue;
                    }

                    System.out.println("Year");
                    int y = scanner.nextInt();
                    if (y < -10000 || y > 10000) {
                        System.out.println("Years are between -10000 and 10000");
                        continue;
                    }

                    int y0 = y - (14 - m) / 12;
                    int x = y0 + y0/4 - y0/100 +y0/400;
                    int m0 = m + 12 * ((14 - m) / 12) - 2;
                    int d0 = (d + x + 31 * m0 / 12) % 7;

                    String b;
                    if (d0 == 0) {
                        b = "Sunday";
                    } else if (d0 == 1) {
                        b = "Monday";
                    } else if (d0 == 2) {
                        b = "Tuesday";
                    } else if (d0 == 3) {
                        b = "Wednesday";
                    } else if (d0 == 4) {
                        b = "Thursday";
                    } else if (d0 == 5) {
                        b = "Friday";
                    } else {
                        b = "Saturday";
                    }

                    System.out.println("The day of the week is " + b);
                }

                // Close the scanner (optional)
                scanner.close();
            }
        }