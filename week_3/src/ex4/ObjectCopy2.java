package ex4;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

        //배열 복사를 실시함
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        //얕은 복사 상태임으로 원본값(array1)이 바뀌면 복사배열(array2)도 바뀜
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("=== bookArray1 shallow copy===");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
        System.out.println("=== bookArray2 shallow copy===");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }


        //깊은 복사 for문으로 새로운 객체를 new로 생성해서 직접 넣어줌
        Book[] bookArray3 = new Book[3];
        System.arraycopy(bookArray1, 0, bookArray3, 0, 3);
        bookArray3[0] = new Book("태백산맥", "조정래");

//        bookArray3[0].setBookName("태백산맥");
//        bookArray3[0].setAuthor("조정래");

        System.out.println("=== bookArray1 deep copy===");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("=== bookArray3 deep copy===");
        for (int i = 0; i < bookArray3.length; i++){
            bookArray3[i].showBookInfo();
        }
    }
}