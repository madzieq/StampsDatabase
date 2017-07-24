/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stamps;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Magda
 */

public class Stamp {
    
    private int catalogNr;    
    private File photoFile;
    private byte[] image;
    private String name;           
    private String unit;
    private Date releaseDate;
    private long production;
    private boolean inCollection;
    private boolean isStamped;
 
    
    public Stamp(int catalogNr, byte[] image, String name, String unit, Date releaseDate, long production, boolean inCollection, boolean isStamped) {
        this.catalogNr = catalogNr;
        this.image = image;
        this.name = name;
        this.unit = unit;
        this.releaseDate = releaseDate;
        this.production = production;
        this.inCollection = inCollection;
        this.isStamped = isStamped;
    }
    
    public Stamp(int catalogNr, String name, String unit, Date releaseDate, long production, boolean inCollection, boolean isStamped) {
        this.catalogNr = catalogNr;
        this.name = name;
        this.unit = unit;
        this.releaseDate = releaseDate;
        this.production = production;
        this.inCollection = inCollection;
        this.isStamped = isStamped;
    }
    
    public Stamp() {
        this.catalogNr = 0;
        this.image = null;
        this.name = "";
        this.unit = "";
        this.releaseDate = null;
        this.production = 0;
        this.inCollection = false;
        this.isStamped = false;
    }
    
   
    public void setCatalogNr(int nr) {
       this.catalogNr = nr;
    }
    
    public int getCatalogNr() {
        return catalogNr;
    }
    
    public void setImage(byte[] im){
        this.image = im;
    }
    
    public byte[] getImage() {
        return image;
    }
    
    public void setPhotoFile(File image) {
        this.photoFile = image;
    }
    
    public File getPhotoFile() {
        return photoFile;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
 
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public String getUnit() {
        return unit;
    }
    
    public void setReleaseDate(int day, int month, int year) {
        GregorianCalendar relDate = new GregorianCalendar(year, month - 1, day);
        this.releaseDate = relDate.getTime();
    }
    
    public Date getReleaseDate() {
        return releaseDate;
    }
    
    public void setProduction(long production) {
        this.production = production;
    }
    
    public long getProduction() {
        return production;
    }
    
    public void setInCollection(boolean inCollection) {
        this.inCollection = inCollection;
    }  
    
    public boolean getInCollection() {
        return inCollection;
    }
  
    public void setStamped(boolean isStamped) {
        this.isStamped = isStamped;
    }
    
    public boolean getStamped() {
        return isStamped;
    }
}
