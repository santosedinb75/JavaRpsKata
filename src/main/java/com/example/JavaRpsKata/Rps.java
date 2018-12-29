package com.example.JavaRpsKata;

import static com.example.JavaRpsKata.ValidThrow.*;
import static com.example.JavaRpsKata.Winner.*;

class Rps {
    Winner play( ValidThrow p1, ValidThrow p2 ) {
        if ( p1 == p2 ) {
            return Tie;
        }

        if ( p1 == Scissors && p2 == Rock
                || p1 == Paper && p2 == Scissors
                || p1 == Rock && p2 == Paper ) {
            return P2_Wins;
        }

        return P1_Wins;
    }
}