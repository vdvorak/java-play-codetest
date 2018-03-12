package com.spring.webflux.code.test.springwebfluxtest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.DateTime;

/**
 * Created by vdvorak on 11.03.18.
 */

public class Customer {
    private Integer id;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private DateTime duetime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private DateTime jointime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getDuetime() {
        return duetime;
    }

    public void setDuetime(DateTime duetime) {
        this.duetime = duetime;
    }

    public DateTime getJointime() {
        return jointime;
    }

    public void setJointime(DateTime jointime) {
        this.jointime = jointime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (!duetime.equals(customer.duetime)) return false;
        if (!id.equals(customer.id)) return false;
        if (!jointime.equals(customer.jointime)) return false;
        if (!name.equals(customer.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duetime=" + duetime +
                ", jointime=" + jointime +
                '}';
    }
}
