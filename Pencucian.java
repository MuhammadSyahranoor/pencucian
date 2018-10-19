package tugas2;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pencucian extends JFrame 
{
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);    
    JLabel lblno=new JLabel("No Plat");    
    JTextField txno=new JTextField(7);    
    JLabel lbljenis=new JLabel("Jenis Kendaraan");    
    JRadioButton roda2=new JRadioButton("Roda 2");    
    JRadioButton roda4=new JRadioButton("Roda 4");    
    ButtonGroup kelompok=new ButtonGroup();    
    JLabel lblcuci=new JLabel("Pilih Cuci");    
    JCheckBox biasa=new JCheckBox("Cuci Biasa");    
    JCheckBox salju=new JCheckBox("Cuci Salju");    
    JCheckBox wax=new JCheckBox("Cuci Wax");    
    JButton cetak=new JButton("Cetak");    
    JTextArea hasil=new JTextArea(); 
 
   Pencucian()
   {       
       setTitle("Pencucian Kendaraan");
       setLocation(300,100);       
       setSize(300,320);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
   } 
 
   void KomponenVisual()    
   {       
       getContentPane().setLayout(null);
       getContentPane().add(lblnama);       
       lblnama.setBounds(10,10,80,20);       
       getContentPane().add(txnama);       
       txnama.setBounds(125,10,155,20);       
       getContentPane().add(lblno);       
       lblno.setBounds(10,33,175,20);       
       getContentPane().add(txno);       
       txno.setBounds(125,33,95,20);       
       getContentPane().add(lbljenis);       
       lbljenis.setBounds(10,56,100,20);       
       kelompok.add(roda2);       
       kelompok.add(roda4);      
       getContentPane().add(roda2);      
       roda2.setBounds(125,56,70,20);       
       getContentPane().add(roda4); 
       roda4.setBounds(210,56,70,20);       
       getContentPane().add(lblcuci);       
       lblcuci.setBounds(10,80,70,20);       
       getContentPane().add(biasa);       
       biasa.setBounds(125,80,100,20);       
       getContentPane().add(salju);       
       salju.setBounds(125,103,100,20);       
       getContentPane().add(wax);       
       wax.setBounds(125,126,100,20);       
       getContentPane().add(cetak);       
       cetak.setBounds(10,150,270,25);       
       getContentPane().add(hasil);       
       hasil.setBounds(10,180,270,100);       
       setVisible(true);    
   } 
 
   void AksiReaksi()
   {
       cetak.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent e)
            {
                hasil.append(txnama.getText()+"\n");  
                hasil.append(txno.getText()+"\n");            
                if(roda2.isSelected()==true){                
                    hasil.append(roda2.getText()+"\n");            
                }             
                else{                
                    hasil.append(roda4.getText()+"\n");             
                }
                if(biasa.isSelected()==true){               
                    hasil.append(biasa.getText()+"\n");             
                }             
                if(salju.isSelected()==true){  
                    hasil.append(salju.getText()+"\n");             
                }         
                if(wax.isSelected()==true){           
                    hasil.append(wax.getText()+"\n");             
                } 
            }       
       });    
   }
   
   public static void main(String args[])
   {       
       Pencucian p = new Pencucian();       
       p.KomponenVisual();       
       p.AksiReaksi();    
   }
}
