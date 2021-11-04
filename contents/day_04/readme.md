# Type

자바의 타입은 크게 원시 타입(Primitive Type)과 참조 타입(Reference Type)이 있다. 원시 타입은 정수, 실수, 문자, 논리 리터럴등의 실제 데이터 값을 저장하는 타입이고, 참조 타입은 객체의 메모리 주소를 참조하는 타입이다.


```java
public class Type {
    public static void main(String[] args) {
        // Primitive 타입
        int a = 1;
        int b = 2;
        
        // Ref 타입
        Monster monster = new Monster(1L, "Monster", 30);
    };
}
```


## 변수 

원시 타입의 경우 각 변수 간에 원시 타입 데이터를 복사하며, 참조 값의 경우 해당 객체의 값을 바꾼다.  



