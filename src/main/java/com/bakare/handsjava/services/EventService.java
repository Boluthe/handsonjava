package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Admin;
import com.bakare.handsjava.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
        @Autowired
        private AdminRepository adminRepository;

        public List<Admin> getAllAdmins() {
            return adminRepository.findAll();
        }

        public Admin getAdminById(Long id) {
            return adminRepository.findById(id).orElse(null);
        }

        public Admin saveAdmin(Admin admin) {
            return adminRepository.save(admin);
        }

        public void deleteAdmin(Long id) {
            adminRepository.deleteById(id);
        }
}
