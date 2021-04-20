/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMinggu7;

/**
 *
 * @author zeecoz
 */
public class Pengguna {

    public static void main(String[] args) {
        Televisi tv = new Televisi("LG, 15 inches", 10);
        String[] semuaChannel = {"METRO TV","RCTI","TPI","TRANS TV",
                                 "TRANS 7", "SCTV", "INDOSIAR","ANTV",
                                 "TVRI"};
        String[] channelFavorit = {"TPI","TRANS 7","TRANS TV","SCTV",
                                   "RCTI", "ANTV"};
        
        System.out.println("Widha, membeli Televisi : "+ tv.getDesk());
        
        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(9);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
    
}
