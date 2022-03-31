import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.google.zxing.EncodeHintType;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import qrcode.CreateQrcode;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Janela extends JFrame implements ActionListener  {
 
    
 JLabel texto;
 JTextField campo;
 JButton botao;   
JPanel p, p2;
CreateQrcode qrcode;


public Janela() throws WriterException, IOException{
super("Teste de Qrcode");
setSize(800,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 Container c = getContentPane();
 texto =  new JLabel("Insere o Link para gerar um QRcode"); 
 campo = new JTextField("..");
 botao = new JButton("gerar");
 botao.addActionListener(this);
 c.setLayout(new FlowLayout(FlowLayout.CENTER));
 p = new JPanel();
 p.setLayout(new GridLayout(300,100));
 p.add(texto);
 p.add(campo);
 p.add(botao);
 


p2 = new JPanel();
p2.setLayout(new FlowLayout());

  
                  
      
                  
 
c.add(p);

  setVisible(true);


  

}


@Override
public void actionPerformed(ActionEvent ae) {
  // TODO Auto-generated method stub
  String path = "demo.png";
  String charset = "UTF-8";
     
  Map<EncodeHintType, ErrorCorrectionLevel> hashMap
              = new HashMap<EncodeHintType,
                            ErrorCorrectionLevel>();
   
  
                            hashMap.put(EncodeHintType.ERROR_CORRECTION,
                            ErrorCorrectionLevel.L);
  
                     
                    


                         

  
  
                 
 if(botao == ae.getSource()){
  try {
    CreateQrcode.Createqrcode( campo.getText() , path, charset, hashMap, 200, 200);
  } catch (WriterException | IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }  
 
 
  
 }
}

}
