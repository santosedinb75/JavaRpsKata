package com.example.JavaRpsKata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.example.JavaRpsKata.ValidThrow.*;
import static com.example.JavaRpsKata.Winner.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName( "Rock, Paper, Scissors Tests" )
class RpsTest {
    private Rps rps = new Rps();

    @Nested
    @DisplayName( "Rock should..." )
    class rockScenarios {

        @Test
        @DisplayName( "...win against Scissors" )
        void beatScissors() {
            assertEquals( P1_Wins, rps.play( Rock, Scissors ) );
        }

        @Test
        @DisplayName( "...lose against Paper" )
        void losePaper() {
            assertEquals( P2_Wins, rps.play( Rock, Paper ) );
        }

        @Test
        @DisplayName( "...tie against Rock" )
        void tieRock() {
            assertEquals( Tie, rps.play( Rock, Rock ) );
        }
    }

    @Nested
    @DisplayName( "Paper should..." )
    class paperScenarios {
        @Test
        @DisplayName( "...win against Rock" )
        void beatRock() {
            assertEquals( P1_Wins, rps.play( Paper, Rock ) );
        }

        @Test
        @DisplayName( "...lose against Scissors" )
        void loseScissors() {
            assertEquals( P2_Wins, rps.play( Paper, Scissors ) );
        }

        @Test
        @DisplayName( "...tie against Paper" )
        void tiePaper() {
            assertEquals( Tie, rps.play( Paper, Paper ) );
        }
    }

    @Nested
    @DisplayName( "Scissors should..." )
    class scissorsScenarios {
        @Test
        @DisplayName( "...win against Paper" )
        void beatPaper() {
            assertEquals( P1_Wins, rps.play( Scissors, Paper ) );
        }

        @Test
        @DisplayName( "...lose against Rock" )
        void loseRock() {
            assertEquals( P2_Wins, rps.play( Scissors, Rock ) );
        }

        @Test
        @DisplayName( "...tie against Scissors" )
        void tieScissors() {
            assertEquals( Tie, rps.play( Scissors, Scissors ) );
        }
    }
}
