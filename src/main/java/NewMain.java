/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mzimasi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
    DoubleBookingAppointmentHolder p1 =new DoubleBookingAppointmentHolder("Jacob");
    DoubleBookingAppointmentHolder p2 =new DoubleBookingAppointmentHolder("Cyril");
    DoubleBookingAppointmentHolder p3 =new DoubleBookingAppointmentHolder("Thabo");
    String md = "Hashcode(s) of persons with an appointment with double booker now : ";
    System.out.println(md+p1.hashCode()+", "+p2.hashCode()+ ", "+p3.hashCode());
 
    SingletonAppointmentHolder p4=SingletonAppointmentHolder.getInstance("Zukisa");
    SingletonAppointmentHolder p5=SingletonAppointmentHolder.getInstance("Musa");
    SingletonAppointmentHolder p6=SingletonAppointmentHolder.getInstance("Lundi");
    String ms = "Hashcode(s) of persons with an appointment with singleton now : ";
    System.out.println(ms+p4.hashCode()+", "+p5.hashCode()+ ", "+p6.hashCode());
 }

    }
