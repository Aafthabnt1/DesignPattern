package nullhandelpattern;

public class NullCompany implements Company{
    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getEmployee() {
        return 0;
    }
}
