# Respostas Atividade 2

<h3>Questão 1:</h3>
Usar getters e setters é considerado boa prática já que esconde a implementação interna no código (chamado de encapsulamento), tem validação de dados permitindo inserir regras ao mudar valores, flexibilidade futura já que permite o dev poder alterar caso a lógica mude, tem controle de acesso (getter sem setter), sem conmtar que pode adicionar logs ou contadores em acessos e mods. <br><br>
<bold>Exemplo de uso que protege a integridade dos dados:<br>

```
class Pessoa:
    def __init__(self):
        self._idade = 0

    def get_idade(self):
        return self._idade

    def set_idade(self, valor):
        if valor >= 0:
            self._idade = valor
        else:
            print("Idade inválida")

p = Pessoa()
p.set_idade(25)    
p.set_idade(-5)     
print(p.get_idade())
```


<h3>Questão 2:</h3>

a) Consideraria importante as informações (atributos): título, autor, editora, gêneros, quantidade de exemplares, reservado e quantidade de exemplares disponiveis.

b) Podemos considerar ela como uma abstração pois ela representa um conceito do mundo real dentro do código, já que possui atributos e métodos que não necessariamente estão presentes nos livros, mas que fazem sentido no conceito do sistema da biblioteca.

c)
Métodos que fariam sentido:
```
public boolean emprestar()
```
Verifica se tem exemplares disponíveis para o empréstimo e atualiza o estoque se o empréstimo for possível.
````
public void devolver()
````
Atualiza o número do estoque quando um livro for devolvido.
````
public boolean estaDisponivel()
````
Retorna true se houver ao menos um exemplar disponível para empréstimo.