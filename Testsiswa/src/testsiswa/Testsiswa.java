/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsiswa;

/**
 *
 * @author ichsan sani al azmi
 */
public class Testsiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        encapsiswa siswa = new encapsiswa();
        siswa.setnama("Icun");
        siswa.setumur(16);
        siswa.setaddres("Malang");
        System.out.println("nama:"+ siswa.getnama() + " alamat " +siswa.getaddres() + " berumur " + siswa.getumur() + " tahun");
        
        
    }
    
}
