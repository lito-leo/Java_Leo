#revue 3u - python


#constantes

BEAUTIFUL = "~~~~~~~~~~~~~"
TITRE = "Menu Alimentaire"

options = [
	"pomme", 
	"biscuit", 
	"chocolat", 
    "pizza", 
    "[q]uitter"
	]

#fonctions sur mesure
#logique de l'application
#afficher le menu

on_demande = True
while on_demande :
    print(BEAUTIFUL + TITRE + BEAUTIFUL)  
    print()

    for i in range(0, len(options)) :
	    print(f"{i} - {options[i]}")

#prendre le choix de l'utilisateur
    choix_valide = False
    while not choix_valide :
        choix = input("Q'aimerais tu commander? ").lower()
        if choix.isdigit() :
            if int(choix) in range(0, len(options)) : 
                choix_valide = True
        elif choix in options :
            choix_valide = True
        else:
            print("\tchoix invalide")


#saisir le choix et voir si le choix est valide
    #possible answers
    if choix == "pizza" or choix == "3":
        print("3$")

    elif choix == "biscuit" or choix == "1":
        print("1$")

    elif choix == "chocolat" or choix == "2":
        print("1$")

    elif choix == "pomme" or choix == "0":
        print("2$")

    elif choix == "quitter" or choix == "q" or choix == "4":
        on_demande = False
    
    else:
        print("Je n'ai pas mis cette option.")

#enfin...?



#encore...?
