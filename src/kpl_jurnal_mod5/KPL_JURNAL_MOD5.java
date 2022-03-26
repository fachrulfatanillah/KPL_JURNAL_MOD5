/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpl_jurnal_mod5;

/**
 *
 * @author fachrur fatanillah
 */
public class KPL_JURNAL_MOD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SayaTubeVideo video1 = new SayaTubeVideo("Review The Fast and the Furious (2001) oleh fachrur fatanillah");
        SayaTubeVideo video2 = new SayaTubeVideo("Review 2 Fast 2 Furious (2003)  oleh fachrur fatanillah");
        SayaTubeVideo video3 = new SayaTubeVideo("Review Turbo-Charged Prelude (2003) oleh fachrur fatanillah");
        SayaTubeVideo video4 = new SayaTubeVideo("Review The Fast and the Furious: Tokyo Drive (2006) oleh fachrur fatanillah");
        SayaTubeVideo video5 = new SayaTubeVideo("Review Fast & Furious (2009) oleh fachrur fatanillah");
        SayaTubeVideo video6 = new SayaTubeVideo("Review Fast Five (2011) oleh fachrur fatanillah");
        SayaTubeVideo video7 = new SayaTubeVideo("Review Fast & Furious 6 (2013) oleh fachrur fatanillah");
        SayaTubeVideo video8 = new SayaTubeVideo("Review Furious 7 (2015) oleh fachrur fatanillah");
        SayaTubeVideo video9 = new SayaTubeVideo("Review Fast & Furious 8 (2017) oleh fachrur fatanillah");
        SayaTubeVideo video10 = new SayaTubeVideo("Review Fast & Furious 9 (2021) oleh fachrur fatanillah");
        video1.increasePlayCount(25000000);
        video2.increasePlayCount(25000000);
        video3.increasePlayCount(25000000);
        video4.increasePlayCount(25000000);
        video5.increasePlayCount(25000000);
        video6.increasePlayCount(25000000);
        video7.increasePlayCount(25000000);
        video8.increasePlayCount(25000000);
        video9.increasePlayCount(25000000);
        video10.increasePlayCount(25000000);


        SayaTubeUser username = new SayaTubeUser("fachrur fatanillah");
        username.addVideo(video1);
        username.addVideo(video2);
        username.addVideo(video3);
        username.addVideo(video4);
        username.addVideo(video5);
        username.addVideo(video6);
        username.addVideo(video7);
        username.addVideo(video8);
        username.addVideo(video9);
        username.addVideo(video10);

        username.printAllVideoPlaycount();
        System.out.println("Total playcount : "+username.getTotalVideoPlayCount());
    }
    
}
