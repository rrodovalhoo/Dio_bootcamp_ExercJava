# Dio_bootcamp_ExercJava
PetMachine


🐶 PetMachine - Sistema de Banho para Pets
Este projeto é um simulador de uma máquina de banho automática para animais de estimação, desenvolvido como parte do Bootcamp da DIO. O objetivo principal foi praticar a lógica de programação e os pilares da Programação Orientada a Objetos (POO) em Java.

🛠️ Tecnologias e Conceitos Utilizados
Linguagem: Java ☕

Encapsulamento: Atributos privados e métodos públicos para garantir a segurança dos dados.

Composição: A classe PetMachine interage diretamente com objetos da classe Pet.

Estruturas de Repetição e Condição: Uso de do-while, switch-case e if/else para controlar o fluxo do sistema.

🚿 Funcionalidades
A máquina possui uma lógica de funcionamento realista:

Gestão de Recursos: É necessário monitorar e abastecer os níveis de água 💧 e shampoo 🧴.

Verificação de Segurança: O banho só começa se houver um pet na máquina, se ela estiver limpa e se houver insumos suficientes.

Higiene da Máquina: Se um pet sujo for retirado sem tomar banho, a máquina fica suja e precisa de uma limpeza (wash) antes do próximo uso.

📂 Estrutura do Projeto
O código está dividido em três classes principais:

Pet: Representa o animal (nome e estado de limpeza).

PetMachine: Contém a inteligência e as regras de negócio da máquina.

Main: Interface de usuário via console para interação com o sistema.
