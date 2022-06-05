import java.io.BufferedReader; 
import java.nio.file.Files; 
import java.nio.file.Paths; 
import java.util.stream.Stream;
import javax.swing.JOptionPane;

import java.util.ArrayList; 
public class lectura{
    public ArrayList<String>funcionPrincipal(String archivo){ 
        ArrayList<String>list_lineas =new ArrayList<>(); 
        try { 
        BufferedReader lector = Files.newBufferedReader(Paths.get(archivo)); 
        Stream<String> lineas = lector.lines(); 
        lineas.flatMap(line -> Stream.of(line.split(" "))) 
            .filter(l->l.contains(" ")) 
            .forEach(list_lineas::add); 
        }catch (Exception e) { 
            JOptionPane.showMessageDialog(null,e); ; 
        }return list_lineas; 
        }
}

