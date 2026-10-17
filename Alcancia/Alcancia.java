
public class Alcancia
{
    private int monedas50, monedas100, monedas200, monedas500, monedas1000, totalMonedas;
    
    public Alcancia(){
       this.monedas50 = 0;
       this.monedas100 = 0;
       this.monedas200 = 0;
       this.monedas500 = 0;
       this.monedas1000 = 0;
    }
    
    public void agregarMonedas(int moneda){
        switch(moneda){
            case 50:
                monedas50++;
                break;
            case 100:
                monedas100++;
                break;
            case 200:
                monedas200++;
                break;
            case 500:
                monedas500++;
                break;
            case 1000:
                monedas1000++;
                break;
        }
    }
    
    public int getSaldo(){
        return monedas50*50+monedas100*100+monedas200*200+monedas500*500+monedas1000*1000;
    }
    
    public int getTotalMonedas(){
        return monedas50+monedas100+monedas200+monedas500+monedas1000;
    }
    
    public int getMonedas(int moneda){
        switch(moneda){
            case 50:
                return monedas50;
            case 100:
                return monedas100;
            case 200:
                return monedas200;
            case 500:
                return monedas500;
            case 1000:
                return monedas1000;
        }
        return 0;
    }
    
    public void vaciar(){
        this.monedas50 = 0;
        this.monedas100 = 0;
        this.monedas200 = 0;
        this.monedas500 = 0;
        this.monedas1000 = 0;
    }
}