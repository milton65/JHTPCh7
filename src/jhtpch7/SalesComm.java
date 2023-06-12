package jhtpch7; 

public class SalesComm {
    public static void main(String[] args) {
        int[] salaryRanges = new int[9];
        double[] grossSales = { 5000, 6200, 4200, 7800, 9500, 11000, 6000, 8400, 7500, 4900 };

        // Calculate salaries and count salespeople in each range
        for (double sales : grossSales) {
            double salary = 200 + (0.09 * sales);
            if (salary >= 200 && salary < 300) {
                salaryRanges[0]++;
            } else if (salary >= 300 && salary < 400) {
                salaryRanges[1]++;
            } else if (salary >= 400 && salary < 500) {
                salaryRanges[2]++;
            } else if (salary >= 500 && salary < 600) {
                salaryRanges[3]++;
            } else if (salary >= 600 && salary < 700) {
                salaryRanges[4]++;
            } else if (salary >= 700 && salary < 800) {
                salaryRanges[5]++;
            } else if (salary >= 800 && salary < 900) {
                salaryRanges[6]++;
            } else if (salary >= 900 && salary < 1000) {
                salaryRanges[7]++;
            } else if (salary >= 1000) {
                salaryRanges[8]++;
            }
        }

        // Display results in tabular format
        System.out.println("Salary Range\tNumber of Salespeople");
        System.out.println();

        int lowerRange = 200;
        int upperRange = 299;
        for (int i = 0; i < salaryRanges.length - 1; i++) {
            String range = "$" + lowerRange + " - $" + upperRange;
            System.out.println(range + "\t\t" + salaryRanges[i]);
            lowerRange += 100;
            upperRange += 100;
        }
        System.out.println("$1000 and over\t\t" + salaryRanges[8]);
    }
}
