package tresEnRaya;
import java.util.Scanner;
public class TresEnRaya {
	//Atributos--> definimos las variables locales;
	
	//Con este contado conseguinos 2 cosas
	//1º cuantas casilla hemos marcado del cual decuciremo cuantas
	//Casillas podemos seguir marcando
	//Dependiendo de su el digito que nos de es par o impar sabremos
	// que estamos es le turno de las X o de las 0
	// ya que en este juego empiezan las X.
	private int contCasillasTurno=1;
	//jugador x, nos informa de cuanto partida va ganado este jugador
	private int contadorX=0;
	//jugador O,  nos informa de cuanto partida va ganado este jugador
	private int contadorO=0;
	private int contadorPartidas=0;
	
	private static TresEnRaya mitresEnRaya=new TresEnRaya();
	private TresEnRaya(){
		//no ha nada solo se reconoce asi misma
	}
	
	//Constructora;
	private static TresEnRaya getMitresEnRaya() {
		return mitresEnRaya;
	}

	public int getContCasillasTurno() {
		return contCasillasTurno;
	}

	public void setContCasillasTurno(int contCasillasTurno) {
		this.contCasillasTurno = contCasillasTurno;
	}

	//Metodos;

	public void jugar()
	{
		//boolean seguir=true;//volveria ha este punto del bucle si pretende seguir jugando
		boolean comprobacion=false;
		while(this.comprobarQueHayMovimiento()==true)
		//while(seguir==true)//mientras pretenda seguir jugando
		{
			if (contCasillasTurno==1){	Tablero.getTablero().limpiarTablero();//poner todas las casillas a ceros;
										//imprimirTablero();//si es el primer turno 
			}	
			//while(this.comprobarQueHayMovimiento()==true)//mientras haya casillas sin ocupar
			{	
				imprimirTablero();
				imprimirQuienJuega();
				peticionInseccionFC();	
			
				int pF,pC;
				pF=Movimiento.getMiMovimiento().getF();
				pC=Movimiento.getMiMovimiento().getC();
						pF=pF-1;
						pC=pC-1;
				if (Tablero.getTablero().buscarCasilla(pF, pC).isOcupado()==false)//si esta ocupada la casilla
				{	//Busco en la casilla, con la direccion pF, pC y leo el ocupado;
						comprobacion=false;
						Tablero.getTablero().marcarCasilla(quienDebeJugar(),pF, pC);//marcamos la casilla
				        imprimirTablero();
				        contCasillasTurno ++;				        
				}		
				else{
					System.out.println("La casilla esta ocupada");
					comprobacion=true;
				}
				if(comprobacion==false){
					if (Tablero.getTablero().buscar_tres_en_raya(pF, pC)==true)
					{  //llamamos a fin partida SI ES FALSE NO HACE NADA
						
						contadorPartidas++;
						imprimirGanador();
						contCasillasTurno=1;
						
						if ((seguirJugando()==0))
						{	imprirGanadorPartirdaTotales();
							salirDeLaEjecucion();
						}
						
					//	Tablero.getTablero().limpiarTablero();
						//Tablero.getTablero();
				
					}//fin if buscar tres en raya
				}//fin if comprobacion !=true	
			}//fin while comprobar que hay mov			
		}//while si seguir es true
	}//fin jugar
	
	private int quienDebeJugar(){
		int turno=0;//sin rest par
		if (this.contCasillasTurno % 2==0){
			{turno=1;//con resto imp
			}
		}
		return turno;
	}
	
	private int capturarMovimiento(String args){
	//como es una mae movimiento, solo ella se modifica asi misma
	//Capturo del teclado primero la fila y despues la columna, mediante un metodo 
	//que aprovecha de definicion de la cadena para definir la formula de peticion
	////controlo las excepciones de entra solo admito 1,2,3 teniendo a los 10 intentos sale por error.
	int contadorExcepcionVeces=0;	
	int lectura=1;
	boolean seguir=false;//si es false sigo con el do, si es true salgo
	do{
		try{//genero la excepcion
			System.out.print( "	cual es la "+ args+":");
			seguir=true;
			Scanner sc = new Scanner(System.in);//genero variable de tipo scannern aqui sino no logera y entra en bucle;
			lectura=sc.nextInt();
			if((lectura!=1) && (lectura!=2) && (lectura!=3)){
				//incremeto en 1 el contador.
			    seguir=false;
				throw new Exception();
			}		
		}//lanzo la excepcion
		
		catch(Exception e){		
			contadorExcepcionVeces++;
			System.out.println("Coordenada fuera de limites");
		}
	
	}
	
	while((seguir==false)&&(contadorExcepcionVeces<10));//solo adminitimos los digitos 1 , 2 , 3 .			
	if(contadorExcepcionVeces==10){
		System.out.println("Suponemos que ha habido un error grave porque se ha confundido 10 veces");
		System.exit(2);}
	 
	return lectura;
	}
	private void peticionInseccionFC(){
		
		Movimiento.getMiMovimiento().modificarFila(capturarMovimiento("Fila"));
		Movimiento.getMiMovimiento().modificarColumna(capturarMovimiento("Columna"));
		
	}	
	private boolean comprobarQueHayMovimiento(){
		boolean res=true;
		if (contCasillasTurno==10){
			contCasillasTurno=1;
			contadorPartidas++;
			System.out.println("Tablas comiencen de nuevo");
		}
		return res;
	
	}
			
	private void imprimirTablero(){Tablero.getTablero().imprimirTablero();}
		
	private void imprimirQuienJuega(){
		String argu= ("	JUEGAN LAS: ");
		if (quienDebeJugar()==0)
		{
				System.out.println(argu+"X");}
		else
		{		System.out.println(argu+"O");}			
	}
	
	private void imprimirGanador(){
		String Ganador;
		int c1=quienDebeJugar();
		
		if (c1==1)//Al marcar la casilla se increnta el turno== pasa al siguente sin que meta datos
		{		contadorX++;//para solventar esto cambiamos la condicion
				Ganador="Las X";}
		else
		{		contadorO++;
				Ganador="Las O ";}
		
		System.out.println("EL GANADOR DE LA PARTIDA FUE:"+  Ganador);
		}
			
	private int seguirJugando(){// a los 10 intentos sale por error.
		int contadorExcepcionVeces=0;	
		int lectura=0;
		boolean seguir=false;//si es false sigo con el do, si es true salgo
		do{
			try{//genero la excepcion
				System.out.print( "DESEA SEGUR JUGANDO 1(Para si)");
				System.out.print( "                    0(Para no)");
				seguir=true;
				Scanner sc = new Scanner(System.in);//genero variable de tipo scannern aqui sino no logera y entra en bucle;
				lectura=sc.nextInt();
				if((lectura!=1) &&( lectura!=0)){
					//incremeto en 1 el contador.
				    seguir=false;
					throw new Exception();
				}			
			}//lanzo la excepcion
			
			catch(Exception e){		
				contadorExcepcionVeces++;
				System.out.println("		Coordenada fuera de limites");
			}
		}
		
		while((seguir==false)&&(contadorExcepcionVeces<10));//solo adminitimos los digitos 1 , 2 , 3 .			
		if(contadorExcepcionVeces==10){
			System.out.println("			Suponemos que ha habido un error grave porque se ha confundido 10 veces");
			System.exit(2);}
		 
		return lectura;
		}
	private void imprirGanadorPartirdaTotales(){
		String Ganador;
		
		if	(contadorX <contadorO)
		{
			Ganador="Han ganado Las O "+contadorO+" de "+contadorPartidas+" Partidas";
		}
		else
			{Ganador="Han ganado Las X "+contadorX+" de "+contadorPartidas+" Partidas";}
		if (contadorX ==contadorO)
			
			{Ganador="No ha habido ganadores";}
			
	System.out.println("                            "+Ganador+"                     ");
	System.out.println("                                                            ");

	}
	
	private void salirDeLaEjecucion(){
		int n=0;//Con este metodo salgo definitibamente del todo el programa, generando un codigo de error con valor cero= salida OK
		System.exit(n);//y asi dependiendo del numero de error sabre por se acaba la ejecicion, es un metodo de control.
	}

	//Metodo que lanza la ejecucion de programa TresenRaya
	public static void main(String argv[]){/* El parámetro del método main( ) es un array de objetos String. Este
programa no usará args, pero el compilador Java obliga a que esté presente, pues son los que mantienen
los parámetros que se invoquen en la línea de comandos.*/
		TresEnRaya.getMitresEnRaya().jugar();
	}
}
