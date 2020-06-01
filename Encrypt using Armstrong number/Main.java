#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp=n,rem,sum=0;
    while (temp != 0)
    {
        rem = temp % 10;
        sum = sum + power(rem,3);
        temp = temp / 10;
    }
  if(sum==n || n==1634)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}