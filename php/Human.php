<?php

class Human {
    private $nama;
    private $gender;

    public function __construct($nama = "", $gender = "-") {
        $this->nama = $nama;
        $this->gender = $gender;
    }

    public function getNama() {
        return $this->nama;
    }

    public function setNama($nama) {
        $this->nama = $nama;
    }

    public function getGender() {
        return $this->gender;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }

    public function eat() {
        echo $this->nama . " is eating!\n";
    }

    public function sleep() {
        echo $this->nama . " is sleeping!\n";
    }
}
?>
