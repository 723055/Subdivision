public class Subdivisions {

    public static void main(String[] args) {
        String[] codesOfSubdivisions = {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K2",
                "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};

        CompanyTree c1 = new CompanyTree();
        for (int i = 0; i < codesOfSubdivisions.length; i++) {
            c1.insert(codesOfSubdivisions[i]);
        }
        c1.print();
    }
}
