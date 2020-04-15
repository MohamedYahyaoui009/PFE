package com.SeQuorStudent.demo.model;

public class EnseignantModulePK
{
    private long id_enseignant;


    private long id_module;


    public EnseignantModulePK()
    {

    }

    public long getId_enseignant() {
        return id_enseignant;
    }

    public void setId_enseignant(long id_enseignant) {
        this.id_enseignant = id_enseignant;
    }

    public long getId_module() {
        return id_module;
    }

    public void setId_module(long id_module) {
        this.id_module = id_module;
    }

    @Override
    public String toString() {
        return "EnseignantModuleFK{" +
                "id_enseignant=" + id_enseignant +
                ", id_module=" + id_module +
                '}';
    }
}

