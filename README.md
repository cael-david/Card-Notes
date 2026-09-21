# 📝 CardNotes
> Um aplicativo desktop moderno e intuitivo de bloco de notas estruturado em cartões (Cards), permitindo aninhamento recursivo de conteúdos, capas personalizadas e organização flexível.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Electron](https://img.shields.io/badge/Electron-47848F?style=for-the-badge&logo=electron&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-07405e?style=for-the-badge&logo=sqlite&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-blue)

---

## 💡 Sobre o Projeto
O **CardNotes** nasceu com o objetivo de oferecer uma experiência de anotações rica e visual. Diferente de blocos de notas tradicionais lineares, ele utiliza o conceito de **Cards**: cada nota possui sua própria identidade visual contendo título, descrição e imagem de capa. Ao acessar um card, o usuário tem acesso a um bloco de texto livre para anotações detalhadas e a uma seção dedicada a **subcards** (que repetem exatamente a mesma estrutura recursivamente), permitindo um aninhamento profundo de ideias, projetos ou estudos.

O projeto combina a robustez e a performance de um backend corporativo em Java com a flexibilidade de interface de uma aplicação desktop multiplataforma empacotada via Electron Forge.

---

## ✨ Funcionalidades
- **Sistema de Cards Visuais:** Crie, edite e organize cards contendo Título, Descrição e Imagem de Capa personalizada.
- **Estrutura Aninhada (Subcards):** Cada card pode conter infinitos subcards dentro de si, mantendo a mesma estrutura hierárquica e modularidade.
- **Bloco de Texto Dedicado:** Área de edição de texto atrelada a cada card para anotações aprofundadas.
- **Arquitetura Desktop Nativa:** Interface moderna construída com tecnologias web, rodando de forma fluida no ambiente desktop.
- **Persistência Local Leve:** Armazenamento de dados rápido, seguro e autossuficiente utilizando SQLite.

---

## 🛠️ Tecnologias Utilizadas
O ecossistema do projeto é dividido entre desktop, backend e banco de dados:

* **Front-end / Desktop:** 
  * [Electron.js](https://www.electronjs.org/) (Interface desktop multiplataforma)
  * [Electron Forge](https://www.electronforge.io/) (Empacotamento e distribuição)
* **Back-end:** 
  * Java 17+
  * [Spring Boot](https://spring.io/projects/spring-boot) (API RESTful e lógica de negócio)
  * Spring Data JPA / Hibernate (Mapeamento objeto-relacional)
  * Maven (Gerenciamento de dependências)
* **Banco de Dados:**
  * [SQLite](https://www.sqlite.org/) (Banco de dados embarcado e local)

---

## ⚙️ Como Rodar o Projeto

Como o aplicativo é empacotado utilizando o **Electron Forge**, você não precisa se preocupar em instalar manualmente o Java ou o Node.js na sua máquina para testá-lo ou executá-lo.

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/CardNotes.git](https://github.com/seu-usuario/CardNotes.git)
   cd CardNotes
