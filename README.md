Fui submetido a uma avaliação pratica, com objetivo de trabalhar em uma empresa como desenvolvedor Java. O desafio foi concluído e estou deixando a resposta registrada para consulta futura.

Foi desenvolvido um aplicativo em Java que calcula o dígito verificador conforme as regas de formação descrita no documento do desafio.
No desenvolvimento da aplicação foi criado uma classe Principal para a execução do código essa classe chama uma classe auxiliar com nome de "Servico", nela que faz todo o controle da aplicação fazendo a leitura/gravação dos dados nos arquivos txt, calculando o digito validador aplicando as regras para que o aplicativo funcione conforme solicitado.

A IDE utilizada foi o Eclipse: para fazer a importação do projeto vá ao menu File>Import, no diretório General selecione "Existing Projects into Workspace" e pressione Next, selecione o diretório na opção "Select root directory" e precione Finish.

Apos a importação se faz necessário a configuração do caminho dos arquivos txt de entrada e saída. Com o projeto aberto vá em: "matricula>>src/main/java>>constant>>URL.java" nessa classe e configurado o caminho de todos os arquivos txt da aplicação.

Para executar a aplicação clique com o botão direito sobre a classe Principal que fica localizada em: "matricula>>src/main/java>>principal>>Principal.java" va na opção: "Run As>>Java Application" que o programa sera executado.


# Processo seletivo Java.
**Controle de matrícula**

Você deve desenvolver um aplicativo (em C# ou Java) que calcule o dígito verificador para uma série de matrículas da empresa XPTO.
Dada uma matrícula de 0000 a 9999 o cálculo do dígito verificador deverá ser feito multiplicando o primeiro número à esquerda por 5, o segundo por 4, o terceiro por 3 e o quarto por 2. O resultado parcial de cada posição deve ser somado e o resultado final da soma deverá ser dividido por 16. O resto desta divisão deverá ser convertido para hexadecimal, sendo este então o dígito verificador.

Exemplo: Matrícula = 9876

Cálculo:

9 * 5 = 45

8 * 4 = 32

7 * 3 = 21

6 * 2 = 12

Total = 45 + 32 + 21 + 12 = 110


Resto da divisão de 110 por 16 é igual a 14.

O número 14 em base 16 é "E". Este é o dígito verificador da matrícula.

Matrícula completa = 9876-E

Pede-se:
1 - **Ler as matrículas que estão no arquivo matriculasSemDV.txt e gerar um arquivo de saída matriculasComDV.txt com as matrículas completas, conforme regra de formação descrita acima.**

Exemplo:
matriculasSemDV.txt| matriculasComDV.txt|
-------------------|--------------------|
9876               | 9876-E             |
9992               | 9992-0             |                         


2 - **Ler as matrículas que estão no arquivo matriculasParaVerificar.txt e gerar um arquivo matriculasVerificadas.txt com as matrículas e um indicador de "verdadeiro" ou "falso" ao lado de cada matrícula, separado por espaço.**

Exemplo:

| matriculasParaVerificar.txt|  matriculasVerificadas.txt  |
|--|--|
|9876-E|9876-E verdadeiro|
|9992-2|9992-2 falso|

**O que DEVE ser enviado como resultado do desafio:**

1 - Os arquivos de entrada e saída dos tópicos 1 e 2 acima;

2 - O código-fonte da solução; 

3 - Um arquivo Leiame.txt com a descrição da solução e como utilizá-la.

Importante: todos os arquivos devem ser enviados em um único ZIP. Não incluir os arquivos binários (.exe, .jar, .dll) no ZIP pois alguns serviços de e-mail bloqueiam este tipo de arquivo.

Obs.: O desenvolvimento de testes unitários é um ponto positivo.
