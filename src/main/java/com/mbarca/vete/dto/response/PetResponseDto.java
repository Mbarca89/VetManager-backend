package com.mbarca.vete.dto.response;

import java.util.Date;

public class PetResponseDto {
    private Long id;
    private String name;
    private String race;
    private String gender;
    private String species;
    private Double weight;
    private Date born;
    private byte[] photo;
    private byte[] thumbnail;
    private String ownerName;

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    private String ownerPhone;

    public PetResponseDto() {
    }

    public PetResponseDto(Long id, String name, String race, String gender, String species, Double weight, Date born, byte[] photo, byte[] thumbnail, String ownerName, String ownerPhone) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.species = species;
        this.weight = weight;
        this.born = born;
        this.photo = photo;
        this.thumbnail = thumbnail;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }
}
