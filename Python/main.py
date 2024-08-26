while True:
    nomes = [input(f"Digite o nome {i + 1}: ") for i in range(3)]
    if 'Rogerio' in nomes:
        print('Acertou')
        break
    else:
        print('Tente novamente.')

