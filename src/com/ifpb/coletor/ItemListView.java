package com.ifpb.coletor;

public class ItemListView {

	private int id;
	
    private String texto;

    private int iconeRid;

    public ItemListView() {

    }
 
    public ItemListView(int id, String texto, int iconeRid) {
    	
    	this.id = id;
    	
        this.texto = texto;

        this.iconeRid = iconeRid;

    }

    public int getIconeRid() {

        return iconeRid;

    }

    public void setIconeRid(int iconeRid) {

        this.iconeRid = iconeRid;

    }
    
    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getTexto() {

        return texto;

    }

    public void setTexto(String texto) {

        this.texto = texto;

    }

}
