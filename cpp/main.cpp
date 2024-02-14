#include "DPR.cpp"
int main() {
    DPRManager manager;

    // Adding sample anggota
    manager.tambah_anggota(DPRMember(2201897, "Ipan", 'L', "Pendidikan", "Partai PKS"));
    manager.tambah_anggota(DPRMember(2201898, "Bangir", 'P', "Kesehatan", "Partai PDI"));
    manager.tambah_anggota(DPRMember(2201888, "phico", 'P', "Politik", "Partai Gerindra"));
    manager.tambah_anggota(DPRMember(2201899, "Phyoo", 'P', "Agama", "Partai Gelora"));
    manager.tambah_anggota(DPRMember(2201800, "weirdamos", 'P', "Pemerintahan", "Partai PPP"));

    // menampilkan semua anggota
    cout << "semua anggota:\n";
    manager.menampilkan_semua_anggota();

    // Updating a member
    manager.update_anggota(2201897, DPRMember(2201897, "irfan Update", 'L', "Pendidikan", "Partai PKS Updated"));

    // menampilkaning semua anggota after update
    cout << "\nsemua anggota setelah di update:\n";
    manager.menampilkan_semua_anggota();

    // Removing a member
    manager.remove_member(2201898);

    // menampilkaning semua anggota after removal
    cout << "\nsemua anggota setelah dihapus:\n";
    manager.menampilkan_semua_anggota();

    return 0;
}
