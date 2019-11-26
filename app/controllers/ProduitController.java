package controllers;

import models.Produit;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class ProduitController extends Controller {
    public Result getProduits(){
        List<Produit> listProduit = Produit.find.all();
        return ok(Json.toJson(listProduit));
    }
}
