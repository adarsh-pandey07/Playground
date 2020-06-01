#include<iostream>
#include<cmath>
using namespace std;
int check(int m,int n)
{
  return pow(m,n);
}
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  if(check(m,n)>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}