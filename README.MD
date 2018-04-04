#Kata Code Generator

Un exercice de code et de TDD à faire à plusieurs et de préférence autour d'une bière !

## Qu'est-ce que c'est qu'un "kata" ?

**Au judo et au karaté:** succession de mouvements codifiés mimant un combat et réalisant une démonstration technique.

**En informatique:** bah la même chose :D

## Le but

De s'exercer sur des problèmes simples dans un contexte restreint

De partager de connaissances entre collègues

De diriger son esprit vers le TDD

## Le Code Generator

### Avant de commencer

- Essayer de ne pas lire en avance
- Faire qu'une seule tâche à la fois. Le but c'est d'apprendre en mode incrémental
- Dans cet exercice on concentrera à tester les parties "importantes"
- On va se servir de http://pholser.github.io/junit-quickcheck/site/0.8/usage/configuring.html

### Step1

- Ecrire une méthode qui génère un nombre aléatoire entre 1 et 10
- S'assurer que des répétitions n'apparaissent pas si on évoque la méthode max 10 fois
- Rappel: Résoudre les choses de la manière la plus simple possible
- Rappel: Faire du refactoring après chaque test qui passe