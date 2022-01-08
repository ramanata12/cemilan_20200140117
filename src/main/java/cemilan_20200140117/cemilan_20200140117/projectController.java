/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cemilan_20200140117.cemilan_20200140117;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author MSi-GAMING
 */
@Controller
public class projectController {

    hitung hitung = new hitung();
    
   @RequestMapping("/input") 
    public String getInput(HttpServletRequest data, Model sayur){
        
        String Nama = data.getParameter("namasayur");
        int Harga = Integer.parseInt(data.getParameter("harga"));
        int Jumlah = Integer.parseInt(data.getParameter("jumlahsayur"));
        int Bayar = Integer.parseInt(data.getParameter("bayar"));
        int total = hitung.getTotal(Harga, Jumlah);
        int diskon = hitung.getDiskon(Harga, Jumlah);
        
        sayur.addAttribute("nama", Nama);
        sayur.addAttribute("harga", ("Rp "+ Harga));
        sayur.addAttribute("jumlah", Jumlah);
        sayur.addAttribute("total", ("Rp "+(Harga*Jumlah)));
        sayur.addAttribute("diskon", diskon + " %");
        sayur.addAttribute("bayar", "Rp "+Bayar);
        sayur.addAttribute("kembalian", "Rp "+(Bayar-total));
        sayur.addAttribute("totdiskon", "Rp "+total);
      
        return "struk";
    }
}

