package resource;

import javafx.beans.property.*;
/**
 * Created by user on 2016-01-18.
 */
public class Script extends Data {
    private final StringProperty script;

    public Script(String name, String directory, String contents) {
        super(name, directory);
        this.script = new SimpleStringProperty(contents);
    }

    public void setScript(String script){
        this.script.set(script);
    }

    public StringProperty getScriptProperty(){
        return this.script;
    }

    public String getScript(){
        return this.script.get();
    }
}
