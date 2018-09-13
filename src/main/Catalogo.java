
package main;

import AbstractFactory.Cliente;
import AbstractFactory.FabricaElfo;
import AbstractFactory.FabricaHumano;
import AbstractFactory.FabricaOrco;
import AbstractFactory.FabricaPersonajes;
import Builder.EjercicioBuilder;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
        String id;
        
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
         
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma()));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            img1.setBounds(300,80,130,130);
            img1.setIcon(iconoEscalado);
            
            ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
            img2.setBounds(500,80,130,130);
            img2.setIcon(iconoEscalado2);
            
            ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo()));
            Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
            img3.setBounds(300,295,130,130);
            img3.setIcon(iconoEscalado3);
            
            ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura()));
            Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
            img4.setBounds(500,295,130,130);
            img4.setIcon(iconoEscalado4);
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            id="elfo";
            B.setId(id);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png"))); 
            
        } else if(e.getSource()==b2){
        
            FabricaPersonajes factory2 = new FabricaHumano();
            Cliente c = new Cliente(factory2);
            
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma()));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            img1.setBounds(300,80,130,130);
            img1.setIcon(iconoEscalado);
            
            ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
            img2.setBounds(500,80,130,130);
            img2.setIcon(iconoEscalado2);
            
            ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo()));
            Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
            img3.setBounds(300,295,130,130);
            img3.setIcon(iconoEscalado3);
            
            ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura()));
            Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
            img4.setBounds(500,295,130,130);
            img4.setIcon(iconoEscalado4);
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            id="humano";
            B.setId(id);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            
            
        } else if(e.getSource()==b3){
        
            FabricaPersonajes factory3 = new FabricaOrco();
            Cliente c = new Cliente(factory3);
            
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirArma()));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            img1.setBounds(300,80,130,130);
            img1.setIcon(iconoEscalado);
            
            ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado2 = new ImageIcon(imgEscalada2);
            img2.setBounds(500,80,130,130);
            img2.setIcon(iconoEscalado2);
            
            ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirEscudo()));
            Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado3 = new ImageIcon(imgEscalada3);
            img3.setBounds(300,295,130,130);
            img3.setIcon(iconoEscalado3);
            
            ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirMontura()));
            Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
            Icon iconoEscalado4 = new ImageIcon(imgEscalada4);
            img4.setBounds(500,295,130,130);
            img4.setIcon(iconoEscalado4);
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+c.recibirAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            id="orco";
            B.setId(id);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            
            
        } else if(e.getSource()==b4){
            
            B.Operacion();
            
            ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagenes/"+B.getArma()));
            Image imgEscalada6;
            Icon iconoEscalado6;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(1000, 160, 130, 130);
                    break;
                case "humano":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(760,260,130,130);
                    break;
                case "orco":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(170,170, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(720,135,170,170);
                    break;
                default:
                    break;
            }
            
            
        } else if(e.getSource()==b5){
            
            B.Operacion();
            
            ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/Imagenes/"+B.getMontura()));
            Image imgEscalada8;
            Icon iconoEscalado8;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada8 = imgIcon8.getImage().getScaledInstance(250,220, Image.SCALE_SMOOTH);
                    iconoEscalado8 = new ImageIcon(imgEscalada8);
                    img8.setIcon(iconoEscalado8);
                    img8.setBounds(770, 210, 250, 220);
                    break;
                case "humano":
                    imgEscalada8 = imgIcon8.getImage().getScaledInstance(250,220, Image.SCALE_SMOOTH);
                    iconoEscalado8 = new ImageIcon(imgEscalada8);
                    img8.setIcon(iconoEscalado8);
                    img8.setBounds(950,170,250,220);
                    break;
                case "orco":
                    imgEscalada8 = imgIcon8.getImage().getScaledInstance(250,200, Image.SCALE_SMOOTH);
                    iconoEscalado8 = new ImageIcon(imgEscalada8);
                    img8.setIcon(iconoEscalado8);
                    img8.setBounds(1000,230,250,200);
                    break;
                default:
                    break;
            }
            
               
        } else if(e.getSource()==b6){
            
            B.Operacion();
            ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/Imagenes/"+B.getEscudo()));
            Image imgEscalada7;
            Icon iconoEscalado7;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada7 = imgIcon7.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
                    iconoEscalado7 = new ImageIcon(imgEscalada7);
                    img7.setIcon(iconoEscalado7);
                    img7.setBounds(830, 125, 130, 130);
                    break;
                case "humano":
                    imgEscalada7 = imgIcon7.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado7 = new ImageIcon(imgEscalada7);
                    img7.setIcon(iconoEscalado7);
                    img7.setBounds(950,230,130,130);
                    break;
                case "orco":
                    imgEscalada7 = imgIcon7.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
                    iconoEscalado7 = new ImageIcon(imgEscalada7);
                    img7.setIcon(iconoEscalado7);
                    img7.setBounds(950,180,200,200);
                    break;
                default:
                    break;
            }
        }
        
    }
    
}
