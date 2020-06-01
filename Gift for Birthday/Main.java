#include<iostream>
using namespace std;
int main()
{
  int y;
  cin>>y;
  if(y%4==0){
    if(y%100==0){
      if(y%400==0)
        cout<<y<<" is a leap year";
      else
        cout<<y<<" is not a leap year";
    }
    else 
      cout<<y<<" is a leap year";
  }
  else
    cout<<y<<" is not a leap year";
}