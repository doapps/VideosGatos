package me.doapps.videos.de.gatos.datasource;

import android.content.Context;

import java.util.ArrayList;

import me.doapps.videos.de.gatos.adapters.Adapter_Channel;
import me.doapps.videos.de.gatos.beans.Channel_DTO;

/**
 * Created by Gantz on 3/12/14.
 */
public class Channel_Datasource {

    public Adapter_Channel getAdapterChannel(Context context){
        Adapter_Channel adapter_channel = new Adapter_Channel(context,getChannels());
        return adapter_channel;
    }

    private ArrayList<Channel_DTO> getChannels(){

        Channel_DTO Animaleschistosos1 = new Channel_DTO("Animaleschistosos1","#FFFFFF ",android.R.color.white,android.R.drawable.ic_menu_directions,"","Gatos Graciosos");
        Channel_DTO perrosgatoschistosos = new Channel_DTO("perrosgatoschistosos","#FFFFFF ",android.R.color.white,android.R.drawable.ic_menu_directions,"","Gatos Chistosos");
        Channel_DTO wendew = new Channel_DTO("wendew","#FFFFFF ",android.R.color.white,android.R.drawable.ic_menu_directions,"","Gatos Ninja");
        Channel_DTO UC1w0SU90SoZu1Tow7g4xkGw = new Channel_DTO("UC1w0SU90SoZu1Tow7g4xkGw","#FFFFFF ",android.R.color.white,android.R.drawable.ic_menu_directions,"","Gatos Bailando");
        Channel_DTO UCCOywen6zdgYOQ1tYoMUcXA = new Channel_DTO("UCCOywen6zdgYOQ1tYoMUcXA","#FFFFFF ",android.R.color.white,android.R.drawable.ic_menu_directions,"","Gatos y Gatitos");
        Channel_DTO UCjEtUGmdYNAHuRQ0of9MpNQ = new Channel_DTO("UCjEtUGmdYNAHuRQ0of9MpNQ","#FFFFFF ",android.R.color.white,android.R.drawable.ic_menu_directions,"","Gatos Hablando");

        ArrayList<Channel_DTO> channel_dtos = new ArrayList<Channel_DTO>();
        channel_dtos.add(Animaleschistosos1);
        channel_dtos.add(perrosgatoschistosos);
        channel_dtos.add(wendew);
        channel_dtos.add(UC1w0SU90SoZu1Tow7g4xkGw);
        channel_dtos.add(UCCOywen6zdgYOQ1tYoMUcXA);
        channel_dtos.add(UCjEtUGmdYNAHuRQ0of9MpNQ);

        return channel_dtos;
    }
}
