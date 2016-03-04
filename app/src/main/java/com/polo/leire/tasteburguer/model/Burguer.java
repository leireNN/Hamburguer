/**
 * Created by leire.polo.local on 2/3/16.
 */
package com.polo.leire.tasteburguer.model;

import java.util.LinkedList;
import java.util.List;

public class Burguer {
    private String nRestaurante = null;
    private String nTipo = null;
    private int mPhoto = 0;
    private String mCompanyWeb = null;
    private String comentarios = null;

    public Burguer(String nRestaurante, String nTipo, int photo, String web, String companyWeb, String comentarios, int rating) {
        this.nRestaurante = nRestaurante;
        this.nTipo = nTipo;
        mPhoto = photo;
        mCompanyWeb = companyWeb;
        this.comentarios = comentarios;
        mRating = rating;
    }

    private int mRating = 0; // 0 to 5
    private List<String> nComposicion = new LinkedList<>();

    public String getnRestaurante() {
        return nRestaurante;
    }

    public void setnRestaurante(String nRestaurante) {
        this.nRestaurante = nRestaurante;
    }

    public String getnTipo() {
        return nTipo;
    }

    public void setnTipo(String nTipo) {
        this.nTipo = nTipo;
    }

    public int getPhoto() {
        return mPhoto;
    }

    public void setPhoto(int photo) {
        mPhoto = photo;
    }

    public String getCompanyWeb() {
        return mCompanyWeb;
    }

    public void setCompanyWeb(String companyWeb) {
        mCompanyWeb = companyWeb;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getRating() {
        return mRating;
    }

    public void setRating(int rating) {
        mRating = rating;
    }
}
