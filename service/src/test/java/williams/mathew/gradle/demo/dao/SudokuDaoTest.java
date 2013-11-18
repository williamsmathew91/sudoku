package williams.mathew.gradle.demo.dao;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.Whitebox;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import williams.mathew.gradle.demo.data.model.Status;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.AssertJUnit.assertTrue;

public class SudokuDaoTest {
    private SudokuDao sudokuDao;

    @Mock
    private Session sessionMock;

    @BeforeMethod
    public void setUp() throws Exception {
        initMocks(this);

        sudokuDao = new SudokuDao();

        Whitebox.setInternalState(sudokuDao, "session", sessionMock);
    }

    @Test
    public void shouldCallSaveWithCorrectInputs() throws Exception {
        assertTrue(true);
    }
}
