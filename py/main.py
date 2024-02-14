# # from Human import Human  # Assuming Human class is in a file named Human.py

# # rain = Human()
# # rain.set_name("Rain")
# # rain.set_gender('Female')

# # techi = Human("Techi", 'P')

# # humans = []

# # n = int(input())
# # for i in range(n):
# #     name = str(input())
# #     gender = input()[0]

# #     humans.append(Human(name, gender))

# # print()
# # print("Automatic output:")
# # print("The first human's name is", rain.get_name())
# # print("Now, ", end=' ')
# # rain.eat()
# # print("The second human's name is", techi.get_name())
# # print("Now, ", end=' ')
# # techi.sleep()

# # print("Iteration output:")
# # for human in humans:
# #     print(str(i + 1) + ".", human.get_name(), "|", human.get_gender())
# # i += 1

# class DPRMember:
#     def __init__(self, id, nama, jenis_kelamin, bidang, partai):
#         self.id = id
#         self.nama = nama
#         self.jenis_kelamin = jenis_kelamin
#         self.bidang = bidang
#         self.partai = partai

# class DPRManager:
#     def __init__(self):
#         self.anggota = []

#     def tambah_anggota(self, member):
#         self.anggota.append(member)

#     def menampilkan_semua_anggota(self):
#         for member in self.anggota:
#             print(f"ID: {member.id}, Nama: {member.nama}, Jenis Kelamin: {member.jenis_kelamin}, Bidang: {member.bidang}, Partai: {member.partai}")

#     def update_anggota(self, id, new_member):
#         for i, member in enumerate(self.anggota):
#             if member.id == id:
#                 self.anggota[i] = new_member
#                 break

#     def remove_member(self, id):
#         self.anggota = [member for member in self.anggota if member.id != id]

# if __name__ == "__main__":
#     manager = DPRManager()

#     # Menambahkan anggota contoh
#     manager.tambah_anggota(DPRMember(2201897, "Ipan", 'L', "Pendidikan", "Partai PKS"))
#     manager.tambah_anggota(DPRMember(2206789, "Bangir", 'P', "Kesehatan", "Partai PDI"))

#     # Menampilkan semua anggota
#     print("Semua anggota:")
#     manager.menampilkan_semua_anggota()

#     # Memperbarui anggota
#     manager.update_anggota(2201897, DPRMember(2201897, "Irfan Update", 'L', "Pendidikan", "Partai PKS Updated"))

#     # Menampilkan semua anggota setelah pembaruan
#     print("\nSemua anggota setelah pembaruan:")
#     manager.menampilkan_semua_anggota()

#     # Menghapus anggota
#     manager.remove_member(2206789)

#     # Menampilkan semua anggota setelah penghapusan
#     print("\nSemua anggota setelah penghapusan:")
#     manager.menampilkan_semua_anggota()


from DPR import DPRMember, DPRManager

def main():
    manager = DPRManager()

    # Menambahkan anggota contoh
    manager.tambah_anggota(DPRMember(2201897, "Ipan", 'L', "Pendidikan", "Partai PKS"))
    manager.tambah_anggota(DPRMember(2206789, "Bangir", 'P', "Kesehatan", "Partai PDI"))

    # Menampilkan semua anggota
    print("Semua anggota:")
    manager.menampilkan_semua_anggota()

    # Memperbarui seorang anggota
    manager.update_anggota(2201897, DPRMember(2201897, "Irfan Update", 'L', "Pendidikan", "Partai PKS Updated"))

    # Menampilkan semua anggota setelah pembaruan
    print("\nSemua anggota setelah diperbarui:")
    manager.menampilkan_semua_anggota()

    # Menghapus seorang anggota
    manager.remove_member(2206789)

    # Menampilkan semua anggota setelah penghapusan
    print("\nSemua anggota setelah dihapus:")
    manager.menampilkan_semua_anggota()

if __name__ == "__main__":
    main()
