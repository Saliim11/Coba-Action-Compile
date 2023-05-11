/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.week.pkg10_mkpl;

/**
 *
 * @author Qalbun Saliim Bakhri
 */
public class TugasWeek10_MKPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Counter counter = new Counter();
		
        System.out.println("Count:" + counter.getCount());

        counter.increment();

        System.out.println("Count:" + counter.getCount());

        counter.decrement();

        System.out.println("Count:" + counter.getCount());
    }
    
}
