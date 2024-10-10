package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entidades.Post;
import entidades.coments;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date momento=null;
		try {
			momento= formatter.parse("21/06/2018 13:05:44");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String titulo =" traveling to new zealand ";
		String conteudo ="i'm visinting this beautiful country ";
		int curtidas =12;
		
		Post postagem = new Post(titulo,conteudo,curtidas, momento);
		coments comentario1= new coments("have a nice trip");
		coments comentario2= new coments("wow that's awesome");
		postagem.addcoment(comentario1);
		postagem.addcoment(comentario2);
		
		StringBuilder sb= new StringBuilder();
		sb.append(postagem.getTitulo());
		sb.append(postagem.getNumLikes()).append("-").append(postagem.getMomento());
		sb.append(postagem.getConteudo()).append("\n");
		sb.append("coments: ").append("\n");
		sb.append(postagem.getComentario());
		sb.append(postagem.getComentario().get(0));
		
		System.out.println(sb.toString());
	}

}
