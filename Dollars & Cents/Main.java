#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int ds,cs;
  ds =d1+d2;
  cs = c1+c2;
  if(cs>=100) {
    ds += cs/100;
    cs=cs%100;
  }
  cout<<ds<<"\n"<<cs;
  return 0;
}