package PersistenciaTXT.Persistencia;

import PersistenciaTXT.Persistencia.Model.a;

import java.io.*;
import java.util.ArrayList;

public class Persistencia {
    public static final String RUTA_ARCHIVO_CLIENTES = "src/PersistenciaTXT/resources/a.txt";
    public static void guardar_a(ArrayList<a> lista_a) throws IOException {

        String contenido = "";

        for(a a: lista_a) {

            contenido+= a.getName()+"@"+a.getAge()+"@"+a.getFriend()+ "\n";
        }
        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_CLIENTES, contenido, false);
    }

    public static ArrayList<a> cargarClientes() throws FileNotFoundException, IOException {

        ArrayList<a> clientes = new ArrayList<a>();

        ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_CLIENTES);
        String line = "";

        for (int i = 0;i<contenido.size(); i++) {
            a mia = new a();
            line = contenido.get(i);

            mia.setName(line.split("@")[0]);
            mia.setAge(line.split("@")[1]);
            mia.setFriend(line.split("@")[2]);


            clientes.add(mia);
        }

        return clientes;
    }
}
