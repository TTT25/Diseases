package com.example.myapplication;

public class Diseases {
    String nameDiag;
    int tired;
    int hurt;
    int body;
    int breath;
    int anorexia;
    int LostWight;
    int digesting;
    int skin;
    int pregnacy;

    public Diseases(String nameDiag, int tired, int hurt, int body, int breath, int anorexia, int lostWight, int digesting, int skin, int pregnacy) {
        this.nameDiag = nameDiag;
        this.tired = tired;
        this.hurt = hurt;
        this.body = body;
        this.breath = breath;
        this.anorexia = anorexia;
        LostWight = lostWight;
        this.digesting = digesting;
        this.skin = skin;
        this.pregnacy = pregnacy;
    }

    public Diseases(int tired, int hurt, int body, int breath, int anorexia, int lostWight, int digesting, int skin, int pregnacy) {
        this.tired = tired;
        this.hurt = hurt;
        this.body = body;
        this.breath = breath;
        this.anorexia = anorexia;
        LostWight = lostWight;
        this.digesting = digesting;
        this.skin = skin;
        this.pregnacy = pregnacy;
    }
    public Diseases() {

    }

    public String getNameDiag() {
        return nameDiag;
    }

    public void setNameDiag(String nameDiag) {
        this.nameDiag = nameDiag;
    }

    public int getTired() {
        return tired;
    }

    public void setTired(int tired) {
        this.tired = tired;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getAnorexia() {
        return anorexia;
    }

    public void setAnorexia(int anorexia) {
        this.anorexia = anorexia;
    }

    public int getLostWight() {
        return LostWight;
    }

    public void setLostWight(int lostWight) {
        LostWight = lostWight;
    }

    public int getDigesting() {
        return digesting;
    }

    public void setDigesting(int digesting) {
        this.digesting = digesting;
    }

    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    public int getPregnacy() {
        return pregnacy;
    }

    public void setPregnacy(int pregnacy) {
        this.pregnacy = pregnacy;
    }
}
