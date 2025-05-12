# 🏭 Factory Method

O **Factory Method** é um padrão de projeto criacional que define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar. Ele delega para as subclasses a responsabilidade de instanciar objetos, promovendo maior flexibilidade e extensibilidade.

---

## 📌 Definição

> **"Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar. O Factory Method permite adiar a instanciação para as subclasses."**  
> — *Design Patterns: Elements of Reusable Object-Oriented Software*

---

## ✅ Quando usar

- Quando uma classe não sabe de antemão qual classe de objetos deve criar.
- Para permitir que subclasses especifiquem os objetos que serão criados.
- Para isolar o código de criação de objetos da lógica principal do programa.
- Quando você quer fornecer extensibilidade ao sistema através de novas "fábricas".

---

## 🧱 Estrutura

```plaintext
Creator (Criador)
├── +factoryMethod(): Product
├── +algumMetodoQueUsaOProduto()
└── - pode conter uma implementação padrão

ConcreteCreator (CriadorConcreto)
└── +factoryMethod(): ProdutoConcreto

Product (Produto)
└── Interface comum para todos os produtos

ConcreteProduct (ProdutoConcreto)
└── Implementação específica do produto
