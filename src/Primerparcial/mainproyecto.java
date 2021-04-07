package Primerparcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class mainproyecto {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tam = 0;
        int espacio =0;
        int j =0;
        int codigo =0;
        String nom = "";
        
        proyecto[] clientes;
        System.out.println("-------------- TIENDAS LOXXO --------------");
        System.out.println("-------------BIENVENIDO USUARIO------------");
        System.out.println(" ");
        System.out.print("Define El Tamano De La Cartera:");
        tam = sc.nextInt();
        clientes = new proyecto[tam];
        //Aqui se Inicializa las variables
        for (int i = 0; i < clientes.length; i++) {
               clientes[i] = new proyecto();
        }
        espacio = tam;
        int opc = -214748364;
        
           
           while(opc != 0){
               System.out.println("---------------MENU PRINCIPAL----------------");
               System.out.println("Tamano de la Cartera: (" +tam+ ")");
               System.out.println("Espacio En La Cartera: (" + espacio + ")");
               System.out.println("1) Agregar Cliente");
               System.out.println("2) Mostrar Clientes");
               System.out.println("3) Buscar Cliente");
               System.out.println("0) Cerrar Sistema");
               System.out.print("Elige una opcion ---> ");
               opc = sc.nextInt();
               int restcod = 0;
               int restnom = 0;
               switch(opc){
                   
                   
                   case 1:
                       
                       //Aqui se deberia Agregar cliente
                       if (espacio == 0) {
                           System.out.println("----> Se Te Han Terminado Los Espacios <----");
                           
                       }else{
                       try{
                       System.out.println("Cliente -- ID[" + j + "]: ");
                       System.out.print("Ingresa Codigo: ");
                       clientes[j].setCodigocliente(sc.nextInt());
                       System.out.print("Ingresa Nombre: ");
                       clientes[j].setNombre(bf.readLine());
                       System.out.print("Ingresa Apellido Paterno: ");
                       clientes[j].setApellidopaterno(bf.readLine());
                       System.out.print("Ingresa Apellido Materno: ");
                       clientes[j].setApellidomaterno(bf.readLine());
                       System.out.print("Ingresa Numero de Telefono: ");
                       clientes[j].setTelefono(bf.readLine());
                       System.out.print("Ingresa Direccion: ");
                       clientes[j].setDireccion(bf.readLine());
                       System.out.print("Ingresa Edad: ");
                       clientes[j].setEdad(sc.nextInt());
                       
                       }catch(Exception e){
                           System.out.println(e.getMessage());
                       }
                         
                       //EL ID del Cliente
                       if (j>=0 && j<tam) {
                           j = j+1;
                       }
                       //Los espacios que se estaran resatando de uno en uno
                       if (espacio > 0 && espacio <= tam) {
                           espacio = espacio - 1;
                       }
                       }
                       break;
                       
                   case 2:
                       if(espacio == tam){
                           System.out.println("----- No Existen registros -----");
                       }else{
                       //Aqui Muestra todos los clientes insertados
                    System.out.println("-----------------Mostrar Clientes-------------------------");
                       for (int i = 0; i < tam; i++) {
                           if(clientes[i].getEdad()!=0){
                           System.out.println("-----------------------------------------------");
                           System.out.println("ID [" + i + "]");
                           System.out.println("Codigo Cliente: " + clientes[i].getCodigocliente());
                           System.out.println("Nombre: " + clientes[i].getNombre());
                           System.out.println("Apellido Paterno: " + clientes[i].getApellidopaterno());
                           System.out.println("Apellido Materno: " + clientes[i].getApellidomaterno());
                           System.out.println("Numero Telefonico: " + clientes[i].getTelefono());
                           System.out.println("Direccion: " + clientes[i].getDireccion());
                           System.out.println("Edad: " + clientes[i].getEdad());
                           }

                       }
                       System.out.println("-----------------------------------------------");
                       }
                     
                       break;
                       
                   case 3:
                       //Aqui Buscara clientes con un sub menu
                       
                       
                       int opc2 = -214748364;
                       while(opc2 != 0){
                       System.out.println("---------------MENU BUSCAR CLIENTE----------------");
                       System.out.println("1) Buscar Por Codigo");
                       System.out.println("2) Buscar Por Nombre");
                       System.out.println("0) Regresar Al Menu Anterior");
                       System.out.print("Elige una opcion ---> ");
                       opc2 = sc.nextInt();
                       
                       switch(opc2){
                           case 1:
                               restcod = tam-espacio;
                               System.out.print("Ingresa el codigo: ");
                               codigo = sc.nextInt();
                                                      //2
                               for (int i = 0; i <(tam-espacio); i++) {
                                   if(codigo == clientes[i].getCodigocliente()){
                                       System.out.println("-----------------------------------------------");
                                       System.out.println("Nombre: " + clientes[i].getNombre());
                                       System.out.println("Apellido Paterno: " + clientes[i].getApellidopaterno());
                                       System.out.println("Apellido Materno: " + clientes[i].getApellidomaterno());
                                       System.out.println("Numero Telefonico: " + clientes[i].getTelefono());
                                       System.out.println("Direccion: " + clientes[i].getDireccion());
                                       System.out.println("Edad: " + clientes[i].getEdad());
                                       System.out.println("-----------------------------------------------");
                                   }
                                   restcod--;
                               }
               
                               break;
                               
                           case 2:
                               restnom = tam-espacio;
                               try{
                               System.out.print("Ingresa el Nombre: ");
                               nom = bf.readLine();
                               for (int i = 0; i < (tam-espacio); i++) {
                                   if(nom.equals(clientes[i].getNombre())){
                                       System.out.println("-----------------------------------------------");
                                       System.out.println("Codigo Cliente: " + clientes[i].getCodigocliente());
                                       System.out.println("Nombre: " + clientes[i].getNombre());
                                       System.out.println("Apellido Paterno: " + clientes[i].getApellidopaterno());
                                       System.out.println("Apellido Materno: " + clientes[i].getApellidomaterno());
                                       System.out.println("Numero Telefonico: " + clientes[i].getTelefono());
                                       System.out.println("Direccion: " + clientes[i].getDireccion());
                                       System.out.println("Edad: " + clientes[i].getEdad());
                                       System.out.println("-----------------------------------------------");
                                   }
                                  
                                  
                               }
                                   
                                   
                                   
                               }catch(Exception e){
                                   System.out.println(e.getMessage());
                               }
                               
                               
                               break;
                               
                           case 0:
                               
                               break;
                       
                       
                       }
                       }
                       
                       break;
                       
                   case 0:
                       System.out.println("----- Que Pases Un Excelente Dia ----");
                       break;
                       
               
               
               }
               
           }

    
}
}
