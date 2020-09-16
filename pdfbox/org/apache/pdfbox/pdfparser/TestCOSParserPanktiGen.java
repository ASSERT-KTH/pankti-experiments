package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestCOSParserPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setUpXStream() {
        xStream.registerConverter(new FileCleanableConverter());
        xStream.registerConverter(new InflaterConverter());
        xStream.registerConverter(new CleanerImplConverter());
    }

    @Test
    public void testLastIndexOf1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf1-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2025</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>DOa8gTKN07PoLfnoN7Q9UUPbm43mvB0Dr6Yfw16ko0gc/RiPj+hHsJaexpViQixD2oF0FOk40lkkkZ7G4xQeH9IPsdUHkItUhjQVaQfSUaSzSBL9AFGhf2PrVUWWL0Oi9G+ICv0r3tZfEU30JOZO0pM4tLebikryDqqZSG4y4wslM86UZMbiyGulbzX90MPXSj9p9kd8Owf2pu9ADAmXP6KC5Ecag1SLVIckYu5dzL0LjUhbkXYixZDQtCAqSH56DOl1pHehN1IUaQyShp5owsu00uNN4UG+gQ76J/pH3Dt99A36ipq+Tl9W09foH9T0VUzTMD1GX25K88FAHdYD9lEwVTDNxXqB/r45w+KLDzTToygeH2IuUhnSaKSpSFuQRHqUpjfN8FmQyWE4hh69jzbBl2r6BDyqgeg8XzQ8GHXMzyDc7yrMIezw7wjTaHjbdjxlEL7zbswxCN+yGXMMwqvWYY5BeMEyzDEIz5iHOQbhyVMxxyA8egLmEFrpb57LyPQVjZ5P/ANNdDlKaTlKaTlKaTnwdDk74Aeeje3BpuxslNgD0UiPbF/jIdJ4hDSOI42PksaZpPEm0riONJaSxutIY4Q0ekljGmmMksbDpBhF0UiiLVeclkRdpPEYadxDGhtIY5g0hkhjBmn0k6JoKw00Dc9Xkwo1aR7I1hWmVw3IM+EYAyjRAKp1AJf9UcTjSHH1LIqN/OmJxu40lqY3Z5clznv1y1s0cBh9ETu+iNPwIpxC4nGCXkQ1ehGZvIgMTIhlSFOR2pDOIsWRRGydjgPfoqIJMRepDGkq0lqks0iiOpyzSBQWJYe4Vx1YbnLQo9kZfREP9gtHARqIpipeJaIM47Z4iSmNjE6Lp9EiYM4nWMwacysxHPiX4ft/YXg8UEvvpFsgFSdiazLd0vRDqq+V3N8UPuwbaCf3QRqPWkdKIExCmBZDg3peCF4NSwvAS5/BNK/JO8nHvvQTzvEdIkbW64DvB+8Z35feVorZL7yHfX/xt/KkyfdnLHnmgO8d722+V3NbNVhyJNxKMDnkV5se9Bb79hxTm67DigeafDex5IBvjXeob75XrZiZqLiuAc+iJt+48GTfMORX7r3eF21Angd8Zd7rfKWJVoWszwFfbxxCJJHNxsH28KoXDaapDCcWtZI50Rxpm1QljZb6SnlSjhSQfFKqlCLZNBaNojFq9BgbazSihtdQDWhs7EtyEeYA2kRFfe7PM+TVvEIZMi9DfeCtoXA1xKxcJa0cP4hUxtqmQ+X1/tiF8cFWIo+dHBOCg0jMUgmVEwbFiiOVrVJ8XKwoUhmTxlxbtY+QO6uxNEY3thKYUNVK4qxofQr7eZaDQIh5/R0pLM1af0d1Nbgcy8pcZZYB5pIh5f8BapPY7dWG64p8amxb5fiq2NOp1bE8lomnVlfGfs1+v+Ug+Zacqyg/SP7Bkuqqg9wA8m3FOFbODSivrq5sJZPUduAn/8B2qDH/UNtp0sDP2oFfk5Zo90CiXQj7Y7sMlmA7rRZCaruQVqu24wlrt68ho6J8X0aG2sbphwa1TYPT373NsRC2CYXUNo5GOKa2OeZoZG1iA9QmXi82SfOqTYgHvGoTL/GoTSZdbpKbbHJbV5Pb1Ctx5HIbb6KN4fSlNobT2CbyX/3MHBSJkOb+1dOnsN++qQ1WzESqjd2+bI4r1ni9379venXyR3HCtddPn8PSaTNj1cGZ5bHpwXL/vv5T/kP1FFbdP1i+D6ZUTKjaNyU6s7ypf7R/RXBaeXXz0DEFRVdc67auaxWM+Q/MxjBmBexaQ4v+Q3URqx7KrlXErlXErjU0OlS9Fqg6PqZqnwYGVQ+ekkibqU5Gfa1NCVQPcih1A1Tl7R9w3ZRyCB2Sp0AXqY7pg4NiBiRW1XNgz4GsCtcUqzKyHzhKVrlu6h9IOUSeSlYpWGwODoLIkqUNS8FVMbc88deAHyxaspQJPIGRhl/6YF1FLDqtvGEJBpix7PGVsbKxk6v2SRKW1rJbivW7VKbTVbTG2xKFvbCwHyvkuK6GrKyUlWm1yYY/n/+lyVR9ht9IDzeTaBpBn7Wai6VVTqBoCiYkf0nmELpLbHtoqMYbbCAR0nCJhzpsSL6dZPd7iZYsTeaScliSTBO9sEvDJXF0fbAPmqr/BbpeQAANCmVuZHN0cmVhbQplbmRvYmoKeHJlZgowIDEzCjAwMDAwMDAwMDAgNjU1MzUgZg0KMDAwMDAwMDAxNSAwMDAwMCBuDQowMDAwMDAwMTI0IDAwMDAwIG4NCjAwMDAwMDAwNzggMDAwMDAgbg0KMDAwMDAwMDE4MSAwMDAwMCBuDQowMDAwMDAwNDcxIDAwMDAwIG4NCjAwMDAwMDExMzggMDAwMDAgbg0KMDAwMDAwMTE3NyAwMDAwMCBuDQowMDAwMDAxMzEwIDAwMDAwIG4NCjAwMDAwODMyNDAgMDAwMDAgbg0KMDAwMDA4MzgyNyAwMDAwMCBuDQowMDAwMDg0MjMwIDAwMDAwIG4NCjAwMDAwODQ0NjYgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzwxQzkwNEFGRUQyNkNEMUZBRDg2OUM4MzQ1ODA2RjNBMj4gPDFDOTA0QUZFRDI2Q0QxRkFEODY5QzgzNDU4MDZGM0EyPl0KL1NpemUgMTMKPj4Kc3RhcnR4cmVmCjEwMDgxMgolJUVPRgo=</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf2-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2025</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf3-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>7yN++D6CQgpD+PV8JfXBh1gVDFe2/djH7me3tLmeshf2ZjdTMlZROxtGLpaKMIeaZXwoJVlFOISS+CMIs9qSJuGxyDZXun0z6yGe2mj/MemI/dMkP4f6SdJT9rc1v8ra7G8h5ZGN9t1J19pfzvRbkbLF5WcINmvSdFNSjv3R7dJ0KTLWttmXiGCj/dKkEfYLk2RGfSDj/GbEPJH28a5z7CNRXknSVLunGWVutBcknW/PC1gNFc9stA9EE9wBNQ2N7Z8kK3UmywInZvtZgyfdssZSZRljOd2SZUm3OCx2Sx9LoqWXNdpqs/awhltDrVar2apauZWsvfzGAY9bbDR6mW0iMKuCqtRtnORvx3IfwpmV05mk91TKefmEIlaud9RS+VRN/26C089CsWE2OYuYHl1O5ZVFeo673G8xxuvZ7nLdMvbcqlbGrvciVefX+Bl2u35miKRlieJouokYi1p2XaIIT1t2nddLcTHzC+IKovOjhpWV/A6qg3T/esV10/voa8onVOkP9/HqWUIx+njL9RvF2XUT+5odLy3ZxL4Sgbdqk5LPvi4dL9KV/BKvt9zPJkk70thXsMOI+UraWZNJE3akWZMDdmsDdql4HnYpIoAdtqep0i41JETaqUzYtTanlJa0pqRIm1iNmqVNc6x2qs32VNikpkqbGB9tlzbbY3zCRs+XJklJMElOkiYsgZKkSRJLkCaTfjXJDJpc22VyraxJYb/aJAVsIg6ctIk4ABv3n73qi9xu1j7cWztZnPurnaX1kGp9+fyGON03VdNaa73BHwRc1VNrG0RYU697nfUleq2zRGsdPvl3sieL7OHOklZsoCurWid76kvahnuGlzprSrztI8YOye5W17VddQ0Z+zuFjRWFDRF1jcj+nexskT1C1JUt6soWdY3wjJB1kRzjY6tarVTkxTFThu08LBTjtTrR4S2KsTXly8E73BG3JHEzNiTrKQyn7nBnkR4BEVkZhRmFIgtzSmT1ED/uBLPilgx3JG5m64NZNiRHOYvIPXde8zyKK51eEvjXjAtJc+eJDg/Q3fxHF/JKdU9NSfNcHEf0tAnlegHOta0WC1KrxSvpuSfTwsJKcbwMJA5AYq5IVJQuQ5GWJ9JCQoKGv/3+84JhsZgFPv5UO/MkM+xZvYqeXF7J4Qoqg6fozdguieWh2YsXbGZu1nyyDNlsCugk3vekzJ0X1IL9MDcYBp7CI80nu6PrwjNwVf8FmKSL4WVuZHN0cmVhbQplbmRvYmoKMTAgMCBvYmoKPDwgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL0xlbmd0aCAyMjMgPj4Kc3RyZWFtCnicXZBNasQwDIX3PoWW08VgT7oNgTKlkEV/aNoDOLaSGhrZKM4it6/shilUYIP83ieepa/9Y08hg37j6AbMMAXyjGvc2CGMOAdSlwZ8cPno6u0Wm5QWeNjXjEtPU1RtC6DfRV0z73B68HHEO6Vf2SMHmuH0eR2kH7aUvnFBymBU14HHSSY92/RiFwRdsXPvRQ95Pwvz5/jYE0JT+8tvGhc9rsk6ZEszqtZIddA+SXUKyf/TD2qc3Jfl6r4XtzGNqe7jvXDlf7dQbmOWPHUJNUiJEAhve0oxFaqcH0BjbzllbmRzdHJlYW0KZW5kb2JqCjExIDAgb2JqCjw8IC9UeXBlIC9PYmpTdG0gL0xlbmd0aCA0MzAgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL04gNiAvRmlyc3QgMzggPj4Kc3RyZWFtCnicfVHLbtswELz3K+ZoHyw+RIkyEASw47oxCidG7DaHIAfGYlSisihINFD/fZdy3KQ9FHpB3Nmd2RkhwSFSpAJCIcsg6NY5RA4pqaKhlPh0dQW26Xx53NsOo+1PZ9hmscShyMe4vh7K8zXYne8OpgbbG4g/56a3S98EsFnnTL3egS1sv7dNaZoQCz2eIg3HA57BPjd7X7qmAluVtgkunCa3YNvjSzi1FmxHb04f/61xBLQQfOgcCmAD0RvxjT/SjwD76srIkV8oztCNqWx/wc6ioIApzxKpU6Wo27S31lU/ArTIkkJyMuhNeMBECpFMheI5Udam6qHO3PO5/0VUkzxXSZZxXWCSSpVornkKyWWRpDSJRKc6EXyaFlFPbFy62kpMz7vEgztzsB8sWwVTu/2sqWpLGLYN9vAdioRNC0VTPqwfNXauDb77TwI3q8X21NOQVfPqEUH3XWm76Pvo4vsY7MFWrg/dCaNZ6V/sOAbRtrU9RBM4zR8m7fyX1WJt2vfIyKnHKPMfPeIcwXua1BwhUbz8K0L2SC5yenQW8+WQWifF4N0zXbTYb23MxBhlbmRzdHJlYW0KZW5kb2JqCjEgMCBvYmoKPDwgL1R5cGUgL1hSZWYgL0xlbmd0aCAxNyAvRmlsdGVyIC9GbGF0ZURlY29kZSAvRGVjb2RlUGFybXMgPDwgL0NvbHVtbnMgNSAvUHJlZGljdG9yIDEyID4+IC9XIFsgMSAzIDEgXSAvU2l6ZSAyIC9JRCBbPGI3ZTQ1YzY4MmNiNTg3OGYxZGRiYzg2ODk3ZTJhMGRmPjxiN2U0NWM2ODJjYjU4NzhmMWRkYmM4Njg5N2UyYTBkZj5dID4+CnN0cmVhbQp4nGNiAAEmRiZXBQYAAUwAbQplbmRzdHJlYW0KZW5kb2JqCiAgICAgICAgICAgICAgICAKc3RhcnR4cmVmCjIxNgolJUVPRgo=</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf4-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2025</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf5-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2025</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf6-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2028</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>7yN++D6CQgpD+PV8JfXBh1gVDFe2/djH7me3tLmeshf2ZjdTMlZROxtGLpaKMIeaZXwoJVlFOISS+CMIs9qSJuGxyDZXun0z6yGe2mj/MemI/dMkP4f6SdJT9rc1v8ra7G8h5ZGN9t1J19pfzvRbkbLF5WcINmvSdFNSjv3R7dJ0KTLWttmXiGCj/dKkEfYLk2RGfSDj/GbEPJH28a5z7CNRXknSVLunGWVutBcknW/PC1gNFc9stA9EE9wBNQ2N7Z8kK3UmywInZvtZgyfdssZSZRljOd2SZUm3OCx2Sx9LoqWXNdpqs/awhltDrVar2apauZWsvfzGAY9bbDR6mW0iMKuCqtRtnORvx3IfwpmV05mk91TKefmEIlaud9RS+VRN/26C089CsWE2OYuYHl1O5ZVFeo673G8xxuvZ7nLdMvbcqlbGrvciVefX+Bl2u35miKRlieJouokYi1p2XaIIT1t2nddLcTHzC+IKovOjhpWV/A6qg3T/esV10/voa8onVOkP9/HqWUIx+njL9RvF2XUT+5odLy3ZxL4Sgbdqk5LPvi4dL9KV/BKvt9zPJkk70thXsMOI+UraWZNJE3akWZMDdmsDdql4HnYpIoAdtqep0i41JETaqUzYtTanlJa0pqRIm1iNmqVNc6x2qs32VNikpkqbGB9tlzbbY3zCRs+XJklJMElOkiYsgZKkSRJLkCaTfjXJDJpc22VyraxJYb/aJAVsIg6ctIk4ABv3n73qi9xu1j7cWztZnPurnaX1kGp9+fyGON03VdNaa73BHwRc1VNrG0RYU697nfUleq2zRGsdPvl3sieL7OHOklZsoCurWid76kvahnuGlzprSrztI8YOye5W17VddQ0Z+zuFjRWFDRF1jcj+nexskT1C1JUt6soWdY3wjJB1kRzjY6tarVTkxTFThu08LBTjtTrR4S2KsTXly8E73BG3JHEzNiTrKQyn7nBnkR4BEVkZhRmFIgtzSmT1ED/uBLPilgx3JG5m64NZNiRHOYvIPXde8zyKK51eEvjXjAtJc+eJDg/Q3fxHF/JKdU9NSfNcHEf0tAnlegHOta0WC1KrxSvpuSfTwsJKcbwMJA5AYq5IVJQuQ5GWJ9JCQoKGv/3+84JhsZgFPv5UO/MkM+xZvYqeXF7J4Qoqg6fozdguieWh2YsXbGZu1nyyDNlsCugk3vekzJ0X1IL9MDcYBp7CI80nu6PrwjNwVf8FmKSL4WVuZHN0cmVhbQplbmRvYmoKMTAgMCBvYmoKPDwgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL0xlbmd0aCAyMjMgPj4Kc3RyZWFtCnicXZBNasQwDIX3PoWW08VgT7oNgTKlkEV/aNoDOLaSGhrZKM4it6/shilUYIP83ieepa/9Y08hg37j6AbMMAXyjGvc2CGMOAdSlwZ8cPno6u0Wm5QWeNjXjEtPU1RtC6DfRV0z73B68HHEO6Vf2SMHmuH0eR2kH7aUvnFBymBU14HHSSY92/RiFwRdsXPvRQ95Pwvz5/jYE0JT+8tvGhc9rsk6ZEszqtZIddA+SXUKyf/TD2qc3Jfl6r4XtzGNqe7jvXDlf7dQbmOWPHUJNUiJEAhve0oxFaqcH0BjbzllbmRzdHJlYW0KZW5kb2JqCjExIDAgb2JqCjw8IC9UeXBlIC9PYmpTdG0gL0xlbmd0aCA0MzAgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL04gNiAvRmlyc3QgMzggPj4Kc3RyZWFtCnicfVHLbtswELz3K+ZoHyw+RIkyEASw47oxCidG7DaHIAfGYlSisihINFD/fZdy3KQ9FHpB3Nmd2RkhwSFSpAJCIcsg6NY5RA4pqaKhlPh0dQW26Xx53NsOo+1PZ9hmscShyMe4vh7K8zXYne8OpgbbG4g/56a3S98EsFnnTL3egS1sv7dNaZoQCz2eIg3HA57BPjd7X7qmAluVtgkunCa3YNvjSzi1FmxHb04f/61xBLQQfOgcCmAD0RvxjT/SjwD76srIkV8oztCNqWx/wc6ioIApzxKpU6Wo27S31lU/ArTIkkJyMuhNeMBECpFMheI5Udam6qHO3PO5/0VUkzxXSZZxXWCSSpVornkKyWWRpDSJRKc6EXyaFlFPbFy62kpMz7vEgztzsB8sWwVTu/2sqWpLGLYN9vAdioRNC0VTPqwfNXauDb77TwI3q8X21NOQVfPqEUH3XWm76Pvo4vsY7MFWrg/dCaNZ6V/sOAbRtrU9RBM4zR8m7fyX1WJt2vfIyKnHKPMfPeIcwXua1BwhUbz8K0L2SC5yenQW8+WQWifF4N0zXbTYb23MxBhlbmRzdHJlYW0KZW5kb2JqCjEgMCBvYmoKPDwgL1R5cGUgL1hSZWYgL0xlbmd0aCAxNyAvRmlsdGVyIC9GbGF0ZURlY29kZSAvRGVjb2RlUGFybXMgPDwgL0NvbHVtbnMgNSAvUHJlZGljdG9yIDEyID4+IC9XIFsgMSAzIDEgXSAvU2l6ZSAyIC9JRCBbPGI3ZTQ1YzY4MmNiNTg3OGYxZGRiYzg2ODk3ZTJhMGRmPjxiN2U0NWM2ODJjYjU4NzhmMWRkYmM4Njg5N2UyYTBkZj5dID4+CnN0cmVhbQp4nGNiAAEmRiZXBQYAAUwAbQplbmRzdHJlYW0KZW5kb2JqCiAgICAgICAgICAgICAgICAKc3RhcnR4cmVmCjIxNgolJUVPRgo=</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf7-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2025</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>/Sve1l8RTfQk5k7Skzi0t5uKSvIOqplIbjLjCyUzzpRkxuLIa6VvNf3Qw9dKP2n2R3w7B/am70AMCZc/ooLkRxqDVItUhyRi7l3MvQuNSFuRdiLFkNC0ICpIfnoM6XWkd6E3UhRpDJKGnmjCy7TS403hQb6BDvon+kfcO330DfqKmr5OX1bT1+gf1PRVTNMwPUZfbkrzwUAd1gP2UTBVMM3FeoH+vjnD4osPNNOjKB4fYi5SGdJopKlIW5BEepSmN83wWZDJYTiGHr2PNsGXavoEPKqB6DxfNDwYdczPINzvKswh7PDvCNNoeNt2PGUQvvNuzDEI37IZcwzCq9ZhjkF4wTLMMQjPmIc5BuHJUzHHIDx6AuYQWulvnsvI9BWNnk/8A010OUppOUppOUppOfB0OTvgB56N7cGm7GyU2APRSI9sX+Mh0niENI4jjY+Sxpmk8SbSuI40lpLG60hjhDR6SWMaaYySxsOkGEXRSKItV5yWRF2k8Rhp3EMaG0hjmDSGSGMGafSTomgrDTQNz1eTCjVpHsjWFaZXDcgz4RgDKNEAqnUAl/1RxONIcfUsio386YnG7jSWpjdnlyXOe/XLWzRwGH0RO76I0/AinELicYJeRDV6EZm8iAxMiGVIU5HakM4ixZFEbJ2OA9+iogkxF6kMaSrSWqSzSKI6nLNIFBYlh7hXHVhuctCj2Rl9EQ/2C0cBGoimKl4logzjtniJKY2MToun0SJgzidYzBpzKzEc+Jfh+39heDxQS++kWyAVJ2JrMt3S9EOqr5Xc3xQ+7BtoJ/dBGo9aR0ogTEKYFkODel4IXg1LC8BLn8E0r8k7yce+9BPO8R0iRtbrgO8H7xnfl95WitkvvId9f/G38qTJ92cseeaA7x3vbb5Xc1s1WHIk3EowOeRXmx70Fvv2HFObrsOKB5p8N7HkgG+Nd6hvvletmJmouK4Bz6Im37jwZN8w5Ffuvd4XbUCeB3xl3ut8pYlWhazPAV9vHEIkkc3GwfbwqhcNpqkMJxa1kjnRHGmbVCWNlvpKeVKOFJB8UqqUItk0Fo2iMWr0GBtrNKKG11ANaGzsS3IR5gDaREV97s8z5NW8QhkyL0N94K2hcDXErFwlrRw/iFTG2qZD5fX+2IXxwVYij50cE4KDSMxSCZUTBsWKI5WtUnxcrChSGZPGXFu1j5A7q7E0Rje2EphQ1UrirGh9Cvt5loNAiHn9HSkszVp/R3U1uBzLylxllgHmkiHl/wFqk9jt1YbrinxqbFvl+KrY06nVsTyWiadWV8Z+zX6/5SD5lpyrKD9I/sGS6qqD3ADybcU4Vs4NKK+urmwlk9R24Cf/wHaoMf9Q22nSwM/agV+Tlmj3QKJdCPtjuwyWYDutFkJqu5BWq7bjCWu3ryGjonxfRobaxumHBrVNg9Pfvc2xELYJhdQ2jkY4prY55mhkbWID1CZeLzZJ86pNiAe8ahMv8ahNJl1ukptscltXk9vUK3Hkchtvoo3h9KU2htPYJvJf/cwcFImQ5v7V06ew376pDVbMRKqN3b5sjivWeL3fv296dfJHccK110+fw9JpM2PVwZnlsenBcv++/lP+Q/UUVt0/WL4PplRMqNo3JTqzvKl/tH9FcFp5dfPQMQVFV1zrtq5rFYz5D8zGMGYF7FpDi/5DdRGrHsquVcSuVcSuNTQ6VL0WqDo+pmqfBgZVD56SSJupTkZ9rU0JVA9yKHUDVOXtH3DdlHIIHZKnQBepjumDg2IGJFbVc2DPgawK1xSrMrIfOEpWuW7qH0g5RJ5KVilYbA4OgsiSpQ1LwVUxtzzx14AfLFqylAk8gZGGX/pgXUUsOq28YQkGmLHs8ZWxsrGTq/ZJEpbWsluK9btUptNVtMbbEoW9sLAfK+S4roasrJSVabXJhj+f/6XJVH2G30gPN5NoGkGftZqLpVVOoGgKJiR/SeYQuktse2ioxhtsIBHScImHOmxIvp1k93uJlixN5pJyWJJME72wS8MlcXR9sA+aqv8Ful5AAA0KZW5kc3RyZWFtCmVuZG9iagp4cmVmCjAgMTgKMDAwMDAwMDAwMCA2NTUzNSBmDQowMDAwMDAwMDE1IDAwMDAwIG4NCjAwMDAwMDAxMjQgMDAwMDAgbg0KMDAwMDAwMDA3OCAwMDAwMCBuDQowMDAwMDAwMTgxIDAwMDAwIG4NCjAwMDAwMDA0ODEgMDAwMDAgbg0KMDAwMDAwMTI2OSAwMDAwMCBuDQowMDAwMDAxMzA4IDAwMDAwIG4NCjAwMDAwMDE0NDcgMDAwMDAgbg0KMDAwMDAwMTU4MSAwMDAwMCBuDQowMDAwMTQ5Nzc4IDAwMDAwIG4NCjAwMDAxNTAyMjcgMDAwMDAgbg0KMDAwMDE1MDYwMCAwMDAwMCBuDQowMDAwMTUxMTg4IDAwMDAwIG4NCjAwMDAxNTE1OTEgMDAwMDAgbg0KMDAwMDE1MTgzMiAwMDAwMCBuDQowMDAwMTUyMDY4IDAwMDAwIG4NCjAwMDAxNjQ0MDkgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzw4NEExOEYyRDc0MzI3QjU2MzQzNENENzgyM0VBNzVGOD4gPDg0QTE4RjJENzQzMjdCNTYzNDM0Q0Q3ODIzRUE3NUY4Pl0KL1NpemUgMTgKPj4Kc3RhcnR4cmVmCjE4MDc1NQolJUVPRgo=</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf8-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>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</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf9-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf10-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2025</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf11-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf12-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>/Sve1l8RTfQk5k7Skzi0t5uKSvIOqplIbjLjCyUzzpRkxuLIa6VvNf3Qw9dKP2n2R3w7B/am70AMCZc/ooLkRxqDVItUhyRi7l3MvQuNSFuRdiLFkNC0ICpIfnoM6XWkd6E3UhRpDJKGnmjCy7TS403hQb6BDvon+kfcO330DfqKmr5OX1bT1+gf1PRVTNMwPUZfbkrzwUAd1gP2UTBVMM3FeoH+vjnD4osPNNOjKB4fYi5SGdJopKlIW5BEepSmN83wWZDJYTiGHr2PNsGXavoEPKqB6DxfNDwYdczPINzvKswh7PDvCNNoeNt2PGUQvvNuzDEI37IZcwzCq9ZhjkF4wTLMMQjPmIc5BuHJUzHHIDx6AuYQWulvnsvI9BWNnk/8A010OUppOUppOUppOfB0OTvgB56N7cGm7GyU2APRSI9sX+Mh0niENI4jjY+Sxpmk8SbSuI40lpLG60hjhDR6SWMaaYySxsOkGEXRSKItV5yWRF2k8Rhp3EMaG0hjmDSGSGMGafSTomgrDTQNz1eTCjVpHsjWFaZXDcgz4RgDKNEAqnUAl/1RxONIcfUsio386YnG7jSWpjdnlyXOe/XLWzRwGH0RO76I0/AinELicYJeRDV6EZm8iAxMiGVIU5HakM4ixZFEbJ2OA9+iogkxF6kMaSrSWqSzSKI6nLNIFBYlh7hXHVhuctCj2Rl9EQ/2C0cBGoimKl4logzjtniJKY2MToun0SJgzidYzBpzKzEc+Jfh+39heDxQS++kWyAVJ2JrMt3S9EOqr5Xc3xQ+7BtoJ/dBGo9aR0ogTEKYFkODel4IXg1LC8BLn8E0r8k7yce+9BPO8R0iRtbrgO8H7xnfl95WitkvvId9f/G38qTJ92cseeaA7x3vbb5Xc1s1WHIk3EowOeRXmx70Fvv2HFObrsOKB5p8N7HkgG+Nd6hvvletmJmouK4Bz6Im37jwZN8w5Ffuvd4XbUCeB3xl3ut8pYlWhazPAV9vHEIkkc3GwfbwqhcNpqkMJxa1kjnRHGmbVCWNlvpKeVKOFJB8UqqUItk0Fo2iMWr0GBtrNKKG11ANaGzsS3IR5gDaREV97s8z5NW8QhkyL0N94K2hcDXErFwlrRw/iFTG2qZD5fX+2IXxwVYij50cE4KDSMxSCZUTBsWKI5WtUnxcrChSGZPGXFu1j5A7q7E0Rje2EphQ1UrirGh9Cvt5loNAiHn9HSkszVp/R3U1uBzLylxllgHmkiHl/wFqk9jt1YbrinxqbFvl+KrY06nVsTyWiadWV8Z+zX6/5SD5lpyrKD9I/sGS6qqD3ADybcU4Vs4NKK+urmwlk9R24Cf/wHaoMf9Q22nSwM/agV+Tlmj3QKJdCPtjuwyWYDutFkJqu5BWq7bjCWu3ryGjonxfRobaxumHBrVNg9Pfvc2xELYJhdQ2jkY4prY55mhkbWID1CZeLzZJ86pNiAe8ahMv8ahNJl1ukptscltXk9vUK3Hkchtvoo3h9KU2htPYJvJf/cwcFImQ5v7V06ew376pDVbMRKqN3b5sjivWeL3fv296dfJHccK110+fw9JpM2PVwZnlsenBcv++/lP+Q/UUVt0/WL4PplRMqNo3JTqzvKl/tH9FcFp5dfPQMQVFV1zrtq5rFYz5D8zGMGYF7FpDi/5DdRGrHsquVcSuVcSuNTQ6VL0WqDo+pmqfBgZVD56SSJupTkZ9rU0JVA9yKHUDVOXtH3DdlHIIHZKnQBepjumDg2IGJFbVc2DPgawK1xSrMrIfOEpWuW7qH0g5RJ5KVilYbA4OgsiSpQ1LwVUxtzzx14AfLFqylAk8gZGGX/pgXUUsOq28YQkGmLHs8ZWxsrGTq/ZJEpbWsluK9btUptNVtMbbEoW9sLAfK+S4roasrJSVabXJhj+f/6XJVH2G30gPN5NoGkGftZqLpVVOoGgKJiR/SeYQuktse2ioxhtsIBHScImHOmxIvp1k93uJlixN5pJyWJJME72wS8MlcXR9sA+aqv8Ful5AAA0KZW5kc3RyZWFtCmVuZG9iagp4cmVmCjAgMTgKMDAwMDAwMDAwMCA2NTUzNSBmDQowMDAwMDAwMDE1IDAwMDAwIG4NCjAwMDAwMDAxMjQgMDAwMDAgbg0KMDAwMDAwMDA3OCAwMDAwMCBuDQowMDAwMDAwMTgxIDAwMDAwIG4NCjAwMDAwMDA0ODEgMDAwMDAgbg0KMDAwMDAwMTI2OSAwMDAwMCBuDQowMDAwMDAxMzA4IDAwMDAwIG4NCjAwMDAwMDE0NDcgMDAwMDAgbg0KMDAwMDAwMTU4MSAwMDAwMCBuDQowMDAwMTQ5Nzc4IDAwMDAwIG4NCjAwMDAxNTAyMjcgMDAwMDAgbg0KMDAwMDE1MDYwMCAwMDAwMCBuDQowMDAwMTUxMTg4IDAwMDAwIG4NCjAwMDAxNTE1OTEgMDAwMDAgbg0KMDAwMDE1MTgzMiAwMDAwMCBuDQowMDAwMTUyMDY4IDAwMDAwIG4NCjAwMDAxNjQ0MDkgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzw4NEExOEYyRDc0MzI3QjU2MzQzNENENzgyM0VBNzVGOD4gPDg0QTE4RjJENzQzMjdCNTYzNDM0Q0Q3ODIzRUE3NUY4Pl0KL1NpemUgMTgKPj4Kc3RhcnR4cmVmCjE4MDc1NQolJUVPRgo=</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf13-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf14-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>DOa8gTKN07PoLfnoN7Q9UUPbm43mvB0Dr6Yfw16ko0gc/RiPj+hHsJaexpViQixD2oF0FOk40lkkkZ7G4xQeH9IPsdUHkItUhjQVaQfSUaSzSBL9AFGhf2PrVUWWL0Oi9G+ICv0r3tZfEU30JOZO0pM4tLebikryDqqZSG4y4wslM86UZMbiyGulbzX90MPXSj9p9kd8Owf2pu9ADAmXP6KC5Ecag1SLVIckYu5dzL0LjUhbkXYixZDQtCAqSH56DOl1pHehN1IUaQyShp5owsu00uNN4UG+gQ76J/pH3Dt99A36ipq+Tl9W09foH9T0VUzTMD1GX25K88FAHdYD9lEwVTDNxXqB/r45w+KLDzTToygeH2IuUhnSaKSpSFuQRHqUpjfN8FmQyWE4hh69jzbBl2r6BDyqgeg8XzQ8GHXMzyDc7yrMIezw7wjTaHjbdjxlEL7zbswxCN+yGXMMwqvWYY5BeMEyzDEIz5iHOQbhyVMxxyA8egLmEFrpb57LyPQVjZ5P/ANNdDlKaTlKaTlKaTnwdDk74Aeeje3BpuxslNgD0UiPbF/jIdJ4hDSOI42PksaZpPEm0riONJaSxutIY4Q0ekljGmmMksbDpBhF0UiiLVeclkRdpPEYadxDGhtIY5g0hkhjBmn0k6JoKw00Dc9Xkwo1aR7I1hWmVw3IM+EYAyjRAKp1AJf9UcTjSHH1LIqN/OmJxu40lqY3Z5clznv1y1s0cBh9ETu+iNPwIpxC4nGCXkQ1ehGZvIgMTIhlSFOR2pDOIsWRRGydjgPfoqIJMRepDGkq0lqks0iiOpyzSBQWJYe4Vx1YbnLQo9kZfREP9gtHARqIpipeJaIM47Z4iSmNjE6Lp9EiYM4nWMwacysxHPiX4ft/YXg8UEvvpFsgFSdiazLd0vRDqq+V3N8UPuwbaCf3QRqPWkdKIExCmBZDg3peCF4NSwvAS5/BNK/JO8nHvvQTzvEdIkbW64DvB+8Z35feVorZL7yHfX/xt/KkyfdnLHnmgO8d722+V3NbNVhyJNxKMDnkV5se9Bb79hxTm67DigeafDex5IBvjXeob75XrZiZqLiuAc+iJt+48GTfMORX7r3eF21Angd8Zd7rfKWJVoWszwFfbxxCJJHNxsH28KoXDaapDCcWtZI50Rxpm1QljZb6SnlSjhSQfFKqlCLZNBaNojFq9BgbazSihtdQDWhs7EtyEeYA2kRFfe7PM+TVvEIZMi9DfeCtoXA1xKxcJa0cP4hUxtqmQ+X1/tiF8cFWIo+dHBOCg0jMUgmVEwbFiiOVrVJ8XKwoUhmTxlxbtY+QO6uxNEY3thKYUNVK4qxofQr7eZaDQIh5/R0pLM1af0d1Nbgcy8pcZZYB5pIh5f8BapPY7dWG64p8amxb5fiq2NOp1bE8lomnVlfGfs1+v+Ug+Zacqyg/SP7Bkuqqg9wA8m3FOFbODSivrq5sJZPUduAn/8B2qDH/UNtp0sDP2oFfk5Zo90CiXQj7Y7sMlmA7rRZCaruQVqu24wlrt68ho6J8X0aG2sbphwa1TYPT373NsRC2CYXUNo5GOKa2OeZoZG1iA9QmXi82SfOqTYgHvGoTL/GoTSZdbpKbbHJbV5Pb1Ctx5HIbb6KN4fSlNobT2CbyX/3MHBSJkOb+1dOnsN++qQ1WzESqjd2+bI4r1ni9379venXyR3HCtddPn8PSaTNj1cGZ5bHpwXL/vv5T/kP1FFbdP1i+D6ZUTKjaNyU6s7ypf7R/RXBaeXXz0DEFRVdc67auaxWM+Q/MxjBmBexaQ4v+Q3URqx7KrlXErlXErjU0OlS9Fqg6PqZqnwYGVQ+ekkibqU5Gfa1NCVQPcih1A1Tl7R9w3ZRyCB2Sp0AXqY7pg4NiBiRW1XNgz4GsCtcUqzKyHzhKVrlu6h9IOUSeSlYpWGwODoLIkqUNS8FVMbc88deAHyxaspQJPIGRhl/6YF1FLDqtvGEJBpix7PGVsbKxk6v2SRKW1rJbivW7VKbTVbTG2xKFvbCwHyvkuK6GrKyUlWm1yYY/n/+lyVR9ht9IDzeTaBpBn7Wai6VVTqBoCiYkf0nmELpLbHtoqMYbbCAR0nCJhzpsSL6dZPd7iZYsTeaScliSTBO9sEvDJXF0fbAPmqr/BbpeQAANCmVuZHN0cmVhbQplbmRvYmoKeHJlZgowIDEzCjAwMDAwMDAwMDAgNjU1MzUgZg0KMDAwMDAwMDAxNSAwMDAwMCBuDQowMDAwMDAwMTI0IDAwMDAwIG4NCjAwMDAwMDAwNzggMDAwMDAgbg0KMDAwMDAwMDE4MSAwMDAwMCBuDQowMDAwMDAwNDcxIDAwMDAwIG4NCjAwMDAwMDExMzggMDAwMDAgbg0KMDAwMDAwMTE3NyAwMDAwMCBuDQowMDAwMDAxMzEwIDAwMDAwIG4NCjAwMDAwODMyNDAgMDAwMDAgbg0KMDAwMDA4MzgyNyAwMDAwMCBuDQowMDAwMDg0MjMwIDAwMDAwIG4NCjAwMDAwODQ0NjYgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzwxQzkwNEFGRUQyNkNEMUZBRDg2OUM4MzQ1ODA2RjNBMj4gPDFDOTA0QUZFRDI2Q0QxRkFEODY5QzgzNDU4MDZGM0EyPl0KL1NpemUgMTMKPj4Kc3RhcnR4cmVmCjEwMDgxMgolJUVPRgo=</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf15-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2028</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>startxref</char-array>" +
            "  <byte-array>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</byte-array>" +
            "  <int>2042</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File filereceiving = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf16-receiving.xml").getFile());
            Scanner scannerreceiving = new Scanner(filereceiving);
            String receivingXML = scannerreceiving.useDelimiter("\\A").next();
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            String returnedXML = 
            "<int>2042</int>";
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = 
            "<object-array>" +
            "  <char-array>%%EOF</char-array>" +
            "  <byte-array>pKVSxERt7tZOqUb473G27fX+tGCdogG6+prD853yLTK2bMOKOOJsvtDT0BAxqUSO7MDMBG3C8wc0pu8zLQlHbJJ+/WTOgBak1W9Y5S8G5N6F36JVh5bWGkH0Iv39stDNtbPBzvJqfLLUmlfTDp4SBNZmzlGgILt8jTFc3yvQPjAe1s20XApwWTM7kS64YZNmJ1WknwxA6kAT/FfX5YRvV3++R3OI77GYYPAZby08mQH0ujWKOfFix32/uJty/z/pnKx91ZXBs+d8UW5Fuuc+LehBcmT8NwuEULBQ4/l2q00lS6s1uwLB6R76Gt8eeFsXd690mGzoegU3qcbXc7eIsQDuQ6Vo7ozYcaAfo1bTbRy7Jr9BJT1VqIP+qhOgwaUACPlbQYZPksuto3EX5vNcwQmMO3WTi8/082NjNHC3ES2/EZUYCYPZJFron/mV+1iaDVJTNB5hrkWTzwxeMlDBY4UnVkwcGVvd0XYIqC5MqW/Zyk6Cpkf/x6m5Ntjs4z2na9vbMfELHhQE91GfbuGpYpIMMGh5lwK4qCVWKFmjUkjtKSzkvs5AkVHTn4m2AdviOkv1oJsO4YCQ0zDkPJNhp4IzD8ex8fbKjzxz6sg6abt+OMPgdOIxXSo+x19sgqFHCEBlh3l4dCY2QvNabZ1eF/LHC6fcnr9eBkDDa1+KJMpaykBLexRraxuOyXei/EzMI7SJtWRWC3tUE/mi6siUh33ato8EwhOUWlT8EMbSI4rME8uW5lsexflkeNrQ12dWYZ70r+w+BRmAbm0N3bbl9i1nIbfcUsPp5Dd0Jrg9sS1OzlZtENz73zuSKl/WFlTFCr/9s4sBSYGVnBtEj2+63DI7Dzc3DJLIb0MUXd1z0xbr4ip3hLiLlDZ/qXKz96sCsvvgI/fISdYGkK8QDwqcfabLLnLPCYEsUrCCveyMO/GpLIi2eXv7M6H6Y8kMZURtkobvAlF//VQDCGaf93aUu8pKBPwzWKXM1U2yV+DaDHh6/fIXr5hJ7ilxk+9AFSP6qQuuq0mUbBvsZ8yNqp3hjCjNJ19zltuztoLRuRvD7OkQC+4un+b4I2isCTM8XHURnPMp/UQV+t64CmsUx7NdJJMaHbbo8/85inlQHV2i9Q0fFI4Xju3OpwMyb43VVgCh6hSQn0xW3D11l2oH2vbz6uxHaBg9sYPSlPHZk6TGh6DXlJqw8zN8P6poCMdB+Vjzs34FHhyE1R5jK0ZCbFkQRutJm4urKLL8tiQV5ZPK2YnjQf2Z88VWGJN6jqGoPnothSxnUXDDzTqSgYTXHR2ahFF5V28kvTT+E40nvpzqpWxHqyycey3tTPWv8rPZuzkhvT5JIQkwwHpRuan0b76nZzaEM8O5YhxNDE4OzHEolRnBqOVgoZflStaPljXX2sN3LMA03WGRpwiXub4IKelXveH5i2A1B30cLpXGnIasBcGEBXF/aClL1biE2NthLllqUeJZYgwz7FLnBdCh9T6hdY1sGeZFjfPp8A954mU4rWoo8GmTBxAClNCmtGHUHGMNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDxBRTFFODIxNDNBODdDQjUxOUM5MkFDNEVDQUM3MzUwNzY4QzczMDc4MDZGMjQ0REZEMkQxRUZGOEU2ODY5Nzk3MzA2QTNCODFFQjMzNjI5Qjk1MUFDNzYwMTAyRUQ5NjQ+Ci9VRSA8Q0YzRkZDNzY1REFERUZFRkM0NDJCNkRERTdCMjg4NDBCOTc1OUQ0NUM0NkM4OUY0RDcyQzcyREFCMTI5NTgzMz4KL08gPEQ4Rjk2NzA4MUVCQTczM0M0RTMxQzQyMjRDOUEyRTk2RDAxNzVDMDc1OUFBNDVFNjIzQ0U0Mzg5OEI1QUY0Nzg1Nzg1NjE1M0JBMDExREQ3NkNEMDJCNTVGOEZFRUVEND4KL09FIDwwQjk1NTk5NDdENTdGMUE3OTUwODc1OEU3Q0MxQkNFQTg2MzBDQzZEMDNGNDE1RUFBMDZGNTRBM0JDOTRGQ0RFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDwxMURFNkVCMDFERTM1RDZEQ0NCNUY5N0M5OUZCQjM1Mj4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array>" +
            "  <int>2048</int>" +
            "</object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}