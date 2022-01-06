<h1 align="center">Compilador de Objetos Dinâmicos</h1>

<h2>Projeto de compilador, utilizando a ferramenta ANTLR, realizado na Disciplina de Compiladores</h2>

## Sobre

O objetivo do projeto foi criar uma gramática e um gerador de código que realizasse a criação e modificação de objetos de forma dinâmica, similar ao que é feito na linguagem de programação Javascript. 
A gramática é de tipagem dinâmica e forte, semelhante à linguagem Python, e permite a criação e modificação de atributos e funções dentro do objeto e também a impressão destes em tela. 

<h2>Trabalhando com objetos em Javascript</h2>

<h3>Objetos e propriedades</h3>

Um objeto em JavaScript tem propriedades associadas a ele. Uma propriedade de um objeto pode ser explicada como uma variável que é ligada ao objeto. Propriedades de objetos são basicamente as mesmas que variáveis normais em JavaScript, exceto pelo fato de estarem ligadas a objetos. As propriedades de um objeto definem as características do objeto. Você acessa as propriedades de um objeto com uma simples notação de ponto:

<div class="highlight"><pre class="highlight c"><code><span class="kt">nomeDoObjeto.nomeDaPropriedade</span></code></pre></div>

Como as variáveis em JavaScript, o nome do objeto (que poderia ser uma variável normal) e um nome de propriedade diferem em maiúsculas/minúsculas (por exemplo, cor e Cor são propriedades diferentes). Você pode definir uma propriedade atribuindo um valor a ela. Por exemplo, vamos criar um objeto chamado meuCarro e dar a ele propriedades chamadas fabricacao, modelo, e ano, conforme mostrado a seguir:

<div class="highlight"><pre class="highlight c"><code><span class="kt">var</span> <span class="n">meuCarro</span> <span class="o">=</span> <span class="mi">{ }</span>
<span class="kt">meuCarro.fabricacao</span> <span class="n">variavel</span> <span class="o">=</span> <span class="mi">"Ford"</span>
<span class="kt">meuCarro.modelo</span> <span class="n">variavel</span> <span class="o">=</span> <span class="mi">"Mustang"</span>
<span class="kt">meuCarro.ano</span> <span class="n">variavel</span> <span class="o">=</span> <span class="mi">1969</span></code></pre></div>

<h3>Criando novos objetos</h3>

Você pode criar objetos usando um inicializador de objeto. O uso de inicializadores de objeto é às vezes conhecido como criar objetos com notação literal. 

A sintaxe para um objeto usando-se um inicializador de objeto é:

<div class="highlight"><pre class="highlight c"><code><span class="kt">var</span> <span class="n">obj</span> <span class="o">=</span> <span class="mi">{</span>
<span class="kt">   propriedade_1:</span> <span class="n">valor_1,</span> 
<span class="mi">   2:</span> <span class="mi">valor_1,</span>
<span class="mi">   // ...,</span>
<span class="mi">   "propriedade n":</span> <span class="mi">valor_n</span>
<span class="mi">}</span></code></pre></div>

<h3>Definindo métodos</h3>

Um método é uma função associada a um objeto, ou, simplesmente, um método é uma propriedade de um objeto que é uma função. São exemplos:

<div class="highlight"><pre class="highlight c"><code><span class="kt">var</span> <span class="n">meuObjeto</span> <span class="o">=</span> <span class="mi">{ </span>
<span class="kt">   meuMetodo(parametros):</span> <span class="n">{</span> 
   <span class="mi">// ...faça algo</span>
<span class="kt">   <span class="mi">}</span>
<span class="mi">}</span></code></pre></div>

<h2>
  <a name="tipagem-din%C3%A2mica" href="#tipagem-din%C3%A2mica" class="anchor">
  </a>
  Sistema de tipos em uma linguagem
</h2>
<p>
Em linguagens de programação, um sistema de tipos é um conjunto de regras que atribuem uma propriedade chamada de tipo para  construções como por exemplo variáveis. 
</p>
<p>
Basicamente, o objetivo de um sistema de tipos é reduzir erros em programas de computador  verificando se este foi excrito de maneira consistente. Essa verificação pode acontecer estaticamente (em tempo de compilação), dinamicamente (em tempo de execução) ou como uma combinação destes.

<h3>
  <a name="tipagem-din%C3%A2mica" href="#tipagem-din%C3%A2mica" class="anchor">
  </a>
  Tipagem estática
</h3>
<p>As Linguagens com tipagem estática não permitem ao desenvolvedor alterar o tipo da variável depois de declarada. Geralmente a verificação de tipo é feita em tempo de compilação. Podemos ver o exemplo abaixo na linguagem Java:.<br>
</p>

<div class="highlight"><pre class="highlight c"><code><span class="kt">int</span> <span class="n">variavel</span> <span class="o">=</span> <span class="mi">4</span><span class="p">;</span>
</code></pre></div>

<p>Neste caso, não podemos alterar o tipo da variável, caso seja necessário fazê-lo devemos criar uma nova variável com um novo tipo de dado que queremos alterar a variável e fazer casting para o novo tipo, mas não fazer a variável <code>variavel</code> receber outro tipo de dado que não seja o que já havia sido definido para ela anteriormente.<br>
</p>

<div class="highlight"><pre class="highlight c"><code><span class="kt">int</span> <span class="n">variavel</span> <span class="o">=</span> <span class="mi">4</span><span class="p">;</span>
<span class="kt">String</span> <span class="n">newVariavel</span> <span class="o">=</span> <span class="p"></span><span class="kt"></span><span class="p"></span> <span class="n">variavel</span>
//error: incompatible types: int cannot be converted to String
<span class="kt">float</span> <span class="n">newVariavel</span> <span class="o">=</span> <span class="p">(</span><span class="kt">float</span><span class="p">)</span> <span class="n">velocity</span><span class="p">;
//no errors</span>
</code></pre></div>

<h3>
  <a name="tipagem-din%C3%A2mica" href="#tipagem-din%C3%A2mica" class="anchor">
  </a>
  Tipagem dinâmica
</h3>

<p>A tipagem dinâmica está ligado a habilidade da linguagem de programação em escolher o tipo de dado de acordo com o valor atribuído à variável em tempo de execução dinamicamente. Veja o exemplo abaixo na linguagem PHP:<br>
</p>

<div class="highlight"><pre class="highlight php"><code><span class="nv">$pessoas</span> <span class="o">=</span> <span class="mi">5</span><span class="p">;</span>
</code></pre></div>

<p>O php já trata a variável com o tipo inteiro sem precisar estar explicito o tipo dela. É possível além disso alterar o valor da variável para outro tipo.<br>
</p>

<div class="highlight"><pre class="highlight php"><code><span class="nv">$pessoas</span> <span class="o">=</span> <span class="mi">5</span><span class="p">;</span>
<span class="nv">$pessoas</span> <span class="o">=</span> <span class="s1">'cinco'</span><span class="p">;
//no errors</span>
</code></pre></div>

<h3>
  <a name="tipagem-fraca" href="#tipagem-fraca" class="anchor">
  </a>
  Tipagem fraca
</h3>

<p>A tipagem fraca está ligada a característica da linguagem de realizar conversões automaticamente entre tipos diferentes de dados. Veja o exemplo abaixo abaixo em Javascript:<br>
</p>

<div class="highlight"><pre class="highlight javascript"><code><span class="kd">const</span> <span class="nx">primeiroNum</span> <span class="o">=</span> <span class="dl">"</span><span class="s2">5</span><span class="dl">"</span>
<span class="kd">const</span> <span class="nx">segundoNum</span> <span class="o">=</span> <span class="mi">5</span>
<span class="nx">console</span><span class="p">.</span><span class="nx">log</span><span class="p">(</span><span class="nx">primeiroNum</span> <span class="o">+</span> <span class="nx">segundoNum</span><span class="p">)</span>
<span class="c1">// 55</span>
</code></pre></div>

<p>Neste caso mesmo o dado <code>segundoNum</code> sendo number ele é convertido para string para que possa fazer a concatenação com a string.</p>

<h3>
  <a name="tipagem-forte" href="#tipagem-forte" class="anchor">
  </a>
  Tipagem forte
</h3>

<p>Linguagens fortemente tipadas não realizam conversões automaticamente. Vamos pegar como exemplo a linguagem Python. Ela possui tipagem forte, se formos executar o exemplo acima em Python teríamos um erro:<br>
</p>

<div class="highlight"><pre class="highlight python"><code><span class="n">primeiroNum</span> <span class="o">=</span> <span class="s">"5"</span>
<span class="n">segundoNum</span> <span class="o">=</span> <span class="mi">5</span>
<span class="k">print</span><span class="p">(</span><span class="n">primeiroNum</span> <span class="o">+</span> <span class="n">segundoNum</span><span class="p">)</span>
<span class="c1"># Traceback (most recent call last):
#  File "&lt;stdin&gt;", line 1, in &lt;module&gt;
# TypeError: can only concatenate str (not "int") to str
</span></code></pre></div>

<p>Como os tipos são bem definidos e a soma entre string e inteiros não é permitida, python lança o erro de que não pode fazer a concatenação desses dados, pedindo que o programador explicite a conversão dos dados. Por exemplo.<br>
</p>

<div class="highlight"><pre class="highlight python"><code><span class="n">primeiroNum</span> <span class="o">=</span> <span class="s">"5"</span>
<span class="n">segundoNum</span> <span class="o">=</span> <span class="mi">5</span>
<span class="k">print</span><span class="p">(</span><span class="nb">int</span><span class="p">(</span><span class="n">primeiroNum</span><span class="p">)</span> <span class="o">+</span> <span class="n">segundoNum</span><span class="p">)</span>
<span class="c1"># 10</span></code></pre></div>

<a name="tipagem-fraca" href="#tipagem-fraca" class="anchor">
</a><h3>
<a name="tipagem-fraca" href="#tipagem-fraca" class="anchor">
</a>Conclusão</h3>


<p>Linguagens estaticamente tipadas têm uma performance de execução melhor, pois durante a execução o código já foi “traduzido” para linguagem máquina e a checagem/tipagem das variáveis já foi feito;

Por outro lado, linguagens dinamicamente tipadas costumam ser mais ágeis durante o desenvolvimento e também são mais flexíveis.

Desse modo, a utilização de uma liguagem com uma certa tipagem depende muito do projeto ao qual se está desenvolvendo o software em questão</p>
