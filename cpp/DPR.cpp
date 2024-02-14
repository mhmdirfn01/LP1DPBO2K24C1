#include <iostream>
#include <string>
#include <vector>
#include <algorithm>


using namespace std;

class Human {
private:
    string nama;
    char gender;

public:
    Human() : nama(""), gender('-') {}

    Human(string nama, char gender) : nama(nama), gender(gender) {}

    string get_nama() const {
        return nama;
    }

    void set_nama(string nama) {
        this->nama = nama;
    }

    char get_gender() const {
        return gender;
    }

    void set_gender(char gender) {
        this->gender = gender;
    }

    void eat() {
        cout << nama << " is eating!" << '\n';
    }

    void sleep() {
        cout << nama << " is sleeping!" << '\n';
    }

    virtual ~Human() {}
};

class DPRMember : public Human {
private:
    int id;
    string bidang_nama;
    string partai_nama;

public:
    DPRMember() : id(0), bidang_nama(""), partai_nama("") {}

    DPRMember(int id, string nama, char gender, string bidang_nama, string partai_nama)
        : Human(nama, gender), id(id), bidang_nama(bidang_nama), partai_nama(partai_nama) {}

    int get_id() const {
        return id;
    }

    void set_id(int id) {
        this->id = id;
    }

    string get_bidang_nama() const {
        return bidang_nama;
    }

    void set_bidang_nama(string bidang_nama) {
        this->bidang_nama = bidang_nama;
    }

    string get_partai_nama() const {
        return partai_nama;
    }

    void set_partai_nama(string partai_nama) {
        this->partai_nama = partai_nama;
    }

    void menampilkan_info() const {
        cout << "ID: " << id << "\nnama: " << get_nama() << "\nGender: " << get_gender()
             << "\nnama bidang: " << bidang_nama << "\nNama Partai: " << partai_nama << '\n';
    }
};

class DPRManager {
private:
    vector<DPRMember> anggota;

public:
    void tambah_anggota(const DPRMember& member) {
        anggota.push_back(member);
    }

    void menampilkan_semua_anggota() const {
        for (const auto& member : anggota) {
            member.menampilkan_info();
            cout << "----------------------\n";
        }
    }

    void update_anggota(int id, const DPRMember& updated_member) {
        for (auto& member : anggota) {
            if (member.get_id() == id) {
                member = updated_member;
                return;
            }
        }
        cout << "Member with ID " << id << " not found.\n";
    }

    void remove_member(int id) {
        auto it = remove_if(anggota.begin(), anggota.end(),
                            [id](const DPRMember& member) { return member.get_id() == id; });
        if (it != anggota.end()) {
            anggota.erase(it, anggota.end());
            cout << "Member with ID " << id << " removed successfully.\n";
        } else {
            cout << "Member with ID " << id << " not found.\n";
        }
    }
};

