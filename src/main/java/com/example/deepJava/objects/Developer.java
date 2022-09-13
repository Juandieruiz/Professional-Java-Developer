package com.example.deepJava.objects;

public class Developer {
    private String name;
    private String codeLanguage;

    public Developer(String name, String codeLanguage) {
        this.name = name;
        this.codeLanguage = codeLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeLanguage() {
        return codeLanguage;
    }

    public void setCodeLanguage(String codeLanguage) {
        this.codeLanguage = codeLanguage;
    }
}
