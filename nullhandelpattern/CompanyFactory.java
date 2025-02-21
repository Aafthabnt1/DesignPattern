package nullhandelpattern;

public class CompanyFactory {
    public Company getCompany(String companyName){
        if(companyName.equals("LTIMINDTREE")){
            return new LTIMindtree();
        }
        return new NullCompany();
    }
}
