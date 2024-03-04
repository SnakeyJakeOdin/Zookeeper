import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menu setup
        Scanner scanner = new Scanner(System.in);
        String userSelection;

        // Cycle until "exit" is typed
        while (true) {
            System.out.print("Please enter the number of the habitat you would like to view: ");
            userSelection = scanner.nextLine();

            // Exit program
            if (userSelection.equals("exit")) {
                break;
            }
        }
        System.out.println("Have a good day!");
    }
    public static String camel() {
        return """
            Switching on the camera in the camel habitat...
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
            Look at that! Our little camel is sunbathing!""";
    }
}
