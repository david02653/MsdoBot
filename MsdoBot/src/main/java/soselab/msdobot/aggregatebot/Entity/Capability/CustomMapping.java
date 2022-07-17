package soselab.msdobot.aggregatebot.Entity.Capability;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class CustomMapping {
    public String mappingName;
    public String description;
    public String schema;
//    public ArrayList<Concept> usedConcept;

//    public CustomMapping(){
//        this.usedConcept = new ArrayList<>();
//    }

    @Override
    public String toString(){
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
