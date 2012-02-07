/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wintrisstech;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author workshopjan23
 */
public class NewtLunarColony 
{
    private Random r = new Random();
    
    private Image Moon;
    private int Height = 344/2;
    private int Y = 0-Height;
    private int Width = 350/2;
    private int X = r. nextInt(1052-Width);
    

    private Image Newt;
    
    private int NH = 100;
    private int NY = 40-Height-NH;
    private int NW = 461/8;
    private int NX = X-NW+100;
    
    public NewtLunarColony() throws IOException
    {
        Newt = ImageIO.read(getClass().getResource("zombie.png"));
        Moon = ImageIO.read(getClass().getResource("the_moon_dan_gerhards_01.png"));
    }
   
    public void paint(Graphics g)
    {
        g.drawImage(Moon, X, Y, Width, Height, null);
        g.drawImage(Newt, NX, NY, NW, NH, null);
        
    }
    
    public void update()
    {
        if(Y<610-Height+50 && NY<610-NH+50)
        {
            Y+=10;
            NY+=10;
        }
        else if(Y>610-Height+50 && NY<610-NH+50)
        {
            Y=0;
            NY=40;
            Y+=10;
            NY+=10;
        }
    }
    
}
