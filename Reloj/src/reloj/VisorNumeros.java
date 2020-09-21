package reloj;

public class VisorNumeros {
     private int valor, limite;
     
     public VisorNumeros(int v, int l) {
        if (v>=0 && v<l) {
            limite=l;
            valor=v;
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
