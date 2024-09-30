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



## heritage

C'est un concept fundamental qui permet a un classe d'heriter des attributs et des methodes d'une classe appele classe de base ou super class.

cela permet de reutilizer le code existant,d'etendre ou de moideifer le comportement d'une classe sans change le code primaire,

Pour declarer l'heritage on utilize le mot extend; 

Pour utilizer la methode de la superclass on utilise le mot cle super;

Example


## Redefinition de methode 

Elle se produit lorsque une sous classe fournie fournie implementation specifique deja define dans la super class;

Cela permet de modifier le comportement d'une methode.

NB: ces deux methodes doivent avoir la meme signature cad : le nom, le type de retour et les parametres;


### Surcharge d'une methode 

Elle se produit lorsque plusieurs methodes dans la meme nom mais avec des signatures differentes

Elle permet de creer plusieurs variants de methodes avec des comportements different en fonctions des arguments en parameter.


## Classe absraite 

C'une classe qui ne peut pas etre instancie directement

Elle est utilizer comme base d'autre classe


## Interface

Elle est utilise pour definer des comportements communs:

Elle fourni uniquement la signature des methodes

Une classe qui implemente une interface doit definer toutes les methodes de cette interface

## Gestion d'exception

C'est un mecanisme qui permet de gerer les erreurs et les situations inatendues qui peuvent subvenir lors de l'excecution d'un programme


Erreur Verifier : c'est une exception que le compilateur exige a gerer soit un bloc : try catch soit en utilisant le mot cle Throws

Erreur Verifier : c'est une exception que qui ne necessite pas une gestion explicite et qui est generalement une erreur de programmation


## Thread

Ils permettent d'executer plusieurs taches simultanement dans un programme

Cela est utile pour les applications qui necessitent des operations de fonds ou des taches qui peuvent s'excecute en parallele comme le traitement des donnes , le UI et la gestion de requetes

Un Thread est la plus petite unite de traitement dans un programme

Chaque Thread possede sa propre pile d'excecution dans un programme et son propre  d'excecution ce qui le permet de 

En java un programme peut avoir plusieurs threads qui s'excecute dans un programme.

Permettant ainsi une Meilleur gestion du systeme.

Fonctionnement : Un Thread peut etre creer en heritant de la classe ou en implementant l'interface (Runnable)

Java fournie des methodes tells que start , join, sleep,interrupt.



# Architecture Client / Serveur

## 1.introduction

## 2.Definition

L'architecturr client serveur est un modele ou le client se connecet au processus du seveur pour fournir un information

Le client est generalement un interface utilisateur qui envoi des requetes 

Tandisque le serveur fourni une reponse

## 3.Types 

On distingue :

### Client leger

Le traitement des donnees se fait principalement sur le serveur 

### Client lourd

Le client gere un pars importante du traitement des donnes reduisant ainsi la charge du serveur

### Architecture 3-tiers

On la separation a trois couche a savoir::
-	Presentation qui represente le client;
- Logique d'application qui represente un serveur intermediare
- Base de données


### Architecture Multi-tiers

: C'est une extention de l'architecture en 3 tiers ajoutant la repartition des charges et la modularite

Le client envoi une requetee via un reseau

> Le serveur recoit la requete traite les information,interroge la base de donnée et génere un réponse , le serveur envoi le resultat au client qui les affiches a l'utilisateur

> Le seveur peu traiter une ou plusieurs connrctions simultanées


## 4.Fonctionnement


## 5.Objectifs

Les principaux objectifs sont: 

### scalabilité 
Il s'agit d'une possibité d'ajouter des clients ou les serveurs sans avoir un impact significatif sur le fonctionnement

### Répartition de charge

IL s'agit d'equilibrer le travail entre plusieurs serveurs pour ameliorer la performance

### Sécurité

IL s'agit de centraliser les données pour mieux controlé les données

## 6.Modélisation

Elle peut etre realiser par des diagrammes UML:

### Diagramme de cas d'utilisation

Il agit de definir les interactions entre clients et serveurs

### Diagramme de frequences

Il s'agit d'illustrer l'ordre des messages echanger entre le client et le serveur

### Diagramme des composants

Il s'agit de visualiser les differentes parti de la structure et leurs relations

## 7.Technologies

Elles sont diverse et adapte pour la mise en place d'une architecture d'un client et serveur :

- Protocole
- Language de programmation
- Base de données 
- Outils de development
- Outils de test
