package StudentGradeRanking;

import java.util.*;

public class StudentOperation {

        static Map<Integer,Double> map=new HashMap<>();
        static  Scanner input=new Scanner(System.in);

        public void addstuednt(){
            System.out.println("How Many Student's MArk U want add:");
            int N= input.nextInt();
            for (int i=0;i<N;i++){
                try {
                    System.out.println("Enter the  "+ (i+1)  +"  Student RollNumber:");
                    int roll = input.nextInt();
                    if (map.containsKey(roll)){
                        throw  new DuplicateEnrollmentException("Enter Unique ROllNo -->>U alreay entered this roll number");
                    }

                    System.out.println("Enter CGPA : (0-10) For Roll->Number  "+roll);
                    double cgpa= input.nextDouble();
                    try {
                        if (cgpa > 10 || cgpa < 0) {
                            throw new InvalidGpaException("Enter valid CGPA");
                        }
                        map.put(roll, cgpa);
                        System.out.println("Student added succesfully");
                    }catch (InvalidGpaException R){
                        System.out.println("ERRO>>"+R.getMessage());
                        i--;
                    }
                } catch (DuplicateEnrollmentException e) {
                    System.out.println("Attention "+e.getMessage());
                    i--;
                }


            }
        }


    public void displayRankings() {
        if (map.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> e1, Map.Entry<Integer, Double> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        System.out.println("\nClass Rankings (Sorted by CGPA)");
        System.out.println("Rank\tRoll Number\tCGPA");
        System.out.println("---------------------------------");

        int rank = 1;
        for (Map.Entry<Integer, Double> entry : list) {
            System.out.println(rank + "\t\t" + entry.getKey() + "\t\t" + entry.getValue());
            rank++;
        }
        System.out.println("---------------------------------");
    }

    public void lookupByRank() {
        if (map.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Enter the rank you want to search (1 to " + list.size() + "): ");
        int targetRank = input.nextInt();

        try {
            if (targetRank < 1 || targetRank > list.size()) {
                throw new RankOutOfBoundsException("Invalid rank! Please enter a number between 1 and " + list.size());
            }
            Map.Entry<Integer, Double> student = list.get(targetRank - 1);

            System.out.println("\n--- Rank Search Result ---");
            System.out.println("Rank        : " + targetRank);
            System.out.println("Roll Number : " + student.getKey());
            System.out.println("CGPA        : " + student.getValue());

        } catch (RankOutOfBoundsException e) {
            System.out.println("Lookup Failed: " + e.getMessage());
        }
    }


        public void diplaymark(){
            for (Map.Entry<Integer,Double> entry: map.entrySet()){
                System.out.println("ROLL NO :"+entry.getKey()+ " -->cgpa :"+entry.getValue());
            }
        }
}
