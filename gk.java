package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class gk {
    private ArrayList<Question> questionSet;
    public gk(){
        questionSet = new ArrayList<Question>();
        System.out.println("Quiz on GENERAL KNOWLEDGE");
        String q = "WHERE IS THE CAPITAL OF INDIA?";
        String[] a =  new String[]{"Mumbai","Delhi", "Hyderabad", "Ahmedabad"};
        questionSet.add(new Question(q, a, "Delhi"));
        q = "WHO INVENTED THE TELEPHONE?";
        a = new String[]{"Thomas Edison", "Micheal Faraday","Marie Curie","Alexander Bell"};
        questionSet.add(new Question(q, a, "Alexander Bell"));
        q = "WHAT IS THE NATIONAL ANIMAL OF INDIA?";
        a = new String[]{"tiger","lion","elephant","leopard"};
        questionSet.add(new Question(q, a, "tiger"));


        Collections.shuffle(questionSet, new Random());
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        for (int question = 0; question < questionSet.size(); question++) {
            System.out.println(questionSet.get(question).getQuestion());
            int numChoices = questionSet.get(question).getChoices().size();
            for(int choice = 0; choice< numChoices;choice++)
            {
                System.out.println((choice + 1) + ":" + questionSet.get(question).getChoices().get(choice));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet = questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if(playerAnswer == correctAnswerIndex + 1)
            {
                numCorrect++;
            }
        }
        scan.close();
        System.out.println("CONGRATULATIONS!! You got "+ numCorrect +  " correct answer(s");
    }
}

