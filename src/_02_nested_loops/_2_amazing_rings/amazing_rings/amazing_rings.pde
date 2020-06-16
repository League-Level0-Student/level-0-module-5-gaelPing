int x1=75;
int x2=425;
float speed = .5;
float sped = -.5;

void setup() {
  size(500, 500);
}

void draw() {

  // Go to the recipe to run the demonstration before starting this program
  background(#AFACAC);


  for (int i=15; i>0; i--) {
    if (i % 2 == 0 )
    {
      noFill();
    }
    if (i % 2 == 1)
    {
      noFill();
    }
    ellipse(x1, 250, i*10, i*10 );
    ellipse(x2, 250, i*10, i*10 );
    x2+=sped;
    x1+= speed;
    if (x1>=425) {
      speed = -0.25;
    }

    x1+= speed;
    if (x1<=75) {
      speed = 0.5;
    }
    x1+= speed;
     if (x2>=425) {
      sped = -0.25;
    }
    x2+=sped;
    if (x2<=75) {
      sped = 0.5;
    }
    x2+=sped;
  }
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
   You can use the noFill() command to make your ellipses transparent.
   Make the rings move past each other.
   When the rings hit the side of the sketch, make them reverse their direction.
   */
}
