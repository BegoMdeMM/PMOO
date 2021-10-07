package tresEnRaya;
public class Tablero {
	//atributos:
	private static Tablero miTablero=null;
	//       tipo  [][]   identificador
	private Casilla[][] listaCasillas;
	
	//Contructara:
	private Tablero(){ 
		        Casilla c1;
			   // identificador     tipo
				listaCasillas=new Casilla[3][3];
				for (int f= 0;f<3;f++){
					for (int c=0;c<3; c++){
						c1=new Casilla();
						listaCasillas[f][c] = c1;
						//listaCasillas[f][c].vaciarCasilla();
					}
				}
	}
	//public InputMismatchException()
	public Casilla[][] getListaCasillas() {
			return listaCasillas;
		}
//	[]getTablero():void
	 public static Tablero getTablero()
	{
		 if (miTablero==null){miTablero=new Tablero();}
	 		return miTablero;
	}
	
//HACE EXACTAMENTE LO MISMO QUE MARCAR, LO UNICO ES QUE TE DEVUELVE LA CASILLA.
	 
	 
	public Casilla buscarCasilla (int pF,int pC){//manda unas coordenadas y obtengo la casilla
 	// recorrido de las filas de la matriz
		Casilla pCasilla;
	//   identificador         tipo
		pCasilla=this.listaCasillas[pF][pC];
		return pCasilla;	
	}
	 	 
//	+Marcar casilla(casilla):void
//marcamos la casilla con los valores recoguidos
	//public void marcarCasilla(char pValor, int pF, int pC)
	public void marcarCasilla(int turno,int pF, int pC)
	//public void añadirCasilla (int pValor, int pF, int pC
 			{Casilla c1;
 			c1=this.listaCasillas[pF][pC];
 			c1.marcar(turno);
 			
 			}

//+Limpiar pantalla():void
//aparte de generar una nueva matriniz la porne toda ha ceros.
	public void limpiarTablero (){			
	//genero una variable que contenga la propia casilla y luego con esta llamo 
		Casilla c1;
		//   identificador         tipo
		for (int f= 0;f<3;f++){//i++ ; le aumenta en 1 a la variable i para la siguiente repeticion
			for (int c=0;c<3; c++){
				c1=this.listaCasillas[f][c];
		        c1.vaciarCasilla();
			}
		}
	}

	public void imprimirTablero(){
	int j,i;
	Casilla c1;
	System.out.println("                                                            ");
	System.out.println("                                                            ");
	System.out.println("                                                            ");
	System.out.println("                                                            ");
	System.out.println("                                                            ");
	System.out.println("                                                            ");
	System.out.println("                                                            ");
	System.out.println("                                                            ");
	  	for( i=0;i<3;i++){
    		
    		for( j=0;j<3;j++){
    			c1=this.listaCasillas[i][j];
    			if(j<2)
    			
    				System.out.print(" " + c1.getValor() + " |");
    			// 
    			else
    				
    				System.out.print(" " + c1.getValor() + " ");
    				    				
    		}
    		
    		if(i<2)
    			
    			System.out.println(		"\n-----------");    			 	    				
    	}
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	System.out.println("                                                            ");
    	System.out.println("                                                            ");
    	System.out.println("                                                            ");
	}
 public boolean  buscar_tres_en_raya(int pF, int pC){
	 boolean encontrado= false;
	 //System.out.println(pF+" "+pC);
	 if (encontrado==false){encontrado=horizontal(pF);}
	 if (encontrado==false){encontrado=vertical(pC);} 
	 if (encontrado==false){encontrado=diagonalDch();}	 
	 if (encontrado==false){encontrado=diagonalIzq();}	
	 return encontrado;
	}
 private boolean horizontal(int pF){
	  boolean encontrado=false;
	  //System.out.println(listaCasillas[0][0].getValor()+" "+listaCasillas[0][1].getValor()+" "+listaCasillas[0][2].getValor());
	  //System.out.println(listaCasillas[1][0].getValor()+" "+listaCasillas[1][1].getValor()+" "+listaCasillas[1][2].getValor());
	  //System.out.println(listaCasillas[2][0].getValor()+" "+listaCasillas[2][1].getValor()+" "+listaCasillas[2][2].getValor());
	  if(listaCasillas[pF][1].getValor()==listaCasillas[pF][0].getValor()&&listaCasillas[pF][1].getValor()==listaCasillas[pF][2].getValor())//comparamos las casillas enteras
	    	{encontrado = true;	} 
	    	  	return encontrado;
 }	    			
		
 private boolean vertical(int pC){
	 boolean encontrado= false; 
	 	
	 		if(listaCasillas[1][pC].getValor()==listaCasillas[0][pC].getValor()&&listaCasillas[1][pC].getValor()==listaCasillas[2][pC].getValor())
	 		{encontrado = true;	} 	
	 		return encontrado;
 }
 private boolean diagonalDch(){	 
	 boolean encontrado= false;
	 if (listaCasillas[0][0].isOcupado()==true || listaCasillas[1][1].isOcupado()==true||listaCasillas[2][2].isOcupado()==true){
	 		if(listaCasillas[1][1].getValor()==listaCasillas[0][0].getValor() &&listaCasillas[1][1].getValor()==listaCasillas[2][2].getValor())
			{encontrado = true;	} 	
			 
	 		}
	 		return encontrado;
	}   
 private boolean diagonalIzq(){	 
	 boolean encontrado= false;
	 		if (listaCasillas[1][1].isOcupado()==true || listaCasillas[0][2].isOcupado()==true||listaCasillas[2][0].isOcupado()==true){
	 			if(listaCasillas[1][1].getValor()==listaCasillas[0][2].getValor()&&listaCasillas[1][1].getValor()==listaCasillas[2][0].getValor())
	 			{encontrado = true;	} 
	 		}	
			return encontrado;
	}   
}	    