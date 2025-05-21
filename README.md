# CalculadoraAlturaPredio
Projeto desenvolvido como parte da avaliação da disciplina de Física na Universidade Estadual do Paraná (UNESPAR).

Este projeto é uma aplicação Java com interface gráfica (Swing) que calcula a altura aproximada de um edifício com base em dados observacionais e conceitos de cinemática da física. O cálculo é feito a partir do tempo que um objeto leva para atravessar uma janela e continuar caindo até o solo.

Funcionalidades:
•  Interface gráfica simples e funcional.
•  Permite a entrada de:
•    Altura da janela (em metros).
•    Tempo para atravessar a janela (em segundos).
•    Tempo de queda abaixo da janela (em segundos).
•    Valor da aceleração da gravidade (em m/s²).
•  Cálculo automático da altura total do edifício.
•  Exibição clara do resultado.
•  Tratamento de entradas inválidas com mensagens de erro.

Lógica de Cálculo:
  A altura do edifício é calculada com base em três etapas da queda livre:
    1. Altura antes da janela: estimada a partir da velocidade média ao passar pela janela e do tempo de aceleração anterior.
    2. Altura da janela: fornecida diretamente pelo usuário.
    3. Altura após a janela: calculada com base no tempo restante de queda e na velocidade ao sair da janela.
As equações utilizadas são baseadas no movimento uniformemente acelerado, considerando aceleração constante (gravidade) e ausência de resistência do ar.

Tecnologias Utilizadas
• Java (versão 8 ou superior)
• Swing (API para criação de interfaces gráficas)
