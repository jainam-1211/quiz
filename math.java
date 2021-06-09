package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class math {
    private ArrayList<Question> questionSet;
    public math(){
        questionSet = new ArrayList<Question>();
        System.out.println("Quiz on MATH");
        String q = "WHAT IS THE SQUARE ROOT OF 16?";
        String[] a = {"16", "4", " 8"," 256"};
        questionSet.add(new Question(q, a, "4"));
        q = "What is the square of 64";
        a = new String[]{"4000", "4090", "4096", "4046"};
        questionSet.add(new Question(q, a, "4096"));
        q = "WHAT S 999 DIVIDED BY 3";
        a = new String[]{"111", "999","333", "125"};
        questionSet.add(new Question(q, a, "333"));


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
           //  System.out.println("The correct answer is " + questionSet.get(question).getAnswer() + " and your selected option is " +playerAnswer);
        }
        scan.close();
        System.out.println("CONGRATULATIONS!! You got "+ numCorrect + " correct answer(s");
    }
}
