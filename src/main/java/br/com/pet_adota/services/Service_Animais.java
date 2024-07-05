package br.com.pet_adota.services;

import java.io.IOException;

import br.com.weblivraria.dao.DAOLivro;
import br.com.weblivraria.dominio.Livro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServiceLivro
 */
public class Service_Animais extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Service_Animais() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pagina = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"pt-br\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Animais</title>\r\n"
				+ "\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            margin: 0px;\r\n"
				+ "            padding: 0px;\r\n"
				+ "        }\r\n"
				+ "        /* Bordas,Cores e Fontes da Pagina */\r\n"
				+ "        header {\r\n"
				+ "            background-color: rgb(12, 12, 53);\r\n"
				+ "            color: white;\r\n"
				+ "            font-family: verdana;\r\n"
				+ "        }\r\n"
				+ "        /* Não sei ainda */\r\n"
				+ "        #areausuario {\r\n"
				+ "            height: 100px;\r\n"
				+ "            border-bottom: 1px solid cyan;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "            align-items: center;\r\n"
				+ "\r\n"
				+ "        }\r\n"
				+ "        /* Botão da Barra de Pesquisa */\r\n"
				+ "        #areapesquisa {\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: center;\r\n"
				+ "            align-items: center;\r\n"
				+ "            height: 100px;\r\n"
				+ "            border-bottom: 1px yellow;\r\n"
				+ "        }\r\n"
				+ "        /* Simbolo de GPS do Google Maps */\r\n"
				+ "        #locallocalizacao {\r\n"
				+ "            display: flex;\r\n"
				+ "            height: 100px;\r\n"
				+ "            border-bottom: 1px purple;\r\n"
				+ "        }\r\n"
				+ "        /* Imagem do Simbolo de GPS do Google Maps */\r\n"
				+ "        #locallocalizacao img {\r\n"
				+ "            width: 16px;\r\n"
				+ "            height: 16px;\r\n"
				+ "        }\r\n"
				+ "        /* Icone de Usuario */\r\n"
				+ "        #usuario {\r\n"
				+ "            display: flex;\r\n"
				+ "            height: 100px;\r\n"
				+ "            color: silver !important;\r\n"
				+ "        }\r\n"
				+ "        /* Imagem do Icone de Usuario */\r\n"
				+ "        #usuario img {\r\n"
				+ "            width: 20px;\r\n"
				+ "            height: 20px;\r\n"
				+ "        }\r\n"
				+ "        /* barra de Pesquisa */\r\n"
				+ "        #areapesquisa {\r\n"
				+ "            padding: 20px;\r\n"
				+ "            color: black !important;\r\n"
				+ "            margin-left: auto;\r\n"
				+ "        }\r\n"
				+ "        /* Imagem da barra de Pesquisa */\r\n"
				+ "        #areapesquisa img{\r\n"
				+ "            width: 250px;\r\n"
				+ "            height: 100px;\r\n"
				+ "        }\r\n"
				+ "        /* Carrinho de Compras */\r\n"
				+ "        #carrinho {\r\n"
				+ "            background-color: white;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            color: black !important;\r\n"
				+ "            margin-left: auto;\r\n"
				+ "        }\r\n"
				+ "        /* Imagem do Carrinho de Compras */\r\n"
				+ "        #carrinho img {\r\n"
				+ "            width: 30px;\r\n"
				+ "            height: 30px;\r\n"
				+ "            color: black !important;\r\n"
				+ "        }\r\n"
				+ "        form img{\r\n"
				+ "            width: 16px !important;\r\n"
				+ "            height: 16px !important;\r\n"
				+ "        }\r\n"
				+ "        form {\r\n"
				+ "            background-color: white;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            margin-left: 80px;\r\n"
				+ "            margin-right: 80px;\r\n"
				+ "        }\r\n"
				+ "        input[type=text] {\r\n"
				+ "            width: 700px;\r\n"
				+ "            border: 0px;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            outline: none;\r\n"
				+ "        }\r\n"
				+ "        input[type=\"submit\"] {\r\n"
				+ "            background-color: gold;\r\n"
				+ "            color: white;\r\n"
				+ "            border: 0px;\r\n"
				+ "            font-size: 15px;\r\n"
				+ "        }\r\n"
				+ "        #areamenu {\r\n"
				+ "            padding: 15px;\r\n"
				+ "            text-align: center;\r\n"
				+ "            margin-left: 10px;\r\n"
				+ "            margin-right: 10px;\r\n"
				+ "        }\r\n"
				+ "        #areamenu a:hover {\r\n"
				+ "            color:goldenrod\r\n"
				+ "        }\r\n"
				+ "        footer {\r\n"
				+ "            background-color: rgb(12, 12, 53);\r\n"
				+ "            color: white;\r\n"
				+ "            font-family: verdana;\r\n"
				+ "            padding: 40px;\r\n"
				+ "        }\r\n"
				+ "        #rodape h2 {\r\n"
				+ "            color: gold;\r\n"
				+ "        }\r\n"
				+ "        #rodape {\r\n"
				+ "            line-height: 30px;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "        }\r\n"
				+ "        #footer a{\r\n"
				+ "            color: silver;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "        }\r\n"
				+ "        #contato img{\r\n"
				+ "            width: 18px;\r\n"
				+ "            height: 18px;\r\n"
				+ "        }\r\n"
				+ "        #generos a {\r\n"
				+ "            display: block;\r\n"
				+ "        }\r\n"
				+ "        #generos {\r\n"
				+ "            width: 450px;\r\n"
				+ "        }\r\n"
				+ "        #copy {\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-top: 1px solid slateblue;\r\n"
				+ "        }\r\n"
				+ "        #listalivros {\r\n"
				+ "            display: flex;\r\n"
				+ "            flex-wrap: wrap;\r\n"
				+ "            width: 90%;\r\n"
				+ "            margin-left: auto;\r\n"
				+ "            margin-right: auto;\r\n"
				+ "        }\r\n"
				+ "        .livro {\r\n"
				+ "            width: 30%;\r\n"
				+ "\r\n"
				+ "            border: 1px solid green;\r\n"
				+ "            padding: 10px;\r\n"
				+ "        }\r\n"
				+ "        .livro img {\r\n"
				+ "            width: 100%;\r\n"
				+ "        }\r\n"
				+ "        .livro h4{\r\n"
				+ "            font-family: verdana;\r\n"
				+ "            font-size: 14px;\r\n"
				+ "        }\r\n"
				+ "        .livros p{\r\n"
				+ "            color: red;\r\n"
				+ "            font-size: 15px;\r\n"
				+ "            font-family: verdana;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				
				
				
				
				
				+ "  .detalhe {\r\n"
				+ "    display: flex;\r\n"
				+ "    width: 1000px;\r\n"
				+ "    margin-bottom: auto;\r\n"
				+ "    margin-right: auto;\r\n"
				+ "}\r\n"
				+ ".detalhe img {\r\n"
				+ "    width: 500px;\r\n"
				+ "    height: 600px,\r\n"
				+ "}\r\n"
				+ ".detalhe .item {\r\n"
				+ "    padding: 20px;\r\n"
				+ "}\r\n"
				+ ".detalhe .item h4 {\r\n"
				+ "    font-family: Arial;\r\n"
				+ "    font-size: 20px;\r\n"
				+ "}\r\n"
				+ ".detalhe .item h5 {\r\n"
				+ "    font-size: 20pt;\r\n"
				+ "    font-family: arial;\r\n"
				+ "    margin: 0px;\r\n"
				+ "}\r\n"
				+ ".detalhe .item .sinopse {\r\n"
				+ "    font-size: 11pt;\r\n"
				+ "    font-family: arial;\r\n"
				+ "    line-height: 20pt;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ ".detalhe .item .preco {\r\n"
				+ "    font-family: arial;\r\n"
				+ "    font-size: 20pt;\r\n"
				+ "    font-weight: bold;\r\n"
				+ "    color:blueviolet\r\n"	
				+ "} "
				
				
				
				
				
				+ ".pag {"
				+ "background-color:blue;"
				+ " color:white;"
				+ " padding:15px;"
				+ " text-decoration:none;"
				+ " font-family:arial;"
				+ " font-weight:bold;"
				+ "} </style>\r\n"
				
				
				
				
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "    <header>\r\n"
				+ "        <div id=\"areausuario\">\r\n"
				+ "            <div id=\"locallocalizacao\">\r\n"
				+ "                <img src=\"setinha.png\" alt=\"\">\r\n"
				+ "                localização da loja\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "            <div id=\"usuario\">\r\n"
				+ "                <img src=\"icon.png\" alt=\"\">\r\n"
				+ "                Logar / Cadastrar\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div id=\"areapesquisa\">\r\n"
				+ "            <img src=\"logotipo-renovagraf.png\" alt=\"\">\r\n"
				+ "            <form action=\"ServiceSearch\" method=\"get\">\r\n"
				+ "                <img src=\"lupa.png\" alt=\"\">\r\n"
				+ "                <input type=\"text\" placeholder=\"Pesquise se Livro Aqui\">\r\n"
				+ "                <input type=\"submit\" value=\"BUSCAR\">\r\n"
				+ "            </form>\r\n"
				+ "\r\n"
				+ "            <div id=\"carrinho\"><img src=\"carrinho.png\" alt=\"\">R$ 0,00</div>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div id=\"areamenu\">\r\n"
				+ "            <nav>\r\n"
				+ "                <a href=\"HOME\">HOME</a>\r\n"
				+ "                <a href=\"#\">ROMANCE</a>\r\n"
				+ "                <a href=\"#\">AVENTURA</a>\r\n"
				+ "                <a href=\"#\">TERROR</a>\r\n"
				+ "                <a href=\"#\">FANTASIA</a>\r\n"
				+ "                <a href=\"#\">SUSPENSE</a>\r\n"
				+ "                <a href=\"#\">DRAMA</a>\r\n"
				+ "                <a href=\"#\">AÇAO</a>\r\n"
				+ "            </nav>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </header>\r\n"
				+ "    <content>\r\n"
				+ "        <div id=\"painel\"><img src=\"persona.png\" alt=\"\"></div>\r\n"
				+ "        <h2>Nossos Produtos</h2>\r\n"
				+ "        <div id=\"listalivros\">\r\n"
				;
		
		String Animais_id = request.getParameter("id");
		String conteudo="";
		DAO_Animais d_animais = new DAO_Animais();
		
		Animais liv = new Animais();
		liv.setId_animais(Integer.parseInt(animal_id));
		liv = d_animais.pesquisar(liv);
		
		
			
		
		
		conteudo+= " <div class=\"detalhe\">\r\n"
		+ "                <img src="+liv.getRaca()+" alt=\"\">\r\n"
		+ "                <div class=item> <h4>"+liv.getTitulo()+"</h4>\r\n"
		
		+ "                <h5>"+liv.getGenero()+"</h5>\r\n"
		+ "                <p class=sinopse>"+liv.getDescricao()+"</p>\r\n"
		
				+ "<a href=ServicePagamento?id="+liv.getId_Animais()+" class=pag> Ir para Pagamento</a> </div>\r\n"
		+ "            </div></a>\r\n"
		+ "        </div>\r\n"
		;
		
		
		pagina+=conteudo;


pagina+=  "        </div>\r\n"
		+ "\r\n"
		+ "        \r\n"
		+ "    </content>\r\n"
		+ "    \r\n"
		+ "    <footer>\r\n"
		+ "        <div id=\"rodape\">\r\n"
		+ "            <div id=\"contato\">\r\n"
		+ "                <h2>Nossos Contatos</h2>\r\n"
		+ "                <a href=\"https://wa.me/5511995689958\"><img src=\"whatzap.png\" alt=\"(11) 98565-9867\"></a>\r\n"
		+ "                (11) 98565-9867 | 92478-3564 <br>\r\n"
		+ "                av. Doutor Paulo Roberto,78 - jardim nova - são paulo - SP <br>\r\n"
		+ "                \r\n"
		+ "            </div>\r\n"
		+ "            <div id=\"generos\">\r\n"
		+ "                <h2>Generos</h2>\r\n"
		+ "                <nav>\r\n"
		+ "                    <a href=\"HOME\">HOME</a>\r\n"
		+ "                    <a href=\"#\">ROMANCE</a>\r\n"
		+ "                    <a href=\"#\">AVENTURA</a>\r\n"
		+ "                    <a href=\"#\">TERROR</a>\r\n"
		+ "                    <a href=\"#\">FANTASIA</a>\r\n"
		+ "                    <a href=\"#\">SUSPENSE</a>\r\n"
		+ "                    <a href=\"#\">DRAMA</a>\r\n"
		+ "                    <a href=\"#\">AÇAO</a>\r\n"
		+ "                </nav>\r\n"
		+ "            </div>\r\n"
		+ "                \r\n"
		+ "        </div>\r\n"
		+ "\r\n"
		+ "        <div id=\"copy\">\r\n"
		+ "            ©Copyright-todos os direitos reservados | design by <a href=\"https://github.com/Peterfernandestorres\">Peter Fernandes Torres</a></div>\r\n"
		+ "\r\n"
		+ "    </footer>\r\n"
		+ "    \r\n"
		+ "</body>\r\n"
		+ "</html>";
response.getWriter().append(pagina);

}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Nome = request.getParameter("txt_Nome");
		String genero = request.getParameter("cboGenero");
		String descricao = request.getParameter("txt_Descricao");
		String raca = request.getParameter("txt_Raca");
		
		response.getWriter().append(Nome+" - "+genero);
		
		Animais an = new Animais();
//		passando os dados para o objeto livro(lv)
		an.setNome(Nome);
		an.setGenero(genero);
		an.setDescricao(descricao);
		an.setRaca(raca);
//		Instancia da camadad DAO para efetuar o cadastro do livro
		
		DAO_Animais dv = new DAO_Animais();
		String result = dv.cadastrar(an);
		
		if (result.equals("Cadastrado Com Sucesso")) {
			response.sendRedirect("Confirmacao.html");
		}		
		else {
			response.getWriter().append(result);		
			}
	}
}
