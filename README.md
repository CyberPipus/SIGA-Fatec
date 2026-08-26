# SIGA-Fatec
Aqui se encontrarão os arquivos em Java para o Projeto Integrador interno e fechado à matéria de Técnicas de Programação II.

Na aula 1 referente a este mesmo, nos fora pedido 5 pontos: Analisar a classe Aluno e identificar por escrito o que forá violado do encapsulamento; refatorar com métodos acessores validos ("getters" e "setters"); criar a superclasse Pessoa para derivar Aluno e Professor pela herança; modelar a classe Turma para conter Aluno via composição; e desenhar o diagra ULM das classes.

Já pontuo aqui que não há a presença do arquivo Matricula.java como uma classe devido a ser assunto da Aula 02 e portando fora ignorado, juntamente com a ausênica de instruções claras para o realizar algo com ele para esta atividade.

Com as excessão devidamente adereçada, começamos pela primeiro ponto: o que está violando o encapsulamento da subclasse Aluno? Bom, resumidamente eram os atributos desprovidos de controle de acesso. "public" indica que em qualquer lugar do código posso realizar a requisição e alteração deles, não de uma cópia temporária ou de um resultado isolado. Solução rápida: declarar todos os atributos como "private" (inclusive para os que serão herdados), depois criar acessores com metodoliga válida, tanto "get" quanto "set" e definir um construtor válido para ser utilizado no Main.java.

Segundo ponto: Criando os "get", "set" e construtores válidos. O Main já nos resgata problemas mais específicos devido à ausência de construtores válidos consequente da inexistência de "sets" e "gets" claramente definidos. Defininir como Aluno, Professor, Pessoa, e Turma terão seu objetos construídos pelo Main, mas os construtores estão definidos em cada um deles seguindo os parâmetros definidos por seus "setters". Logo, precisamos defininir estes e como serão resgatados/consultados/descritos pelos "getters" e é aqui que colocamos limitadores, como por exemplo impedir médias negativas ou superiores a 10 para Alunos, invalidar Professores com SIAPE nulos ou vazios, Pessoas com nome também nulos ou vazios e Turmas ausentes de códigos identificadores. Terminado aqui, podemos definir o que os "getters" resgatam das classes com um função que atende à nossa necessidade.

Terceiro ponto: Uma superclasse Pessoa. Superclasse são classe que agregam atributos e métodos comuns às classes que compartilhariam estes, portando tudo, seja atributo, método, construtor, "getter" ou "setter", que se "repete" em Aluno e Professor devem estar nesta classe e precisam ser resgatados pelo método "super()". Usualmente, resgatamos os "setters" e "getters" com "super()", mas também é possível transmitir atributo e outros médotos. Por fim, a superclasse é abstrata aqui porque somente precisamos dela em um nível mecânico, sem a necessidade de se criar uma Pessoa que não seja Aluno ou Professor.

Quarto ponto: Um classe com contenção. Turma contém Alunos, não a subclasse, mas sim os objetos criadados com seu molde, e isto a torna dependente de Aluno, mas não o contrário, pois uma Aluno pode estar no sistema não ter sido deferido a uma Turma. Basicamente quer dizer que criamos uma matriz no formato de lista que organiza estes objetos como itens com atributos, quantidade de itens e posicionamento destes, assim como a possibilidade de escrever uma cópia para alteração, protegendo a lista original.

Quinto ponto: O diagrama ULM de classes. Está em anexo no Teams, não se preocupe.

Para compilar e ler o código, eu recomendo o comando no Terminal "javac -d bin src/siga/*.java >> java -cp bin siga.Main
