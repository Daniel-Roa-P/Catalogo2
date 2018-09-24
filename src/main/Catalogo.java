package main;

import AbstractFactory.Cliente;
import AbstractFactory.FabricaElfo;
import AbstractFactory.FabricaHumano;
import AbstractFactory.FabricaOrco;
import AbstractFactory.FabricaPersonajes;
import Builder.ConstructorElfo;
import Builder.ConstructorHumano;
import Builder.ConstructorOrco;
import Builder.Director;
import Builder.Personaje;
import Prototype.Diseñador;
import Prototype.PrototipoPersonajes;
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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Catalogo extends JFrame implements ActionListener {

        JButton b=new JButton("Elfo");
        JButton b2=new JButton("Humano");
        JButton b3=new JButton("Orco");
        JButton b4=new JButton("Añadir arma");
        JButton b5=new JButton("Añadir montura");
        JButton b6=new JButton("Añadir escudo");
        JButton b7=new JButton("Imprimir tropas");
        
        JLabel Arma=new JLabel("Arma");
        JLabel Montura=new JLabel("Montura");
        JLabel Aspecto=new JLabel("Aspecto");
        JLabel Escudo=new JLabel("Escudo");
        JLabel Personaje=new JLabel("Personaje");
        
        JLabel Elfos=new JLabel("Elfos:");
        JLabel Humanos=new JLabel("Humanos:");
        JLabel Orcos=new JLabel("Orcos:");
        
        JTextField nElfos=new JTextField("10");
        JTextField nHumanos=new JTextField("10");
        JTextField nOrcos=new JTextField("10");
        
        JLabel img1=new JLabel();
        JLabel img2=new JLabel();
        JLabel img3=new JLabel();
        JLabel img4=new JLabel();
        JLabel img5=new JLabel();
        JLabel img6=new JLabel();
        JLabel img7=new JLabel();
        JLabel img8=new JLabel();
        
        Director D=new Director();
        Personaje P=new Personaje();
        String id;
 
        JPanel jpan;
        
    public static void main(String[] args) {
        
        Catalogo P=new Catalogo();
        P.setSize(1350, 700);
        P.setVisible(true);
    }
    
    public Catalogo(){
        
        Container c=getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(Color.darkGray);

        jpan=new JPanel();
        jpan.setBounds(400, 425, 900, 180);
        jpan.setOpaque(true);
        jpan.setBackground(Color.DARK_GRAY);
        add(jpan);
        
        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(Arma);
        c.add(Montura);
        c.add(Escudo);
        c.add(Aspecto);
        c.add(Personaje);
        c.add(Elfos);
        c.add(Humanos);
        c.add(Orcos);
        c.add(nElfos);
        c.add(nHumanos);
        c.add(nOrcos);
        c.add(img1);
        c.add(img2);
        c.add(img3);
        c.add(img4);
        c.add(img7);
        c.add(img5);
        c.add(img8);
        c.add(img6);
        
        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
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
        b7.setBounds(130, 580, 150, 30);
        b7.setBackground(Color.ORANGE);
        
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
        
        Elfos.setBounds(130, 450, 100, 20);
        Elfos.setForeground(Color.BLACK);
        nElfos.setBounds(250, 450, 100, 20);
        Humanos.setBounds(130, 490, 100, 20);
        Humanos.setForeground(Color.BLACK);
        nHumanos.setBounds(250, 490, 100, 20);
        Orcos.setBounds(130, 530, 100, 20);
        Orcos.setForeground(Color.BLACK);
        nOrcos.setBounds(250, 530, 100, 20);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b){
        
            id="elfo";
            
            FabricaPersonajes factory1 = new FabricaElfo();
            Cliente c = new Cliente(factory1);
            
            D.setConstructor(new ConstructorElfo());
            D.construirPersonaje();
            P=D.getPersonaje();
            
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
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png"))); 
            
        } else if(e.getSource()==b2){
        
            id="humano";
            
            FabricaPersonajes factory2 = new FabricaHumano();
            Cliente c = new Cliente(factory2);
            
            D.setConstructor(new ConstructorHumano());
            D.construirPersonaje();
            P=D.getPersonaje();
            
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
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));

        } else if(e.getSource()==b3){
        
            id="orco";
            
            FabricaPersonajes factory3 = new FabricaOrco();
            Cliente c = new Cliente(factory3);
            
            D.setConstructor(new ConstructorOrco());
            D.construirPersonaje();
            P=D.getPersonaje();
            
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
            
            ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getAspecto()));
            Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(300,330, Image.SCALE_SMOOTH);
            Icon iconoEscalado5 = new ImageIcon(imgEscalada5);
            img5.setBounds(800,100,300,330);
            img5.setIcon(iconoEscalado5);
            
            img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            img8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vacio.png")));
            
        } else if(e.getSource()==b4){
            
            ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getArma()));
            Image imgEscalada6;
            Icon iconoEscalado6;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(850, 110, 130, 130);
                    break;
                case "humano":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(130,130, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(850,130,130,130);
                    break;
                case "orco":
                    imgEscalada6 = imgIcon6.getImage().getScaledInstance(170,170, Image.SCALE_SMOOTH);
                    iconoEscalado6 = new ImageIcon(imgEscalada6);
                    img6.setIcon(iconoEscalado6);
                    img6.setBounds(770,100,170,170);
                    break;
                default:
                    break;
}
            
        } else if(e.getSource()==b5){
            
            ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getMontura()));
            Image imgEscalada8;
            Icon iconoEscalado8;
            
            if(null != id)switch (id) {
                case "elfo":
                    imgEscalada8 = imgIcon8.getImage().getScaledInstance(250,220, Image.SCALE_SMOOTH);
                    iconoEscalado8 = new ImageIcon(imgEscalada8);
                    img8.setIcon(iconoEscalado8);
                    img8.setBounds(1000, 210, 250, 220);
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
            ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/Imagenes/"+P.getEscudo()));
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
        } else if(e.getSource()==b7){
            
            Diseñador dis;
            jpan.setLayout(null);
            jpan.removeAll();
            int elfos=Integer.parseInt(nElfos.getText());
            int humanos=Integer.parseInt(nHumanos.getText());
            int orcos=Integer.parseInt(nOrcos.getText());  
            int n=(elfos+humanos+orcos);
            int j = 0;
            int k = 0;
            JLabel tropas[]=new JLabel[n];
            JLabel armas[]=new JLabel[n];
            JLabel escudos[]=new JLabel[n];
            JLabel monturas[]=new JLabel[n];
            String personaje = null;
            
            for(int i=0;i<n;i++){
                    
                if(i<elfos){
                    personaje="elfo";
                } else if(i>=elfos && i<(elfos+humanos)) {
                    personaje="humano";
                } else if(i>=(elfos+humanos) && i<(n)){
                    personaje="orco";
                }
                
                if(i!=0 && i%13==0){
                        j=j+1;
                        k=0;
                    }
                
                    dis=new Diseñador();
                    PrototipoPersonajes prot;
                    prot=dis.retrievePersonaje(personaje);
                    
                    ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getAspecto()));
                    Image imgEscalada9 = imgIcon9.getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH);
                    Icon iconoEscalado9 = new ImageIcon(imgEscalada9);
                
                    ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getArma()));
                    Image imgEscalada10 = imgIcon10.getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH);
                    Icon iconoEscalado10 = new ImageIcon(imgEscalada10);
                    
                    ImageIcon imgIcon11 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getEscudo()));
                    Image imgEscalada11 = imgIcon11.getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH);
                    Icon iconoEscalado11 = new ImageIcon(imgEscalada11);
                    
                    ImageIcon imgIcon12 = new ImageIcon(getClass().getResource("/Imagenes/"+prot.getMontura()));
                    Image imgEscalada12 = imgIcon12.getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH);
                    Icon iconoEscalado12 = new ImageIcon(imgEscalada12);
                    
                    tropas[i]=new JLabel();
                    tropas[i].setIcon(iconoEscalado9);
                    armas[i]=new JLabel();
                    armas[i].setIcon(iconoEscalado10);
                    escudos[i]=new JLabel();
                    escudos[i].setIcon(iconoEscalado11);
                    monturas[i]=new JLabel();
                    monturas[i].setIcon(iconoEscalado12);
                    
                    jpan.add(escudos[i]);
                    escudos[i].setBounds(37+(k*70), 22+(j*60), 25, 25);
                    jpan.add(tropas[i]);
                    tropas[i].setBounds(0+(k*70), 0+(j*60), 60, 60);
                    jpan.add(monturas[i]);
                    monturas[i].setBounds(40+(k*70), 20+(j*60), 35, 35);
                    jpan.add(armas[i]);
                    armas[i].setBounds(0+(k*70), 5+(j*60), 25, 25);
                    
                    k++;
                    
                jpan.validate();
                jpan.repaint();
                 
            }
                
            
        }
    
    }
}