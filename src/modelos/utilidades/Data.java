/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.utilidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author marcos
 */
public class Data {

    Calendar calendar = null;
    Date date = null;

    public Data() {
        calendar = Calendar.getInstance();
        date = new Date();
        calendar.setTime(date);

    }

    public  String somarData(int dias) {
        this.calendar.setTime(new Date());
        calendar.add(calendar.DATE, dias);
        return getData(calendar.getTime());
    }

    public String getData() {
        SimpleDateFormat df;
        df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(date);
    }
     private String getData(Date date) {
        SimpleDateFormat df;
        df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(date);
    }
}
