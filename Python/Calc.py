print("|Bem-vindo à Pyculadora!|")
max_entries = 20  # Número máximo de entradas

while True:  # Loop principal para executar a calculadora
    valor = None  # Reinicia o valor para o novo cálculo
    operacoes = 0  # Contador de operações realizadas

    while operacoes < max_entries:
        if valor is None:
            try:
                valor = float(input(f"Digite o número {operacoes + 1}: "))  # Solicita o primeiro número
            except ValueError:
                print("Entrada inválida! Por favor, digite um número válido.")
                continue  # Solicita o número novamente
        else:
            while True:  # Loop para garantir que o usuário entre com um operador válido
                operador = input("Digite o operador (+ - * /) ou = para obter o resultado: ").strip()

                if operador in "+-*/":
                    try:
                        numero = float(input("Digite o próximo número: "))  # Solicita o próximo número
                    except ValueError:
                        print("Entrada inválida! Por favor, digite um número válido.")
                        continue  # Solicita o número novamente
                    
                    # Atualiza o valor baseado no operador
                    if operador == "+":
                        valor += numero
                    elif operador == "-":
                        valor -= numero
                    elif operador == "*":
                        valor *= numero
                    elif operador == "/":
                        if numero != 0:
                            valor /= numero
                        else:
                            print("Não é possível dividir por zero")  # Mensagem de erro para divisão por zero
                            continue  # Solicita um novo número e operador
                    operacoes += 1  # Incrementa o contador de operações
                    if operacoes >= max_entries:
                        print(f"Limite de {max_entries} entradas alcançado.")
                        break  # Sai do loop principal
                    break  # Sai do loop de operadores para continuar o processo

                elif operador == "=":
                    print(f"Resultado: {valor:.3f}")  # Exibe o resultado formatado com 3 casas decimais
                    operacoes += 20
                    break  # Sai do loop interno para finalizar o cálculo
                else:
                    print("Digite um operador válido")  # Mensagem de erro para operador inválido
                    continue  # Solicita um novo operador e número

            if operacoes >= max_entries:
                break  # Sai do loop principal após alcançar o limite de entradas

    continuar = input("Deseja fazer outro cálculo? (s/n): ").lower()  # Pergunta ao usuário se deseja fazer outro cálculo
    if continuar != 's':
        break  # Sai do loop principal se o usuário digitar qualquer coisa diferente de 's'

print("Calculadora encerrada. Obrigado por usar!")
