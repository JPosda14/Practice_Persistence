package PersistenceTXT;

import PersistenceTXT.Model.a;
import PersistenceTXT.Persistencia.Persistencia;

import javax.swing.*;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    static ArrayList<a> lista_a = new ArrayList<a>();
    public static void main(String[] args) throws IOException {
        try{
            lista_a= Persistencia.load_a();

        }catch (IOException e){
             e.printStackTrace();
        }


            String name= JOptionPane.showInputDialog("Ingrese el nombre de la persona");
            String age= JOptionPane.showInputDialog("Ingrese la edad de la persona");
            String friend= JOptionPane.showInputDialog("Ingrese el nombre del amigo de la persona");
            a a=new a(name,age,friend);
            lista_a.add(a);
            Persistencia.save_a(lista_a);
            show_a(lista_a);
        }

    public static void show_a(ArrayList<a>lista_a){
        for (a b :lista_a){
            System.out.println(b.toString());
        }
    }
}