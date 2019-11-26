package models;

import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class Produit extends BaseModel {

    public static Finder<Long,Produit> find = new Finder<>(Produit.class);

    private String nom_produit, code_produit;

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public String getCode_produit() {
        return code_produit;
    }

    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }
}
