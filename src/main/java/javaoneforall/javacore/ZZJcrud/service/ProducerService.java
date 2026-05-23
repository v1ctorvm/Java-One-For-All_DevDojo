package javaoneforall.javacore.ZZJcrud.service;

import javaoneforall.javacore.ZZJcrud.domain.Producer;
import javaoneforall.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op){
        switch (op){
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();


        }
    }

    private static void findByName() {
        System.out.print("Type the name or empty to list all: ");
        List<Producer> producers = ProducerRepository.findByName(SCANNER.nextLine());

        producers.forEach(p-> System.out.printf("[%d] - %s%n", p.getId(),p.getName()));
    }

    private static void delete(){
        System.out.println("Type the id of producer you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());

        System.out.println("Are you sure [Y/N]: ");
        String choice = SCANNER.nextLine();

        if ("y".equalsIgnoreCase(choice)){
            ProducerRepository.delete(id);
        }
    }

    private static void save(){
        System.out.println("Type the name of procuder: ");
        String name = SCANNER.nextLine();
        Producer build = Producer.builder().name(name).build();

        ProducerRepository.save(build);
    }

    private static void update(){
        System.out.println("Type the id od the object you want to update: ");
        Optional<Producer> producer = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));

        if (producer.isEmpty()){
            System.out.println("Producer not found");
            return;
        }

        Producer producerFromDataBase = producer.get();
        System.out.println("Producer found " + producerFromDataBase);
        System.out.println("Type the new name or enter to keep the same:");
        String name = SCANNER.nextLine();

        name = name.isEmpty() ? producerFromDataBase.getName() : name;

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDataBase.getId())
                .name(name).build();

        ProducerRepository.update(producerToUpdate);
    }

}
