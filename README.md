
- [x] Fork an existing simple project
- [x] Adapt to exercise's MVP
- [x] Ensure tests are fine
- [x] Add the Discount feature
- [x] Evovlve tests
- [x] Document
- [x] Code comments and javaDoc (***in FRENCH yet***)

----

**Disclaimer** [Go to French version](https://github.com/tstebut/simple-shop-basket-java/blob/master/README.md#french-version)

I really did not have time to finalize this piece properly~~and in particular I skip the Javadoc, which is however an important exercise from my point of view~~. In addition, I started on a simple resolution, helping me with a small project in pure Java done by a student somewhere in the world, and I forked this project. I then corrected and adapted the code so that it is both right and meets the minimum requirement of the exercise, namely a basket with 3 possible fruits, and variable quantity. I then, on day 2, added the functionality of Discount.

This little app is testable in command lines, and if you've read so far, thanks :)! you just have to follow the rest of this simple procedure.

PS: played and tested with an Eclipse CHE (codenvy.io) => live demo possible.

## Required configuration

Java 8+ with Maven 3+

## Installation

``
$ mvn clean install
``

## Launching

```
$ cd target
$ java -cp discount-basket-1.0.jar com.company.basket.Main
```

## Trick

To iterate as many times as necessary:

``
$ cd .. && mvn clean install && cd - && java -cp discount-basket-1.0.jar com.company.Main
``

----
###FRENCH VERSION

Je n'ai vraiment pas eu le temps de pauffiner cet ouvrage~~, et notamment j'ai fais l'impasse sur la Javadoc, qui est pourtant un exercice important de mon point de vue~~.
Par ailleurs, je suis parti sur une résolution simple, en m'aidant d'un petit projet en pur Java fait par un étudiant quelque part dans le monde, et j'ai forké ce projet.
J'ai ensuite corrigé et adapté le code pour qu'il soit à la fois juste et qu'il réponde au besoin minimal de l'exercice, à savoir un panier avec 3 fruits possibles, et de quantité variable.
J'ai ensuite, le jour 2, ajouté la fonctionalité de Discount.

Cette petite appli est testable en lignes de commandes, et si vous avez lu jusqu'ici, merci :) ! vous n'avez plus qu'à suivre la suite de cette procédure simple.

PS: joué et testé avec un Eclipse CHE (codenvy.io) => démo live possible.

## Configuration requise

  Java 8+ avec Maven 3+

## Installation

``
  $ mvn clean install
``

## Lancement

```
  $ cd target
  $ java -cp discount-basket-1.0.jar com.company.basket.Main
```

## Astuce

  Pour itérer autant de fois que nécessaire : 
  
``
  $ cd .. && mvn clean install && cd - && java -cp discount-basket-1.0.jar com.company.Main
``
