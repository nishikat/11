/* Sphere.c
 * Nishika Tripathi
 * 1404168
 * lab7
 * calculates the volume and surface area of a sphere after given the radius
 */

#include <stdio.h>
#include <math.h>

int main() {
  double radius, area, volume;
  const double pi = 3.141592654;

  printf("Enter the radius of the sphere: ");
  scanf("%lf", &radius);

     area = 4*pi*radius*radius;
     volume = (4.0/3.0)*(pi)*radius*radius*radius;

  printf("The volume is %.6lf ", volume);
  printf("and the surface area is %.6lf. ", area);
 
  printf("\n");
  
  return 0;
}
