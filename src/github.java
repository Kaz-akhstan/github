import javax.swing.*;
import java.beans.MethodDescriptor;

public class github {
    public static void main(String[] args)
    {
        String antal = JOptionPane.showInputDialog(null, "Hur många tal?");
        int antalInt = Integer.parseInt(antal);
        int[]lista = new int[antalInt];
        String tabell = "";

        for(int i = 0; i<lista.length; i++)
        {
            String nyttTal = JOptionPane.showInputDialog(null, "Ange ett tal");
            lista[i] = Integer.parseInt(nyttTal);
            tabell = tabell + "Index " + i + ": " + lista[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, tabell);
        int Maxvarde = 0;
        int Minvarde = 0;
        float Medvarde = 0;
        for(int j = 0; j<lista.length; j++)
        {
            if(j == 0)
            {
                Minvarde = lista[0];
            }
            if(lista[j] > Maxvarde)
            {
                Maxvarde = lista[j];
            }
            if(lista[j] < Minvarde)
            {
                Minvarde = lista[j];
            }
            Medvarde = Medvarde + lista[j];
        }
        System.out.println(tabell);
        Medvarde = Medvarde/lista.length;
        JOptionPane.showMessageDialog(null, "Maximumvärdet: " + Maxvarde + "\nMinimumvärdet: " + Minvarde + "\nMedelvärdet: " + Medvarde);
    }
}