package com.bakare.handsjava.services;

import com.bakare.handsjava.entities.Fee;
import com.bakare.handsjava.repositories.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeService {
    @Autowired
    private FeeRepository feeRepository;

    public List<Fee> getAllFees() {
        return feeRepository.findAll();
    }

    public Fee getFeeById(Long id) {
        return feeRepository.findById(id).orElse(null);
    }

    public Fee saveFee(Fee fee) {
        return feeRepository.save(fee);
    }

    public void deleteFee(Long id) {
        feeRepository.deleteById(id);
    }
}