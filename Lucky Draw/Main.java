#include<iostream>
using namespace std;
int main() {
  int n,flag=0;
  cin>>n;
  for(int i = 2; i<n; i++) {
    if(n%i == 0){
      flag=1;
      break;
    }   
 }
  if(flag==1 || n==0 || n==1)
    cout<<"Not eligible";
  else
  	cout<<"Eligible";
  return 0;
}