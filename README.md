# Simulation 🧬
The essence of the project is a step-by-step simulation of a 2D world populated by herbivores and predators. In addition to creatures, the world contains resources (grass), which the herbivores feed on, and static objects with which you can’t interact - they just fill the space.
The 2D world is represented as an NxM matrix, where each creature or object occupies a cell completely. It is not allowed for multiple objects/creatures to be in the same cell.

## Rules 📋
1. Rabbits search for grass. 🐇
2. Wolves hunt rabbits. 🐺
3. The map also contains obstacles in the form of rocks and trees. 🌳 | 🗻
4. Each animal has a number of health points and a speed (the number of moves it can make at once). 💊 | 💨

## Path finding 📐
Creatures uses the A* (A star) algorithm to find a path to the nearest target.

![A_Star_Algorithm webm 720p vp9](https://github.com/KostyaDemens/Simulation/assets/93008807/002b585d-5157-4c5b-8872-c144d0b1a33e)

Illustration of A* search for finding a path between two points on a graph. From left to right, a heuristic that prefers points closer to the goal is used increasingly.

## End game conditions ❌

The simulation ends in two scenarios:
1. Predators exterminates all herbivores.
2. Herbivores extirpates all grass.

##
