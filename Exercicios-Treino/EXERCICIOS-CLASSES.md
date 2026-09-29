# Exercícios de Classes em Java

20 exercícios + 1 projeto final, do mais simples ao mais completo. A dificuldade sobe a cada nível,
mas **cada exercício é independente**: todas as classes são escritas do zero.

## Como usar

1. **Faça em ordem**, mesmo que o começo pareça fácil. Os primeiros fixam a base que faltou no `Conta.java`.
2. **Crie um pacote para cada exercício**: botão direito em `src` → *New* → *Package* → `ex01`, `ex02`...
   O IntelliJ coloca a linha `package ex01;` sozinho.
3. **Tudo do zero.** Não copie nem importe classes de exercícios anteriores. Se um exercício precisa de uma
   classe parecida com uma que você já fez, escreva de novo.
4. **Teste sempre numa classe separada com `main`** (ex.: `TesteLampada`). Cada exercício tem uma tabela
   *Teste → Resultado esperado*. Se os seus números baterem, está certo.
5. **Terminou um exercício? Manda para o Claude revisar** antes de passar para o próximo.

## Checklist antes de dar um exercício por terminado

Esses foram os erros que mais apareceram no `Conta.java`:

- [ ] Todo método tem **tipo de retorno** (`void`, `double`, `boolean`, `String`...). **Só o construtor não tem.**
- [ ] Método com `return algo`: o tipo do método é o tipo desse `algo`. Método `void` não devolve nada.
- [ ] `=` **guarda** um valor. `==` **compara** dois valores.
- [ ] Na atribuição, a variável fica **à esquerda**: `saldo = saldo - valor;`
- [ ] Código que executa (`if`, contas) fica **dentro de um método ou construtor**, nunca solto na classe.
- [ ] Atributos são `private`. Nomes em camelCase: `valorCheque`, não `Valor_Cheque`.
      Classes começam com maiúscula (`Conta`), métodos e variáveis com minúscula (`sacar`).
- [ ] Rodei o teste e os números bateram.

---

## Nível 1: o básico de uma classe

**Conceitos:** atributos, construtor, métodos `void` × métodos que retornam valor, getters, `this`.

### Ex 01: Lâmpada

Crie a classe `Lampada`:

- atributo `ligada` (`boolean`), que começa desligada
- `ligar()` e `desligar()`, que não retornam nada
- `estaLigada()`, que retorna `boolean`
- `alternar()`: se estiver ligada, desliga; se estiver desligada, liga

| Teste | `estaLigada()` |
|---|---|
| `new Lampada()` | `false` |
| `ligar()` | `true` |
| `alternar()` | `false` |
| `alternar()` | `true` |

> Dica: o `alternar()` cabe numa linha só usando o operador `!` (que inverte um boolean).

### Ex 02: Retângulo

Crie a classe `Retangulo`:

- o construtor recebe `largura` e `altura` (`double`)
- `calcularArea()` e `calcularPerimetro()` retornam `double`
- `ehQuadrado()` retorna `boolean`

| Teste | Área | Perímetro | `ehQuadrado()` |
|---|---|---|---|
| `new Retangulo(4, 5)` | `20.0` | `18.0` | `false` |
| `new Retangulo(3, 3)` | `9.0` | `12.0` | `true` |

### Ex 03: Aluno

Crie a classe `Aluno`:

- o construtor recebe `nome` e três notas (`double`)
- `calcularMedia()` retorna `double`
- `estaAprovado()` retorna `boolean` (média ≥ 7)
- `getSituacao()` retorna `String`: `"Aprovado"` (≥ 7), `"Recuperação"` (≥ 5 e < 7) ou `"Reprovado"` (< 5)
- `getNome()`

| Teste | Média | Situação |
|---|---|---|
| `new Aluno("Ana", 8, 7, 9)` | `8.0` | Aprovado |
| `new Aluno("Bruno", 5, 6, 4)` | `5.0` | Recuperação |
| `new Aluno("Caio", 2, 3, 4)` | `3.0` | Reprovado |

### Ex 04: Contador (dois construtores)

Crie a classe `Contador`:

- `incrementar()`, `decrementar()`, `zerar()` e `getValor()`
- o valor **nunca** fica negativo: decrementar no zero não faz nada
- **dois construtores**: `Contador()` começa em 0, e `Contador(int inicial)` começa no valor informado

| Teste | `getValor()` |
|---|---|
| `new Contador()` | `0` |
| `incrementar()` 3 vezes | `3` |
| `decrementar()` 5 vezes | `0` |
| `new Contador(10)` | `10` |

> Conceito novo: uma classe pode ter **vários construtores**, desde que os parâmetros sejam diferentes.
> Isso se chama **sobrecarga**.

---

## Nível 2: regras dentro da classe (encapsulamento)

**Conceitos:** validar valores, métodos que **recusam** uma operação, retornar `boolean` para dizer se deu certo,
e **não** criar setter quando ele permitiria burlar as regras.

### Ex 05: Cadastro de usuário

Crie a classe `Usuario`:

- o construtor recebe `nome`, `idade` e `email` e **usa os setters** para guardar os valores
- `setNome` recusa nome vazio: imprime um aviso e não altera nada
- `setIdade` recusa idade negativa ou acima de 150
- `setEmail` recusa e-mail sem `@`
- `ehMaiorDeIdade()` retorna `boolean`
- getters para os três atributos

| Teste | Resultado esperado |
|---|---|
| `new Usuario("Dan", 19, "dan@email.com")` | `ehMaiorDeIdade()` → `true` |
| `setIdade(-5)` | aviso na tela, idade continua `19` |
| `setNome("")` | aviso na tela, nome continua `"Dan"` |
| `setEmail("danemail.com")` | aviso na tela, e-mail continua `"dan@email.com"` |
| `setIdade(17)` | `ehMaiorDeIdade()` → `false` |

> Dicas: `texto.isBlank()` diz se a String está vazia ou só tem espaços, e `texto.contains("@")` diz se ela
> tem um `@`.
>
> Para pensar: o que fica guardado se você criar `new Usuario("", -1, "x")`? Teste e tente explicar.

### Ex 06: Produto com estoque

Crie a classe `Produto`:

- o construtor recebe `nome`, `preco` e `quantidade`
- `adicionarEstoque(int qtd)` recusa `qtd` ≤ 0
- `removerEstoque(int qtd)` retorna `boolean`: `true` se conseguiu, `false` se não tinha estoque suficiente
  (nesse caso, não remove nada)
- `valorEmEstoque()` retorna preço × quantidade
- **não crie `setQuantidade`**. Pense no motivo antes de continuar.

| Teste | Resultado esperado |
|---|---|
| `new Produto("Camiseta", 50.0, 10)` | valor em estoque `500.0` |
| `removerEstoque(3)` | `true`, quantidade `7` |
| `removerEstoque(20)` | `false`, quantidade continua `7` |
| `adicionarEstoque(5)` | quantidade `12`, valor em estoque `600.0` |

### Ex 07: Carro

Crie a classe `Carro`, com os atributos `ligado` e `velocidade` (`int`):

- `ligar()`
- `desligar()`: só desliga se estiver parado (velocidade 0)
- `acelerar()`: +10 km/h, no máximo 180, e **só se estiver ligado**
- `frear()`: −10 km/h, no mínimo 0

| Teste | Velocidade | Observação |
|---|---|---|
| `new Carro()` e `acelerar()` | `0` | está desligado |
| `ligar()` e `acelerar()` 3 vezes | `30` | |
| `desligar()` | `30` | recusado, o carro está andando |
| `frear()` 5 vezes | `0` | não fica negativo |
| `desligar()` | `0` | agora desliga |
| `ligar()` e `acelerar()` 20 vezes | `180` | limite máximo |

### Ex 08: Cartão de ônibus

Crie a classe `CartaoOnibus`:

- o construtor recebe o nome do dono, e o saldo começa em 0
- `recarregar(double valor)` recusa valor ≤ 0
- `passarNaCatraca()` retorna `boolean`: cobra a tarifa de **R$ 5,50**, recusa se o saldo não der e conta as viagens
- `getSaldo()` e `getViagens()`
- **Regra extra:** a cada 10 viagens pagas, a próxima é grátis

| Teste (cartão novo) | Resultado esperado |
|---|---|
| `recarregar(20)` | saldo `20.0` |
| `passarNaCatraca()` 3 vezes | saldo `3.5`, viagens `3` |
| `passarNaCatraca()` | `false`, porque 3.5 < 5.5 |

| Teste da regra extra (outro cartão novo) | Resultado esperado |
|---|---|
| `recarregar(100)` e `passarNaCatraca()` 10 vezes | saldo `45.0` |
| `passarNaCatraca()` (11ª viagem) | `true`, saldo continua `45.0` |
| `passarNaCatraca()` (12ª viagem) | saldo `39.5` |

### Ex 09: Celular pré-pago com crédito emergencial

Esse exercício treina o mesmo raciocínio do `Conta.java`, com outra história.

Crie a classe `Celular`:

- o construtor recebe o valor da **primeira recarga**, que vira o saldo
- o **crédito emergencial** (quanto a operadora deixa o saldo ficar negativo) é definido na criação:
  - primeira recarga de até R$ 30 → crédito emergencial de **R$ 10**
  - acima de R$ 30 → **25%** da recarga
- `fazerLigacao(int minutos)` retorna `boolean`: custa **R$ 0,50 por minuto** e só é permitida se o custo couber
  em saldo + crédito emergencial
- `recarregar(double valor)`: recusa valor ≤ 0. Se o saldo estiver negativo, cobra uma **taxa de 10% do valor
  usado** do crédito emergencial, e depois soma a recarga
- `estaUsandoEmergencial()` retorna `boolean`
- `getSaldo()` e `getCreditoEmergencial()`

| Teste | Resultado esperado |
|---|---|
| `new Celular(30)` | crédito emergencial `10.0` |
| `fazerLigacao(70)` | `true` (custo 35), saldo `-5.0`, usando o emergencial = `true` |
| `fazerLigacao(20)` | `false` (custo 10, mas só tem 5 disponível), saldo continua `-5.0` |
| `fazerLigacao(10)` | `true` (custo 5 = exatamente o disponível), saldo `-10.0` |
| `recarregar(50)` | taxa de 10% sobre os 10 usados = 1, saldo `39.0`, usando = `false` |
| `new Celular(100)` | crédito emergencial `25.0` |

---

## Nível 3: objetos que usam outros objetos

**Conceitos:** atributo que é outro objeto, `ArrayList`, percorrer uma lista com `for`,
métodos que recebem e devolvem objetos.

O básico de `ArrayList` que você vai precisar:

```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();   // lista vazia de String
nomes.add("Ana");                              // adiciona
nomes.size();                                  // quantos tem
nomes.remove("Ana");                           // remove
for (String nome : nomes) {                    // passa por cada um
    System.out.println(nome);
}
```

Para guardar objetos de uma classe sua, troque `String` pelo nome da classe: `ArrayList<Jogador>`.

### Ex 10: Time de basquete

Crie duas classes:

- `Jogador`: o construtor recebe `nome`, `pontosTotais` (`int`) e `jogos` (`int`).
  `getMediaDePontos()` retorna `double`. **Se `jogos` for 0, a média é `0.0`** (não divida por zero).
- `Time`: o construtor recebe o nome do time, e a lista de jogadores começa vazia.
  - `adicionarJogador(Jogador j)`
  - `quantidadeDeJogadores()`
  - `getCestinha()` retorna o `Jogador` com a maior média
  - `getMediaDoTime()`: média das médias (time sem jogadores → `0.0`)
  - `getJogadoresAcimaDe(double media)` retorna um `ArrayList<Jogador>`

| Teste | Resultado esperado |
|---|---|
| `new Jogador("Dan", 200, 10)` | média `20.0` |
| `new Jogador("Leo", 95, 10)` | média `9.5` |
| `new Jogador("Rafa", 150, 10)` | média `15.0` |
| Adicionar os três ao time: `quantidadeDeJogadores()` | `3` |
| `getCestinha().getNome()` | `Dan` |
| `getMediaDoTime()` | `14.833...` |
| `getJogadoresAcimaDe(10).size()` | `2` |
| Adicionar `new Jogador("Novato", 0, 0)` | média `0.0`, sem erro |
| `getMediaDoTime()` | `11.125` |

> ⚠️ Em Java, `int / int` descarta os decimais: `95 / 10` dá `9`, não `9.5`. Se a média do Leo sair `9.0`,
> é isso que está acontecendo.

### Ex 11: Biblioteca

Crie duas classes:

- `Livro`: `titulo`, `autor` e `emprestado` (começa `false`)
- `Biblioteca`, com uma lista de livros:
  - `adicionarLivro(Livro l)`
  - `emprestar(String titulo)` retorna `boolean`: `false` se o livro não existe ou já está emprestado
  - `devolver(String titulo)`
  - `listarDisponiveis()`

| Teste | Resultado esperado |
|---|---|
| Adicionar "Dom Casmurro" e "O Hobbit" | |
| `emprestar("O Hobbit")` | `true` |
| `emprestar("O Hobbit")` | `false`, já está emprestado |
| `emprestar("Harry Potter")` | `false`, não existe |
| `listarDisponiveis()` | só Dom Casmurro |
| `devolver("O Hobbit")` e `listarDisponiveis()` | os dois |

> ⚠️ **Compare Strings com `.equals()`, nunca com `==`.** O `==` compara se é o *mesmo objeto na memória*,
> não se o texto é igual. É um dos erros mais comuns em Java.

### Ex 12: Carrinho de compras

Crie três classes:

- `Produto`: `nome` e `preco`
- `ItemCarrinho`: guarda um `Produto` e uma quantidade, e tem `subtotal()`
- `Carrinho`:
  - `adicionar(Produto p, int qtd)`
  - `remover(String nomeDoProduto)`
  - `total()`
  - `aplicarCupom(String codigo)`: `"DESCONTO10"` dá 10% de desconto; qualquer outro código mostra um aviso.
    Só vale um cupom por carrinho.

| Teste | Resultado esperado |
|---|---|
| Camiseta (50.0) × 2 e Tênis (300.0) × 1 | total `400.0` |
| `aplicarCupom("DESCONTO10")` | total `360.0` |
| `aplicarCupom("XYZ")` | aviso, total continua `360.0` |
| `remover("Tênis")` | total `90.0`, o desconto continua valendo |

> **Desafio extra:** dê um estoque ao `Produto` e crie `finalizarCompra()` no carrinho, que tira do estoque a
> quantidade comprada de cada produto. Se algum produto não tiver estoque suficiente, nada é retirado de nenhum.

### Ex 13: Banco

Crie duas classes:

- `Conta`: `numero`, `titular` e `saldo`, sem cheque especial.
  - `depositar(double valor)`
  - `sacar(double valor)` retorna `boolean` e recusa se o saldo não der
- `Banco`, com uma lista de contas:
  - `criarConta(String titular, double depositoInicial)` retorna a `Conta` criada, com número automático
    (1, 2, 3...). Quem controla o próximo número é o `Banco`.
  - `buscarConta(int numero)` retorna a `Conta`, ou `null` se ela não existir
  - `transferir(int origem, int destino, double valor)` retorna `boolean`. Retorna `false` se alguma das contas
    não existir ou se o saque falhar, e **nesse caso nenhum saldo muda**.

| Teste | Resultado esperado |
|---|---|
| `criarConta("Dan", 500)` e `criarConta("Ana", 100)` | números `1` e `2` |
| `transferir(1, 2, 200)` | `true`, saldos `300.0` e `300.0` |
| `transferir(2, 1, 1000)` | `false`, saldos continuam `300.0` e `300.0` |
| `transferir(1, 99, 50)` | `false`, a conta 99 não existe. A conta 1 continua com `300.0` |
| `buscarConta(99)` | `null` |

> Dica: a ordem importa. Confira se as duas contas existem **antes** de sacar.

---

## Nível 4: recursos extras das classes

**Conceitos:** `static`, `toString`, `equals` e `enum`.

### Ex 14: Senhas de atendimento (`static`)

Crie a classe `Senha`, como as senhas de fila de banco ou de hospital:

- o construtor recebe `boolean preferencial`
- cada senha nova recebe um código automático: as normais são `N001`, `N002`, `N003`..., e as preferenciais
  são `P001`, `P002`..., cada tipo com a sua própria contagem
- `getCodigo()`
- `public static int getTotalEmitidas()` e `public static int getTotalPreferenciais()`

| Teste | Resultado esperado |
|---|---|
| `new Senha(false)` | `N001` |
| `new Senha(false)` | `N002` |
| `new Senha(true)` | `P001` |
| `new Senha(false)` | `N003` |
| `Senha.getTotalEmitidas()` | `4` |
| `Senha.getTotalPreferenciais()` | `1` |

> Conceito: um atributo `static` pertence **à classe**, não a cada objeto. Existe um só, compartilhado por todas as
> senhas. Por isso ele consegue contar quantas foram criadas.
>
> Dica: `String.format("N%03d", 1)` gera `"N001"` (número com 3 dígitos e zeros à esquerda).

### Ex 15: Filmes (`toString`)

Crie a classe `Filme`:

- o construtor recebe `titulo`, `ano`, `duracaoEmMinutos` (`int`) e `nota` (`double`)
- `getDuracaoFormatada()` retorna a duração no formato `2h49`
- `toString()`, para que `System.out.println(filme)` mostre tudo numa linha

| Teste | `System.out.println(filme)` |
|---|---|
| `new Filme("Interestelar", 2014, 169, 8.7)` | `Interestelar (2014) - 2h49 - nota 8,7` |
| `new Filme("Up", 2009, 96, 8.3)` | `Up (2009) - 1h36 - nota 8,3` |
| `new Filme("Coringa", 2019, 122, 8.4)` | `Coringa (2019) - 2h02 - nota 8,4` |

> Dicas:
> - Aqui a divisão de `int` é exatamente o que você quer: `169 / 60` dá `2` (horas) e `169 % 60` dá `49`
>   (o resto, que são os minutos).
> - `%02d` escreve o número com 2 dígitos, para sair `2h02` e não `2h2`.
> - `%.1f` escreve com uma casa decimal. No seu Windows em português, ele já usa vírgula.
> - Coloque `@Override` em cima do `toString()`.

### Ex 16: Ponto e `equals`

Crie a classe `Ponto(double x, double y)`:

- `distanciaAte(Ponto outro)` retorna `double`
- implemente `equals` para dois pontos com o mesmo `x` e `y` serem considerados iguais

| Teste | Resultado esperado |
|---|---|
| `new Ponto(0, 0).distanciaAte(new Ponto(3, 4))` | `5.0` |
| `p1 = new Ponto(1, 2)` e `p2 = new Ponto(1, 2)`, `p1 == p2` | `false`. Descubra por quê. |
| `p1.equals(p2)` (depois de implementar) | `true` |

> Dica: `Math.sqrt()` e `Math.pow()`. Relembre o aviso do Ex 11 sobre `==` com objetos.

### Ex 17: Pedido com `enum`

Crie o enum `StatusPedido { ABERTO, PAGO, ENVIADO, ENTREGUE, CANCELADO }` e a classe `Pedido`. Cada método
retorna `boolean`:

- `pagar()`: só funciona se estiver ABERTO
- `enviar()`: só se estiver PAGO
- `entregar()`: só se estiver ENVIADO
- `cancelar()`: só se estiver ABERTO ou PAGO

| Teste | Retorno | Status depois |
|---|---|---|
| `new Pedido()` | | ABERTO |
| `enviar()` | `false` | ABERTO |
| `pagar()` | `true` | PAGO |
| `cancelar()` | `true` | CANCELADO |
| `pagar()` | `false` | CANCELADO |

---

## Nível 5: herança, polimorfismo e interfaces

**Conceitos:** `extends`, `super(...)`, `@Override`, classe abstrata, `interface`, e uma lista que guarda
objetos de tipos diferentes.

### Ex 18: Funcionários (herança)

- `Funcionario(nome, salarioBase)`, com `calcularSalario()` que retorna o salário base
- `Gerente extends Funcionario`: o salário tem **20% de bônus**
- `Estagiario extends Funcionario`: recebe também `horasSemanais`, que não pode passar de 30
  (limite da Lei do Estágio)
- uma `ArrayList<Funcionario>` com os três tipos, e o cálculo da folha total

| Teste | `calcularSalario()` |
|---|---|
| `Funcionario("Ana", 3000)` | `3000.0` |
| `Gerente("Bruno", 5000)` | `6000.0` |
| `Estagiario("Dan", 1500, 30)` | `1500.0` |
| Folha total | `10500.0` |

### Ex 19: Formas geométricas (classe abstrata)

- `abstract class Forma`, com `abstract double calcularArea();`
- `Circulo(raio)`, `Retangulo(largura, altura)` e `Triangulo(base, altura)`, todos com `extends Forma`
- numa `ArrayList<Forma>`: a soma das áreas e a forma de maior área

| Teste | Área |
|---|---|
| `Circulo(1)` | `3.14159...` |
| `Retangulo(4, 5)` | `20.0` |
| `Triangulo(6, 2)` | `6.0` |
| Soma | `29.14159...` |
| Maior | o Retangulo |

> Dica: `Math.PI`. Repare que o `for` chama `calcularArea()` sem saber qual forma é, e cada uma calcula do seu
> jeito. Isso é **polimorfismo**.

### Ex 20: Meios de pagamento (interface)

- `interface MeioDePagamento`, com `boolean pagar(double valor);` e `String getNome();`
- `Pix`: sem taxa
- `Boleto`: taxa fixa de R$ 2,00
- `CartaoDeCredito(double limite)`: recusa se passar do limite, e o limite vai diminuindo
- uma classe `Loja` com `processar(MeioDePagamento meio, double valor)`, que mostra o resultado

| Teste | Resultado esperado |
|---|---|
| Pix, R$ 100 | pago, cobrou `100.0` |
| Boleto, R$ 100 | pago, cobrou `102.0` |
| Cartão com limite 500, R$ 300 | pago, limite restante `200.0` |
| O mesmo cartão, R$ 300 | recusado |

---

## Nível 6: projeto final, sistema da academia

Usa todos os conceitos da lista, com todas as classes escritas do zero.

**Plano** (`enum`), com preço e duração:

| Plano | Preço | Dias |
|---|---|---|
| MENSAL | R$ 100 | 30 |
| TRIMESTRAL | R$ 270 | 90 |
| ANUAL | R$ 960 | 365 |

**AlunoAcademia:** nome, matrícula automática (`static`), plano, dias restantes e quantidade de check-ins.
O plano está vencido quando os dias restantes chegam a 0 ou menos.

**Academia**, com uma lista de alunos:

- `matricular(String nome, Plano plano)` retorna o aluno e soma o preço ao faturamento
- `fazerCheckin(int matricula)` retorna `boolean`: recusa se o plano estiver vencido
- `passarDias(int dias)` simula o tempo: tira os dias de todos os alunos
- `renovar(int matricula, Plano plano)`: o aluno começa um plano novo, com os dias cheios, e o preço entra no
  faturamento
- `relatorio()` mostra os alunos ativos e vencidos, os check-ins de cada um e o faturamento total
- `toString()` no aluno

| Teste | Resultado esperado |
|---|---|
| `matricular("Dan", MENSAL)` e `matricular("Ana", ANUAL)` | matrículas `1` e `2`, faturamento `1060.0` |
| `fazerCheckin(1)` | `true` |
| `passarDias(31)` | Dan vencido, Ana com `334` dias |
| `fazerCheckin(1)` | `false`, plano vencido |
| `fazerCheckin(2)` | `true` |
| `renovar(1, TRIMESTRAL)` | faturamento `1330.0` |
| `fazerCheckin(1)` | `true` |
| `relatorio()` | 2 ativos, 0 vencidos. Check-ins: Dan 2, Ana 1. Faturamento `1330.0` |

> **Desafio extra:** em vez de imprimir avisos quando algo é recusado, lance exceções
> (`throw new IllegalArgumentException("...")`) e trate com `try/catch` no `main`.
