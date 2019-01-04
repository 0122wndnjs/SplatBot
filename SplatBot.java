package lab11;

import splatbot.Action;
import splatbot.Cell;
import splatbot.SplatBotColor;
import splatbot.Splatter;

public class SplatBot {

	public static void main(String[] args) {
		int delay = 50;
		int nTurns = 500;
		new Splatter(splatbot.RobotLefty.class, lab11.SplatBot.class, delay, nTurns);
	}

	public SplatBot(SplatBotColor RandB) {

	}

	public Action getAction(Cell left, Cell front, Cell right) {

		int step = 1;
		if (step % 5 == 0) {
			return Action.SPLAT;
		} else if (front == Cell.NEUTRAL) {
			return Action.MOVE_FORWARD;
		} else if (right == Cell.NEUTRAL) {
			return Action.TURN_RIGHT;
		} else if (left == Cell.NEUTRAL) {
			return Action.TURN_LEFT;
		} else if (front == Cell.BLUE && right == Cell.NEUTRAL) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.BLUE && left == Cell.NEUTRAL) {
			return Action.TURN_LEFT;
		} else if ((right == Cell.BLUE && left == Cell.BLUE) && (front == Cell.BLUE)) {
			return Action.MOVE_FORWARD;
		} else if ((right != Cell.WALL || right != Cell.ROCK) && right == Cell.NEUTRAL && left == Cell.NEUTRAL) {
			return Action.TURN_LEFT;
		} else if ((front == Cell.WALL || front == Cell.ROCK) && right == Cell.NEUTRAL) {
			return Action.TURN_RIGHT;
		} else if ((front == Cell.WALL || front == Cell.ROCK) && left == Cell.NEUTRAL) {
			return Action.TURN_LEFT;
		} else if (front == Cell.ROCK && right == Cell.BLUE) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.ROCK && left == Cell.BLUE) {
			return Action.TURN_LEFT;
		} else if (front == Cell.RED) {
			return Action.MOVE_FORWARD;
		} else if (right == Cell.RED) {
			return Action.TURN_RIGHT;
		} else if (left == Cell.RED) {
			return Action.TURN_LEFT;
		} else if ((front == Cell.WALL || front == Cell.ROCK) && left == Cell.RED) {
			return Action.TURN_LEFT;
		} else if ((front == Cell.WALL || front == Cell.ROCK) && right == Cell.RED) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.RED_ROBOT && (left == Cell.WALL || left == Cell.ROCK)) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.RED_ROBOT && (right == Cell.WALL || right == Cell.ROCK)) {
			return Action.TURN_LEFT;
		} else if (front == Cell.RED_ROBOT) {
			return Action.TURN_RIGHT;
		} else if ((right == Cell.WALL && front == Cell.NEUTRAL) || (left == Cell.WALL && front == Cell.NEUTRAL)) {
			return Action.MOVE_FORWARD;
		} else if ((front != Cell.ROCK || front != Cell.WALL) && (right == Cell.WALL && left == Cell.ROCK)
				&& (left == Cell.WALL && right == Cell.ROCK) && (right == Cell.ROCK && left == Cell.ROCK)) {
			return Action.MOVE_FORWARD;
		} else if ((front == Cell.ROCK || front == Cell.WALL) && (right == Cell.WALL && left == Cell.ROCK)
				&& (left == Cell.WALL && right == Cell.ROCK) && (right == Cell.ROCK && left == Cell.ROCK)) {
			return Action.MOVE_BACKWARD;
		} else if ((right != Cell.WALL && front == Cell.BLUE && right == Cell.RED)
				|| (right != Cell.ROCK && front == Cell.BLUE && right == Cell.RED)) {
			return Action.TURN_RIGHT;
		} else if ((left != Cell.WALL && front == Cell.BLUE && left == Cell.RED)
				|| (left != Cell.ROCK && front == Cell.BLUE && left == Cell.RED)) {
			return Action.TURN_RIGHT;
		} else if (right == Cell.WALL && (front == Cell.ROCK || front == Cell.WALL)) {
			return Action.TURN_LEFT;
		} else if (left == Cell.WALL && (front == Cell.ROCK || front == Cell.WALL)) {
			return Action.TURN_RIGHT;
		} else if ((front == Cell.WALL || front == Cell.ROCK)) {
			return Action.TURN_LEFT;
		} else if (front == Cell.ROCK && right == Cell.ROCK) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.ROCK && left == Cell.ROCK) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.WALL && left == Cell.ROCK) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.WALL && right == Cell.ROCK) {
			return Action.TURN_LEFT;
		} else if ((front == Cell.ROCK || front == Cell.WALL) && (right == Cell.ROCK || right == Cell.WALL)) {
			return Action.TURN_LEFT;
		} else if (front == Cell.WALL && right == Cell.WALL) {
			return Action.TURN_RIGHT;
		} else if (front == Cell.WALL && left == Cell.WALL) {
			return Action.TURN_LEFT;
		} else if ((front == Cell.ROCK || front == Cell.WALL) && (left == Cell.ROCK || left == Cell.WALL)) {
			return Action.TURN_RIGHT;
		} else {
			return Action.MOVE_FORWARD;
		}
	}

	public void survey(Cell[][] survey) {

	}
}