package com.example.deepJava.encapsulation;

class TestExam {
    private float calification;
    private int numberOfQuestions;
    private boolean active;

    public float getCalification() {
        return calification;
    }

    public float getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public boolean isActive() {
        return active;
    }

    public void setCalification(float calification) {
        this.calification = calification;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

public class UniversityCalifications {
    public static void main(String[] args) {
        TestExam e = new TestExam();
        e.setCalification(10.0f);
    }
}
