# class Human:

#     def __init__(self, name="", gender=''):
#         self._name = name
#         self._gender = gender

#     def get_name(self):
#         return self._name

#     def set_name(self, name):
#         self._name = name

#     def get_gender(self):
#         return self._gender

#     def set_gender(self, gender):
#         self._gender = gender

#     def eat(self):
#         print(self._name, "is eating")

#     def sleep(self):
#         print(self._name, "is sleeping")

class Human:
    def __init__(self, nama="", gender='-'):
        self.nama = nama
        self.gender = gender

    def get_nama(self):
        return self.nama

    def set_nama(self, nama):
        self.nama = nama

    def get_gender(self):
        return self.gender

    def set_gender(self, gender):
        self.gender = gender

    def eat(self):
        print(f"{self.nama} is eating!")

    def sleep(self):
        print(f"{self.nama} is sleeping!")

class DPRMember(Human):
    def __init__(self, id=0, nama="", gender='-', bidang_nama="", partai_nama=""):
        super().__init__(nama, gender)
        self.id = id
        self.bidang_nama = bidang_nama
        self.partai_nama = partai_nama

    def get_id(self):
        return self.id

    def set_id(self, id):
        self.id = id

    def get_bidang_nama(self):
        return self.bidang_nama

    def set_bidang_nama(self, bidang_nama):
        self.bidang_nama = bidang_nama

    def get_partai_nama(self):
        return self.partai_nama

    def set_partai_nama(self, partai_nama):
        self.partai_nama = partai_nama

    def menampilkan_info(self):
        print(f"ID: {self.id}\nnama: {self.get_nama()}\nGender: {self.get_gender()}"
              f"\nnama bidang: {self.bidang_nama}\nNama Partai: {self.partai_nama}\n")

class DPRManager:
    def __init__(self):
        self.anggota = []

    def tambah_anggota(self, member):
        self.anggota.append(member)

    def menampilkan_semua_anggota(self):
        for member in self.anggota:
            member.menampilkan_info()
            print("----------------------")

    def update_anggota(self, id, updated_member):
        for member in self.anggota:
            if member.get_id() == id:
                member = updated_member
                return
        print(f"Member with ID {id} not found.")

    def remove_member(self, id):
        self.anggota = [member for member in self.anggota if member.get_id() != id]
        print(f"Member with ID {id} removed successfully." if len(self.anggota) < len(
            self.anggota) else f"Member with ID {id} not found.")

