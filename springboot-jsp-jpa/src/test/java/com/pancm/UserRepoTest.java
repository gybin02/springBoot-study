import com.pancm.dao.UserDao;
import com.pancm.pojo.User;
import com.pancm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void baseTest() throws Exception {
        User user = new User();
        user.setName("Jay");
        user.setPassword("123456");
        user.setBirthday("2008-08-08");
        userDao.save(user);
//        userDao.delete(user);
//        userDao.findOne(1);
    }
}