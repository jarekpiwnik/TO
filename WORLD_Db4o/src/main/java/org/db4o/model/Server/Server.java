package org.db4o.model.Server;

import com.db4o.Db4o;
import com.db4o.ObjectServer;


import static org.db4o.model.other_class.Config.*;

public class Server {
    public static void main(String[] args) {
       // new File(PATH_TO_DB4O_FILE).delete();
        ObjectServer server = Db4o.openServer(PATH_TO_DB4O_FILE, PORT);
        server.grantAccess(USERNAME, PASSWORD);
        System.out.println("Server START ");
        while(true){}
       // server.close();
    }
}
