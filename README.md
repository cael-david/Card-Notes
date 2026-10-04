Markdown
# 📝 CardNotes
> Um aplicativo desktop moderno e intuitivo de bloco de notas estruturado em cartões (Cards), permitindo aninhamento recursivo de conteúdos, capas personalizadas e organização flexível.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Electron](https://img.shields.io/badge/Electron-47848F?style=for-the-badge&logo=electron&logoColor=white)
![SQLite](https://img.shields.io/badge/SQLite-07405e?style=for-the-badge&logo=sqlite&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-blue)
💡 Sobre o Projeto
O CardNotes nasceu com o objetivo de oferecer uma experiência de anotações rica e visual. Diferente de blocos de notas tradicionais lineares, ele utiliza o conceito de Cards: cada nota possui sua própria identidade visual contendo título, descrição e imagem de capa. Ao acessar um card, o usuário tem acesso a um bloco de texto livre para anotações detalhadas e a uma seção dedicada a subcards (que repetem exatamente a mesma estrutura recursivamente), permitindo um aninhamento profundo de ideias, projetos ou estudos.

O projeto combina a robustez e a performance de um backend corporativo em Java com a flexibilidade de interface de uma aplicação desktop multiplataforma empacotada via Electron Forge.

✨ Funcionalidades
Sistema de Cards Visuais: Crie, edite e organize cards contendo Título, Descrição e Imagem de Capa personalizada.

Estrutura Aninhada (Subcards): Cada card pode conter infinitos subcards dentro de si, mantendo a mesma estrutura hierárquica e modularidade.

Bloco de Texto Dedicado: Área de edição de texto atrelada a cada card para anotações aprofundadas.

Arquitetura Desktop Nativa: Interface moderna construída com tecnologias web, rodando de forma fluida no ambiente desktop.

Persistência Local Leve: Armazenamento de dados rápido, seguro e autossuficiente utilizando SQLite.

🛠️ Tecnologias Utilizadas
O ecossistema do projeto é dividido entre desktop, backend e banco de dados:

Front-end / Desktop:

Electron.js (Interface desktop multiplataforma)

Electron Forge (Empacotamento e distribuição)

HTML, CSS e JavaScript puros (Sem frameworks)

Back-end:

Java 17+

Spring Boot (API RESTful e lógica de negócio)

Spring Data JPA / Hibernate (Mapeamento objeto-relacional)

Maven (Gerenciamento de dependências)

Banco de Dados:

SQLite (Banco de dados embarcado e local)

⚙️ Como Instalar e Rodar o Projeto
Para o usuário final, basta baixar o arquivo .zip empacotado, descompactar e executar o aplicativo diretamente (sem necessidade de instalar Node.js ou Java).

Para desenvolvedores que desejam rodar o código-fonte, siga as instruções abaixo.

Pré-requisitos (Para Desenvolvedores)
Node.js (Versão 18 ou superior)

Git

🚀 Executando em Ambiente de Desenvolvimento
Clone o repositório:

Bash
git clone [https://github.com/seu-usuario/CardNotes.git](https://github.com/seu-usuario/CardNotes.git)
Acesse a pasta do frontend (onde está o projeto Electron):

Bash
cd CardNotes/cardnotes-frontend
Instale as dependências:

Bash
npm install
Inicie o aplicativo:

Bash
npm start
📦 Gerando o Executável (.exe)
O aplicativo utiliza o Electron Forge para empacotamento completo. Para compilar o projeto e gerar a versão de distribuição para Windows:

Certifique-se de estar na pasta cardnotes-frontend.

Execute o comando:

Bash
npm run make
Após a conclusão, os arquivos estarão disponíveis em:

Executável pronto para testar: cardnotes-frontend/out/cardnotes-frontend-win32-x64/

Arquivo .zip distribuível: cardnotes-frontend/out/make/zip/win32/x64/

❓ Solução de Problemas Comuns
Erro ENOENT: Could not read package.json:
Certifique-se de que navegou para dentro da pasta cardnotes-frontend no terminal antes de rodar os comandos npm start ou npm run make.

Problemas ao carregar a interface ou banco de dados em produção:
Verifique se a pasta java-runtime, o backend.jar e o arquivo meubanco.db estão devidamente configurados na tag extraResources do seu package.json para serem incluídos durante o build.
