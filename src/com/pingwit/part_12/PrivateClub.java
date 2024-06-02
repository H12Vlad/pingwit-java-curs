package com.pingwit.part_12;

public class PrivateClub {
    public static final Long SERIAL_VERSION = 666l;
    private final  String clubName;
    private final int members;

    public PrivateClub() {
        this.clubName = "Rich Cat";
        this.members = 0;
    }

    private PrivateClub(String clubName) {
        this.clubName = clubName;
        this.members = 0;
    }

    private PrivateClub(String clubName, int members) {
        this.clubName = clubName;
        this.members = members;
    }

    @Override
    public String toString() {
        return "PrivateClub{" +
                "clubName='" + clubName + '\'' +
                ", members=" + members +
                '}';
    }
}