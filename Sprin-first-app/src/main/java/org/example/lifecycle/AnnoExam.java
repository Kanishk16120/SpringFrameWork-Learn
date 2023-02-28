package org.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnoExam {
    private String subject;

    public AnnoExam() {
        super();
    }

    @Override
    public String toString() {
        return "AnnoExam{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @PostConstruct
    public void start()
    {
        System.out.println("starting method");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("Ending method");
    }
}
