public class Main {

    // ADD YOUR CODE HERE

     public static double[] getMultipleGradeCaps(String[] grades) {
        double[] caps = new double[grades.length];
        for (int i = 0; i < grades.length; i++) {
           // ...
            switch (grades[i]) {
        case "A+":
        case "A":
            caps[i] = 5.0;
            break;
        case "A-":
            caps[i] = 4.5;
            break;
        case "B+":
            caps[i] = 4.0;
            break;
        case "B":
            caps[i] = 3.5;
            break;
        case "B-":
            caps[i] = 3.0;
            break;
        case "C":
            caps[i] = 2.5;
            break;
        default:
            caps[i] = 0;
            break;
        }

       

        }
        return caps;
    }


    public static double getGradeCap(String grade) {
        double cap = 0;
        
        switch (grade) {
        case "A+":
        case "A":
            cap = 5.0;
            break;
        case "A-":
            cap = 4.5;
            break;
        case "B+":
            cap = 4.0;
            break;
        case "B":
            cap = 3.5;
            break;
        case "B-":
            cap = 3.0;
            break;
        case "C":
            cap = 2.5;
            break;
        default:
            cap = 0;
            break;
        }
        return cap;
    }

public static void main(String[] args) {
        String[] grades = new String[]{"A+", "A", "A-"};
        double[] caps = getMultipleGradeCaps(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + ":" + caps[i]);
        }
    }
}