
package FLOG_GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author DINUKA
 */
public class ControllerMainMenu 
{
    int mouseX=0;
    int mouseY=0;
    PanelMainMenu panelMainMenu;
    ControllerRoundReadyUp controllerRoundReadyUp;
    GameScreen gameScreen;

    public ControllerMainMenu(PanelMainMenu panelMainMenu, GameScreen gameScreen,ControllerRoundReadyUp controllerRoundReadyUp) {
        this.panelMainMenu = panelMainMenu;
        this.gameScreen = gameScreen;
        this.controllerRoundReadyUp= controllerRoundReadyUp;
        initializeMainMenuListeners();
    }
    
    private void startClick()
    {
        gameScreen.changeScreen(DataForUI.STR_ROUNDREADYUP, DataForUI.STR_MAINMENU);
        DataForUI.RoundNum=1;
       // controllerRoundReadyUp.runTimer();
      //gameScreen.changeScreen(DataForUI.STR_GAMEPLAY, null);
      //controllerGamePlay.runTimer();  
      
    }
    
    private void multiplayerClick(){
            gameScreen.changeScreen(DataForUI.SelectMultiplayer, DataForUI.STR_MAINMENU);

    }
    private void settingsClick()
    {
        gameScreen.changeScreen(DataForUI.STR_SETTINGS, DataForUI.STR_MAINMENU);
    }
    
    private void helpClick()
    {
    
    }
    
    private void aboutClick()
    {
    
    }
    private void exitClick()
    {
        System.exit(0);
    
    }
    
    
    /**
     *  The Following code is used to initialize event listeners 
     *  and also adding custom 
     * 
     */
    
    private void initializeMainMenuListeners() 
    {
       final int _start = 0;
       final int _setting = 2;
       final int _help = 3;
       final int _about = 4;
       final int _exit = 1;
       final int _TopBorder=5; 
       
       panelMainMenu.btnMultiPlayer.addActionListener((java.awt.event.ActionEvent evt) -> {
           multiplayerClick();
       });
       
        panelMainMenu.getCompCon(_TopBorder).addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
          
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
             
            }
        });
        panelMainMenu.getCompCon(_TopBorder).addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                gameScreen.moveScreen(e.getXOnScreen(), e.getYOnScreen(),mouseX,mouseY);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               
            }
        });
        
        panelMainMenu.getComponent(_start).addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_startgame_h.png"));
                panelMainMenu.setIcon_Start(imgIcon);
                startClick();
              
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_startgame_c.png"));
                panelMainMenu.setIcon_Start(imgIcon);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_startgame_h.png"));
                panelMainMenu.setIcon_Start(imgIcon);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_startgame_h.png"));
                panelMainMenu.setIcon_Start(imgIcon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_startgame_n.png"));
                panelMainMenu.setIcon_Start(imgIcon);
            }
        });
        
        panelMainMenu.getComponent(_setting).addMouseListener(new MouseListener() {

           @Override
           public void mouseClicked(MouseEvent e) {
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_settings_h.png"));
                panelMainMenu.setIcon_Settings(imgIcon);
               settingsClick();
           }

           @Override
           public void mousePressed(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_settings_c.png"));
                panelMainMenu.setIcon_Settings(imgIcon);
           }

           @Override
           public void mouseReleased(MouseEvent e) {
              ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_settings_h.png"));
                panelMainMenu.setIcon_Settings(imgIcon);
           }

           @Override
           public void mouseEntered(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_settings_h.png"));
                panelMainMenu.setIcon_Settings(imgIcon);
           }

           @Override
           public void mouseExited(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_settings_n.png"));
                panelMainMenu.setIcon_Settings(imgIcon);
           }
       });
        
        panelMainMenu.getComponent(_help).addMouseListener(new MouseListener() {

           @Override
           public void mouseClicked(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_help_h.png"));
                panelMainMenu.setIcon_Help(imgIcon);
               helpClick();
           }

           @Override
           public void mousePressed(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_help_c.png"));
                panelMainMenu.setIcon_Help(imgIcon);
           }

           @Override
           public void mouseReleased(MouseEvent e) {
              ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_help_h.png"));
                panelMainMenu.setIcon_Help(imgIcon);
           }

           @Override
           public void mouseEntered(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_help_h.png"));
                panelMainMenu.setIcon_Help(imgIcon);
           }

           @Override
           public void mouseExited(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_help_n.png"));
                panelMainMenu.setIcon_Help(imgIcon);
           }
       });
        
        panelMainMenu.getComponent(_about).addMouseListener(new MouseListener() {

           @Override
           public void mouseClicked(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_credits_h.png"));
                panelMainMenu.setIcon_Credits(imgIcon);
               aboutClick();
           }

           @Override
           public void mousePressed(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_credits_c.png"));
                panelMainMenu.setIcon_Credits(imgIcon);
           }

           @Override
           public void mouseReleased(MouseEvent e) {
              ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_credits_h.png"));
                panelMainMenu.setIcon_Credits(imgIcon);
           }

           @Override
           public void mouseEntered(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_credits_h.png"));
                panelMainMenu.setIcon_Credits(imgIcon);
           }

           @Override
           public void mouseExited(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_credits_n.png"));
                panelMainMenu.setIcon_Credits(imgIcon);
           }
       });
        
        panelMainMenu.getComponent(_exit).addMouseListener(new MouseListener() {

           @Override
           public void mouseClicked(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_quit_c.png"));
                panelMainMenu.setIcon_Quit(imgIcon);
               exitClick();
               
           }

           @Override
           public void mousePressed(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_quit_c.png"));
                panelMainMenu.setIcon_Quit(imgIcon);
           }

           @Override
           public void mouseReleased(MouseEvent e) {
              ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_quit_n.png"));
                panelMainMenu.setIcon_Quit(imgIcon);
           }

           @Override
           public void mouseEntered(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_quit_h.png"));
                panelMainMenu.setIcon_Quit(imgIcon);
           }

           @Override
           public void mouseExited(MouseEvent e) {
               ImageIcon imgIcon = new ImageIcon(getClass().getResource("/images/btn_quit_n.png"));
                panelMainMenu.setIcon_Quit(imgIcon);
           }
       });
        
    }
    
}
