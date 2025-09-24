# Sistema de Gestão de Projetos

Sistema Java simples para gerenciamento de usuários, projetos e equipes.

## Funcionalidades

### 1. Cadastro de Usuários
- Nome completo, CPF, e-mail, cargo, login, senha
- Perfis: Administrador, Gerente, Colaborador

### 2. Cadastro de Projetos  
- Nome, descrição, data início, data término prevista
- Status: Planejado, Em Andamento, Concluído, Cancelado
- Gerente responsável

### 3. Cadastro de Equipes
- Nome, descrição, membros (usuários)
- Uma equipe pode atuar em vários projetos

## Estrutura do Projeto

```
meu-projeto-java/src/
├── Main.java     # Classe principal com exemplos
├── Usuario.java  # Modelo de usuário
├── Projeto.java  # Modelo de projeto
└── Equipe.java   # Modelo de equipe
```

## Como Executar

### Pré-requisitos
- Java JDK 8 ou superior

### Opção 1: Linha de Comando
```cmd
# Navegar para o diretório
cd meu-projeto-java

# Compilar
javac -d . src\*.java

# Executar
java Main
```

### Opção 2: VS Code
1. Instale a extensão "Extension Pack for Java"
2. Abra o arquivo Main.java
3. Clique no botão ▶️ "Run Java"

## Saída Esperada

```
=== SISTEMA DE GESTAO ===

USUARIOS CADASTRADOS:
- Joao Silva (ADMINISTRADOR)
- Maria Santos (GERENTE)
- Pedro Costa (COLABORADOR)

PROJETOS CADASTRADOS:
- Sistema de Vendas - Status: PLANEJADO
  Gerente: Maria Santos

EQUIPES CADASTRADAS:
- Equipe Desenvolvimento
  Membros: 2
  Projetos: 1
```

## Tecnologias

- Java 8+
- LocalDate para datas
- ArrayList para listas