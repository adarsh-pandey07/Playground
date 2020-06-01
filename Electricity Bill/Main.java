#include<iostream>
using namespace std;
int main()
{
  int u,b;
  cin>>u;
  if(u<=200){
    b=0.5*u;
    cout<<"Rs."<<b;
  }
  else if(200<u<=400){
    b =.65*u+100;
    cout<<"Rs."<<b;
  }
  else if(400<u<=600){
    b = .80*u+200;
    cout<<"Rs."<<b;
  }
  else if(u>600){
    b = u*1.25+425;
    cout<<"Rs."<<b;
  }
 
}