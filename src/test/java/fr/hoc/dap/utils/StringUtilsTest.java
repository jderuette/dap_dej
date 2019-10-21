package fr.hoc.dap.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author djer1
 *
 */
public class StringUtilsTest {

    @Test
    public void testToTable_oneCol() {
        List<String> datas = new ArrayList<String>();
        datas.add("le petit chas");
        datas.add("se tient");
        datas.add("dans la forêt");

        Integer numberOfCol = 3;
       

        String table = StringUtils.toTable(numberOfCol, datas);
        
        Integer expectedNbRows = 1;

        Assert.assertNotNull("Table should contains datas", table);
        Integer expectedPipe = expectedNbRows * (1 + numberOfCol);
        Assert.assertEquals("Table should contains " + expectedNbRows + " row and " + numberOfCol + " columns",
                expectedPipe, countNbPipe(table));

        Integer numberOfTable = 1;
        Assert.assertEquals("Table should contains " + numberOfTable+" table start", numberOfTable, countNbTableStart(table));
    }

    @Test
    public void testToTable_twoCol() {
        List<String> datas = new ArrayList<String>();
        datas.add("le petit chas");
        datas.add("se tient");
        datas.add("sur sa tige");
        datas.add(" ,quand soudain");

        Integer numberOfCol = 2;
       
        String table = StringUtils.toTable(numberOfCol, datas);
        
        Integer expectedNbRows = 2;

        Assert.assertNotNull("Table should contains datas", table);
        Integer expectedPipe = expectedNbRows * (1 + numberOfCol);
        Assert.assertEquals("Table should contains " + expectedNbRows + " row and " + numberOfCol + " columns",
                expectedPipe, countNbPipe(table));

        Integer numberOfTable = 1;
        Assert.assertEquals("Table should contains "  +numberOfTable+ " table start", numberOfTable, countNbTableStart(table));
    }
    
    
    @Test
    public void testToTable_lastRowPartial() {
        List<String> datas = new ArrayList<String>();
        datas.add("le petit chas");
        datas.add("se tient");
        datas.add("sur sa tige");
        datas.add(" ,quand soudain");
        datas.add(" ,il se fait enfiller");

        Integer numberOfCol = 2;

        String table = StringUtils.toTable(numberOfCol, datas);
        
        Integer expectedNbRows = 3;

        Assert.assertNotNull("Table should contains datas", table);
        Integer expectedPipe = expectedNbRows * (1 + numberOfCol);
        Assert.assertEquals("Table should contains " + expectedNbRows + " row and " + numberOfCol + " columns",
                expectedPipe, countNbPipe(table));

        Integer numberOfTable = 1;
        Assert.assertEquals("Table should contains " + numberOfTable + " table start", numberOfTable, countNbTableStart(table));
    }
    
    @Test
    public void testToTable_nullList() {
        List<String> datas = null;

        Integer numberOfCol = 42;

        String table = StringUtils.toTable(numberOfCol, datas);
        
        Integer expectedNbRows = 0;

        Assert.assertNotNull("Table should contains be empty", table);
        Integer expectedPipe = 0;
        Assert.assertEquals("Table should contains " + expectedNbRows + " row and " + numberOfCol + " columns",
                expectedPipe, countNbPipe(table));

        Integer numberOfTable = 0;
        Assert.assertEquals("Table should contains " + numberOfTable+" table start", numberOfTable, countNbTableStart(table));
    }
    
    @Test
    public void testToTable_emptyList() {
        List<String> datas = new ArrayList<String>();

        Integer numberOfCol = 42;

        String table = StringUtils.toTable(numberOfCol, datas);
        
        Integer expectedNbRows = 0;

        Assert.assertNotNull("Table should contains be empty", table);
        Integer expectedPipe = 0;
        Assert.assertEquals("Table should contains " + expectedNbRows + " row and " + numberOfCol + " columns",
                expectedPipe, countNbPipe(table));

        Integer numberOfTable = 0;
        Assert.assertEquals("Table should contains " + numberOfTable+" table start", numberOfTable, countNbTableStart(table));
    }
    
    @Test
    public void testToTable_zeroCol() {
        List<String> datas = new ArrayList<String>();
        datas.add("le petit chas");
        datas.add("se tient");
        datas.add("sur sa tige");
        datas.add(" ,quand soudain");
        datas.add(" ,il se fait enfiller");

        Integer numberOfCol = 0;

        String table = StringUtils.toTable(numberOfCol, datas);
        
        Integer expectedNbRows = 0;

        Assert.assertNotNull("Table should contains be empty", table);
        Integer expectedPipe = 0;
        Assert.assertEquals("Table should contains " + expectedNbRows + " row and " + numberOfCol + " columns",
                expectedPipe, countNbPipe(table));

        Integer numberOfTable = 0;
        Assert.assertEquals("Table should contains " + numberOfTable+" table start", numberOfTable, countNbTableStart(table));
    }


    private Integer countNbPipe(String data) {
        int count = org.springframework.util.StringUtils.countOccurrencesOf(data, "|");
        return count;
    }

    private Integer countNbTableStart(String data) {
        int count = org.springframework.util.StringUtils.countOccurrencesOf(data,
                "---------------------------------------------------------");
        return count;
    }
}
