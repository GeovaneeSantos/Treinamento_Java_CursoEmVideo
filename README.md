# Treinamento_Java_CursoEmVideo
## Códigos feitos durante o curso Java básico do Curso em Vídeo
Esses códigos foram **"problemas"** propostos pelo professor Gustavo Guanabara durante o curso de Java básico</br>
Aqui tenho desde apps Java muito simples com saída pelo terminal até alguns mais avançados que usam JavaSwing, POO e conceitos mais "complicadinhos"
</br>
### **Os destaques são:**
</br>

## HelloWorld 

Aqui foi meu primeiro código Java, aprendi e apliquei conceitos sobre variáveis, atribuições e compreendi a estrutura de um código nativo da linguagem Java.
</br>

## [EquacaoSegundoGrau](EquacaoSegundoGrau/src/cursoemvideo/TelaEquacao.java/)

* Fiz um app com interface gráfica para resolver uma função afim e retornar o valor de delta (Foi uma aplicação prática dos recursos <ins>getter()</ins> e <ins>setter()</ins> do Java)
</br>
Essas funções permitem alterar ou recuperar dados de um elemento. O maior desafio aqui foi manipular esses dados, pois certos elementos só funcionam com um determinado tipo de dado, labels por exemplo exibem strings, então para exibir o resultado do cálculo foi necessário o uso de funções de conversão (Integer.parseInt() e toString()) e variáveis para receberem e trabalhar os dados obtidos desses campos. Aprendi também alguns recursos do construtor do Java, que é o método usado para iniciar os componentes do sistema, o painel de resultados inicia invisível e ao clicá-lo para calcular ele chama a função setVisible(), que permite tornar um item visível ou não por meio de seu valor lógico.
</br>

## [ProjetoTriangulo](ProjetoTriangulo/src/classes/TelaTriangulo.java/)

* Aqui eu fiz um app que verifica se há ou não a capacidade do polígono ser triângulo, se a soma de dois lados for sempre maior que o terceiro lado, então há a capacidade desse polígono ser um triângulo. Essa lógica foi transcrita em Java e usei a biblioteca Swing para criar uma interface interativa e simples. Além disso, o app também diferencia os triângulos sendo capaz de classificá-los como (Escaleno, Equilátero ou Isósceles). 
</br>

## [TesteFuncao01](TesteFuncao01/src/testefuncao01/TesteFuncao01.java/) e [TesteFuncao02](TesteFuncao02/src/testefuncao02/TesteFuncao02.java/) 

* Esses dois projetos introduzem os conceitos de POO de uma maneira um pouco mais sólida, no qual eu crio uma classe chamada Fatorial() e assim posso usá-la em todo meu código, sem a necessidade de reescrevê-la. Dentro dela eu crio as variáveis num (Número a ser fatorado) e fat (Resultado da fatoração) com atributo private, encapsulando assim todo o cálculo feito. Criei as funções setValor() no qual o parâmetro introduzido nele será usado para a fatoração, getFatorial() que retorna o resultado e getFormula() que retorna toda a extensão da fórmula resultante da fatoração. Foi um pouco desafiador entender esses conceitos, mas por compreender a importância deles eu me esforcei e fui capaz de usá-los aqui.
</br>

## [Projeto Vetor](JavaApplication37/src/Classes/telaVetor.java/)

* Aqui eu uni todos os conhecimentos básicos (variáveis primitivas, arrays, interface gráfica com JavaSwing, Wrapper Classes, Java methods e aplicação prática dos recursos de Programação Orientada a Objeto). Esse app permite que o usuário insira, exclua e ordene um array. Esse projeto parece simples porque ele realmente é, a lógica usada nele pode ser adaptada e aplicada em outros tipos de problemas como um gerenciador de tarefas, gerenciamento de estoque, pessoas, recursos, valores etc.
</br>
Foi extremamente gratificante concluir esse treinamento e com toda certeza darei seguimento nas boas práticas e conhecimentos obtidos.
</br>
Valorizei os comentários pois eles, além de facilitarem a compreensão do código, tornam mais fácil sua manutenção e futura escalabilidade.
</br>
Busquei aplicar as boas práticas e construir códigos limpos (no início nem tanto, mas nos projetos mais avançados sim).
</br>
