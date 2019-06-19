package es.ulpgc.hpds;

import org.junit.Test;

import java.util.*;


import static es.ulpgc.hpds.Ejercicio2_.Move.*;
import static java.lang.Integer.min;
import static java.lang.StrictMath.max;
import static org.assertj.core.api.Assertions.assertThat;

public class Ejercicio2_ {
    final static Map<Coordinate, String> players;

    @Test
    public void control_move_up(){
        List<String> result1 = new ArrayList<>();
        Move [] moves = {up, up};
        Coordinate coordinate = new Coordinate(0,0);
        for (Move move : moves) {
            coordinate = coordinate.move(move);
            result1.add(players.get(coordinate));
        }
        List<String> result = new ArrayList<>();
        result.add("Ryu");
        result.add("Ryu");
        assertThat(result1).isEqualTo(result);
    }

    @Test
    public void control_move_left(){
        List<String> result1 = new ArrayList<>();
        Move [] moves = {left, left};
        Coordinate coordinate = new Coordinate(0,0);
        for (Move move : moves) {
            coordinate = coordinate.move(move);
            result1.add(players.get(coordinate));
        }
        List<String> result = new ArrayList<>();
        result.add("M.Bison");
        result.add("Sagat");
        assertThat(result1).isEqualTo(result);
    }

    @Test
    public void control_move_down(){
        List<String> result1 = new ArrayList<>();
        Move [] moves = {down, down};
        Coordinate coordinate = new Coordinate(0,0);
        for (Move move : moves) {
            coordinate = coordinate.move(move);
            result1.add(players.get(coordinate));
        }
        List<String> result = new ArrayList<>();
        result.add("Ken");
        result.add("Ken");
        assertThat(result1).isEqualTo(result);
    }



    static {
        players = new HashMap<>();
        players.put(new Coordinate(0,1),"Ryu");
        players.put(new Coordinate(1,1),"E.Honda");
        players.put(new Coordinate(2,1),"Blanka");
        players.put(new Coordinate(3,1),"Guile");
        players.put(new Coordinate(4,1),"Balrog");
        players.put(new Coordinate(5,1),"Vega");

        players.put(new Coordinate(0,0),"Ken");
        players.put(new Coordinate(1,0),"Chun Li");
        players.put(new Coordinate(2,0),"Zangief");
        players.put(new Coordinate(3,0),"Dhalsim");
        players.put(new Coordinate(4,0),"Sagat");
        players.put(new Coordinate(5,0),"M.Bison");
    }


    public static class Coordinate{
        int x, y;
        final int max_y = 1;
        final int max_x = 6;

        final static Map<Move, Coordinate> moves;

        public Coordinate(int x, int y){
            this.x = (x + max_x) % max_x;
            this.y = max(min(y, max_y),0);
        }

        public Coordinate move(Move move){
            return new Coordinate(x+moves.get(move).x,y+moves.get(move).y);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coordinate that = (Coordinate) o;
            return x == that.x &&
                    y == that.y &&
                    max_y == that.max_y &&
                    max_x == that.max_x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, max_y, max_x);
        }

        static{
            moves = new HashMap<>();
            moves.put(right, new Coordinate(1,0));
            moves.put(up, new Coordinate(0,1));
            moves.put(down, new Coordinate(0,-1));
            moves.put(left, new Coordinate(-1,0));
        }

    }

    public enum Move {
        up, down, left, right
    }

}
