package PersistenceTXT.Persistencia;

import PersistenceTXT.Model.a;

import java.io.*;
import java.util.ArrayList;

public class Persistencia {
    public static final String RUTA_ARCHIVO_CLIENTES = "src/PersistenceTXT/Resources/a.txt";
    public static void save_a(ArrayList<a> lista_a) throws IOException {

        String contenido = "";

        for(a a: lista_a) {

            contenido+= a.getName()+"/"+a.getAge()+"/"+a.getFriend()+ "\n";
        }
        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_CLIENTES, contenido, false);
    }

    public static ArrayList<a> load_a() throws FileNotFoundException, IOException {

        ArrayList<a> as = new ArrayList<a>();

        ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_CLIENTES);
        String line = "";

        for (int i = 0;i<contenido.size(); i++) {
            a mia = new a();
            line = contenido.get(i);

            mia.setName(line.split("/")[0]);
            mia.setAge(line.split("/")[1]);
            mia.setFriend(line.split("/")[2]);


            as.add(mia);
        }

        return as;
    }
}
