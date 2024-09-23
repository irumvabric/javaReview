## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Same notes of the Course 

C'est un concept qui permet de regrouper les données et les méthodes qui manipule ces données au sein d'une meme unite.

Il permet de proteger l'acces direct et de controller la modification de ces données.

public class Banque {
    public String compte;
    private int solde;

    public void demarrer(){
        System.out.println("On y va");
    }
    public int kilometrage(){
        return 14;
    }
}



# heritage

C'est un concept fundamental qui permet a un classe d'heriter des attributs et des methodes d'une classe appele classe de base ou super class.

cela permet de reutilizer le code existant,d'etendre ou de moideifer le comportement d'une classe sans change le code primaire,

Pour declarer l'heritage on utilize le mot extend; 

Pour utilizer la methode de la superclass on utilise le mot cle super;

Example

# Redefinition de methode 

Elle se produit lorsque une sous classe fournie fournie implementation specifique deja define dans la super class;

Cela permet de modifier le comportement d'une methode.

NB: ces deux methodes doivent avoir la meme signature cad : le nom, le type de retour et les parametres;


# Surcharge d'une methode 

Elle se produit lorsque plusieurs methodes dans la meme nom mais avec des signatures differentes

Elle permet de creer plusieurs variants de methodes avec des comportements different en fonctions des arguments en parameter.


# Classe absraite 

C'une classe qui ne peut pas etre instancie directement

Elle est utilizer comme base d'autre classe

# Interface

Elle est utilise pour definer des comportements communs:

Elle fourni uniquement la signature des methodes

Une classe qui implemente une interface doit definer toutes les methodes de cette interface







