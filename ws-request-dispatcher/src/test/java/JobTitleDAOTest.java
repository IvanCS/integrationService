import com.ipetrushin.syncher.ejb.dispatcher.core.DestinationService;
import com.ipetrushin.syncher.ejb.dispatcher.dao.JobTitleDAO;
import com.ipetrushin.syncher.ejb.dispatcher.dao.entities.JobtitleEntity;
import com.ipetrushin.syncher.ejb.dispatcher.dao.entities.JobtitlehhEntity;
import com.ipetrushin.syncher.ejb.dispatcher.dao.entities.JobtitlemonsterEntity;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 25.08.13
 * Time: 22:07
 * To change this template use File | Settings | File Templates.
 */

public class JobTitleDAOTest {

    private final String JT_NAME = "testName",
            JT_HH_NAME = "testNameHH",
            JT_MONSTER_NAME = "testNameMonster";
    @EJB
    private JobTitleDAO jobTitleDAO;
    private static EJBContainer container;

    @BeforeClass
    public static void setup(){
        container = EJBContainer.createEJBContainer();
    }
    @AfterClass
    public static void destroy(){
        container.close();
    }

    @Before
    public void preTest() throws Exception {

            container.getContext().bind("inject", this);

            initJobTitleDAOData();



    }




    private void initJobTitleDAOData() {

        JobtitlehhEntity entityHH = new JobtitlehhEntity();
        entityHH.setJobtitlehhid(1);
        entityHH.setName(JT_HH_NAME);

        jobTitleDAO.save(entityHH);

        JobtitlemonsterEntity entityMonster = new JobtitlemonsterEntity();
        entityMonster.setJobtitlemonsterid(1);
        entityMonster.setName(JT_MONSTER_NAME);

        jobTitleDAO.save(entityMonster);

        JobtitleEntity entity = new JobtitleEntity();
        entity.setName(JT_NAME);
        entity.setJobtitleid(1);
        entity.setReferenceValueHh(1);
        entity.setReferenceValueMonster(1);

        jobTitleDAO.save(entity);
    }

    @Test
    public void testGetJTReferenceNameForHH() throws Exception {
        String nameHH = jobTitleDAO.getJTReferenceName(JT_NAME, DestinationService.HH);
        Assert.assertEquals(JT_HH_NAME, nameHH);

    }

    @Test
    public void testGetJTReferenceNameForMonster() throws Exception {
        String nameMonster = jobTitleDAO.getJTReferenceName(JT_NAME, DestinationService.HH);
        Assert.assertEquals(JT_MONSTER_NAME, nameMonster);
    }

    // @Test
    public void testFindJTEntityByName() throws Exception {
        JobtitleEntity entity = jobTitleDAO.findByJTName(JT_NAME);
        Assert.assertNotNull(entity);
    }
}
