/*
Author: Aniket Mane
Problem Statement: Write a recursive function to find the sum of first n natural numbers.
Notes: Decide the base case and the recursive case. The base case is when n is less than 1, return 0.
*/

#include <iostream>
#include <cstdlib>
using namespace std;

int sum(int n){
    if(n < 1){
        return 0;
    }
    return n + sum(n - 1);
}

int main(){
    int n;
    cout<<"Enter the number:";
    cin>>n;
    cout<<"Sum of first "<<n<<" numbers is "<<sum(n)<<endl;
}