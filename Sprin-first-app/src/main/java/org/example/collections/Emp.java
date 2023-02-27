package org.example.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> addreses;
    private Map<String,String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddreses() {
        return addreses;
    }

    public void setAddreses(Set<String> addreses) {
        this.addreses = addreses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp() {
        super();
    }

    public Emp(String name, List<String> phones, Set<String> addreses, Map<String, String> courses) {
        super();
        this.name = name;
        this.phones = phones;
        this.addreses = addreses;
        this.courses = courses;
    }
}
