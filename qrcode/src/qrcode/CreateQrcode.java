package qrcode;

import java.io.File;
import java.io.IOException;

import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;

import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
public class CreateQrcode {
 
    


    public static void Createqrcode(String data,String path,
    String charset, Map hashMap,
    int height, int width)  throws WriterException, IOException{
  

        BitMatrix bitMatrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, width, height);
   
          
  
    MatrixToImageWriter.writeToFile(bitMatrix, path.substring(path.lastIndexOf(".") + 1 ), new File(path));
   
    }


}
