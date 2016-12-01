package com.example.student.cardsofwisdom;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
                "I don't know, ask your friend.",
                "How about no?",
                "Go for it!!!"
        };
    }
    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        return answers[2];
    }
}
