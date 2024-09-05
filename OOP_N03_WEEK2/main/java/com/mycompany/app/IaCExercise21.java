package main.java.com.mycompany.app;

public class IaCExercise21 {
     // Tạo enum đại diện cho sáu loại tiền tệ ít giá trị nhất
     enum PaperCurrency {
        ONE, TWO, FIVE, TEN, TWENTY, FIFTY
    }

    public static void main(String[] args) {
        // Lặp qua các giá trị của enum và in ra mỗi giá trị cùng với ordinal()
        for (PaperCurrency currency : PaperCurrency.values()) {
            System.out.println(currency + " có ordinal: " + currency.ordinal());
        }
    }
}
