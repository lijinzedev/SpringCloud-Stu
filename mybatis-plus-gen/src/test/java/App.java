import com.creaway.Main;
import com.creaway.mapper.AppAlarmDao;
import com.creaway.model.AppAlarm;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author: Curiosity
 * @Date: 2021/1/17 23:24
 * @Description:
 */
@SpringBootTest
public class App {
    @Resource
    AppAlarmDao appAlarmDao;

    //mybatis-plus逆向工程
    @Test
    public void testMappingGeneratorOracle() {
//        Main.autoGenerator().execute();
        AppAlarm entity = new AppAlarm();
        entity.setAlarmDate(LocalDateTime.now());
        entity.setAlarmLevel("1");
        entity.setAlarmNo(1);
        entity.setAlarmStatus("1");
        entity.setInfo("test");
        appAlarmDao.insert(entity);

    }


}
