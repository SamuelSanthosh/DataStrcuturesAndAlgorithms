#include<bits/stdc++.h>
using namespace std;
#define ll long long int

int main(){
    ll n;
    cin>>n;
    
    ll arr[n+1];
    ll nextGreaterElement[n+1];
    ll previousGreaterElement[n+1];
    stack<ll> s;
    
    for(int i = 1;i <= n;i++)
        cin>>arr[i];
    
    for(int i = 1;i<=n;i++){
        if(s.empty()){
            s.push(i);
            continue;
        }
        if(arr[i] < arr[s.top()]){
            s.push(i);
            continue;
        }
        while(!s.empty() && arr[i] > arr[s.top()]){
            nextGreaterElement[s.top()] = i;
            s.pop();
        }
        s.push(i);
    }
    while(!s.empty()){
        ll index = s.top();
        nextGreaterElement[index] = -1;
        s.pop();
    }
    
    for(int i = n;i >= 1;i--){
        if(s.empty()){
            s.push(i);
            continue;
        }
        if(arr[i] < arr[s.top()]){
            s.push(i);
            continue;
        }
        while(!s.empty() && arr[i] > arr[s.top()]){
            previousGreaterElement[s.top()] = i;
            s.pop();
        }
        s.push(i);
    }
    while(!s.empty()){
        ll index = s.top();
        previousGreaterElement[index] = -1;
        s.pop();
    }
    for(int i = 1;i <= n;i++){
        cout<<nextGreaterElement[i]<<previousGreaterElement[i]<<endl;
    }
}
