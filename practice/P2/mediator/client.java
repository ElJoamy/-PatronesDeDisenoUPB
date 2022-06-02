public class client {
    public static void main (String []args){
        Skype skype = new Skype();

        QA qa1 = new QA(skype);
        qa1.setCargo("QA").setCi("12345679").setName("Julio Parse").setGrado("Especializacion");
        QA qa2 = new QA(skype);
        qa2.setCargo("QA").setCi("23456789").setName("Ana Guzman").setGrado("Maestria");
        QA qa3 = new QA(skype);
        qa3.setCargo("QA").setCi("34567890").setName("Carla Linares").setGrado("Doctorado");

        SM sm1 = new SM(skype);
        sm1.setCargo("SM").setCi("45678901").setName("Minerva Luz").setCertificaciones("Hacking Etico");
        SM sm2 = new SM(skype);
        sm2.setCargo("SM").setCi("56789012").setName("Mauricio Gran").setCertificaciones("Ciberseguridad");
        SM sm3 = new SM(skype);
        sm3.setCargo("SM").setCi("67890123").setName("Michael Pearce").setCertificaciones("AWS");

        DEV dev1 = new DEV(skype);
        dev1.setCargo("DEV").setCi("12345678").setName("Juan Perez").setLenguaje("Java");
        DEV dev2 = new DEV(skype);
        dev2.setCargo("DEV").setCi("87654321").setName("Pedro Perez").setLenguaje("Python");
        DEV dev3 = new DEV(skype);
        dev3.setCargo("DEV").setCi("12345612").setName("Maria Ordonez").setLenguaje("c++");

        skype.addProfesionalChat(qa1, "QA")
        .addProfesionalChat(qa2, "QA")
        .addProfesionalChat(qa3, "QA")
        .addProfesionalChat(sm1, "SM")
        .addProfesionalChat(sm2, "SM")
        .addProfesionalChat(sm3, "SM")
        .addProfesionalChat(dev1, "DEV")
        .addProfesionalChat(dev2, "DEV")
        .addProfesionalChat(dev3, "DEV");

        qa1.send("QA");
        sm2.send("Para todos");
        dev3.send("DEV");

    }
}