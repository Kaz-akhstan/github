import javax.swing.*;
import java.util.Arrays;

public class github {
    public static void main(String[] args)
    {
        String antal = "";
        int summa = 0;
        antal = JOptionPane.showInputDialog(null, "Hur många tal?");
        int antalInt = Integer.parseInt(antal);

        int[] lista = new int[antalInt];
        for(int i = 1; i <= lista.length; i++)
        {
            antal = JOptionPane.showInputDialog(null, "Ange de " + i + "e numret");
            lista[i] = Integer.parseInt(antal);
        }
    }
}