package com.lukegjpotter.selenium.squabblebot.operator.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SquabbleStartScreenOperator.java
 *
 * @author lukegjpotter
 * <p>
 * This class operates the start screen of Squabble. It goes through the menus to get to the Gameplay Loop and then
 * hands off to {@code SquabbleGameplayLoopOperator} to play the game.
 */
public class SquabbleStartScreenOperator {

    private final Logger log = LoggerFactory.getLogger(SquabbleStartScreenOperator.class);
}
