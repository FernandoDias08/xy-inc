#Projeto Rest ZUP


Para construção do projeto foi utilizada a linguagem JAVA, através do Framework Spring.
Para persistência dos dados, foi utilizado o banco H2 (Embarcado), salvando na tabela 'POI'. 
Como servidor de aplicação, será necessário utilizar o servidor Tomcat8 (porta 8080). 
Para execução, importar no Spring Tools Suite e executar como 'Spring Boot App', pois o mesmo já possui o Tomcat embarcado ou então subir o servidor separado e realizar o deploy pelo Maven.

Obs:Para verificar se o Banco está em execução normalmente, executar o projeto e abrir o Browser com o link http://localhost:8080/h2

Para cadastrar os Pontos de Interesse (POIS), subir o Tomcat e enviar a requisição através de qualquer Client Http:


`Salvar POI'S:`
Para cadastrar os POI'S, a ação pode ser realizada via Rest, inserindo o Json:

método POST 
http://localhost:8080/poi

{
	"name" : "Lanchonete",
	"coordX" : 27,
	"coordY" : 12

}

Ou abrir o Browser no endereço 'http://localhost:8080/h2', clicar em 'Connect' e executar o Script abaixo no console:

INSERT INTO POI (NAME, COORDX , COORDY ) VALUES ('Lanchonete', 27, 12);
INSERT INTO POI (NAME, COORDX , COORDY ) VALUES ('Posto', 31, 18);
INSERT INTO POI (NAME, COORDX , COORDY ) VALUES ('Joalheria', 15, 12);
INSERT INTO POI (NAME, COORDX , COORDY ) VALUES ('Floricultura', 19, 21);
INSERT INTO POI (NAME, COORDX , COORDY ) VALUES ('Pub', 12, 8);
INSERT INTO POI (NAME, COORDX , COORDY ) VALUES ('Supermercado', 23, 6);
INSERT INTO POI (NAME, COORDX , COORDY ) VALUES ('Churrascaria', 28, 2);


`Listar POI'S`

método GET
http://localhost:8080/poi


`Buscar POI por proximidade`

método GET 
http://localhost:8080/poi/listByProximity/20/10/10



