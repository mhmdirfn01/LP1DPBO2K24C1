<?php

require_once 'Human.php';

class DPRMember extends Human {
    private $id;
    private $bidangNama;
    private $partaiNama;
    private $Foto;

    public function __construct($id = 0, $nama = "", $gender = "-", $bidangNama = "", $partaiNama = "", $Foto = "") {
        parent::__construct($nama, $gender);
        $this->id = $id;
        $this->bidangNama = $bidangNama;
        $this->partaiNama = $partaiNama;
    }

    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getBidangNama() {
        return $this->bidangNama;
    }

    public function setBidangNama($bidangNama) {
        $this->bidangNama = $bidangNama;
    }

    public function getPartaiNama() {
        return $this->partaiNama;
    }

    public function setPartaiNama($partaiNama) {
        $this->partaiNama = $partaiNama;
    }

    public function getFoto() {
        return $this->Foto;
    }

    public function setFoto($Foto) {
        $this->Foto = $Foto;
    }

    public function displayInfo() {
        echo "<tr>";
        echo "<td> " . $this->id . "</td>";
        echo "<td> " . $this->getNama() . "</td>";
        echo "<td> " . $this->getGender() . "</td>";
        echo "<td> " . $this->bidangNama . "</td>";
        echo "<td> " . $this->partaiNama . "</td>";
        echo "<td><img src=\"https://cdn.oneesports.id/cdn-data/sites/2/2023/09/Nolan-MLBB-1-1024x576.jpg".  $this->getFoto() . "\" width='100px'/></td>";
        echo "</tr>";
    }
}
?>
