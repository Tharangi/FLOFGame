
package FLOG_GUI;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DINUKA
 */
public class ThreadTimer implements Runnable
{
    PanelGamePlay panelGamePlay;
    PanelRoundReadyUp panelRoundReadyUp;
    ControllerRoundReadyUp controllerRoundReadyUp;
    ControllerGamePlay controllerGamePlay;
    
    boolean isRoundReadyUp=false;
    boolean isGamePlay=false;
    
    int seconds=0;

    public ThreadTimer(PanelGamePlay panelGamePlay, ControllerGamePlay controllerGamePlay, int seconds) {
        this.panelGamePlay = panelGamePlay;
        this.controllerGamePlay = controllerGamePlay;
        this.seconds =seconds;
        isGamePlay=true;
        isRoundReadyUp=false;
    }

    public ThreadTimer(PanelRoundReadyUp panelRoundReadyUp,ControllerRoundReadyUp controllerRoundReadyUp, int seconds) {
        this.panelRoundReadyUp =panelRoundReadyUp;
        this.controllerRoundReadyUp=controllerRoundReadyUp;
        this.seconds = seconds;
         isGamePlay=false;
        isRoundReadyUp=true;
    }
    

    @Override
    public void run() 
    {
        if(isGamePlay)
        {
            startCountDown(seconds);
        }  
        if(isRoundReadyUp)
        {
            startReadyUpCountDown(seconds);
        }
      return;
    }
    
    private void startCountDown(int sec)
    {
        for(int i=sec;i>=0;i--)
        {
            if(ControllerGamePlay.stopTimer)
            {
                ControllerGamePlay.stopTimer=false;
                return;
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
            if(i<10)
            {
                panelGamePlay.setTimer("0"+i);
            }
            else
            {
                panelGamePlay.setTimer(""+i);
            }
        }
    
        controllerGamePlay.startNextRound();
    }
     private void startReadyUpCountDown(int sec)
    {
        System.out.println("read up timer thread started");
        for(int i=sec;i>=0;i--)
        {
                        
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
            if(i<10)
            {
                panelRoundReadyUp.setTimer("0"+i);
                System.out.println(""+i);
            }
            else
            {
                panelRoundReadyUp.setTimer(""+i);
            }
        }
        controllerRoundReadyUp.startRound();
    }
    
}
