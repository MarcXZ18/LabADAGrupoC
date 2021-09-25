# Ejercicio 6

def textInMark(texto, numero):
    # Dado un texto y un numero la funcion imprimira
    # el número de espacios entre el marco y las palabras
    length = len(texto)
    line1 = ("*")*(length+2+2*numero)+"\n"
    line2 = "*" + " "*(2*numero + length) + "*\n"
    line3 = "*" + " "*numero + texto + " "*numero + "*\n"

    imprimir = line1 + numero*line2 + line3 + numero*line2 + line1
    print(imprimir)

texto = 'Hello World!'
numEspacios = 3
val = textInMark(texto, numEspacios)
print(val)