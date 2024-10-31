# **StepWise**

> Um aplicativo Android simples para calcular uma distância percorrida.

## 📱 Descrição

O StepWise é um aplicativo móvel desenvolvido para ajudar os usuários a calcular a distância percorrida com base na quantidade de passos dados. 
Este projeto é ideal para pessoas que desejam monitorar suas atividades físicas, sejam caminhadas ou corridas.

## 🔧 Funcionalidades

- [x] Cálculo de Distância: Insira a quantidade de passos e escolha o tamanho do passo (curto, médio ou longo) para obter uma estimativa da distância percorrida.
- [x] Ajuste para Corrida: O aplicativo permite que os usuários especifiquem se estão correndo, aumentando a distância estimada em 20%.
- [x] Interface Amigável: Com um design simples e intuitivo, o StepWise facilita a interação do usuário, tornando o cálculo de distâncias um processo rápido e eficiente.
- [X] Entrada de Dados: O usuário insere a quantidade de passos em um campo de texto
- [X] Seleção do Tamanho do Passo: O usuário escolhe entre três tamanhos de passo: curto (0.5m), médio (0.75m) ou longo (1m).


## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button**   para executar o app.
- [X] **Checkbox** e **RadioGroup** para seleção de escolha. 

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/App-StepWise.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash

├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/stepwise
│ │ │ │ ├── MainActivity.java # Atividade principal 
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo

 ````
## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade.
 
 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, o usuário insere a quantidade de passos que ele deu, marca se ele estava correndo ou não no Checkbox, e no radioGroup ele seleciona o tamanho da passada dele,
assim apertando o botão irá devolver o resultado em um TextView logo abaixo do botão.
 
![stepwise](https://github.com/user-attachments/assets/98834280-9821-4c48-8362-ad48fa5ca95e)

 
## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença MIT
 
Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).
