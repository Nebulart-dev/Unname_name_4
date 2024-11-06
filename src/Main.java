//Рисунок в консоле (Прямоугольник)
/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            System.out.println("* * * * *");
        }
    }
}
*/

/*
//Рисунок в консоле (Треугольник - Полный)
public class Main {
    public static void main(String[] args) {
        int count = 7;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < count - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
*/

/*
//Рисунок в консоле (Треугольник - Полутреугольник 1)
public class Main {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j > count - i - 2) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
*/

/*
//Рисунок в консоле (Треугольник - Полутреугольник 2)
public class Main {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < count - i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
*/

/*
//Рисунок в консоле (Ромбик)
public class Main {
    public static void main(String[] args) {
        int count = 7;
        int n = count;

        //Верхняя часть
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < count - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        //Нижняя часть
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < count; j++) {
                if (j > count - i - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

*/

/*
//Рисунок в консоле (Слеш 1)
public class Main {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j == count - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/

/*
//Рисунок в консоле (Слеш 2)
public class Main {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/
