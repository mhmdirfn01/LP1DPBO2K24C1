<?php

require_once 'DPRMember.php';

class DPRManager {
    private $anggota = [];

    public function addMember(DPRMember $member) {
        $this->anggota[] = $member;
    }

    public function displayAllMembers() {
        echo "<table border='1'>";
        echo "<tr><th>ID</th><th>Nama</th><th>Gender</th><th>Bidang</th><th>Nama Partai</th><th>Foto aku</th></tr>";
        foreach ($this->anggota as $member) {
            $member->displayInfo();
        }
        echo "</table>";
    }

    public function updateMember($id, DPRMember $updatedMember) {
        foreach ($this->anggota as &$member) {
            if ($member->getId() == $id) {
                $member = $updatedMember;
                return;
            }
        }
        echo "Member with ID $id not found.\n";
    }

    public function removeMember($id) {
        foreach ($this->anggota as $key => $member) {
            if ($member->getId() == $id) {
                unset($this->anggota[$key]);
                echo "Member with ID $id removed successfully.\n";
                return;
            }
        }
        echo "Member with ID $id not found.\n";
    }
}
?>
