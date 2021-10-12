#include <stdio.h>
#include <math.h>

int main()
{
    float firstEdge,secondEdge,aci,sonuc;
  
    printf("Bir kenari bilinmeyen üçgenin ilk bilinen kenarini giriniz");
    scanf("%f" , &firstEdge);
    printf("Bir kenari bilinmeyen üçgenin ikinci bilinen kenarini giriniz");
    scanf("%f" ,&secondEdge);
    printf("bilinmeyen kenarı karşılayan açıyı giriniz");
    scanf("%f" ,&aci);
    aci = aci*(3.14159/180); 
    sonuc = (sqrt((pow(firstEdge,2) + pow(secondEdge,2)) - 2*(secondEdge)*(firstEdge)*(cosf(aci))));
    printf("%f ", sonuc);
    

    return 0;
}