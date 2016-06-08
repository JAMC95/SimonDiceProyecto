import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ficherito {
	
	String cadena;
	
	
	static void lectura() throws FileNotFoundException{
		String nombre;
		int puntuacion;
		String texto="";
		FileReader flS;
		try {
			flS = new FileReader("Ranking.txt");
			BufferedReader fE= new BufferedReader(flS);

			while(texto!=null){
				texto=fE.readLine();
				if(texto!=null){
				
					StringTokenizer st = new StringTokenizer(texto,",");
				     while (st.hasMoreTokens()) {
				    	 puntuacion=Integer.parseInt(st.nextToken());

				    	 nombre= st.nextToken();

							System.out.println("Nombre " +nombre);
							System.out.println("Puntuacion " +puntuacion);
							

				     }
				     
				
					
				}
				
			}fE.close(); 
				
				
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void escritura(String nombre, int puntuacion) throws IOException{
		
		FileWriter flS=new FileWriter("Ranking.txt",true);
		BufferedWriter fS=new BufferedWriter(flS);

		if(nombre!=null){
			fS.write(puntuacion+","+nombre);
			fS.newLine();
		}
		
		
		fS.close();
		ordenate();
	
		
	}

	public static void ordenate() throws IOException {
		ArrayList<String> Ficheros = new ArrayList<String>();
		
		String texto="";
		FileReader flS;
		try {
			flS = new FileReader("Ranking.txt");
			BufferedReader fE= new BufferedReader(flS);

			while(texto!=null){
				texto=fE.readLine();
				if(texto!=null){
				
					Ficheros.add(texto);
							

				     }
				     
				
					
				}
			fE.close(); 
			}catch(IOException e){
				
		
			
		}
		int numero =Ficheros.size();
		
		Collections.sort(Ficheros);
		Collections.reverse(Ficheros);
		//System.out.println(Ficheros);
		while(Ficheros.size()>10){
			Ficheros.remove(10);
		}
		
		FileWriter flSA=new FileWriter("Ranking.txt");
		BufferedWriter fSA=new BufferedWriter(flSA);

		for(int i=0;i<Ficheros.size();i++){
			fSA.write(Ficheros.get(i));
			fSA.newLine();
		}
		
		
		fSA.close();
		
	}
}
	