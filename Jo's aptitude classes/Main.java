#include<iostream>
using namespace std;
int f_gcd(int n1,int n2,int n3,int small)
{
  int ngcd;
  while(small>=1){
    if(n1%small==0 && n2%small==0 && n3%small==0){
      ngcd = small;
      break;
    }
    small--;
  }
   return ngcd; 
}
int main()
{
  int n1,n2,n3,gcd,small;
  cin>>n1>>n2>>n3>>gcd;
  if(n1<n2){
    if(n2<n3)
      small =n1;
    else
      small =n3;
  }    
  else if(n2<n3)
      small = n2;
    else
      small = n3;
  if(gcd==f_gcd(n1,n2,n3,small))
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}