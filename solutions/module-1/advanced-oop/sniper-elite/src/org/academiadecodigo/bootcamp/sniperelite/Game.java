package org.academiadecodigo.bootcamp.sniperelite;

import org.academiadecodigo.bootcamp.sniperelite.gameobject.GameObjectFactory;
import org.academiadecodigo.bootcamp.sniperelite.gameobject.GameObject;
import org.academiadecodigo.bootcamp.sniperelite.gameobject.decor.Tree;
import org.academiadecodigo.bootcamp.sniperelite.gameobject.enemy.Enemy;
import org.academiadecodigo.bootcamp.sniperelite.gameobject.weapons.SniperRifle;

/**
 * Sniper Elite
 */
public class Game {

    public static final double ENEMY_PROBABILITY = 0.7;
    public static final int BULLET_DAMAGE = 1;

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    /**
     * Construct the game
     * @param numberObjects the number of game objects to create
     */
    public Game(int numberObjects) {

        this.gameObjects = createGameObjects(numberObjects);
        this.sniperRifle = new SniperRifle(BULLET_DAMAGE);

    }

    /**
     * Start shooting
     */
    public void start() {

        for (GameObject gameObject : gameObjects) {

            System.out.println(gameObject.getMessage());

            if (gameObject instanceof Enemy) {

                Enemy target = (Enemy) gameObject;
                while (!target.isDead()) {

                    System.out.println("Making the shot...");
                    sniperRifle.shoot(target);
                    shotsFired++;

                }

                System.out.println("Target is neutralized. I repeat, Target is neutralized!");

            }


        }

        System.out.println("All targets are down. I repeat all targets are down. " + shotsFired + " shots.");

    }

    private GameObject[] createGameObjects(int numberObjects) {

        GameObject[] gameObjects = new GameObject[numberObjects];

        for (int i = 0; i <gameObjects.length ; i++) {

            gameObjects[i] = Math.random() < ENEMY_PROBABILITY ? GameObjectFactory.createEnemy() : new Tree();

        }

        return gameObjects;

    }

}
