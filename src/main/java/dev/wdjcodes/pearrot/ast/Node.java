package dev.wdjcodes.pearrot.ast;

public abstract class Node {

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
