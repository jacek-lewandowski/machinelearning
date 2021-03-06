package com.example.hunterPreyPredator.map;

import com.example.hunterPreyPredator.agents.AgentType;

/**
 * Created by mateusz on 08.04.16.
 */

/**
 * Klasa reprezentująca pozycję agenta w środowisku.
 */
public class Position {

    private int x;
    private int y;
    private AgentType agentType;
    private int agentNumber;

    public Position(int x, int y, AgentType agentType, int agentNumber) {
        this.x = x;
        this.y = y;
        this.agentType = agentType;
        this.agentNumber = agentNumber;
    }

    public Position(Position another) {
        this.x = another.x;
        this.y = another.y;
        this.agentType = another.agentType;
        this.agentNumber = another.agentNumber;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public AgentType getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentType agentType) {
        this.agentType = agentType;
    }

    public int getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(int agentNumber) {
        this.agentNumber = agentNumber;
    }

    public boolean inRange2(Position position, int range) {
        return (Math.abs(this.x - position.getX()) <= range && Math.abs(this.y - position.getY()) <= range);
    }

    public boolean inRange(Position position, int range){
        int dx = Math.abs(this.x - position.getX());
        int dy = Math.abs(this.y - position.getY());
        boolean isXInRage = dx <= range;
        boolean isYInRage = dy <= range;
        return isXInRage && isYInRage;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", agentType=" + agentType +
                ", agentNumber=" + agentNumber +
                '}';
    }
}
