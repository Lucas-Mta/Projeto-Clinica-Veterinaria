package Model;

public class Main {
    public static void main(String[] args) {

        // OBTENDO INSTÂNCIAS DAS CLASSES: -----------------------------------

        AnimalDAO animalDAO = AnimalDAO.getInstance();
        AppointmentDAO appointmentDAO = AppointmentDAO.getInstance();
        ClientDAO clientDAO = ClientDAO.getInstance();
        ExamDAO examDAO = ExamDAO.getInstance();
        HospitalizeDAO hospitalizeDAO = HospitalizeDAO.getInstance();
        MedicineDAO medicineDAO = MedicineDAO.getInstance();
        PrescriptionDAO prescriptionDAO = PrescriptionDAO.getInstance();
        SecretaryDAO secretaryDAO = SecretaryDAO.getInstance();
        SpecieDAO specieDAO = SpecieDAO.getInstance();
        TreatmentDAO treatmentDAO = TreatmentDAO.getInstance();
        VaccinationDAO vaccinationDAO = VaccinationDAO.getInstance();
        VeterinarianDAO veterinarianDAO = VeterinarianDAO.getInstance();

        System.out.println("\n----------------------\n");

// INSERINDO EXEMPLOS EM CADA CLASSE: -----------------------------------

// --- CLIENTES ---
        System.out.println("\nInserindo CLIENTES...");
        Client client1 = clientDAO.create("12345678910", "Lucas", "Rua A, 10", "71912345678", "lucas@email.com");
        Client client2 = clientDAO.create("98765432100", "Carla", "Rua D, 25", "71999887766", "carla@email.com");
        Client client3 = clientDAO.create("11223344556", "Pedro", "Rua E, 45", "71988776655", "pedro@email.com");
        System.out.println("Clientes inseridos: " + client1 + ", " + client2 + ", " + client3);

// --- SECRETÁRIAS ---
        System.out.println("\nInserindo SECRETÁRIAS...");
        Secretary secretary1 = secretaryDAO.create("11122233345", "Josefa", "Rua B, 15", "71987654321", "jose@email.com", "jose31s", "senhajose", "Matutino");
        Secretary secretary2 = secretaryDAO.create("22233344455", "Maria", "Rua F, 30", "71912344321", "maria@email.com", "maria24", "senhamaria", "Noturno");
        System.out.println("Secretárias inseridas: " + secretary1 + ", " + secretary2);

// --- VETERINÁRIOS ---
        System.out.println("\nInserindo VETERINÁRIOS...");
        Veterinarian vet1 = veterinarianDAO.create("99988877765", "Marcos", "Rua C, 20", "11911223344", "marcos@email.com", "marcosvet", "amocachorros", "Anestesiologia", "09:00", 5);
        Veterinarian vet2 = veterinarianDAO.create("88877766655", "Joana", "Rua G, 40", "11933445566", "joana@email.com", "joanavet", "petsarelife", "Cardiologia", "08:00", 8);
        System.out.println("Veterinários inseridos: " + vet1 + ", " + vet2);

// --- ESPÉCIES ---
        System.out.println("\nInserindo ESPÉCIES...");
        Specie specie1 = specieDAO.create("Cachorro");
        Specie specie2 = specieDAO.create("Gato");
        Specie specie3 = specieDAO.create("Pássaro");
        System.out.println("Espécies inseridas: " + specie1 + ", " + specie2 + ", " + specie3);

// --- ANIMAIS ---
        System.out.println("\nInserindo ANIMAIS...");
        Animal animal1 = animalDAO.create("Jack", 3, 'M', 55.5, client1.getClientId(), specie1.getSpecieId());
        Animal animal2 = animalDAO.create("Mia", 2, 'F', 10.2, client2.getClientId(), specie2.getSpecieId());
        Animal animal3 = animalDAO.create("Bob", 1, 'M', 1.5, client3.getClientId(), specie3.getSpecieId());
        System.out.println("Animais inseridos: " + animal1 + ", " + animal2 + ", " + animal3);

// --- TRATAMENTOS ---
        System.out.println("\nInserindo TRATAMENTOS...");
        Treatment treatment1 = treatmentDAO.create(animal1.getAnimalId(), "20/09/2024", "Tratamento para febre");
        Treatment treatment2 = treatmentDAO.create(animal2.getAnimalId(), "25/09/2024", "Tratamento para alergia");
        System.out.println("Tratamentos inseridos: " + treatment1 + ", " + treatment2);

// --- CONSULTAS ---
        System.out.println("\nInserindo CONSULTAS...");
        Appointment app1 = appointmentDAO.create("21/09/2024", "10:00", animal1.getAnimalId(), vet1.getVetId(), treatment1.getTreatmentId(), "Febre alta e vômito");
        Appointment app2 = appointmentDAO.create("26/09/2024", "15:00", animal2.getAnimalId(), vet2.getVetId(), treatment2.getTreatmentId(), "Coceira intensa");
        System.out.println("Consultas inseridas: " + app1 + ", " + app2);

// --- EXAMES ---
        System.out.println("\nInserindo EXAMES...");
        Exam exam1 = examDAO.create(app1.getAppointmentId(), "Hemograma", "Exame de sangue", "21/09/2024", "Aguardando", null);
        Exam exam2 = examDAO.create(app2.getAppointmentId(), "Raio-X", "Exame de imagem", "26/09/2024", "Concluído", "Sem alterações");
        System.out.println("Exames inseridos: " + exam1 + ", " + exam2);

// --- MEDICAMENTOS ---
        System.out.println("\nInserindo MEDICAMENTOS...");
        Medicine med1 = medicineDAO.create("Ibuprofeno", 20);
        Medicine med2 = medicineDAO.create("Antialérgico", 15);
        System.out.println("Medicamentos inseridos: " + med1 + ", " + med2);

// --- PRESCRIÇÕES ---
        System.out.println("\nInserindo PRESCRIÇÕES...");
        Prescription pres1 = prescriptionDAO.create(vet1.getVetId(), app1.getAppointmentId(), med1.getDrugId(), "Infecção", 500, "Tomar 2x ao dia por 7 dias");
        Prescription pres2 = prescriptionDAO.create(vet2.getVetId(), app2.getAppointmentId(), med2.getDrugId(), "Alergia", 200, "Aplicar 1x ao dia por 5 dias");
        System.out.println("Prescrições inseridas: " + pres1 + ", " + pres2);

// --- INTERNAÇÕES ---
        System.out.println("\nInserindo INTERNAÇÕES...");
        Hospitalize hosp1 = hospitalizeDAO.create(vet1.getVetId(), animal1.getAnimalId(), "22/09/2024", "Paciente estável, febre controlada");
        Hospitalize hosp2 = hospitalizeDAO.create(vet2.getVetId(), animal2.getAnimalId(), "27/09/2024", "Paciente em observação para alergia");
        System.out.println("Internações inseridas: " + hosp1 + ", " + hosp2);

// --- VACINAÇÕES ---
        System.out.println("\nInserindo VACINAÇÕES...");
        Vaccination vacc1 = vaccinationDAO.create(vet1.getVetId(), animal1.getAnimalId(), "Vacina Anti alérgica", "10/10/2024");
        Vaccination vacc2 = vaccinationDAO.create(vet2.getVetId(), animal2.getAnimalId(), "Vacina Contra Pulgas", "15/10/2024");
        System.out.println("Vacinações inseridas: " + vacc1 + ", " + vacc2);

        System.out.println("\n----------------------\n");

















/*
        // OBTENDO INSTÂNCIAS DAS CLASSES: -----------------------------------

        AnimalDAO animalDAO = AnimalDAO.getInstance();
        AppointmentDAO appointmentDAO = AppointmentDAO.getInstance();
        ClientDAO clientDAO = ClientDAO.getInstance();
        ExamDAO examDAO = ExamDAO.getInstance();
        HospitalizeDAO hospitalizeDAO = HospitalizeDAO.getInstance();
        MedicineDAO medicineDAO = MedicineDAO.getInstance();
        PrescriptionDAO prescriptionDAO = PrescriptionDAO.getInstance();
        SecretaryDAO secretaryDAO = SecretaryDAO.getInstance();
        SpecieDAO specieDAO = Model.SpecieDAO.getInstance();
        TreatmentDAO treatmentDAO = TreatmentDAO.getInstance();
        VaccinationDAO vaccinationDAO = VaccinationDAO.getInstance();
        VeterinarianDAO veterinarianDAO = VeterinarianDAO.getInstance();

        System.out.println("\n----------------------\n");


        // INSERINDO EXEMPLOS EM CADA CLASSE: -----------------------------------

        // --- INSERINDO CLIENTE ---
        System.out.println("\nInserindo um novo CLIENTE...");
        Client client = clientDAO.create("12345678910", "Lucas",
                "Rua A, 10", "71912345678", "lucas@email.com");
        System.out.println("Cliente inserido: " + client);

        // --- INSERINDO SECRETÁRIA ---
        System.out.println("\nInserindo uma nova SECRETÁRIA...");
        Secretary secretary = secretaryDAO.create("11122233345", "Josefa",
                "Rua B, 15", "71987654321", "jose@email.com",
                "jose31s", "senhajose", "Matutino");
        System.out.println("Secretária inserida: " + secretary);

        // --- INSERINDO VETERINÁRIO ---
        System.out.println("\nInserindo um novo VETERINÁRIO...");
        Veterinarian veterinarian = veterinarianDAO.create("99988877765", "Marcos",
                "Rua C, 20", "11911223344", "marcos@email.com",
                "marcosvet", "amocachorros", "Anestesiologia",
                "09:00", 5);
        System.out.println("Veterinário inserido: " + veterinarian);

        // --- INSERINDO ESPÉCIE ---
        System.out.println("\nInserindo uma nova ESPÉCIE...");
        Specie specie = specieDAO.create("Cachorro");
        System.out.println("Espécie inserida: " + specie);

        // --- INSERINDO ANIMAL ---
        System.out.println("\nInserindo um novo ANIMAL...");
        Animal animal = animalDAO.create("Jack", 3, 'M', 55.5, client.getClientId(), specie.getSpecieId());
        System.out.println("Animal inserido: " + animal);

        // --- INSERINDO TRATAMENTO ---
        System.out.println("\nInserindo um novo TRATAMENTO...");
        Treatment treatment = treatmentDAO.create(animal.getAnimalId(), "20/09/2024",
                "Tratamento para febre");
        System.out.println("Tratamento inserido: " + treatment);

        // --- INSERINDO CONSULTA ---
        System.out.println("\nInserindo uma nova CONSULTA...");
        Appointment appointment = appointmentDAO.create("21/09/2024", "10:00",
                animal.getAnimalId(), veterinarian.getVetId(), treatment.getTreatmentId(), "Febre alta e vômito");
        System.out.println("Consulta inserida: " + appointment);

        // --- INSERINDO EXAME ---
        System.out.println("\nInserindo um novo EXAME...");
        Exam exam = examDAO.create(appointment.getAppointmentId(), "Hemograma", "Exame de sangue",
                "21/09/2024", "Aguardando", null);
        System.out.println("Exame inserido: " + exam);

        // --- INSERINDO MEDICAMENTO ---
        System.out.println("\nInserindo um novo MEDICAMENTO...");
        Medicine medicine = medicineDAO.create("Ibuprofeno", 20);
        System.out.println("Medicamento inserido: " + medicine);

        // --- INSERINDO PRESCRIÇÃO ---
        System.out.println("\nInserindo uma nova PRESCRIÇÃO...");
        Prescription prescription = prescriptionDAO.create(veterinarian.getVetId(), appointment.getAppointmentId(),
                medicine.getDrugId(), "Infecção", 500, "Tomar 2x ao dia por 7 dias");
        System.out.println("Prescrição inserida: " + prescription);

        // --- INSERINDO INTERNAÇÃO ---
        System.out.println("\nInserindo uma nova INTERNAÇÃO...");
        Hospitalize hospitalize = hospitalizeDAO.create(veterinarian.getVetId(), animal.getAnimalId(),
                "22/09/2024", "Paciente estável, febre controlada");
        System.out.println("Internação inserida: " + hospitalize);

        // --- INSERINDO VACINAÇÃO ---
        System.out.println("\nInserindo uma nova VACINAÇÃO...");
        Vaccination vaccination = vaccinationDAO.create(veterinarian.getVetId(), animal.getAnimalId(),
                "Vacina Anti alérgica", "10/10/2024");
        System.out.println("Vacinação inserida: " + vaccination);


        System.out.println("\n----------------------\n");


        // RECUPERANDO DADOS DO BANCO: -----------------------------------

        // --- TESTANDO RECUPERAÇÃO DE CLIENTES ---
        System.out.println("\nRecuperando CLIENTE pelo CPF...");
        Client clienteRecuperado = clientDAO.retrieveByCpf("12345678910");
        if (clienteRecuperado != null) {
            System.out.println("Cliente recuperado: " + clienteRecuperado);
        } else {
            System.out.println("Cliente não encontrado.");
        }

        // --- TESTANDO RECUPERAÇÃO DE SECRETÁRIOS ---
        System.out.println("\nRecuperando SECRETÁRIO pelo CPF...");
        Secretary secretaryRecuperado = secretaryDAO.retrieveByCpf("11122233345");
        if (secretaryRecuperado != null) {
            System.out.println("Secretário recuperado: " + secretaryRecuperado);
        } else {
            System.out.println("Secretário não encontrado.");
        }

        // --- TESTANDO RECUPERAÇÃO DE VETERINÁRIOS ---
        System.out.println("\nRecuperando VETERINÁRIO pelo CPF...");
        Veterinarian veterinarianRecuperado = veterinarianDAO.retrieveByCpf("99988877765");
        if (veterinarianRecuperado != null) {
            System.out.println("Veterinário recuperado: " + veterinarianRecuperado);
        } else {
            System.out.println("Veterinário não encontrado.");
        }

        // --- TESTANDO RECUPERAÇÃO DE ANIMAIS ---
        System.out.println("\nRecuperando ANIMAL por ID...");
        Animal animalRecuperado = animalDAO.retrieveById(1);
        if (animalRecuperado != null) {
            System.out.println("Animal recuperado: " + animalRecuperado);
        } else {
            System.out.println("Animal não encontrado.");
        }

        // --- TESTANDO RECUPERAÇÃO DE TRATAMENTOS ---
        System.out.println("\nRecuperando TRATAMENTO por ID...");
        Treatment tratamentoRecuperado = treatmentDAO.retrieveById(1);
        if (tratamentoRecuperado != null) {
            System.out.println("Tratamento recuperado: " + tratamentoRecuperado);
        } else {
            System.out.println("Tratamento não encontrado.");
        }

        // --- TESTANDO RECUPERAÇÃO DE CONSULTAS ---
        System.out.println("\nRecuperando CONSULTA por ID...");
        Appointment consultaRecuperada = appointmentDAO.retrieveById(1);
        if (consultaRecuperada != null) {
            System.out.println("Consulta recuperada: " + consultaRecuperada);
        } else {
            System.out.println("Consulta não encontrada.");
        }

        // --- TESTANDO RECUPERAÇÃO DE MEDICAMENTOS ---
        System.out.println("\nRecuperando MEDICAMENTO por ID...");
        Medicine medicamentoRecuperado = medicineDAO.retrieveById(1);
        if (medicamentoRecuperado != null) {
            System.out.println("Medicamento recuperado: " + medicamentoRecuperado);
        } else {
            System.out.println("Medicamento não encontrado.");
        }

        // --- TESTANDO RECUPERAÇÃO DE PRESCRIÇÕES ---
        System.out.println("\nRecuperando PRESCRIÇÃO por ID...");
        Prescription prescricaoRecuperada = prescriptionDAO.retrieveById(1);
        if (prescricaoRecuperada != null) {
            System.out.println("Prescrição recuperada: " + prescricaoRecuperada);
        } else {
            System.out.println("Prescrição não encontrada.");
        }

        // --- TESTANDO RECUPERAÇÃO DE INTERNAMENTOS ---
        System.out.println("\nRecuperando INTERNAMENTO por ID...");
        Hospitalize internamentoRecuperado = hospitalizeDAO.retrieveById(1);
        if (internamentoRecuperado != null) {
            System.out.println("Internamento recuperado: " + internamentoRecuperado);
        } else {
            System.out.println("Internamento não encontrado.");
        }

        // --- TESTANDO RECUPERAÇÃO DE VACINAÇÕES ---
        System.out.println("\nRecuperando VACINAÇÃO por ID...");
        Vaccination vacinacaoRecuperada = vaccinationDAO.retrieveById(1);
        if (vacinacaoRecuperada != null) {
            System.out.println("Vacinação recuperada: " + vacinacaoRecuperada);
        } else {
            System.out.println("Vacinação não encontrada.");
        }


        System.out.println("\n----------------------\n");


        // UPDATES: -----------------------------------

        // --- UPDATE CLIENTE ---
        System.out.println("\nAtualizando CLIENTE...");
        clienteRecuperado = clientDAO.retrieveById(1);
        if (clienteRecuperado != null) {
            clienteRecuperado.setAddress("Rua B, 456");
            clientDAO.update(clienteRecuperado);
            System.out.println("Cliente atualizado: " + clienteRecuperado);
        }

        // --- UPDATE SECRETÁRIO ---
        System.out.println("\nAtualizando SECRETÁRIO...");
        secretaryRecuperado = secretaryDAO.retrieveById(1);
        if (secretaryRecuperado != null) {
            secretaryRecuperado.setAddress("Rua Nova, 789");
            secretaryDAO.update(secretaryRecuperado);
            System.out.println("Secretário atualizado: " + secretaryRecuperado);
        }

        // --- UPDATE VETERINÁRIO ---
        System.out.println("\nAtualizando VETERINÁRIO...");
        veterinarianRecuperado = veterinarianDAO.retrieveById(1);
        if (veterinarianRecuperado != null) {
            veterinarianRecuperado.setSpecialty("Cirurgia");
            veterinarianDAO.update(veterinarianRecuperado);
            System.out.println("Veterinário atualizado: " + veterinarianRecuperado);
        }

        // --- UPDATE ANIMAL ---
        System.out.println("\nAtualizando ANIMAL...");
        animalRecuperado = animalDAO.retrieveById(1);
        if (animalRecuperado != null) {
            animalRecuperado.setName("Rex");
            animalDAO.update(animalRecuperado);
            System.out.println("Animal atualizado: " + animalRecuperado);
        }

        // --- UPDATE TRATAMENTO ---
        System.out.println("\nAtualizando TRATAMENTO...");
        tratamentoRecuperado = treatmentDAO.retrieveById(1);
        if (tratamentoRecuperado != null) {
            tratamentoRecuperado.setFinished(true);
            treatmentDAO.update(tratamentoRecuperado);
            System.out.println("Tratamento atualizado: " + tratamentoRecuperado);
        }

        // --- UPDATE CONSULTA ---
        System.out.println("\nAtualizando CONSULTA...");
        consultaRecuperada = appointmentDAO.retrieveById(1);
        if (consultaRecuperada != null) {
            consultaRecuperada.setSymptoms("Vômito");
            appointmentDAO.update(consultaRecuperada);
            System.out.println("Consulta atualizada: " + consultaRecuperada);
        }

        // --- UPDATE MEDICAMENTO ---
        System.out.println("\nAtualizando MEDICAMENTO...");
        medicamentoRecuperado = medicineDAO.retrieveById(1);
        if (medicamentoRecuperado != null) {
            medicamentoRecuperado.setName("Antibiótico Forte");
            medicineDAO.update(medicamentoRecuperado);
            System.out.println("Medicamento atualizado: " + medicamentoRecuperado);
        }

        // --- UPDATE PRESCRIÇÃO ---
        System.out.println("\nAtualizando PRESCRIÇÃO...");
        prescricaoRecuperada = prescriptionDAO.retrieveById(1);
        if (prescricaoRecuperada != null) {
            prescricaoRecuperada.setInstructions("Tomar 1 comprimido por dia durante 10 dias");
            prescriptionDAO.update(prescricaoRecuperada);
            System.out.println("Prescrição atualizada: " + prescricaoRecuperada);
        }

        // --- UPDATE INTERNAÇÃO ---
        System.out.println("\nAtualizando INTERNAÇÃO...");
        internamentoRecuperado = hospitalizeDAO.retrieveById(1);
        if (internamentoRecuperado != null) {
            internamentoRecuperado.setProgress("Evoluindo");
            hospitalizeDAO.update(internamentoRecuperado);
            System.out.println("Internação atualizada: " + internamentoRecuperado);
        }

        // --- UPDATE VACINAÇÃO ---
        System.out.println("\nAtualizando VACINAÇÃO...");
        vacinacaoRecuperada = vaccinationDAO.retrieveById(1);
        if (vacinacaoRecuperada != null) {
            vacinacaoRecuperada.setVaccineName("Vacina XYZ");
            vaccinationDAO.update(vacinacaoRecuperada);
            System.out.println("Vacinação atualizada: " + vacinacaoRecuperada);
        }


        System.out.println("\n----------------------\n");


        // DELETES: -----------------------------------

        // --- DELETAR CLIENTE ---
        System.out.println("\nDeletando cliente...");
        if (clienteRecuperado != null) {
            clientDAO.delete(clienteRecuperado);
            System.out.println("Cliente deletado.");
        }

        // --- DELETAR SECRETÁRIA ---
        System.out.println("\nDeletando secretária...");
        if (secretaryRecuperado != null) {
            secretaryDAO.delete(secretaryRecuperado);
            System.out.println("Secretária deletada.");
        }

        // --- DELETAR VETERINÁRIO ---
        System.out.println("\nDeletando veterinário...");
        if (veterinarianRecuperado != null) {
            veterinarianDAO.delete(veterinarianRecuperado);
            System.out.println("Veterinário deletado.");
        }

        // --- DELETAR ANIMAL ---
        System.out.println("\nDeletando animal...");
        if (animalRecuperado != null) {
            animalDAO.delete(animalRecuperado);
            System.out.println("Animal deletado.");
        }

        // --- DELETAR TRATAMENTO ---
        System.out.println("\nDeletando tratamento...");
        if (tratamentoRecuperado != null) {
            treatmentDAO.delete(tratamentoRecuperado);
            System.out.println("Tratamento deletado.");
        }

        // --- DELETAR CONSULTA ---
        System.out.println("\nDeletando consulta...");
        if (consultaRecuperada != null) {
            appointmentDAO.delete(consultaRecuperada);
            System.out.println("Consulta deletada.");
        }

        // --- DELETAR MEDICAMENTO ---
        System.out.println("\nDeletando medicamento...");
        if (medicamentoRecuperado != null) {
            medicineDAO.delete(medicamentoRecuperado);
            System.out.println("Medicamento deletado.");
        }

        // --- DELETAR PRESCRIÇÃO ---
        System.out.println("\nDeletando prescrição...");
        if (prescricaoRecuperada != null) {
            prescriptionDAO.delete(prescricaoRecuperada);
            System.out.println("Prescrição deletada.");
        }

        // --- DELETAR VACINAÇÃO ---
        System.out.println("\nDeletando vacinação...");
        if (vacinacaoRecuperada != null) {
            vaccinationDAO.delete(vacinacaoRecuperada);
            System.out.println("Vacinação deletada.");
        }

        // --- DELETAR INTERNAÇÃO ---
        System.out.println("\nDeletando internação...");
        if (internamentoRecuperado != null) {
            hospitalizeDAO.delete(internamentoRecuperado);
            System.out.println("Internação deletada.");
        }*/

    }
}
