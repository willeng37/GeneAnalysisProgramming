package bin.main.ErrorManagement;


public class GenomeDatabaseError extends Exception {

    private GenomeError error;

    public GenomeDatabaseError(GenomeError error) {
        this.error = error;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("ERROR {" + this.error + "}");
        System.exit(-1);
    }
}

