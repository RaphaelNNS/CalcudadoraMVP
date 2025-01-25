
---

# **CalculadoraMVP**

Uma calculadora funcional desenvolvida para Android com o objetivo de praticar e implementar a arquitetura **MVP (Model-View-Presenter)**. Este projeto é uma evolução do [CalculadoraMVC](https://github.com/RaphaelNNS/CalculadoraMVC.git), com a arquitetura ajustada para maior desacoplamento e testabilidade.

---

## **📋 Sobre o Projeto**

O objetivo principal deste projeto foi consolidar os conceitos da arquitetura **MVP**, que oferece uma separação clara entre as camadas de lógica de negócio, interface do usuário e comunicação entre elas. O projeto permite realizar operações matemáticas básicas, além de avaliar expressões mais complexas.

---

## **🛠️ Arquitetura MVP**

A estrutura segue o padrão **Model-View-Presenter**:
- **Model**: Contém a lógica de negócios e manipulação de dados, incluindo a avaliação de expressões matemáticas.
- **View**: Gerencia a interface do usuário, exibindo informações e capturando as interações do usuário.
- **Presenter**: Atua como intermediário entre o Model e a View, processando as interações do usuário e atualizando a interface conforme necessário.

---

## **🎨 Funcionalidades**

- Realiza operações matemáticas básicas: soma, subtração, multiplicação e divisão.
- Suporte a expressões mais complexas, como `(5 + 3) * 2`.
- Interface simples, responsiva e amigável.
- Tratamento de erros para expressões inválidas.

---

## **🚀 Tecnologias Utilizadas**

- **Kotlin**: Linguagem principal para o desenvolvimento.
- **Android Studio**: Ambiente de desenvolvimento integrado.
- **Biblioteca EvalEx**: Para avaliação de expressões matemáticas.

---

## **📂 Estrutura do Projeto**

```plaintext
CalculadoraMVP/
├── model/
│   └── Calculadora.kt        # Lógica de negócios
├── presenter/
│   └── MainPresenter.kt      # Comunicação entre Model e View
├── view/
│   └── MainActivity.kt       # Interface do usuário
├── resources/
│   └── layout/
│       └── activity_main.xml # Layout da aplicação
└── AndroidManifest.xml
```

---

## **📦 Como Executar**

1. Clone este repositório:
   ```bash
   git clone https://github.com/SeuUsuario/CalculadoraMVP.git
   ```

2. Abra o projeto no **Android Studio**.

3. Sincronize o Gradle e compile o projeto.

4. Execute o aplicativo em um dispositivo ou emulador Android.

---

## **📢 Contribuições**

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com sugestões, correções e melhorias.

---

## **🔗 Referências**

- [CalculadoraMVC](https://github.com/RaphaelNNS/CalculadoraMVC.git): Projeto original que inspirou esta aplicação.

--- 
