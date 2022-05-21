package org.db4o.model.Klient;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import org.db4o.model.other_class.Util;

import static org.db4o.model.other_class.Config.*;

public class Klient {
    public static void main(String[] args) {
       // new File(Util.PATH_TO_DB4O_FILE).delete();
        // accessDb4o();
        //new File(Util.PATH_TO_DB4O_FILE).delete();
        //ObjectContainer db= Db4o.openFile(Util.PATH_TO_DB4O_FILE);
        ObjectContainer db = Db4o.openClient(HOST, PORT, USERNAME, PASSWORD);

        try {
           // storeFirstPilot(db);
           // storeSecondPilot(db);
            retrieveAllPilots(db);
           // retrievePilotByName(db);
           // retrievePilotByExactPoints(db);
            updatePilot(db);
           // deleteFirstPilotByName(db);
           // deleteSecondPilotByName(db);
            //server.close();
        }
        finally {
            db.close();
        }
    }

    public static void accessDb4o() {
        ObjectContainer db=Db4o.openClient(HOST, PORT, USERNAME, PASSWORD);
        try {
            // do something with db4o
        }
        finally {
            db.close();
        }
    }

    public static void storeFirstPilot(ObjectContainer db) {
        Pilot pilot1=new Pilot("Michael Schumacher",100);
        db.store(pilot1);
        System.out.println("Stored "+pilot1);
    }

    public static void storeSecondPilot(ObjectContainer db) {
        Pilot pilot2=new Pilot("Rubens Barrichello",99);
        db.store(pilot2);
        System.out.println("Stored "+pilot2);
    }

    public static void retrieveAllPilotQBE(ObjectContainer db) {
        Pilot proto=new Pilot(null,0);
        ObjectSet result=db.queryByExample(proto);
        Util.listResult(result);
    }

    public static void retrieveAllPilots(ObjectContainer db) {
        ObjectSet result=db.queryByExample(Pilot.class);
        Util.listResult(result);
    }

    public static void retrievePilotByName(ObjectContainer db) {
        Pilot proto=new Pilot("Michael Schumacher",0);
        ObjectSet result=db.queryByExample(proto);
        Util.listResult(result);
    }

    public static void retrievePilotByExactPoints(ObjectContainer db) {
        Pilot proto=new Pilot(null,100);
        ObjectSet result=db.queryByExample(proto);
        // listResult(result);
    }

    public static void updatePilot(ObjectContainer db) {
        ObjectSet result=db.queryByExample(new Pilot("Michael Schumacher",0));
        Pilot found=(Pilot)result.next();
        found.setPoints(11);
        db.store(found);
        // System.out.println("Added 11 points for "+found);
        //retrieveAllPilots(db);
    }

    public static void deleteFirstPilotByName(ObjectContainer db) {
        ObjectSet result=db.queryByExample(new Pilot("Michael Schumacher",0));
        Pilot found=(Pilot)result.next();
        db.delete(found);
        //System.out.println("Deleted "+found);
        //retrieveAllPilots(db);
    }

    public static void deleteSecondPilotByName(ObjectContainer db) {
        ObjectSet result=db.queryByExample(new Pilot("Rubens Barrichello",0));
        Pilot found=(Pilot)result.next();
        db.delete(found);
        // System.out.println("Deleted "+found);
        // retrieveAllPilots(db);
    }
}
