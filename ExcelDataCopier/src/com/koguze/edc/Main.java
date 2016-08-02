/**
 *
 */
package com.koguze.edc;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * @author koguze
 */
public class Main {

    /**
     * @param args
     */

    private static final String ops = "ops";
    private static final String op = "op";


    public static void main(String[] args) {

        // it only needs one parameter
        // path of rule file

        if (args != null && args.length > 0) {
            Main m = new Main();
            m.readDataFromRuleFile(args[0]);
        } else {

        }
    }

    private void readDataFromRuleFile(String ruleFilePath) {
        // read rules from file

        try {

            File ruleFile = new File(ruleFilePath);

            JAXBContext jaxbContext = JAXBContext.newInstance(Operations.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Operations operations = (Operations) jaxbUnmarshaller.unmarshal(ruleFile);

            List<Operation> l = operations.getOperations();

            for (Operation o : l) {
                InputStream inp = new FileInputStream(o.getSrcfilepath());
                //InputStream inp = new FileInputStream("workbook.xlsx");

                Workbook wb = WorkbookFactory.create(inp);
                Sheet sheet = wb.getSheet(o.getSrcsheet());
                Row row = sheet.getRow(o.getSrcrowstart());
                Cell cell = row.getCell(o.getSrccolumnstart());
                if (cell == null)
                    cell = row.createCell(3);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                cell.setCellValue("a test");


                // Write the output to a file
                FileOutputStream fileOut = new FileOutputStream("workbook.xls");
                wb.write(fileOut);
                fileOut.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
