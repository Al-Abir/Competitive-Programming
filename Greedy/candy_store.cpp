#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
class Solution {
  public:
    vector<int> candyStore(int candies[], int N, int k) {
        // Write Your Code here
        
        sort(candies, candies+N);
        int min_ammount=0, max_ammount=0;
        int i =0, j=N-1;
        
        while(i<=j){
            
              min_ammount+=candies[i];
              i++;
              j-=k;
        }
        
        i=N-1, j=0;
        while(i>=j){
            max_ammount+=candies[i];
            i--;
            j+=k;
        }
        
        vector<int> ans ;
        ans.push_back(min_ammount);
        ans.push_back(max_ammount);
        
        return ans;
    }
};

int main(){
     Solution sl;
     int N,K;
     cin>>N>>K;
     int candies[N];
     for(int i=0; i<N; i++){
        cin>>candies[i];
     }
    vector<int> ans = sl.candyStore(candies, N, K);

    for(int num:ans){

        cout<<num<<" ";

    }
    cout<<endl;


    return 0;    
}