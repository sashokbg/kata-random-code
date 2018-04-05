# Kata Code Generator

Un exercice de code et de TDD à faire à plusieurs et de préférence autour d'une bière !

Disponible sur github: https://github.com/sashokbg/kata-random-code

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

### Step 1

- Ecrire une méthode qui génère un nombre aléatoire entre 0 et 9
- S'assurer que des répétitions n'apparaissent pas si on évoque la méthode max 10 fois


- Rappel: Résoudre les choses de la manière la plus simple possible
- Rappel: Faire du refactoring après chaque test qui passe

### Step 2

- Ajouter une variable qui détermine la length du code généré (entre 1 et 3) ex 001..013..123 etc ..
- S'assurer que tous les codes pour un length donné sont bien générés (pas de codes oubliés)

### Step 3

- Le générateur devrait nous prévenir si tous les codes pour une taille concrète sont déjà utilisés

### Step 4

- Passer le code généré en alphanumérique

**Hints:**

- Utiliser du property based testing si possible avec junit-quickcheck