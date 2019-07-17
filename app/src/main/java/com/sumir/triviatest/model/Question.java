package com.sumir.triviatest.model;

public class Question {
    private String answers;
    private boolean ansTrue;

    public Question() {

    }

    public Question(String answers, boolean ansTrue) {
        this.answers = answers;
        this.ansTrue = ansTrue;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public boolean isAnsTrue() {
        return ansTrue;
    }

    public void setAnsTrue(boolean ansTrue) {
        this.ansTrue = ansTrue;
    }

    @Override
    public String toString() {
        return "Question{" +
                "answers='" + answers + '\'' +
                ", ansTrue=" + ansTrue +
                '}';
    }
}

