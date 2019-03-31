package mapperTest;

import com.chris.model.entity.ItemInfo;
import com.chris.model.mapper.ItemInfoMapper;
import com.chris.server.ServerApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServerApplication.class)
public class ItemInfoMapperTest {
    @Autowired
    private ItemInfoMapper mapper;

    @Test
    public void test() {
        List<ItemInfo> res= mapper.selectAll();
        System.out.println("================="+res.size());
        Assert.assertNotEquals(res.size(),0);
    }
}
