# Révisions

### Prérequis
- Cloner le projet sur votre poste dans le repertoire de votre choix
- Ouvrir le projet :
  - Sur l'écran d'accueil d'IntelliJ, cliquer sur **Open**
  - Sélectionner le dossier **tp-xxx** qui a été copié depuis github puis cliqué sur **OK**.
  - Le projet s'ouvre
  - Allez vérifier que le SDK est bien sélectionné dans **File > Project Structure** onglet **Project**

### Utilisation de GIT

- Créer une nouvelle branche **prenomNom**
- Faire **1 commit** par exercice (sauf exercice 0)
- Ouvrir **une seule** *pull request* sur github et **ne pas** la fermer/merger !!


## Exercice 1

Ecrivez vos classe dans **net.lecnam.ussi47.revisions.exo1**

On vous demande de réaliser une ébauche d'application pour gérer une médiathèque.

La médiathèque gère des **Médias** qui peuvent être des **Livres**, **CD**

Ces **Médias** ont tous :

 - Un **Titre**
 - Un **Auteur**
 - Une **Date de retour**

Un **Livre** a en plus :

- Un nombre de pages

Un **CD** a en plus :

- Un nombre de titres
- Une durée (en seconde)



Un **Emprunteur**  a :

- Un **Nom**
- Un **Prénom**
- Une liste de **médias empruntés**

Pour un **Emprunteur** on doit pouvoir

- Eprunter un média en donnant une date de retour

- Voir les **Médias** empruntés comme par exemple :

  - Livre | Le petit Prince | A. St Exupery | 120 pages | A retourner le : 20/12/2018

  - CD | Izia | Izia | 12 Titres | 2432 secondes | A retourner le : 20/12/2018

#### Ecrire sur ordinateur le programme nécessaire pour répondre à ces spécifications

Pensez aux constructeurs, à la visibilité des attributs et méthodes.

Pensez au nommage 

Utilisez les collections les plus appropriées

#### Ecrire sur ordinateur le programme nécessaire pour répondre à ces spécifications dans le package **net.lecnam.ussi2a.revisions.exo1**

Le code de la classe **net.lecnam.ussi47.revisions.exo1.Main** une fois complété doit pouvoir s'executer : 

```java
public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre("Le petit Prince", "A. St Exupery", 150);
        CD cd = new CD("Izia", "Izia",  12, 2432);

        Emprunteur e = new Emprunteur("Arya", "Stark");
        
        // Ajouter le livre avec une date de retour le 20/12/2018
        // Ajouter le CD avec une date de retour le 20/12/2018
        
        // voir les médias empruntés

    }
}
```



## Exercice 2

Ecrivez vos classe dans **net.lecnam.ussi47.revisions.exo2**

On vous demande de réaliser une ébauche d'application pour gérer des employés

Un **Employé** a :

- Un **nom**
- Une **date de naissance**
- Un **salaire**
- Une **date d'embauche**

Un **Ingenieur** a en plus :

- un **grade**

Pour un **Employé** ou un **Ingenieur** on doit pouvoir

- Voir ses caractéristiques tel que :

  - Nom | Date de naissance
- voir son salaire sachant que pour un ingénieur, pour chaque unité de grade, son salaire est augmenté d'autant de centaines (ex, grade 1, +100€, grade 2, + 200€, etc...)
- Doit pouvoir avoir son salaire être **augmenté**
- Doit pouvoir changer de **grade**

Les employés et ingénieurs travaillent au sein d'une **Société** qui possède :

- Un **nom**
- Des **collaborateurs**   

Dans une société, on doit pouvoir :

- Lister les collaborateurs par **date d'embauche croissante**
- Exporter un fichier csv des collaborateurs
- Importer un fichier csv de nouveaux collaborateurs



#### Ecrire sur ordinateur le programme nécessaire pour répondre à ces spécifications dans le package **net.lecnam.ussi2a.revisions.exo2**

Le code de la classe **net.lecnam.ussi47.revisions.exo2.Main** une fois complété doit pouvoir s'executer : 

```java
public class Main {

    public static void main(String[] args) {

        // Ajouter une société
        
        // Ajouter un employee
        // Ajouter un ingenieur
       
        // Voir le salaire de l'employé
        // Voir le salaire de l'ingénieur
        
        // augmenter le salaire l'employé
        // augmenter le grade de l'ingenieur
        
        // Voir le salaire de l'employé
        // Voir le salaire de l'ingénieur
        
        // Lister les collaborateur par date d'embauche croissante
        
        // Exporter les collaborateurs dans un csv
        // Importer les collaborateurs depuis un csv

    }
}
```



## Exercice 3

Ecrivez vos classe dans **net.lecnam.ussi47.revisions.exo3**

On vous demande de réaliser une ébauche d'application pour gérer des comptes bancaire

Une banque a des clients, chaque client a un nom et peut avoir 1 seul compte courant et 1 ou plusieurs comptes d'épargne. Par défaut, il a un compte de chaque catégorie.

Un compte courant ne procure pas d'intéret mais on peut avoir une autorisation de découvert.
Un compte d'épargne a un taux d'interet et procure des intérets mais n'a pas d'autorisation de decouvert

Sur un compte, on réalise des opérations  : verser de l'argent (opération au montant positif) ou retirer de l'argent (opération au montant négatif). Une exception personalisée doit pouvoir se declencher si on retire de l'argent au dela du seuil minimum. Ces opérations doivent être historisées. On doit pouvoir afficher une opération et afficher le solde d'un compte ainsi que son type.

On doit pouvoir lister la liste des 5 dernières opérations effectuées sur un compte et la liste des comptes d'un client.

#### Ecrire sur ordinateur le programme nécessaire pour répondre à ces spécifications dans le package **net.lecnam.ussi2a.revisions.exo3**

Le code de la classe **net.lecnam.ussi47.revisions.exo3.Main** une fois complété doit pouvoir s'executer : 

```java
public class Main {

    public static void main(String[] args) {

        // Ajouter un client
        
        // Ajouter une autorisation de découvert de 300€
        
        // Déposer 1000€ sur le compte courant et afficher le solde
        
        // Retirer 5 fois 100€ et afficher le solde
        
        // Retirer 1000€ et afficher le solde 
        
        // Lister les comptes d'un client avec le solde par compte même si une exception est levée avant 

		// lister les 5 dernières opérations du compte courant

    }
}
```

## Exercice 4

Ecrivez vos classe dans **net.lecnam.ussi47.revisions.exo4**

Vous devez réaliser une application de gestion d'un centre sportif  




Un centre sportif gère 2 types de joueur :

- footballeur

- handballeur




Un **Footballeur** possède :

- Un nom (String)

- Une cote qui correspond à sa valeur sportive mais aussi son salaire (Entier)

- On doit pouvoir retourner le salaire du joueur la formule coût = (cote * cote * 10 ) + 1000

- On doit pouvoir retourner une chaine qui décrit le joueur




Un **handballeur** possède :

- Un nom (String)

- Une cote qui correspond à sa valeur sportive mais aussi son salaire (Entier)

- On doit pouvoir retourner le salaire du joueur la formule coût = cote * 2 + 1000

- On doit pouvoir retourner une chaine qui décrit le joueur



Un **Centre sportif** gère donc une 1 ensemble de sportif, on doit pouvoir :

- Ajouter un nouveau sportif.

- Retirer un sportif grâce à son nom

- Lister les sportif

- Afficher le total des cotes

- Afficher le coût total des salaires

- Exporter un fichier csv (un fichier texte avec toutes les informations séparées par des points virgules)

#### Ecrire sur ordinateur votre proposition de programme pour répondre à ces spécifications


