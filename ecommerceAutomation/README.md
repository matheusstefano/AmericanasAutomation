# Cucumber Com Selenium WebDriver

Comandos: DEVE SER INSTALADO NA MÁQUINA O MAVEN PARA UTILIZAÇÃO DOS COMANDOS (VERSÃO UTILIZADA 3.3.9)
----------
PARA RODAR OS TESTES SEM INSTALAR O MAVEN É SÓ ACESSAR O ARQUIVO RunnerTest E CLICAR NA SETA DE RUN.
 
mvn test = Ao Rodar esse comando no Terminal todos os testes são executados.

mvn test -Dcucumber.options=“--tags @Case1” = Ao Rodar esse comando passando a tag específica de um cenário de testes, será executado somente o teste da tag específica.

mvn cluecumber-report:reporting = Ao Rodar esse comando é gerado o relatório dos últimos testes.

CUCUMBER_OPTIONS='--tags @Case1' mvn test =
Substituir o @Case1 pela tag que queira executar dos seus testes.

# Comando para Rodar os testes no Linux / OS X:
CUCUMBER_OPTIONS='--tags "@smoke and @fast"' mvn test

# Comando Para Rodar os testes no Windows:
set CUCUMBER_OPTIONS='--tags "@smoke and @fast"'
mvn test

# Para gerar o Relatório de testes você vai fazer o seguinte:
- rodar o comando no terminal: mvn test
- Quando você rodar o comando mvn test vai ser executado todos os testes.
- Após executar todos os testes você vai rodar o seguinte comando para gerar o relatório: mvn cluecumber-report:reporting
- Quando você rodar o comando acima do report vai ser gerado um caminho no terminal onde vc vai encontrar o .html do arquivo de relatório.


