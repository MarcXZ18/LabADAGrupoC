# Ejercicio 5

def textInMark(texto):
    # Dado un string la funcion retorna otro string
    # con las palabras colocadas en un marco
    length = len(texto)
    line1 = ("*")*(length + 2) + "\n"
    line2 = "*" + " "*length + "*\n"
    line3 = "*" + texto + "*\n"

    print(line1 + line2 + line3 + line2 + line1)

texto = 'Hello World!'
val = textInMark(texto)
print(val)
