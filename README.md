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

# Chap 3 : Les sockets

## 1.Definition

ce sont des interfaces qui permette aux programmes de communiquer entre eux

Il s'agit d un ppoint de connnection permettant l'echange des donnees entre euX

Il existe deux types:

### - Sochet de flux (Stream socket)
Il utilise le protocol `TCP` pour assurer une communication fiable et ordonner 

### - Socket de Datagramme(Datagram socket) 

Il utilise le protocol `UDP` qui est moins fiable mais qui offre des performances plus rapide

NB: Les sockets permettent aux applications de s'envoyer des info entre les addresses IP pour etablir des connnections necessaires

## 2.Fonctionnement des sockets

Le fonctionnement repose sur plusieurs etapes qui permettent l'etablissement et la gestion d'une connnection entre 2 applications

### °1 Creation du socket 

L'application cree des sockets en utilisant des fonctions fournies par le systeme d'exploitation ou fourni par les packages JAVA

### °2 Liaison (Binding)

Pour les sockets au serveur la liaison associe le socket a une addresse IP a une apport de port precis cela permet d'etablir une connection

### °3 Ecoute (Listen)

Dans le cas de socket de flux le serveur passe en mode ecoute pour attendre les demandes de connections

Cela indique que le serveur est pres aaccepter les connections des clients.

### °4 Acceptation des connections

Lorsque un client se connecte le serveur accepte la connection en utilisant des fonctions precises 

Cela permet de creer un nouveau socket pour gerer la communication avec les clients: permettant ainsi au serveur a ecouter les autres connections

 ### °4 Communication

Une fois la connection etablie les donnes peuvent etre echanger entre le client et le serveur en utilisant des fonctions de lecture et d'ecriture.

## 3.Programmation Java

### °1. Gestion des addresses IP

`InetAddress`

ex: `InetAddress a = InetAddress.getLocalhost();`

        `try {  
            InetAddress a = InetAddress.getLocalHost();
            System.out.println("L'address Ip  est : "+a.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        try {
            InetAddress b = InetAddress.getByName("localhost");
            System.out.println("L'address Ip  est : "+b.getHostAddress());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        Enumeration<NetworkInterface> nt = null;
        try {
            nt = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }

        while (nt.hasMoreElements()){
            NetworkInterface k = nt.nextElement();
            System.out.println("Le nom de la carte est : "+k.getName());
            System.out.println("Le description de la carte est : "+k.getName());

        }`

### °2. Creation de socket TCP

Main du Serveur

    `
        package org.example;



    public class Main {
    public static void main(String[] args) {
        server s1 = new server();

        s1.receiveinfo();

        System.out.println("The end of the listening");
    }
    }
    `
Class du Serveur

    `
    package org.example;

    import javax.net.ssl.SSLServerSocket;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.PrintWriter;
    import java.net.ServerSocket;
    import java.net.Socket;
    
    public class server {

    public void receiveinfo() {
        int port = 12345;

        ServerSocket sv;

        {
            try {
                sv = new ServerSocket(port);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Socket sk;

        {
            try {
                sk = sv.accept();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        PrintWriter out;

        {
            try {
                out = new PrintWriter(sk.getOutputStream(), true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedReader in;

        {
            try {
                in = new BufferedReader(new InputStreamReader(
                        sk.getInputStream()
                ));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String rps;

        {
            try {
                rps = in.readLine();
                System.out.println("Message du client :" + rps);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }
    `

Main du Client

    `
    package org.example;

    import java.net.InetAddress;
    import java.net.NetworkInterface;
    import java.net.SocketException;
    import java.net.UnknownHostException;
    import java.util.Enumeration;
    
    import org.example.client;
    
    public class Main {
        public static void main(String[] args) {
            client cl1 = new client();

        cl1.sendInfo();
    }
    }
    `

Class du Client


        `package org.example;

    import java.io.*;
    import java.net.Socket;
    
    public class client {

    public void sendInfo(){
        String addr = "localhost";
        int port = 12345;

        Socket st;

        {
            try {
                st = new Socket(addr,port);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        PrintWriter out;

        {
            try {
                out = new PrintWriter(st.getOutputStream(),true);

                BufferedReader in;

                in = new BufferedReader(new InputStreamReader(
                        st.getInputStream()
                ));

                out.println("Bonjour mon serveur");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



    }
    `


Classe Server datagram

    `
    package org.example;

    import java.io.IOException;
    import java.net.DatagramPacket;
    import java.net.DatagramSocket;
    import java.net.SocketException;
    
    public class server {


    public void receiveinfo(){
        int port = 9786;
        DatagramSocket ds;

        {
            try {
                ds = new DatagramSocket(port);
            } catch (SocketException e) {
                throw new RuntimeException(e);
            }
        }

        byte[] buffer = new  byte[1024];

        DatagramPacket rc = new DatagramPacket(buffer,buffer.length);

        {
            try {
                ds.receive(rc);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        String msg = new String(rc.getData(),0,rc.getLength());

        System.out.println(msg);

    }
    }

    `
Classe Client datagram

    `

    package org.example;

    import java.io.IOException;
    import java.net.*;
    
    public class client {

    public void sendMessage(){
    String msg = "Serveur iri bon";
    int port = 9786;

    DatagramSocket ds;

    {
        try {
            ds = new DatagramSocket();

            InetAddress a = InetAddress.getByName("localhost");


        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),a,port);

            try {
                ds.send(dp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
    }
    }

    
    `

# CHAP 5 : RMI( Remote Moethod invocation) 

## 1. Introduction

Il permet a un programme d'invoquer des objets situes a une autre machine facilitant ainsi la creation d'application distribue
C'est un mecanisme qui fonctionne a travers le reseau en rendant possible  l'acces distant comme s'il etaient en local

## 2. objctifs
### Transparence

Permettre au developpeur d'appeler des methodes distantes de la meme maniere que les methodes locale

### Distribution

Supporter la creation d'application reparti sur plusieurs machines

### Distribution

Rendre la communication entre les applications distant aussi simple que possible aux developpeurs

Elle se compose de plusieurs elements cles:

- Client : une application qui invoque un application distant
- Serveur : une application qui fournie une objet distant
- Registry : Un service qui permet au client de localiser les objets distant
- Protocol RMI : Il permet d'assurer la communication entre le client et le serveur

Foctionnement


les etapes sont: 

Creation des interfaces
Definir une interface qui herite

- Implementaion de l'interface :

 Creer une classe qui implemente cet interface et qui herite de 

    `UnicastRemoteObject`

Enregistremeent de l'objet distant
L'Objet doit enregistrer dans le registre pour qu'il soi accessible par le client 
- Invocation de la methode distante
Le client cherche l'objet dans le registre  et invoque la methode comme si il s'agissait d'une methode locale
