<?php

require_once 'DPRManager.php';

// Contoh Penggunaan

$manager = new DPRManager();

// Menambahkan anggota
$manager->addMember(new DPRMember(2201897, "Ipan", 'L', "Pendidikan", " PKS" ));
$manager->addMember(new DPRMember(2201898, "Bangir", 'P', "Kesehatan", " PDI"));
$manager->addMember(new DPRMember(2201888, "phico", 'P', "Politik", " Gerindra"));
$manager->addMember(new DPRMember(2201899, "Phyoo", 'P', "Agama", " Gelora"));
$manager->addMember(new DPRMember(2201800, "weirdamos", 'P', "Pemerintahan", " PPP"));

// Menampilkan semua anggota
echo "<strong>Semua anggota:</strong>\n";
$manager->displayAllMembers();

// Mengupdate anggota
$manager->updateMember(2201897, new DPRMember(2201897, "Irfan Update", 'L', "Pendidikan", "Partai Jason Updated"));

// Menampilkan semua anggota setelah update
echo "\n<strong>Semua anggota setelah di update:</strong>\n";
$manager->displayAllMembers();

// Menghapus anggota
$manager->removeMember(2201800);

// Menampilkan semua anggota setelah penghapusan
echo "\n<strong>Semua anggota setelah dihapus:</strong>\n";
$manager->displayAllMembers();
?>
