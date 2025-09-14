public class MarathiAlphabet {
    public static void main(String[] args) {
        // Vowels (स्वर)
        char a   = (char)2309; // अ
        char aa  = (char)2310; // आ
        char i   = (char)2311; // इ
        char ii  = (char)2312; // ई
        char u   = (char)2313; // उ
        char uu  = (char)2314; // ऊ
        char ru  = (char)2315; // ऋ
        char rru = (char)2400; // ॠ
        char lu  = (char)2316; // ऌ
        char llu = (char)2401; // ॡ
        char e   = (char)2319; // ए
        char ai  = (char)2320; // ऐ
        char o   = (char)2323; // ओ
        char au  = (char)2324; // औ

        System.out.println("Vowels (स्वर):");
        System.out.println("" + a + " " + aa + " " + i + " " + ii + " " + u + " " + uu + " " +
                           ru + " " + rru + " " + lu + " " + llu + " " + e + " " + ai + " " +
                           o + " " + au);

        // Consonants (व्यंजन)
        char ka = (char)2325; // क
        char kha = (char)2326; // ख
        char ga = (char)2327; // ग
        char gha = (char)2328; // घ
        char nga = (char)2329; // ङ

        char cha = (char)2330; // च
        char chha = (char)2331; // छ
        char ja = (char)2332; // ज
        char jha = (char)2333; // झ
        char nya = (char)2334; // ञ

        char tta = (char)2335; // ट
        char ttha = (char)2336; // ठ
        char dda = (char)2337; // ड
        char ddha = (char)2338; // ढ
        char nna = (char)2339; // ण

        char ta = (char)2340; // त
        char tha = (char)2341; // थ
        char da = (char)2342; // द
        char dha = (char)2343; // ध
        char na = (char)2344; // न

        char pa = (char)2346; // प
        char pha = (char)2347; // फ
        char ba = (char)2348; // ब
        char bha = (char)2349; // भ
        char ma = (char)2350; // म

        char ya = (char)2351; // य
        char ra = (char)2352; // र
        char la = (char)2354; // ल
        char va = (char)2357; // व

        char sha = (char)2358; // श
        char ssa = (char)2359; // ष
        char sa = (char)2360; // स
        char ha = (char)2361; // ह

        System.out.println("\nConsonants (व्यंजन):");
        System.out.println("" + ka + " " + kha + " " + ga + " " + gha + " " + nga);
        System.out.println("" + cha + " " + chha + " " + ja + " " + jha + " " + nya);
        System.out.println("" + tta + " " + ttha + " " + dda + " " + ddha + " " + nna);
        System.out.println("" + ta + " " + tha + " " + da + " " + dha + " " + na);
        System.out.println("" + pa + " " + pha + " " + ba + " " + bha + " " + ma);
        System.out.println("" + ya + " " + ra + " " + la + " " + va);
        System.out.println("" + sha + " " + ssa + " " + sa + " " + ha);

        // Matras (स्वरचिन्हे)
        char aa_m = (char)2366; // ा
        char i_m  = (char)2367; // ि
        char ii_m = (char)2368; // ी
        char u_m  = (char)2369; // ु
        char uu_m = (char)2370; // ू
        char ru_m = (char)2371; // ृ
        char rru_m= (char)2372; // ॄ
        char lu_m = (char)2402; // ॢ
        char llu_m= (char)2403; // ॣ
        char e_m  = (char)2375; // े
        char ai_m = (char)2376; // ै
        char o_m  = (char)2379; // ॉ
        char au_m = (char)2380; // ौ

        System.out.println("\nMatras (स्वरचिन्हे):");
        System.out.println("" + aa_m + " " + i_m + " " + ii_m + " " + u_m + " " + uu_m + " " +
                           ru_m + " " + rru_m + " " + lu_m + " " + llu_m + " " + e_m + " " +
                           ai_m + " " + o_m + " " + au_m);

        // Other signs
        char chandrabindu = (char)2305; // ँ
        char anusvara = (char)2306;     // ं
        char visarga = (char)2307;      // ः
        char halant = (char)2381;       // ्

        System.out.println("\nOther signs:");
        System.out.println("" + chandrabindu + " " + anusvara + " " + visarga + " " + halant);
    }
}
