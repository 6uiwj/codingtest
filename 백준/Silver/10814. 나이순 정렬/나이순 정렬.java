import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int idx = 0;
        String[] users = new String[2];
        List<Users> usersList = new ArrayList<Users>();
        Users[] usersArray = new Users[n];
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<n; i++) {
            users = br.readLine().split(" ");
            Users user = new Users();
            user.age = Integer.parseInt(users[0]);
            user.name = users[1];
            user.index = idx;
            usersArray[i] = user;
            idx++;
        }

        Arrays.sort(usersArray, (a,b) -> {
            if (a.age != b.age) return a.age - b.age;
            return a.index - b.index;
        });

        for (Users user : usersArray) {
            sb.append(user.age).append(" ").append(user.name).append("\n");
        }
        System.out.println(sb.toString());
    }
}

class Users {
    int age;
    String name;
    int index;
}
