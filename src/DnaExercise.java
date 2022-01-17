public class DnaExercise {
    public static void main(String[] args) {
        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
        char[] charArray = dna.toCharArray();
        String stringFromCharArr = new String(charArray);
        String[] findString = {"TAGG", "CCAG", "AGCC"};
        int[] count = {0, 0, 0};

        for (int i = 0; i < charArray.length - 3; i ++){
            if ("T".toCharArray()[0] == charArray[i]
                & "A".toCharArray()[0] == charArray[i+1]
                    & "G".toCharArray()[0] == charArray[i+2]
                    & "G".toCharArray()[0] == charArray[i+3]) {
                count[0]++;

            }


            else if ("C".toCharArray()[0] == charArray[i]
                    & "C".toCharArray()[0] == charArray[i+1]
                    & "A".toCharArray()[0] == charArray[i+2]
                    & "G".toCharArray()[0] == charArray[i+3]){
                count[1] ++;



            }
            if ("A".toCharArray()[0] == charArray[i]
                    & "G".toCharArray()[0] == charArray[i+1]
                    & "C".toCharArray()[0] == charArray[i+2]
                    & "C".toCharArray()[0] == charArray[i+3]){
                count[2] ++;



            }
//            String str1 = String(charArray);
//            String str2 = charArray[i+1];
//            String str3 = charArray[i+2];
//            String str4 = charArray[i+3];

//            System.out.println(stringFromCharArr);
//            System.out.println(charArray[i]);
//            String stringFromCharArr = new String(charArray[i] + charArray[i+1] + charArray[i+2] + charArray[i+3]);
//            if ("TAGG" == charArray[i] + charArray[i+1] + charArray[i+2] + charArray[i+3])
        }
        System.out.println("TAGG: " + count[0]);
        System.out.println("CCAG: " + count[1]);
        System.out.println("AGCC: " + count[2]);


    }
}