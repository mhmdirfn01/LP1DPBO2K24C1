package satu;

// // import java.util.Scanner;
// // import java.util.ArrayList;

// // public class Main {
// //     public static void main(String[] args) {

// //         Human rain = new Human();
// //         rain.setName("Rain");
// //         rain.setGender('L');

// //         Human techi = new Human("Techi", 'P');

// //         int n = 0;
// //         String name;
// //         char gender;

// //         ArrayList<Human> list = new ArrayList<>();

// //         Scanner sc = new Scanner(System.in);

// //         try {
// //             n = sc.nextInt();
// //         } catch (Exception e) {
// //             System.out.println("Error: The input is not an integer");
// //             return; // Exit the program if the input is not an integer
// //         }

// //         for (int i = 0; i < n; i++) {
// //             name = sc.next();
// //             gender = sc.next().charAt(0);

// //             Human temp = new Human();
// //             temp.setName(name);
// //             temp.setGender(gender);
// //             list.add(temp);
// //         }

// //         // Print the list of humans
// //         for (Human human : list) {
// //             System.out.println("Name: " + human.getName() + ", Gender: " + human.getGender());
// //         }
// //     }
// // }
// public class DPRMember {
//     int id;
//     String nama;
//     char jenisKelamin;
//     String bidang;
//     String partai;

//     public DPRMember(int id, String nama, char jenisKelamin, String bidang, String partai) {
//         this.id = id;
//         this.nama = nama;
//         this.jenisKelamin = jenisKelamin;
//         this.bidang = bidang;
//         this.partai = partai;
//     }
// }

// import java.util.ArrayList;
// import java.util.Iterator;

// public class DPRManager {
//     ArrayList<DPRMember> anggota = new ArrayList<>();

//     public void tambahAnggota(DPRMember member) {
//         anggota.add(member);
//     }

//     public void tampilkanSemuaAnggota() {
//         for (DPRMember member : anggota) {
//             System.out.println("ID: " + member.id + ", Nama: " + member.nama + ", Jenis Kelamin: " + member.jenisKelamin +
//                     ", Bidang: " + member.bidang + ", Partai: " + member.partai);
//         }
//     }

//     public void updateAnggota(int id, DPRMember newMember) {
//         Iterator<DPRMember> iterator = anggota.iterator();
//         while (iterator.hasNext()) {
//             DPRMember member = iterator.next();
//             if (member.id == id) {
//                 iterator.remove();
//                 anggota.add(newMember);
//                 break;
//             }
//         }
//     }

//     public void removeMember(int id) {
//         anggota.removeIf(member -> member.id == id);
//     }

//     public static void main(String[] args) {
//         DPRManager manager = new DPRManager();

//         // Menambahkan anggota contoh
//         manager.tambahAnggota(new DPRMember(2201897, "Ipan", 'L', "Pendidikan", "Partai PKS"));
//         manager.tambahAnggota(new DPRMember(2206789, "Bangir", 'P', "Kesehatan", "Partai PDI"));

//         // Menampilkan semua anggota
//         System.out.println("Semua anggota:");
//         manager.tampilkanSemuaAnggota();

//         // Memperbarui anggota
//         manager.updateAnggota(2201897, new DPRMember(2201897, "Irfan Update", 'L', "Pendidikan", "Partai PKS Updated"));

//         // Menampilkan semua anggota setelah pembaruan
//         System.out.println("\nSemua anggota setelah pembaruan:");
//         manager.tampilkanSemuaAnggota();

//         // Menghapus anggota
//         manager.removeMember(2206789);

//         // Menampilkan semua anggota setelah penghapusan
//         System.out.println("\nSemua anggota setelah penghapusan:");
//         manager.tampilkanSemuaAnggota();
//     }
// }


import java.util.ArrayList;
import java.util.Iterator;

public class DPRManager {
    private ArrayList<DPRMember> anggota;

    public DPRManager() {
        anggota = new ArrayList<>();
    }

    public void tambahAnggota(DPRMember member) {
        anggota.add(member);
    }

    public void menampilkanSemuaAnggota() {
        for (DPRMember member : anggota) {
            member.menampilkanInfo();
            System.out.println("----------------------");
        }
    }

    public void updateAnggota(int id, DPRMember updatedMember) {
        for (int i = 0; i < anggota.size(); i++) {
            if (anggota.get(i).getId() == id) {
                anggota.set(i, updatedMember);
                return;
            }
        }
        System.out.println("Member with ID " + id + " not found.");
    }

    public void removeAnggota(int id) {
        Iterator<DPRMember> iterator = anggota.iterator();
        while (iterator.hasNext()) {
            DPRMember member = iterator.next();
            if (member.getId() == id) {
                iterator.remove();
                System.out.println("Member with ID " + id + " removed successfully.");
                return;
            }
        }
        System.out.println("Member with ID " + id + " not found.");
    }
}
