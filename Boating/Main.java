#include<iostream>
using namespace std;
int main()
{
  int w,a,c;
  cin>>w>>a>>c;
  if((75*a+30*c)<=w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}