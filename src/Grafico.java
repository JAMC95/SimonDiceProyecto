import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.Toolkit;

public class Grafico extends JFrame {

	private JPanel SimonPrincipal;
	public int n = 4; // numero de colores a mostrar
	protected ArrayList<String> Colores = new ArrayList<String>();
	protected ArrayList<String> Usuario = new ArrayList<String>();
	public JTextArea Texto = new JTextArea();
	private int contador = 0;
	public JPanel Verde;
	public JPanel Amarillo = new JPanel();
	public JPanel Rojo = new JPanel();
	public JPanel Azul = new JPanel();
	public JLabel lblNivel;
	public JLabel Logo = new JLabel("");
	private JTable table;
	private JLabel lblNivelMaximo;
	private JLabel lblNombre;
	 DefaultTableModel modelo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafico frame = new Grafico();
					//frame.setLocationRelativeTo(null);
					//Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
					//frame.setSize(pantalla.width / 2, pantalla.height / 2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	

	public Grafico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Icono.png"));
		setTitle("Simons Say's - Jose Antonio Moral Castilla");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 513);
		SimonPrincipal = new JPanel();
		SimonPrincipal.setBorder(null);
		setContentPane(SimonPrincipal);
		SimonPrincipal.setLayout(null);
		//Tomo el tamaño de la pantalla
		//Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
		//Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto:
		//this.setLocation((pantallaTamano.width/2)-(this.getWidth()/2), (pantallaTamano.height/2)-(this.getHeight()/2)); 
		this.setLocationRelativeTo(null);
		Rojo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Usuario.add("Rojo");
				contador++;
				try {
					CompruebaContador();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				Rojo.setBackground(Color.red);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Rojo.setBackground(new Color(255, 153, 153));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Rojo.setBackground(new Color(255, 153, 153));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Rojo.setBackground(Color.red);
			}
		});
		Rojo.setBackground(new Color(255, 153, 153));
		Rojo.setBounds(116, 140, 105, 123);
		
		SimonPrincipal.add(Rojo);

		Verde = new JPanel();
		Verde.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Usuario.add("Verde");
				contador++;
				try {
					CompruebaContador();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				Verde.setBackground(Color.green);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Verde.setBackground(new Color(204, 255, 153));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Verde.setBackground(new Color(204, 255, 153));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Verde.setBackground(Color.green);
			}
		});
		Verde.setBackground(new Color(204, 255, 153));
		Verde.setBounds(116, 269, 105, 123);
		SimonPrincipal.add(Verde);

		Azul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Usuario.add("Azul");
				contador++;
				try {
					CompruebaContador();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				Azul.setBackground(Color.blue);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Azul.setBackground(new Color(153, 255, 204));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Azul.setBackground(new Color(153, 255, 204));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Azul.setBackground(Color.blue);
			}

		});
		Azul.setBackground(new Color(153, 255, 204));
		Azul.setBounds(231, 141, 105, 122);
		SimonPrincipal.add(Azul);
		Texto.setBackground(UIManager.getColor("Button.background"));

		Texto.setBounds(10, 94, 105, 23);
		SimonPrincipal.add(Texto);

		Amarillo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Usuario.add("Amarillo");
				contador++;
				try {
					CompruebaContador();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				Amarillo.setBackground(Color.yellow);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Amarillo.setBackground(new Color(255, 255, 153));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Amarillo.setBackground(new Color(255, 255, 153));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Amarillo.setBackground(Color.yellow);
			}
		});
		modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Maximo");
        table = new JTable();
        table.setBackground(SystemColor.control);
		table.setBounds(114, 131, 222, 276);
		SimonPrincipal.add(table);
		
 
        table.setModel(modelo);
        table.setVisible(false);
		Amarillo.setBackground(new Color(255, 255, 153));
		Amarillo.setBounds(231, 269, 105, 123);
		SimonPrincipal.add(Amarillo);
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contador = 0;
				visible();
				start();

			}
		});
		btnIniciar.setBounds(10, 28, 89, 23);
		SimonPrincipal.add(btnIniciar);

		lblNivel = new JLabel("Nivel " + (n - 3));
		lblNivel.setBounds(10, 0, 46, 14);
		SimonPrincipal.add(lblNivel);

		JButton btnVerRanking = new JButton("Ver Ranking");
		btnVerRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				invisible();
				//String nombre;
				//int puntuacion;
				String texto="";
				FileReader flS;
				//int ranking=0;
				table.setVisible(true);
				limpiartabla();
				try {
					flS = new FileReader("Ranking.txt");
					BufferedReader fE= new BufferedReader(flS);

					while(texto!=null){
						texto=fE.readLine();
						if(texto!=null){
						
							StringTokenizer st = new StringTokenizer(texto,",");
						     while (st.hasMoreTokens()) {
						    	// puntuacion=Integer.parseInt();
						    	// puntuacion-=1;
						    	// nombre= st.nextToken();
						    	// ranking++;
							//	Ranking.append(ranking+"."+    "Nombre " +nombre+ " maximo nivel " +puntuacion+"\n");
									
						    	 String [] Datos = new String[3];
							       Datos[1]= st.nextToken();
							       Datos[0]=st.nextToken();;
							      
							       modelo.addRow(Datos);
									

						     }
						     
						
							
						}
						
					}fE.close(); 
						
						
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnVerRanking.setBounds(98, 28, 146, 23);
		SimonPrincipal.add(btnVerRanking);
		
		
		Logo.setBounds(20, 128, 414, 150);
		Logo.setIcon(new ImageIcon("Simon.jpg"));
		SimonPrincipal.add(Logo);
		
		lblNivelMaximo = new JLabel("Nivel Maximo");
		lblNivelMaximo.setBounds(220, 115, 115, 14);
		SimonPrincipal.add(lblNivelMaximo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(116, 115, 46, 14);
		SimonPrincipal.add(lblNombre);
		Rojo.setVisible(false);
		Azul.setVisible(false);
		Verde.setVisible(false);
		Amarillo.setVisible(false);
		Texto.setVisible(false);
		lblNivel.setVisible(false);
		lblNivelMaximo.setVisible(false);
		lblNombre.setVisible(false);

	}

	protected void limpiartabla() {
		 for(int i=(table.getRowCount()-1);i>=0;i--){
             modelo.removeRow(i);
          }
		
	}

	protected void visible() {
		
		lblNivelMaximo.setVisible(false);
		lblNombre.setVisible(false);
		table.setVisible(false);
		
		//limpiartabla();
		
		Rojo.setVisible(true);
		Azul.setVisible(true);
		Verde.setVisible(true);
		Amarillo.setVisible(true);
		Texto.setVisible(true);
		lblNivel.setVisible(true);
		Logo.setVisible(false);
		
	}

	protected void invisible() {
		lblNivelMaximo.setVisible(true);
		lblNombre.setVisible(true);
		Rojo.setVisible(false);
		Azul.setVisible(false);
		Verde.setVisible(false);
		Amarillo.setVisible(false);
		Texto.setVisible(false);
		lblNivel.setVisible(false);
		Logo.setVisible(false);

	}

	protected void start() {
		Thread worker = new Thread() {
			public void run() {
				Random r = new Random();
				Texto.setText("");
				// r.nextInt();
				// System.out.println(r.nextInt(4)+1);
				// System.out.println(n);
				for (int i = Colores.size(); i < n; i++) {
					int seleccion = r.nextInt(4) + 1;
					switch (seleccion) {
					case 1:
						Colores.add("Rojo");
						break;
					case 2:
						Colores.add("Azul");
						break;
					case 3:
						Colores.add("Verde");
						break;
					case 4:
						Colores.add("Amarillo");
						break;
					}

				}

				// Simulate doing something useful.
				for (int j = 0; j < Colores.size(); j++) {
					// Bad practice
					// Texto.append(Colores.get(j)+"\n");
					switch (Colores.get(j)) {
					case "Rojo":
						Rojo.setBackground(Color.RED);
						break;
					case "Azul":
						Azul.setBackground(Color.BLUE);
						break;
					case "Verde":
						Verde.setBackground(Color.GREEN);
						break;
					case "Amarillo":
						Amarillo.setBackground(Color.YELLOW);
						break;
					}
					PonerColoresApagados();

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}
				}
				Texto.setText("Empieza");

				// Bad practice
				// statusLabel.setText("Completed.");
			}
		};

		worker.start();

	}

	protected void PonerColoresApagados() {
		/*
		 * Rojo.setBackground(new Color(255, 153, 153)); Azul.setBackground(new
		 * Color(153, 255, 204)); Verde.setBackground(new Color(204, 255, 153));
		 * Amarillo.setBackground(new Color(255, 255, 153));
		 */

		Thread worker = new Thread() {
			public void run() {

				// Simulate doing something useful.

				// Bad practice

				try {
					Thread.sleep(750);
				} catch (InterruptedException e) {

				}

				Rojo.setBackground(new Color(255, 153, 153));
				Azul.setBackground(new Color(153, 255, 204));
				Verde.setBackground(new Color(204, 255, 153));
				Amarillo.setBackground(new Color(255, 255, 153));
				

			}
		};

		worker.start();
	}

	public void limpiar() {
		Texto.setText("");

	}

	protected void CompruebaContador() throws IOException {
		if (contador == n) {
			if (Colores.equals(Usuario)) {
				limpiar();

				Texto.setText("Correcto\n");
				Usuario.clear();
				n++;
				lblNivel.setText("Nivel " + (n - 3));
				contador = 0;
				// Colores.clear();
				start();

			} else {
				Texto.setText("Torpe\n");
				Usuario.clear();
				Colores.clear();
				int puntuacion = n - 3;
				int numeroregistros=1;
				String ultimoranking; 
				
				String texto;
				 String [] Datos = new String[3];
				try {
					FileReader flS = new FileReader("Ranking.txt");
					BufferedReader fE= new BufferedReader(flS);
					texto=fE.readLine();
					while(texto!=null){
						texto=fE.readLine();
						if(texto!=null){
						
							StringTokenizer st = new StringTokenizer(texto,",");
						     while (st.hasMoreTokens()) {
						  
									
						    	
							       Datos[1]= st.nextToken();
							       Datos[0]=st.nextToken();;
							      numeroregistros++;
							      
							    
									

						     }
						     
						
							
						}
						
					}fE.close(); 
						
						
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ultimoranking=Datos[1];
				
				//System.out.println(numeroregistros+" "+ultimoranking);
				
				int ultimoINT= Integer.parseInt(ultimoranking);
				if((numeroregistros<=10)&&(puntuacion>ultimoINT)){
					String nombre = JOptionPane.showInputDialog(null,
							"Juego finalizado, ha llegado al nivel " + puntuacion + "\n Introduce tu nombre",
							"Juego finalizado", JOptionPane.CANCEL_OPTION);
					Ficherito f = new Ficherito();
					f.escritura(nombre, puntuacion);
					
				}
			
				n = 4;
				lblNivel.setText("Nivel " + (n - 3));
				contador = 0;

			}

		}

	}
}
