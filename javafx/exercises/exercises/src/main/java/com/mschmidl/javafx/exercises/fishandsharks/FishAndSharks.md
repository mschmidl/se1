# Rules for a Sharks and Fish Cellular Automaton

## Basic Rules

### Grid:

A square grid 100x100 of cells.
Each cell can be empty, occupied by a fish, or occupied by a shark. 

Time is counted in chronons.

### Fish:

#### Movement:
At each chronon, a fish moves randomly to one of the adjacent unoccupied squares. If there are no free squares, no movement takes place.

#### Reproduction:
Once a fish has survived a certain number of chronons it may reproduce. 
This is done as it moves to a neighbouring square, leaving behind a new fish in its old position. 
Its reproduction time is also reset after this.

### Sharks:

#### Movement:
At each chronon, a shark moves randomly, preferring adjacent squares occupied by a fish. If there is no fish, the shark moves to a random adjacent unoccupied square. If there are no free squares, no movement takes place.

#### Reproduction:
Once a shark has survived a certain number of chronons it may reproduce in exactly the same way as the fish.

#### Death:
At each chronon, each shark is deprived of a unit of energy. Upon reaching zero energy, a shark dies.
If a shark moves to a square occupied by a fish, it eats the fish and energy is reset.

## Implementation

### Step 1
Use inheritance to create the class *Creature* and the inheriting classes *Fish* and *Shark*.

All Creatures have a *color* and a *timeToBreed*.

Sharks have a *timeToStarve*.

## Step 2:

Add parameters *gridSize*, *numberOfFish* and *numberOfSharks*
Create a *Creature[][]* grid with size *gridSize* x *gridSize* to hold all creatures.
Add *numberOfFish* fish and *numberOfSharks* sharks to the grid at random positions.

Hint:

*Random random = new Random(System.currentTimeMillis());
int row = random.nextInt(0, gridSize);*

## Step 3:
Use the following code to create a *GridPane* with constant proportions:

```
private GridPane initGridPane() {
    GridPane gridPane = new GridPane();
    for (int i = 0; i < gridSize; i++) {
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setPercentWidth(100.0 / gridSize);
        gridPane.getColumnConstraints().add(columnConstraints);

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setPercentHeight(100.0 / gridSize);
        gridPane.getRowConstraints().add(rowConstraints);
    }
    return gridPane;
}
```

Draw 4x4 Rectangles for each fish and shark. Use the *color* of the *Creatures* defined earlier.

## Step 4:
In preparation for moving fish and sharks, create a new *Enum* called *Directions* UP, DOWN, LEFT, RIGHT.

Then write a method *Creature getGridContentInDirection(int row, int col, Direction direction)* that returns e.g. the *Creature* to the LEFT of the point (34,12) in the grid.

_Be aware that the grid wraps around. So if the grid is 100x100 then the point (99,0) is to the LEFT of (0,0)_

## Step 5:
Create a new method *void setGridContentInDirection(int row, int col, Direction direction, Creature creature)* to set a *Creature* in a direction of a point.

## Step 6:
Implement fish movement. 

Use *getGridContentInDirection(..)* to check if there are free spots for a fish to move to.
If so, select one direction that is free at random and use *setGridContentInDirection(..)* to move the fish there.
For now set the current point empty if the fish has moved

## Step 7:
Implement shark movement. 

Use *getGridContentInDirection(..)* to check if there are preferred spots with a fish or possible spots that are free for the shark to move to.
If there are preferred spots, select one by random and use *setGridContentInDirection(..)* to move the shark there.
If there are no preferred spots but possible spots, select one by random and use *setGridContentInDirection(..)* to move the shark there.
For now set the current point empty if the shark has moved

## Step 8:
Add a game loop:

Create a method *simulate()* that simulates one step for all fish and sharks, then clears out the gridPane using *gridPane.getChildren().clear();* and then re-draws all fish and sharks. 

Then use this code, to run the *simulate()* method in a loop:
```
GameLoopTimer gameLoopTimer = new GameLoopTimer() {
    @Override
    public void tick(float secondsSinceLastFrame) {
        progress(gridPane);
    }
};

gameLoopTimer.start();
```

## Step 9:
Implement reproduction for fish and sharks.
Every time the simulation progresses one step, reduce the *timeToBreed* introduced earlier.

When *timeToBreed* reaches 0 and if the fish or shark could move, create a new fish or shark in the spot that just got empty and reset *timeToBreed* 

## Step 10:
Shark eating and death.

Every time a simulation step for a shark is done, reduce the *timeToStarve* by one.

Whenever a shark moves into a space with a fish, reset the *timeToStarve*.

### Step 11 (optional)
Extend the UI with a *settingsGrid* and use the existing classes *Label*, *NumberSpinner* to make all parameters adjustable. 
Add *Button*s to start and stop the simulation.
