package ru.alex.controlWeightbackend.controlWeightbackend.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by aleks on 19.01.2019.
 */
@Entity
public class Mark {
    private long idMark;
    private Timestamp dateMark;
    private double weight;
    private double waist;
    private Client clientByIdClient;

    @Id
    @Column(name = "id_mark", nullable = false)
    public long getIdMark() {
        return idMark;
    }

    public void setIdMark(long idMark) {
        this.idMark = idMark;
    }

    @Basic
    @Column(name = "date_mark", nullable = false)
    public Timestamp getDateMark() {
        return dateMark;
    }

    public void setDateMark(Timestamp dateMark) {
        this.dateMark = dateMark;
    }

    @Basic
    @Column(name = "weight", nullable = false, precision = 0)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "waist", nullable = false, precision = 0)
    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mark mark = (Mark) o;

        if (idMark != mark.idMark) return false;
        if (Double.compare(mark.weight, weight) != 0) return false;
        if (Double.compare(mark.waist, waist) != 0) return false;
        if (dateMark != null ? !dateMark.equals(mark.dateMark) : mark.dateMark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (idMark ^ (idMark >>> 32));
        result = 31 * result + (dateMark != null ? dateMark.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(waist);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    public Client getClientByIdClient() {
        return clientByIdClient;
    }

    public void setClientByIdClient(Client clientByIdClient) {
        this.clientByIdClient = clientByIdClient;
    }
}
