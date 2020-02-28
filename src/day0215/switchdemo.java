public class switchdemo {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A': {
                System.out.print("优秀");
                break;
            }
            case 'B': {
                System.out.print("良好");
                break;
            }
            case 'C': {
                System.out.print("及格");
                break;
            }
            case 'D':{
                System.out.print("继续努力");
                break;
            }
            default:
                System.out.print("等级 " + grade);
        }

    }
}