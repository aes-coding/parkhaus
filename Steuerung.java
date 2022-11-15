import java.util.*;
public class Steuerung
{
    private int kapazitaet;
    private int anzahlPKW;
    private int anzahlTickets;
    private ArrayList<Ampel> AmpelList = new ArrayList();
    private ArrayList<Ticket> TicketList = new ArrayList();
    private ArrayList<Einfahrt> EinfahrtList = new ArrayList();
    private ArrayList<Ausfahrt> AusfahrtList = new ArrayList();
    private ArrayList<Kassenautomat> KassenautomatList = new ArrayList();
    public Steuerung()
    {
        kapazitaet = 250;
        anzahlPKW = 2;
        anzahlTickets = TicketList.size();
    }
    
    public void setKapazitaet(int kapazitaet){
    
        this.kapazitaet = kapazitaet;
    
    }
    
    public int getKapazitaet(){
    
        return kapazitaet;
        
    }
    
    public void schalteAmpeln(){
    
        Ampel ampel = null;
        AmpelList.add(ampel);
        AmpelList.add(ampel);
    
    }
    
    public void setzeAlleAmpelnRot(){
    
        for(int i = 0; AmpelList.size() > i; i++){
            Ampel ampel = null;
            ampel.setRot(true);
            ampel.setGruen(false);
        
            if (AmpelList.get(i).getRot()){
                
            }else{
                AmpelList.set(i, ampel);
            }
        
        }
        
    }
    
    public void setzeAlleAmpelnGruen(){
        
        
    
    }
    
    public void erstelleTicket(){
        Ticket ticket = null;
        TicketList.add(ticket);
        TicketList.add(ticket);
        
    }
}
