package resource;

import javafx.beans.property.*;
/**
 * Created by user on 2016-01-18.
 */
public class Data {
    private final StringProperty name;
    private final StringProperty directory;
    private final DoubleProperty x;
    private final DoubleProperty y;

    public Data(String name, String directory){
        this(name, directory, 300, 275);
    }

    public Data(String name, String directory, double x, double y){
        this.name = new SimpleStringProperty(name);
        this.directory = new SimpleStringProperty(directory);
        this.x = new SimpleDoubleProperty(x);
        this.y = new SimpleDoubleProperty(y);
    }

    public StringProperty getNameProperty(){
        return this.name;
    }

    public StringProperty getDirectoryProperty(){
        return this.directory;
    }

    public String getName(){
        return this.name.get();
    }

    public String getDirectory(){
        return this.directory.get();
    }

    public void setX(double x){
        this.x.set(x);
    }

    public void setY(double y){
        this.y.set(y);
    }

    public DoubleProperty getXProperty(){
        return this.x;
    }

    public DoubleProperty getYProperty(){
        return this.y;
    }

    public double getX(){
        return this.x.get();
    }

    public double getY(){
        return this.y.get();
    }
}
