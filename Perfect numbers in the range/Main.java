#include<iostream>
using namespace std;
int main()
{
  int s,e,sum;
  cin>>s>>e;
  for(int i =s; i<=e; i++) {
    sum = 0;
    for(int j=1; j<=i/2;j++){
      if(i%j==0)
        sum += j;
    }
    if(sum == i)
      cout<<i<<" ";
  }
  return 0;
}