package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	private String titulo;
	private String conteudo;
	private int numLikes;
	private Date momento;
	private ArrayList<coments> comentario= new ArrayList<>();
	
	public ArrayList<coments> getComentario() {
		return comentario;
	}

	public void setComentario(ArrayList<coments> comentario) {
		this.comentario = comentario;
	}

	public Post(String titulo, String conteudo, int numLikes, Date momento2) {
	
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.numLikes = numLikes;
		this.momento = momento2;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getNumLikes() {
		return numLikes;
	}

	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public void addcoment(coments comentar) {
		comentario.add(comentar);
	}
	
}
