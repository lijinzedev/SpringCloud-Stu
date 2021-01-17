import com.creaway.Main;
import com.creaway.mapper.AppAlarmDao;
import com.creaway.model.AppAlarm;
import com.creaway.service.AppAlarmService;

import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author: Curiosity
 * @Date: 2021/1/17 23:24
 * @Description:
 */
@SpringBootTest(classes = Main.class)
public class App {
    @Autowired
    AppAlarmService appAlarmService;

    //mybatis-plus逆向工程
    @Test
    public void testMappingGenerator() {
//        Main.autoGenerator().execute();
        AppAlarm entity = new AppAlarm();
        entity.setAlarmDate(LocalDateTime.now());
        entity.setAlarmLevel("1");
        entity.setAlarmNo(1);
        entity.setAlarmStatus("1");
        entity.setInfo("test");
        appAlarmService.list();

    }


}
