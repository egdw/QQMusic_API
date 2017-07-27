package com.model;

/**
 * Auto-generated: 2017-07-22 23:53:2
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Pay {

    private int payDown;
    private int payMonth;
    private int payPlay;
    private int payStatus;
    private int priceAlbum;
    private int priceTrack;
    private int timeFree;
    public void setPayDown(int payDown) {
         this.payDown = payDown;
     }
     public int getPayDown() {
         return payDown;
     }

    public void setPayMonth(int payMonth) {
         this.payMonth = payMonth;
     }
     public int getPayMonth() {
         return payMonth;
     }

    public void setPayPlay(int payPlay) {
         this.payPlay = payPlay;
     }
     public int getPayPlay() {
         return payPlay;
     }

    public void setPayStatus(int payStatus) {
         this.payStatus = payStatus;
     }
     public int getPayStatus() {
         return payStatus;
     }

    public void setPriceAlbum(int priceAlbum) {
         this.priceAlbum = priceAlbum;
     }
     public int getPriceAlbum() {
         return priceAlbum;
     }

    public void setPriceTrack(int priceTrack) {
         this.priceTrack = priceTrack;
     }
     public int getPriceTrack() {
         return priceTrack;
     }

    public void setTimeFree(int timeFree) {
         this.timeFree = timeFree;
     }
     public int getTimeFree() {
         return timeFree;
     }
	@Override
	public String toString() {
		return "Pay [payDown=" + payDown + ", payMonth=" + payMonth + ", payPlay=" + payPlay + ", payStatus="
				+ payStatus + ", priceAlbum=" + priceAlbum + ", priceTrack=" + priceTrack + ", timeFree=" + timeFree
				+ "]";
	}

     
}