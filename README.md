# Programação Orientada por Objetos 2023/2024

## Ficha de Laboratório 3

### Objetivo

- Introdução à herança de classes

## Programa

Pretende-se desenvolver um protótipo para uma empresa transportadora que possui uma frota de veículos e aviões. Os veículos são utilizados na venda de serviços de fretagem e transporte, pelos quais são cobradas taxas que representam os seus honorários. Esta empresa possui na sua frota um conjunto de veículos de Transporte terrestre e de Transporte aéreo, sendo que os Camiões e Furgonetas são considerados Transportes Terrestres. Para o desenvolvimento deste programa, o repositório contém uma classe `Transporte` e um conjunto de classes de teste para testar as classes a desenvolver nesta ficha.

## Regras de implementação

- Aceitar o assignment do GitHub Classroom
- Clonar o repositório gerado pelo GitHub Classroom
- Utilizar o IDE BlueJ.
- Implementar o código necessário e testar no fim de cada nível.
- **Atualizar a versão do programa no repositório no mínimo no fim de cada nível** (é aconselhado no final de cada funcionalidade implementada e testada com sucesso).
- Use as convenções de codificação adotadas para a linguagem Java (ver **Notas**).

## Implementação

### Nível 1:

1. Aplicando a herança derive da classe `Transport`, as classes `GroundTransportation` e `AirTransportation` para representar um transporte terrestre e um transporte áereo. Têm em consideração que, para além dos atributos que caracterizam um objeto de tipo `Transport`, os objetos das subclasses possuem os seguintes atributos:

  - Para `GroundTransportation`:
    - `licensePlate` ( `String` ) - Atributo com a matrícula do veículo

  - Para `AirTransportation`:
    - `name` ( `String` ) - Atributo para o nome da aeronave;
    - `numberOfContainers` ( `int` ) - Atributo que identifica o número (quantidade) de contentores.

- Considere que os honorários para os transportes terrestres é sempre de `3%` e para os transporte aéreo é de `4%`.

### Nível 2:

- Para a classe `GroundTransportation`:    
  - Acrescente à classe criada o respectivo construtor que recebe por parâmetros a matrícula.
  - Acrescente os métodos seletores e modificadores que julgue serem necessários.

- Para a classe `AirTransportation`:
  - Acrescente à classe criada o respectivo construtor, que recebe por parâmetros o nome do avião e o número de contentores.
  - Acrescente à classe os métodos seletores e modificadores que julgue serem necessários.


### Nível 3:

1. Implemente nas classse `GroundTransportation` e `AirTransportation` o método `getPriceWithFees` que retorne o preço do transporte com a taxa de honorários cobrados.

2. Implemente nas duas sub classes anteriores o método `getTransportType` que devolve uma `String` com a descrição do tipo de transporte.

3. Implemente nas duas sub classes anteriores o método `toString()`, que retorne a informação dos atributos na forma de texto (`String`).
    - Nota: reutilize o método idêntico da super classe.


### Nível 4:

1. Aplicando a herança derive da classe `GroundTransportation` classes para `Lorry` e `Van`, tendo em consideração que cada uma das suas instâncias, para além dos atributos que caracterizam a classe `GroundTransportation`, acrescentam os seguintes atributos:

- Para `Lorry`:
  - `numberOfPallets` ( `int` ) - Atributo com o número de paletes do Camião.
  - `trailers` ( `int` ) - Atributo com o número de atrelados do Camião.

- Para `Van`:
  - `packages` ( `int` ) - Atributo para o número de pacotes que a furgoneta transporta.

2. 

- Para `Lorry`:

  - Acrescente à classe criada o respectivo construtor, que recebe por parametros o número de paletes, número de atrelados e a matricula.
  - Acrescente à classe os métodos seletores e modificadores que julgue serem necessários.
  - Crie o método `toString()` na classe `Lorry` que retorne a informação dos atributos na forma de texto (String).
    - Nota: reutilize o método idêntico desenvolvido no nível 2 para a classe `GroundTransportation`.

- Para `Van`:

  - Acrescente à classe criada o respectivo construtor, que recebe por parametros o número de packages e a matrícula.
  - Acrescente à classe os métodos seletores e modificadores que julgue serem necessários.
  - Crie o método `toString()` na classe `Van` que retorne a informação dos atributos na forma de texto (`String`).
    - Nota: reutilize o método idêntico desenvolvido no nível 2 para a classe `GroundTransportation`.

### Nível 5:

1. Implemente a classe `ShippingCompany` **como uma subclasse** da classe `HashSet<Transport>`. Deve considerar os seguintes atributos:

  - `name` ( `String` ) - Representa o nome da companhia aérea transportadora.
  - `inService` ( `ArrayList<Transport>` ) - guarda os transportes da empresa aérea em serviço

2. Implemente um construtor que recebe por parâmetros o nome da companhia aérea transportadora.
3. Implemente, os metodos seletores que achar necessário.
4. Crie o método `toString()` na classe `ShippingCompany` que retorna a informação dos vários `Transport` guardados na coleção.
5. No programa principal crie uma instância da classe `ShippingCompany` para a empresa com o nome `"RELIABLE-MOVING"`.
  - Depois desta instância criada adicione a esta coleção um objeto `GroundTransportation`, dois objetos `AirTransportation` , um objeto `Lorry` e um objeto `Van`
  - Mostre os transportes criados.

6. Crie o método `makeTransportation` que recebe por parâmetros o `id` do transporte, a origem. o destino e o preço. Caso o `id` exista e o transporte esteja disponível (leia-se, `available=true`) modifica os valores da origem, destino, preço e disponibilidade que fica com o valor `false`. De seguida deverá inserir este transporte no `ArrayList` de transportes em serviço e remove da coleção `ShippingCompany`
  - Nota: É necessário desenvolver alguns métodos auxiliares (por exemplo, `private Transport getTransportation (String id)`)
7. Crie o método `finalizeTransportation` que recebe por parâmetro o `id` do transporte a finalizar. Este método remove o transporte com o respetivo `id` do `ArrayList` com os transportes em utilização.
  - Se possível, ao transporte removido do `ArrayList` deverá de modificar os valores da origem e do destino para `String` vazia, o preço com o valor `0.0` e a disponibilidade com o valor `true`. Após a modificação deverá de inserir o transporte na coleção `ShippingCompany`.

**Notas:**

Para os identificadores siga as convenções adotadas normalmente, em particular:

1. A notação **camelCase** para o nome das variáveis locais e identificadores de atributos e métodos.

2. A notação **PascalCase** para os nomes das classes.

3. Não utilize o símbolo ‘_’, nem abreviaturas nos identificadores.
