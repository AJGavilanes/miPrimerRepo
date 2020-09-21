package reloj;

public class Reloj {
    private VisorNumeros horas, minutos, segundos;
    
    public Reloj(int h, int m, int s) {         
    	horas=new VisorNumeros(h, 12);
        minutos=new VisorNumeros(m, 60);       
        segundos=new VisorNumeros(s, 60);
    }
    
    public boolean incrementa() {        
        if (!segundos.incrementa()) {
        	if (!minutos.incrementa()) horas.incrementa();
        	return true;
        }
        return true; 
    }
    
    public String toString() {
        String resp="";
    	resp+=horas.toString();
        resp+=":";
        resp+=minutos.toString();
        resp+=":";
        resp+=segundos.toString();
        return resp;
    }
    
    public boolean equals(Reloj r) {
    	if (r==null) return false;
    	return horas.equals(r.horas) && minutos.equals(r.minutos) && segundos.equals(r.segundos); 
    }
}
