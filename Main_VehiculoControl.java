
import java.io.*;
public class Main_VehiculoControl
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader ( System.in));
       
        VehiculoControl lista[] = new VehiculoControl[5];
        int opcion=0;
       
        lista [0]=new VehiculoControl("audi","vr5000",1997,500,3000000,15000000,639);
        lista [1]=new VehiculoControl("fod","fr545",2015,200,3000000,10000000,640);
        lista [2]=new VehiculoControl("renault","er43",2011,201,5000000,16000000,641);
        lista [3]=new VehiculoControl("citroen","op400",2010,0,20000,500000,621);
        lista [4]=new VehiculoControl("Toyota","rt343",2015,0,3000000,1000000,639);
        
        System.out.println("1.listado completo -2.-Imprime autos del año 2015");
        System.out.println ("3-imprime autos sin Stock 4-imprime autos mayores a 6.000.000");
        System.out.print("ingrese opcion :");
        opcion = Integer.parseInt(br.readLine ());
       
        if(opcion==1)
        {
            for(int i=0;i<lista.length;i++)
            {
                System.out.println(lista [i].imprimeResumen());
            }
        }
        if(opcion==2)
        {
            for(int i=0;i<lista.length;i++)
            {
                if (lista [i].getAnoFabricacion()==2015)
                System.out.println(lista [i].imprimeResumen());
            } 
        }    
            if(opcion==3)
           {
            for(int i=0;i<lista.length;i++)
            {
                if (lista [i].getStockActual()==0)
                System.out.println(lista [i].imprimeResumen());
            }
        }
        if(opcion==4)
           {
            for(int i=0;i<lista.length;i++)
            {
                if (lista [i].getPrecioVenta()>6000000)
                System.out.println(lista [i].imprimeResumen());
            }
        }
     
    
        
    
        
        
    }
}

    