package reloj;

public class VisorNumeros {
     private int valor, limite;
     
     public VisorNumeros(int vv, int ll) {
        if (vv>=0 && vv<ll) {
            limite=ll;
            valor=vv;
        }
     }
     
     public boolean incrementa() {
           valor++;
           if (valor!=limite) return true;
           valor=0;
           return false;
     }  
     
     public String toString() {
        String s="";
        if (valor<10) s+="0";
        s=s+valor;
        return s;   
     }
           
     public boolean equals(VisorNumeros v) {
    	 if (v==null) return false;
    	 return v.valor==valor;
     }
}
