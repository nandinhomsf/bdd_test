# language: pt

Funcionalidade: Verificar Triângulos

  Cenário: Verificar triângulo equilátero
    Dado que tenho os lados a=2, b=2 e c=2
    Quando verifico se é um triângulo
    Entao deve exibir "O triangulo eh equilatero"

  Cenário: Verificar triângulo isósceles
    Dado que tenho os lados a=2, b=2 e c=3
    Quando verifico se é um triângulo
    Entao deve exibir "O triangulo eh isosceles"

  Cenário: Verificar triângulo escaleno
    Dado que tenho os lados a=3, b=4 e c=5
    Quando verifico se é um triângulo
    Entao deve exibir "O triangulo eh escaleno"

  Cenário: Verificar triângulo inválido
    Dado que tenho os lados a=1, b=2 e c=3
    Quando verifico se é um triângulo
    Entao deve exibir "Nao eh um triangulo"

  Cenário: Verificar triângulo com lado de valor zero
    Dado que tenho os lados a=0, b=2 e c=3
    Quando verifico se é um triângulo
    Entao deve exibir "Nao eh um triangulo"

  Cenário: Verificar triângulo com lado de valor negativo
    Dado que tenho os lados a=-1, b=2 e c=3
    Quando verifico se é um triângulo
    Entao deve exibir "Nao eh um triangulo"

  Cenário: Verificar triângulo com todos os lados iguais a zero
    Dado que tenho os lados a=0, b=0 e c=0
    Quando verifico se é um triângulo
    Entao deve exibir "Nao eh um triangulo"