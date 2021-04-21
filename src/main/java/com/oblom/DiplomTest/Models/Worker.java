package com.oblom.DiplomTest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Worker {
    @Id
    @GeneratedValue
    private long worker_id;
    private String l_name;
    private String f_name;
    private long phone;

    public long getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(long worker_id) {
        this.worker_id = worker_id;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "worker_id=" + worker_id +
                ", l_name='" + l_name + '\'' +
                ", f_name='" + f_name + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Worker(String l_name, String f_name, long phone) {
        this.l_name = l_name;
        this.f_name = f_name;
        this.phone = phone;
    }

    public Worker() {
    }
}
