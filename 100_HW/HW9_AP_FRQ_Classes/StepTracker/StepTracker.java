import java.util.*;


public class stepTracker{
    int dsteps;
    int entries;
    int ad;
    int tSteps;
    
    public stepTracker(){
        entries = 0;
        tSteps = 0;
        ad = 0;
    }
    
    public stepTracker(int q){
            entries = 0;
            tSteps = 0;
            ad = 0;
    }
    
    public void addDailySteps(int q){
        dsteps = dsteps + q;
        tsteps = tsteps + q;
        if(dsteps > 9999){
                ad++;
        }
        entries++;
    }
    
    public int activeDays(){
        return ad;
    }
    
    public double averageSteps(){
        int double average;
        average = tsteps/entries;
        return average;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} 