
package main;

import AbstractFactory.Cliente;
import AbstractFactory.FabricaElfo;
import AbstractFactory.FabricaHumano;
import AbstractFactory.FabricaOrco;
import AbstractFactory.FabricaPersonajes;
import Builder.EjercicioBuilder;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Catalogo extends JFrame implements ActionListener {

        JButton b=new JButton("Elfo");
        JButton b2=new JButton("Humano");
        JButton b3=new JButton("Orco");
        JButton b4=new JButton("Añadir arma");
        JButton b5=new JButton("Añadir montura");
        JButton b6=new JButton("Añadir escudo");
        
        JLabel Arma=new JLabel("Arma");
        JLabel Montura=new JLabel("Montura");
        JLabel Aspecto=new JLabel("Aspecto");
        JLabel Escudo=new JLabel("Escudo");
        JLabel Personaje=new JLabel("Personaje");
        
        JLabel img1=new JLabel();
        JLabel img2=new JLabel();
        JLabel img3=new JLabel();
        JLabel img4=new JLabel();
        JLabel img5=new JLabel();
        JLabel img6=new JLabel();
        JLabel img7=new JLabel();
        JLabel img8=new JLabel();
        
        EjercicioBuilder B=new EjercicioBuilder();
        
    public static void main(String[] args) {
        
        Catalogo P=new Catalogo();
        P.setSize(1250, 500);
        P.setVisible(true);
        
    }
    
    public Catalogo(){
        
        Container c=getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(Color.darkGray);
           
        
        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(Arma);
        c.add(Montura);
        c.add(Escudo);
        c.add(Aspecto);
        c.add(Personaje);
        c.add(img1);
        c.add(img2);
        c.add(img3);
        c.add(img4);
        c.add(img6);
        c.add(img7);
        c.add(img5);
        c.add(img8);
        
        
        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        b.setBounds(130, 50, 100, 35);
        b.setBackground(Color.CYAN);
        b2.setBounds(130, 200, 100, 35);
        b2.setBackground(Color.CYAN);
        b3.setBounds(130, 350, 100, 35);
        b3.setBackground(Color.CYAN);
        b4.setBounds(700, 50, 150, 35);
        b4.setBackground(Color.YELLOW);
        b5.setBounds(875, 50, 150, 35);
        b5.setBackground(Color.YELLOW);
        b6.setBounds(1050, 50, 150, 35);
        b6.setBackground(Color.YELLOW);
        
        Arma.setBounds(300, 50, 100, 20);
        Arma.setForeground(Color.WHITE);
        Arma.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Escudo.setBounds(300, 270, 100, 20);
        Escudo.setForeground(Color.WHITE);
        Escudo.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Aspecto.setBounds(500, 50, 100, 20);
        Aspecto.setForeground(Color.WHITE);
        Aspecto.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Montura.setBounds(500, 270, 100, 20);
        Montura.setForeground(Color.WHITE);
        Montura.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Personaje.setBounds(5, 205, 150, 20);
        Personaje.setForeground(Color.red);
        Personaje.setFont(new java.awt.Font("ALGERIAN", 1, 20));
        Personaje.setBackground(Color.cyan);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b){
        
            FabricaPersonajes factory1 = new FabricaElfo();
            Cliente c = new Cliente(factory1);
            
            img1.setBounds(300,80,130,130);
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma())));
            img2.setBounds(500,80,130,130);
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto())));
            img3.setBounds(300,295,130,130);
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo())));
            img4.setBounds(500,295,130,130);
            img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura())));
            img5.setBounds(800, 100, 300, 330);
            img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/elfo2.png")));
            
            B.setId("elfo");
            
        } else if(e.getSource()==b2){
        
            FabricaPersonajes factory2 = new FabricaHumano();
            Cliente c = new Cliente(factory2);
            
            img1.setBounds(300,80,130,130);
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma())));
            img2.setBounds(500,80,130,130);
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto())));
            img3.setBounds(300,295,130,130);
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo())));
            img4.setBounds(500,295,130,130);
            img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura())));
            img5.setBounds(800, 100, 300, 330);
            img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hombre2.png")));
            
            B.setId("humano");
            
        } else if(e.getSource()==b3){
        
            FabricaPersonajes factory3 = new FabricaOrco();
            Cliente c = new Cliente(factory3);
            
            img1.setBounds(300,80,130,130);
            img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma())));
            img2.setBounds(500,80,130,130);
            img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto())));
            img3.setBounds(300,295,130,130);
            img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo())));
            img4.setBounds(500,295,130,130);
            img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura())));
            img5.setBounds(800, 100, 300, 330);
            img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cosaverde2.png")));
            
            B.setId("orco");
            
        } else if(e.getSource()==b4){
            
            B.Operacion();
            
            img6.setBounds(760,260,130,130);
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+B.getArma())));
            
        } else if(e.getSource()==b5){
            
            B.Operacion();
            
            img8.setBounds(750,150,130,130);
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+B.getMontura())));
            
               
        } else if(e.getSource()==b6){
            
            B.Operacion();
            
            img7.setBounds(1000,230,130,130);
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+B.getEscudo())));
            
        }
        
    }
    
}
