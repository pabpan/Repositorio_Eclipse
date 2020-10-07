
public class Libro {

	private String titulo_libro;
	private String autor_libro;
	private int num_paginas_libro;
	private String estado_libro;

	public Libro (String titulo_libro, String autor_libro, int num_paginas_libro, String estado_libro) {
		
		this.titulo_libro=titulo_libro;
		this.autor_libro=autor_libro;
		this.num_paginas_libro=num_paginas_libro;
		this.estado_libro=estado_libro;
	}

	public String getTitulo_libro() {
		return titulo_libro;
	}

	public void setTitulo_libro(String titulo_libro) {
		this.titulo_libro = titulo_libro;
	}

	public String getAutor_libro() {
		return autor_libro;
	}

	public void setAutor_libro(String autor_libro) {
		this.autor_libro = autor_libro;
	}

	public int getNum_paginas_libro() {
		return num_paginas_libro;
	}

	public void setNum_paginas_libro(int num_paginas_libro) {
		this.num_paginas_libro = num_paginas_libro;
	}

	public String getEstado_libro() {
		return estado_libro;
	}

	public void setEstado_libro(String estado_libro) {
		this.estado_libro = estado_libro;
	}
	
}
