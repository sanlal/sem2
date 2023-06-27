package b_tech_assignment1;

import java.util.*;

public class ques20 {
    private static int numTeams;
    private static int numRounds;
    private static ArrayList<Team> teams;
    private static ArrayList<Question> questions;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Get number of teams and rounds from user
        System.out.print("Enter number of teams: ");
        numTeams = scanner.nextInt();
        System.out.print("Enter number of rounds: ");
        numRounds = scanner.nextInt();
        
        // Initialize teams and questions
        teams = new ArrayList<>();
        questions = new ArrayList<>();
        for (int i = 1; i <= numTeams; i++) {
            teams.add(new Team("Team " + i));
        }
        for (int i = 1; i <= numRounds; i++) {
            questions.add(new Question("Round " + i));
        }
        
        // Start quiz
        for (int roundNum = 0; roundNum < numRounds; roundNum++) {
            Question question = questions.get(roundNum);
            System.out.println("=== " + question.getName() + " ===");
            
            // Ask each team the question and record their answer
            for (Team team : teams) {
                System.out.println(team.getName() + ", it's your turn to answer the question.");
                String answer = scanner.nextLine().trim();
                team.recordAnswer(roundNum, answer);
            }
        }
        
        // Calculate scores and eliminate teams with lowest scores
        while (teams.size() > 1) {
            // Calculate average score for each team
            for (Team team : teams) {
                team.calculateAverageScore();
            }
            
            // Sort teams by average score (lowest to highest)
            Collections.sort(teams);
            
            // Eliminate team(s) with lowest average score
            while (teams.size() > 1 && teams.get(0).getAverageScore() == teams.get(1).getAverageScore()) {
                teams.remove(0);
            }
            if (teams.size() > 1) {
                System.out.println("The following team has been eliminated: " + teams.get(0).getName());
                teams.remove(0);
            }
        }
        
        // Declare winner
        System.out.println("The winner is: " + teams.get(0).getName());
    }
}

class Team implements Comparable<Team> {
    private String name;
    private ArrayList<String> answers;
    private double averageScore;
    
    public Team(String name) {
        this.name = name;
        this.answers = new ArrayList<>();
        this.averageScore = 0.0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void recordAnswer(int roundNum, String answer) {
        answers.add(roundNum, answer);
    }
    
    public void calculateAverageScore() {
        double totalScore = 0.0;
        for (String answer : answers) {
            totalScore += getScore(answer);
        }
        averageScore = totalScore / answers.size();
    }
    
    public double getAverageScore() {
        return this.averageScore;
    }
    
    private double getScore(String answer) {
        // Here, you could implement a scoring system based on how close the answer is to the correct answer.
        // For simplicity, we'll assume all answers are either correct or incorrect, and worth 1 or 0 points.
        if (answer.equals("correct")) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
    
    @Override
    public int compareTo(Team other) {
        // Sort teams by average score (lowest to highest)
        if (this.averageScore < other.averageScore) {
            return -1;
        } else if (this.averageScore > other.averageScore) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Question {
    private String name;
    public Question(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
