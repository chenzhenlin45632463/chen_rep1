package com.java.patten;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpPattenDemo {
    public static final String PHONE_AREA_NUMBER_REGEXP
            = "86|852|853|886|54|61|92|55|45|49|7|33|63|82|31|1|60|1|52|27|351|81|66|90|34|30|65|64|972|39|44|84|355|213|93|297|968|994|971|20|251|353|372|376|244|1264|1268|43|1246|675|1809|595|930|973|507|375|1441|359|229|32|354|1787|48|387|591|501|267|975|226|257|85|240|670|228|809|1767|593|291|298|689|594|379|679|358|238|220|242|57|506|1809|299|995|53|590|671|592|7|509|599|504|686|253|996|224|245|233|241|855|420|263|237|874|1345|269|225|965|385|254|682|371|266|856|961|370|231|218|41|262|352|250|40|261|960|356|265|223|692|389|596|230|222|685|1809|976|1664|880|51|691|95|373|212|377|258|264|977|505|227|234|683|47|46|41|503|381|232|221|248|966|239|290|1809|1758|378|1784|94|421|386|268|249|597|677|252|992|255|676|1809|1809|216|688|993|690|678|502|58|673|256|380|598|998|967|687|36|963|1876|374|967|964|98|91|62|1809|962|260|235|56|236|242";
    public static final String PHONE_NUMBER_REGEXP = "^[0-9]{6,11}$";
    public static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile(PHONE_NUMBER_REGEXP);
    public static final Pattern PHONE_AREA_NUMBER_PATTERN = Pattern.compile(PHONE_AREA_NUMBER_REGEXP);

    @Test
    public void testNumber(){
        Matcher matcher = RegexpPattenDemo.PHONE_NUMBER_PATTERN.matcher("18381121942");
        boolean flag = matcher.matches();
        System.out.println(flag);
    }

    @Test
    public void testAreaNumber(){
        Matcher matcher = RegexpPattenDemo.PHONE_AREA_NUMBER_PATTERN.matcher("82");
        System.out.println(matcher.matches());
    }
}
