package com.logical;


    class MonthlyPayment {

        public static double calculateMonthlyPayment(double P, int Y, double R) {
            if (P < 0 || Y <= 0 || R < 0) {
                throw new IllegalArgumentException("Invalid input values. P, Y, and R must be non-negative.");
            }

            // Convert annual interest rate to monthly and calculate intermediate value
            double r = R / 100 / 12;
            double n = 12 * Y;

            // Calculate the monthly payment using the formula
            double monthlyPayment = P * r / (1 - Math.pow(1 + r, -n));

            return monthlyPayment;
        }

        public static void main(String[] args) {
            if (args.length != 3) {
                System.out.println("Usage: java LoanPaymentCalculator <Principal> <Years> <InterestRate>");
                return;
            }

            try {
                double principal = Double.parseDouble(args[0]);
                int years = Integer.parseInt(args[1]);
                double interestRate = Double.parseDouble(args[2]);

                double monthlyPayment = calculateMonthlyPayment(principal, years, interestRate);

                System.out.println("Monthly Payment: " + monthlyPayment);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numeric values.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }


