package cl.vicentepc.miappprueba1;

public class Pets {

    private String petHeight;
    private String petWeight;
    private String petChar;

    public Pets() {
    }

    public Pets(String petHeight, String petWeight, String petChar) {
        this.petHeight = petHeight;
        this.petWeight = petWeight;
        this.petChar = petChar;
    }

    public String getPetHeight() {
        return petHeight;
    }

    public void setPetHeight(String petHeight) {
        this.petHeight = petHeight;
    }

    public String getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(String petWeight) {
        this.petWeight = petWeight;
    }

    public String getPetChar() {
        return petChar;
    }

    public void setPetChar(String petChar) {
        this.petChar = petChar;
    }

    public int[] get(String spinnerPersonality, String spinnerHome, String spinnerZodiac, String radioGroupGender) {
        int pet1 = 0;
        int pet2 = 0;
        int pet3 = 0;

        if (spinnerPersonality.equals("Callado/a")) {
            if (spinnerHome.equals("Casa")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatopersa;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.beagle;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.gatopersa;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.sanbernardo;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.setterirlandes;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.beagle;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.collie;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.gatosiames;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.caballo;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.gatopersa;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatopersa;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.beagle;
                        pet3 = R.mipmap.terrier;
                    }
                }
            } else if (spinnerHome.equals("Departamento")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.weimaraner;
                    } else {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.gatosiames;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatopersa;
                        pet2 = R.mipmap.gatosiames;
                        pet3 = R.mipmap.setterirlandes;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.doberman;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.gatosiames;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.grandanes;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.beagle;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.setterirlandes;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.zebra;
                        pet3 = R.mipmap.caballo;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.caballo;
                    } else {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.gatopersa;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.zebra;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.doberman;
                    }
                }
            }
        } else if (spinnerPersonality.equals("Serio/a")) {
            if (spinnerHome.equals("Casa")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.doberman;
                    }
                } else if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.caballo;
                    } else {
                        pet1 = R.mipmap.caballo;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.gatopersa;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.gatosiames;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.caballo;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.gatosiames;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.doberman;
                    } else {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.setterirlandes;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.grandanes;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.beagle;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.gatopersa;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.gatopersa;
                    }
                }
            } else if (spinnerHome.equals("Departamento")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.zebra;
                        pet3 = R.mipmap.gatopersa;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.grandanes;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.doberman;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.zebra;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.doberman;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.grandanes;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.terrier;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.zebra;
                    } else {
                        pet1 = R.mipmap.caballo;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.beagle;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.caballo;
                    } else {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.zebra;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.beagle;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.sanbernardo;
                    } else {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.doberman;
                    }
                }
            }
        } else if (spinnerPersonality.equals("Nervioso/a")) {
            if (spinnerHome.equals("Casa")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.doberman;
                    } else {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.collie;
                    }
                } else if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.doberman;
                    } else {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.zebra;
                    } else {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.caballo;
                    } else {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.collie;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.weimaraner;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.collie;
                    } else {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.terrier;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.doberman;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.grandanes;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.terrier;
                    }
                }
            } else if (spinnerHome.equals("Departamento")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.gatosiames;
                        pet3 = R.mipmap.huron;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.beagle;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.zebra;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.sanbernardo;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.grandanes;
                    } else {
                        pet1 = R.mipmap.cocker;
                        pet2 = R.mipmap.beagle;
                        pet3 = R.mipmap.grandanes;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.caballo;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.caballo;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.gatoangora;
                    } else {
                        pet1 = R.mipmap.caballo;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatopersa;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.zebra;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.beagle;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatopersa;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.beagle;
                        pet3 = R.mipmap.caballo;
                    }
                }
            }
        }
        if (spinnerPersonality.equals("Temperamental")) {
            if (spinnerHome.equals("Casa")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.doberman;
                    }
                } else if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.weimaraner;
                    } else {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.weimaraner;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.sanbernardo;
                    } else {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.bullterrier;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.zebra;
                        pet3 = R.mipmap.gatoangora;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.setterirlandes;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.huron;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.setterirlandes;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.zebra;
                        pet3 = R.mipmap.bullterrier;
                    } else {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.weimaraner;
                    } else {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.bullterrier;
                    }
                }
            } else if (spinnerHome.equals("Departamento")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.sanbernardo;
                    } else {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.gatoangora;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.gatoangora;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.setterirlandes;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.sanbernardo;
                    } else {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.huron;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.bullterrier;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.beagle;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.collie;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.weimaraner;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.bullterrier;
                        pet3 = R.mipmap.caballo;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.gatoangora;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatosiames;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.beagle;
                    }
                }
            }
        } else if (spinnerPersonality.equals("Alegre")) {
            if (spinnerHome.equals("Casa")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.grandanes;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.sanbernardo;
                        pet3 = R.mipmap.dalmata;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.boxer;
                    } else {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.weimaraner;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.doberman;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.doberman;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.collie;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.bullterrier;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.sanbernardo;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.bullterrier;
                    } else {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.caballo;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.terrier;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.huron;
                        pet2 = R.mipmap.gatopersa;
                        pet3 = R.mipmap.zebra;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.bullterrier;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.cocker;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.zebra;
                    } else {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.gatosiames;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.doberman;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.bullterrier;
                    } else {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.beagle;
                    }
                }
            } else if (spinnerHome.equals("Departamento")) {
                if (spinnerZodiac.equals("Aries")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.gatosiames;
                    }
                } else if (spinnerZodiac.equals("Tauro")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.grandanes;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.beagle;
                    }
                } else if (spinnerZodiac.equals("Geminis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.beagle;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.collie;
                    } else {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.bullterrier;
                    }
                } else if (spinnerZodiac.equals("Cancer")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.dalmata;
                    } else {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.boxer;
                    }
                } else if (spinnerZodiac.equals("Leo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.bulldog;
                        pet2 = R.mipmap.boxer;
                        pet3 = R.mipmap.cocker;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.bulldog;
                    }
                } else if (spinnerZodiac.equals("Virgo")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.setterirlandes;
                        pet2 = R.mipmap.bulldog;
                        pet3 = R.mipmap.weimaraner;
                    } else {
                        pet1 = R.mipmap.terrier;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Libra")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.bulldog;
                    } else {
                        pet1 = R.mipmap.bullterrier;
                        pet2 = R.mipmap.beagle;
                        pet3 = R.mipmap.collie;
                    }
                } else if (spinnerZodiac.equals("Escorpio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.collie;
                        pet2 = R.mipmap.dalmata;
                        pet3 = R.mipmap.terrier;
                    } else {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.pastoraleman;
                    }
                } else if (spinnerZodiac.equals("Sagitario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.pastoraleman;
                        pet2 = R.mipmap.weimaraner;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.boxer;
                        pet2 = R.mipmap.pastoraleman;
                        pet3 = R.mipmap.weimaraner;
                    }
                } else if (spinnerZodiac.equals("Capricornio")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.doberman;
                        pet3 = R.mipmap.pastoraleman;
                    } else {
                        pet1 = R.mipmap.weimaraner;
                        pet2 = R.mipmap.cocker;
                        pet3 = R.mipmap.doberman;
                    }
                } else if (spinnerZodiac.equals("Actuario")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.dalmata;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.gatopersa;
                    } else {
                        pet1 = R.mipmap.zebra;
                        pet2 = R.mipmap.caballo;
                        pet3 = R.mipmap.gatosiames;
                    }
                } else if (spinnerZodiac.equals("Piscis")) {
                    if (radioGroupGender.equals("M")) {
                        pet1 = R.mipmap.sanbernardo;
                        pet2 = R.mipmap.setterirlandes;
                        pet3 = R.mipmap.beagle;
                    } else {
                        pet1 = R.mipmap.gatoangora;
                        pet2 = R.mipmap.huron;
                        pet3 = R.mipmap.cocker;
                    }
                }
            }
        }
        return new int[]{pet1, pet2, pet3};
    }
}
