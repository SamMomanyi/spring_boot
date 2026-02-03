package com.sammomanyi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;
    private final AiService aiService;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository, AiService aiService) {
        this.softwareEngineerRepository = softwareEngineerRepository;
        this.aiService = aiService;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        String prompt = """
                Based on the programming techstack %s that %s has given Provide a full learning path for  this person
                """.formatted(softwareEngineer.getTechStack().toString(), softwareEngineer.getName());
        String chatRes = aiService.chat(prompt);
        softwareEngineer.setLearningPathRecommendation(chatRes);
        softwareEngineerRepository.save(softwareEngineer);
    }


    public SoftwareEngineer getSoftwareEngineersById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + "not found"));
    }

    public void deleteSoftwareEngineerById(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }

    public void updateEngineerById(Integer id, SoftwareEngineer softwareEngineer) {
        SoftwareEngineer existingEngineer = softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + "not found "));

        existingEngineer.setName(softwareEngineer.getName());
        existingEngineer.setTechStack(softwareEngineer.getTechStack());
        softwareEngineerRepository.save(existingEngineer);
    }
}
