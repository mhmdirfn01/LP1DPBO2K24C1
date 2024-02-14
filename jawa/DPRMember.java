package satu;

// public class Human {

//     private String name;
//     private char gender;

//     // Default constructor
//     public Human() {
//         this.name = "";
//         this.gender = '\0';  // Initialize char with a default value
//     }

//     // Parameterized constructor
//     public Human(String name, char gender) {
//         this.name = name;
//         this.gender = gender;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public char getGender() {
//         return this.gender;
//     }

//     public void setGender(char gender) {
//         this.gender = gender;
//     }

//     public void eat() {
//         System.out.println(this.name + " is eating");
//     }

//     public void sleep() {
//         System.out.println(this.name + " is sleeping");
//     }
// }

public class DPRMember {
    private int id;
    private String nama;
    private char gender;
    private String bidangNama;
    private String partaiNama;

    public DPRMember(int id, String nama, char gender, String bidangNama, String partaiNama) {
        this.id = id;
        this.nama = nama;
        this.gender = gender;
        this.bidangNama = bidangNama;
        this.partaiNama = partaiNama;
    }

    // Getter dan Setter untuk setiap atribut

    public void menampilkanInfo() {
        System.out.println("ID: " + id + "\nNama: " + nama + "\nGender: " + gender
                + "\nBidang Nama: " + bidangNama + "\nPartai Nama: " + partaiNama);
    }

    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}

