<h1 align="center">Compilador de Objetos Dinâmicos</h1>

<h2>Projeto de compilador, utilizando a ferramenta ANTLR, realizado na Disciplina de Compiladores</h2>

<h2>Grupo:</h2>

<ul> 
  <li>George Siqueira Sercundes</li>
  <li>Adauto de Holanda Barbosa</li>
  <li>Luiz Carlos de França</li>
  <li>Luiz Carlos Oliveira Neves</li>
</ul>

<h2>Sobre</h2>

<p>O objetivo do projeto foi, atráves do uso da ferramenta ANTLR, criar um compilador que realizasse a criação e modificação de objetos de forma dinâmica, similar ao que é feito na linguagem de programação Javascript. 
A gramática criada é de tipagem dinâmica e forte, semelhante à linguagem Python, e permite a criação e modificação de atributos e funções dentro do objeto e também a impressão destes em tela.</p>

<h2>Estrutura do compilador</h2>

<h3>Análise léxica</h3>

<p>Na gramática (arquivo Obj.g4) foram criados tokens para que a ferramenta ANTLR gerasse o analisador léxico. Foram descritos tokens para os tipos da linguagem, para os operadores e também para ignorar espaços em branco, tabulação, retorno de carro e saltos de linha.</p>

<h3>Analise Sintática</h3>

<p>Na gramática foram criadas regras sintáticas para que o ANTLR gere o analisador sintático. As regras permitem inserir no código fonte a criação de objetos, modificação de atributos e funções, chamadas de funções e impressão de expressões. As expressões contemplam valores de todos os tipos (inteiros, booleanos, string e de ponto flutuante), variáveis, operadores entre expressões, grupo de expressões, atributos e valores de retorno de funções. Também foram feitas regras para declaração de variáveis, comandos de atribuição, loop while e seleção if-then-else. Por fim, temos a regras para criação de atributos e funções dentro dos objetos.</p>

<h3>Analise Semântica</h3>

<p>Para a análise semântica foi criada a classe AnalisadorSemantico.java. O analisador semântico irá percorrer a arvore sintática gerada pelo código fonte (arquivo teste.obj) e verificar erros de operações entre tipos incompatíveis, variáveis não declaradas, chamada de atributos e funções inexistentes, criação de atributos e funções já existentes e também a semântica dos comandos while e if. Como a linguagem é de tipagem dinâmica, não há checagem de tipos na declaração de variáveis.</p>

<h3>Geração de código</h3>

<p>Para geração de código foi criada a classe Interpretador.java. O Interpretador também irá percorrer a arvore sintática gerada pelo código fonte para que o compilador realize os comandos que foram descritos. O Interpretador também captura erros em tempo de execução.</p>

<h2>Trabalhando com objetos dinâmicos</h2>

<h3>Objetos e propriedades</h3>

<p>Um objeto tem propriedades associadas a ele. Uma propriedade de um objeto pode ser explicada como uma variável que é ligada ao objeto. Propriedades de objetos são basicamente as mesmas que variáveis normais, exceto pelo fato de estarem ligadas a objetos. As propriedades de um objeto definem as características do objeto. Você acessa as propriedades de um objeto com uma simples notação de ponto:</p>

<div class="highlight"><pre class="highlight c"><code><span class="kt">nomeDoObjeto.nomeDaPropriedade</span></code></pre></div>

<p>O nome do objeto (que poderia ser uma variável normal) e um nome de propriedade diferem em maiúsculas/minúsculas (por exemplo, cor e Cor são propriedades diferentes). Você pode definir uma propriedade atribuindo um valor a ela. Por exemplo, vamos criar um objeto chamado meuCarro e dar a ele propriedades chamadas fabricacao, modelo, e ano, conforme mostrado a seguir:</p>

<div class="highlight"><pre class="highlight c"><code><span class="kt">obj</span> <span class="n">meuCarro</span> <span class="o">=</span> <span class="mi">{ }</span>
<span class="kt">meuCarro.fabricacao</span> <span class="o">=</span> <span class="mi">"Ford"</span>
<span class="kt">meuCarro.modelo</span> <span class="o">=</span> <span class="mi">"Mustang"</span>
<span class="kt">meuCarro.ano</span> <span class="o">=</span> <span class="mi">1969</span></code></pre></div>

<h3>Criando novos objetos</h3>

<p>Você pode criar objetos usando um inicializador de objeto. O uso de inicializadores de objeto é às vezes conhecido como criar objetos com notação literal. A sintaxe para um objeto usando-se um inicializador de objeto é:</p>

<div class="highlight"><pre class="highlight c"><code><span class="kt">obj</span> <span class="n">meuObjeto</span> <span class="o">=</span> <span class="mi">{</span>
<span class="kt">   propriedade_1:</span> <span class="n">valor_1,</span> 
<span class="mi">   2:</span> <span class="mi">valor_1,</span>
<span class="mi">   // ...,</span>
<span class="mi">   "propriedade n":</span> <span class="mi">valor_n</span>
<span class="mi">}</span></code></pre></div>

<h3>Definindo métodos</h3>

<p>Um método é uma função associada a um objeto, ou, simplesmente, um método é uma propriedade de um objeto que é uma função. São exemplos:</p>

<div class="highlight"><pre class="highlight c"><code><span class="kt">obj</span> <span class="n">meuObjeto</span> <span class="o">=</span> <span class="mi">{ </span>
<span class="kt">   meuMetodo(parametros):</span> <span class="n">{</span> 
   <span class="mi">// ...faça algo</span>
<span class="kt">   <span class="mi">}</span>
<span class="mi">}</span></code></pre></div>


<div class="highlight"><pre class="highlight c"><code><span class="kt">meuObjeto.meuMetodo</span> <span class="n">=</span> <span class="o">function()</span> <span class="n">{</span> 
   <span class="mi">// ...faça algo</span>
<span class="kt"><span class="mi">}</span></code></pre></div>

<h2>Executando o compilador</h2>

<p>Para compilar o código fonte teste.obj é so digitar no shell o seguinte comando:</p>

<div class="highlight"><pre class="highlight c"><code><span class="kt">bash compile.sh</span></code></pre></div>

<p>Para compilar outro arquivo de código fonte é necessário alterar a variável "src" na classe Main.java para o arquivo desejado.</p>
