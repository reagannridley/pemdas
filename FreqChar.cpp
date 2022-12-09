//optional
#include <bits/stdc++.h>

using namespace std;
int main() {
    
    string kt;
    getline(cin,kt);
    
    char arr[kt.length() + 1];
    strcpy(arr, kt.c_str()); 
    int n = sizeof(arr) / sizeof(arr[0]);
    sort(arr, arr+n);

    char t = arr[1];
    char c;
    int counter = 0, s = n - 1;;
    for(int j = 1; j <= s; j++){
        c = arr[j];
        if(t != c) {
            cout << t << ": " << counter <<"\n";
            t = c;
            counter = 1;
            if(j == s) cout << t << ": " << counter <<"\n";
            continue;
        }
        counter++;
        if(j == s) cout << t << ": " << counter <<"\n";
    }
    return 0;
}
