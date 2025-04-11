# 🎲 Simple Frustration Game Simulator

A Java console simulation of the board game **Simple Frustration**, following the game rules and extended with support for multiple game variations.

## 📋 Functional Specification

The simulator runs a game between two players on a board, using dice rolls to advance positions. Throughout the game, the simulation outputs the following to the console:

1. The current player, their dice roll, and position before and after each turn.
2. Running total of turns taken per player.
3. The winner at the end of the game.
4. Total number of turns taken across both players.

---

## 🕹️ Game Variations

The simulation supports multiple game rule variations. These can be **individually toggled** and **combined** to change the gameplay.

### ❌ Exact Landing Required (End Rule)
- A player **must land exactly** on the END position to win.
- If the roll overshoots the END, the player bounces **backwards**, including down the tail and potentially wrapping around the board.

### ✅ Hit Sends Player Home (Hit Rule)
- If a player lands on the same square as their opponent, the opponent is sent back to their **Home** position.
- Each player starts at a unique Home index (e.g. Red at 1, Blue at 9 or 19 depending on board size).

### ✅ Dice Mode
- Choose between:
   - 🎲 Single die (6-sided)
   - 🎲🎲 Double dice (two 6-sided dice)

### 🟨 Board Size
- Choose between:
   - 🟩 **Standard board**: 18 main positions + 3 tail positions
   - 🟦 **Large board**: 36 main positions + 6 tail positions
- Tail positions are unique per player and used once they complete a full circuit.

This variation is functional in the aspect of can vary in size. However, the tail positions are not named correctly, as i could not figure out how to do this in the way i've implemented the functionality of the game.

---

## 🚀 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/simple-frustration-simulator.git
