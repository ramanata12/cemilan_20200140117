/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cemilan_20200140117.cemilan_20200140117;

/**
 *
 * @author MSi-GAMING
 */
public class hitung {
    public int getTotal(int hargasayur,int jumlah){
        int hasil = hargasayur * jumlah;
        int total; 
        
        if(hasil < 16000){
            total = hasil - (hasil * 0);
        }
        else if ((hasil > 16000) && (hasil < 25000)){
            total = hasil - (hasil * 10/100);
        }
        else{
            total = hasil - (hasil * 15/100);
        }
        return total;
    }
}

