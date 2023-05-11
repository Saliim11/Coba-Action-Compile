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
public class Counter {
    
    private int count;
	
    public Counter() {
        this.resets();
    }

    public void reset() {
        counts = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
    
}
