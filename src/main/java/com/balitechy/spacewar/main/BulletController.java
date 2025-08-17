package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

import com.balitechy.spacewar.main.interfaces.Bullet;


public class BulletController {
    
    private LinkedList<Bullet> bl = new LinkedList<Bullet>();
    
    
    public void tick(){
        for(int i=0; i < bl.size(); i++){
            // Obtiene la bala como una instancia de la interfaz Bullet.
            Bullet tempBullet = bl.get(i);
            if(tempBullet.getY() < 0){
                removeBullet(tempBullet);
            }else{
                tempBullet.tick();
            }
        }
    }
    
   
    public void render(Graphics g){
        for(int i=0; i < bl.size(); i++){
            bl.get(i).render(g);
        }
    }
    
   
    public void addBullet(Bullet bullet){
        bl.add(bullet);
    }
    
    
    public void removeBullet(Bullet bullet){
        bl.remove(bullet);
    }
}