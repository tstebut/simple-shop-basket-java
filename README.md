**Disclaimer** 

Je n'ai vraiment pas eu le temps de pauffiner cet ouvrage, et notamment j'ai fais l'impasse sur la Javadoc, qui est pourtant un exercice important de mon point de vue.
Par ailleurs, je suis parti sur une résolution simple, en m'aidant d'un petit projet en pur Java fait par un étudiant quelque part dans le monde, et j'ai forké ce projet.
J'ai ensuite corrigé et adapté le code pour qu'il soit à la fois juste et qu'il réponde au besoin minimal de l'exercice, à savoir un panier avec 3 fruits possibles, et de quantité variable.
J'ai ensuite, le jour 2, ajouté la fonctionalité de Discount.

Cette petite appli est testable en lignes de commandes, et si vous avez lu jusqu'ici, merci :) ! vous n'avez plus qu'à suivre la suite de cette procédure simple.

PS: joué et testé avec un Eclipse CHE (codenvy.io) => démo live possible.

**Configuration requise**

  Java 8+ avec Maven 3+

**Installation**

  $ mvn clean install

**Lancement**

  $ cd target
  
  $ java -cp discount-basket-1.0.jar com.company.basket.Main

**Astuce**

  Pour itérer autant de fois que nécessaire : $ cd .. && mvn clean install && cd - && java -cp discount-basket-1.0.jar com.company.Main
