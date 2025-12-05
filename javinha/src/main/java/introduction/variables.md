#  Variáveis em Java

Em Java, **variáveis** são espaços na memória usados para armazenar valores. Cada variável possui:

  * Um **tipo** (que define o tipo de dado)
  * Um **nome**
  * Um **valor** (que pode mudar, dependendo do tipo)

A sintaxe básica é:

```java
tipo nome = valor;
```

**Exemplo:**

```java
int idade = 30;
String nome = "Javinha";
```

-----

# 🔤 Tipos de Variáveis

Existem duas categorias principais: **Tipos Primitivos** e **Tipos por Referência**.

## 1\. Tipos Primitivos

São tipos básicos que armazenam valores simples e são extremamente **performáticos**.

| Tipo Primitivo | Descrição | Exemplo |
| :--- | :--- | :--- |
| **byte** | Números inteiros pequenos (-128 a 127) | `byte n = 10;` |
| **short** | Números inteiros médios | `short n = 200;` |
| **int** | Números inteiros padrões | `int idade = 22;` |
| **long** | Números inteiros grandes | `long populacao = 8000000L;` |
| **float** | Número decimal (precisão simples) | `float nota = 9.5f;` |
| **double** | Número decimal (precisão dupla) | `double altura = 1.72;` |
| **char** | Caractere único | `char letra = 'A';` |
| **boolean** | Verdadeiro ou falso | `boolean ativo = true;` |

### Características importantes:

  * Sempre usam **letra minúscula**.
  * São mais **rápidos** e **leves**.
  * **Nunca** podem ser `null`.

## 2\. Tipos por Referência

Esses tipos armazenam **referências** para objetos na memória.

  * **Exemplos:** `String`, Classes criadas pelo programador, e **Wrappers** dos tipos primitivos (`Integer`, `Double`, `Boolean`, etc.).

### Eles:

  * Podem ser **nulos** (`null`).
  * Têm **métodos** (pois são objetos).
  * Começam com **letra maiúscula** (no caso das classes/wrappers).

-----

#  A curiosidade: `boolean` vs `Boolean`

Em Java, **`boolean`** e **`Boolean`** são parecidos no nome, mas funcionam de forma diferente devido às suas categorias (primitivo vs. wrapper/objeto).

| Característica | **`boolean`** (Primitivo) | **`Boolean`** (Classe Wrapper) |
| :--- | :--- | :--- |
| **Valores** | Apenas `true` ou `false` | `true`, `false`, ou **`null`** |
| **Performance** | Mais rápido e ocupa menos memória | Levemente mais lento (por ser objeto) |
| **Uso** | Lógica simples e direta (dois estados) | Quando precisa de três estados ou métodos de objeto |

##  `boolean` (primitivo)

  * Exemplo:
    ```java
    boolean ligado = false; // Só pode ser true ou false
    ```

##  `Boolean` (classe wrapper)

  * **Pode ser `true`, `false` ou `null`**.

  * Possui **métodos** (por ser um objeto).

  * Usado quando você precisa representar um estado **“não definido”**.

  * Exemplo:

    ```java
    Boolean curtida; // Pode ser true, false, ou null
    ```

##  Exemplo prático: sistema de likes do YouTube

O YouTube usa três estados para o feedback do usuário:

1.  **Like**
2.  **Dislike**
3.  **Nenhum dos dois** (neutro/não escolhido)

Se usasse apenas o primitivo `boolean`, só poderia ter dois estados. Por isso, faz mais sentido usar o **Wrapper `Boolean`**:

```java
Boolean likeStatus;
```

  * `true` → deu **like**
  * `false` → deu **dislike**
  * `null` → **não escolheu** (neutro)

Essa é exatamente a utilidade principal do `Boolean` com três estados.

-----

# Resumo Rápido

  * **`boolean`** (primitivo) → **Dois estados** (`true`/`false`), mais rápido, **não pode ser `null`**.
  * **`Boolean`** (Wrapper) → **Três estados** (`true`/`false`/`null`), orientado a objetos, tem métodos.
  * **Tipos primitivos** não podem ser nulos.
  * **Wrappers** podem ser nulos e têm métodos úteis.
