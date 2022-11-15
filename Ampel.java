
public class Ampel
{
    private boolean rot;
    private boolean gruen;
    public Ampel()
    {
      this.rot = false;
      this.gruen = true;
    }
    public void setRot(boolean rot){
        this.rot = rot;
    }
    public boolean getRot(){
        return rot;
    }
    public void setGruen(boolean gruen){
        this.gruen = gruen;
    }
    public boolean getGruen(){
        return gruen;
    }
}
