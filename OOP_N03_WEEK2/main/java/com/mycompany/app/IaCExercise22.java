package main.java.com.mycompany.app;

public class IaCExercise22 {
        // Tạo enum đại diện cho sáu loại tiền tệ ít giá trị nhất
        enum PaperCurrency {
            ONE, TWO, FIVE, TEN, TWENTY, FIFTY
        }
    
        public static void main(String[] args) {
            // Lặp qua các giá trị của enum và sử dụng switch để in ra mô tả
            for (PaperCurrency currency : PaperCurrency.values()) {
                switch (currency) {
                    case ONE -> System.out.println("ONE: Loại tiền giấy mệnh giá nhỏ nhất.");
                    case TWO -> System.out.println("TWO: Một mệnh giá hiếm gặp.");
                    case FIVE -> System.out.println("FIVE: Mệnh giá thường được sử dụng.");
                    case TEN -> System.out.println("TEN: Mệnh giá phổ biến.");
                    case TWENTY -> System.out.println("TWENTY: Mệnh giá tương đối lớn.");
                    case FIFTY -> System.out.println("FIFTY: Mệnh giá lớn nhất trong danh sách này.");
                }
            }
        }
}
