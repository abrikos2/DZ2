#include <iostream>
#include <cmath>
using namespace std;

#define task_20

#ifdef task_1
int main(){
    int x;
    cin >> x;
    if (x > 0){
        x++;
    } else if (x < 0){
        x--;
        x--;
    } else if (x == 0){
        x = 10;
    }
    cout << x << endl;
    return 0;
}
#endif 

#ifdef task_2
int main(){
    int a,b,c;
    cin >> a >> b >> c;
    int pos_count, neg_count = 0;
    if (a > 0) {pos_count++;}
    else if (a < 0) {neg_count++;}

    if (b > 0) {pos_count++;}
    else if (b < 0) {neg_count++;}

    if (c > 0) {pos_count++;}
    else if (c < 0) {neg_count++;}

    cout << pos_count << endl;
    cout << neg_count << endl;
    return 0;
}
#endif 

#ifdef task_3
int main(){
    int a,b;
    cin >> a >> b;
    if (a > b) {
        cout << a << endl;
    } else if (a < b) {
        cout << b << endl;
    } else {
        cout << a << "=" << b << endl;
    }
    return 0;
}
#endif 

#ifdef task_4
int main(){
    double A,B;
    cin >> A >> B;
    if (A > B){
        double temp;
        temp = A;
        A = B;
        B = temp;
    }
    cout << "A=" << A << endl;
    cout << "B=" << B << endl;

    return 0;
}
#endif 

#ifdef task_5
int main(){
    int a,b,c, middle;
    cin >> a >> b >> c;
    if ((a >= b && a <= c)||(a <= b && a >= c)){middle = a;} 
    else if ((b >= a && b <= c)||(b <= a && b >= c)){middle = b;} 
    else {middle = c;}
    cout << middle << endl;
    return 0;
}
#endif 

#ifdef task_6
int main(){
    double A,B,C;
    cin >> A >> B >> C;
    if (A < B && B < C) {
        A *= 2;
        B *= 2;
        C *= 2;
    } else {
        A = -A;
        B = -B;
        C = -C;
    }
    cout << "A=" << A << endl;
    cout << "B=" << B << endl;
    cout << "C=" << C << endl;
    return 0;
}
#endif 

#ifdef task_7
int main(){
    double x,y;
    cin >> x >> y;
    if (x > 0 && y > 0) {
        cout << "Точка находится в 1 четверти" << endl;
    } else if (x < 0 && y > 0){
        cout << "Точка находится в 2 четверти" << endl;
    } else if (x < 0 && y < 0){
        cout << "Точка находится в 3 четверти" << endl;
    } else {
        cout << "Точка находится в 4 четверти" << endl;
    }
    return 0;
}
#endif 

#ifdef task_8
int main(){
    double x;
    cin >> x;
    if (x > 0) {
        cout << "f(x)=" << 2 * sin(x) << endl;
    } else {
        cout << "f(x)=" << 6-x << endl;
    }
    return 0;
}
#endif 

#ifdef task_9
int main(){
    double x;
    cin >> x;
    if (x <= -2 || x > 2) {
        cout << "f(x)=" << 2 * x << endl;
    } else {
        cout << "f(x)=" << -3 * x << endl;
    }
    return 0;
}
#endif 

#ifdef task_10
int main(){
    double x;
    cin >> x;
    if (x <= 0) {
        cout << "f(x)=" << -x << endl;
    } else if (0 < x < 2){
        cout << "f(x)=" << x * x << endl;
    } else {
        cout << "f(x)=" << 4 << endl;
    }
    return 0;
}
#endif 

#ifdef task_11
int main(){
    double x;
    cin >> x;
    if (x < 0) {
        cout << "f(x)=" << 0 << endl;
    } else if (int(x) % 2 == 0){
        cout << "f(x)=" << 1 << endl;
    } else {
        cout << "f(x)=" << -1 << endl;
    }
    return 0;
}
#endif 

#ifdef task_12
int main(){
    int year;
    cin >> year;
    if ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
        cout << 366 << endl;
    } else {
        cout << 365 << endl;
    }
    return 0;
}
#endif 

#ifdef task_13
int main(){
    int x;
    cin >> x;
    if (x == 0) {
        cout << "нулевое число" << endl;
    } else {
        if (x > 0) {
            cout << "положительное";
        } else {
            cout << "отрицательное";
        }
        
        if (x % 2 == 0) {
            cout << "четное";
        } else {
            cout << "нечетное";
        }
        
        cout << "число" << endl;
    }
    return 0;
}
#endif 

#ifdef task_14
int main(){
    int x;
    cin >> x;
    if (x % 2 == 0){
        cout << "четное" << endl;
    } else {
        cout << "нечетное" << endl;
    }
    if (x < 10) {
        cout << "однозначное" << endl;
    } else if (x < 100) {
        cout << "двузначное" << endl;
    } else {
        cout << "трехзначное" << endl;
    }
    return 0;
}
#endif 

#ifdef task_15
int main(){
    int x;
    cin >> x;
    switch (x){
        case 1: cout << "Понедельник" << endl;
        case 2: cout << "Вторник" << endl;
        case 3: cout << "Среда" << endl;
        case 4: cout << "Четверг" << endl;
        case 5: cout << "Пятница" << endl;
        case 6: cout << "Суббота" << endl;
        case 7: cout << "Воскресенье" << endl;
    }
    return 0;
}
#endif 

#ifdef task_16
int main(){
    int x;
    cin >> x;
    switch (x){
        case 1: cout << "Зима" << endl;
        case 2: cout << "Зима" << endl;
        case 3: cout << "Весна" << endl;
        case 4: cout << "Весна" << endl;
        case 5: cout << "Весна" << endl;
        case 6: cout << "Лето" << endl;
        case 7: cout << "Лето" << endl;
        case 8: cout << "Лето" << endl;
        case 9: cout << "Осень" << endl;
        case 10: cout << "Осень" << endl;
        case 11: cout << "Осень" << endl;
        case 12: cout << "Зима" << endl;
    }
    return 0;
}
#endif 

#ifdef task_17
int main(){
    int x,m;
    cin >> x >> m;
    switch (x){
        case 1: cout << m << "Килограмм" << endl;
        case 2: cout << m << "Милиграмм" << endl;
        case 3: cout << m << "Грамм" << endl;
        case 4: cout << m << "Тонн" << endl;
        case 5: cout << m << "Центнеров" << endl;
    }
    return 0;
}
#endif 

#ifdef task_18
int main() {
    int D, M;
    cin >> D >> M;
    int prevD = D, prevM = M;
    switch (M) {
        case 1: 
            if (D == 1) {
                prevD = 31;
                prevM = 12;
            } else {
                prevD = D - 1;
            }
        case 2: case 4: case 6: case 8: case 9: case 11:
            if (D == 1) {
                prevD = 31;
                prevM = M - 1;
            } else {
                prevD = D - 1;
            }
        case 5: case 7: case 10: case 12:
            if (D == 1) {
                prevD = 30;
                prevM = M - 1;
            } else {
                prevD = D - 1;
            }            
        case 3: 
            if (D == 1) {
                prevD = 28; 
                prevM = 2;
            } else {
                prevD = D - 1;
            }
    }
    
    cout << prevD << " " << prevM << endl;
    
    return 0;
}

#endif 

#ifdef task_19
int main(){
    int D,M;
    cin >> D >> M;
    int nextD = D, nextM = M;
    switch (M) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            if (D == 31) {
                nextD = 1;
                if (M == 12) {
                    nextM = 1;
                } else { 
                    nextM = M+1;
                }
            } else {
                nextD = D + 1;
            }
            
        case 4: case 6: case 9: case 11:
            if (D == 30) {
                nextD = 1;
                nextM = M + 1;
            } else {
                nextD = D + 1;
            }
            
        case 2:
            if (D == 28) {
                nextD = 1;
                nextM = 3;
            } else {
                nextD = D + 1;
            }
    }
    
    cout << nextD << " " << nextM << endl;
    return 0;
}
#endif 



#ifdef task_20
int main(){
    char C;
    int N;
    cin >> C;
    cin >> N;
    char newD = C;
    setlocale(LC_ALL, "Russian");
    switch (N) {
        case 0: 
            break;
            
        case 1: 
            switch (C) {
                case 'С': newD = 'З';  
                case 'З': newD = 'Ю';  
                case 'Ю': newD = 'В'; 
                case 'В': newD = 'С';
            }
        case -1: 
            switch (C) {
                case 'С': newD = 'В';  
                case 'В': newD = 'Ю'; 
                case 'Ю': newD = 'З'; 
                case 'З': newD = 'С'; 
                
            }
            
    }
    
    cout << newD << endl;
    return 0;
}
#endif 