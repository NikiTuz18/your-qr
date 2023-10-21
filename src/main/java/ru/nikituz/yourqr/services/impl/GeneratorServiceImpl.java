package ru.nikituz.yourqr.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nikituz.yourqr.qrgenerator.QRCodeGenerator;
import ru.nikituz.yourqr.services.GeneratorService;

import java.util.Base64;

@Service
@RequiredArgsConstructor
public class GeneratorServiceImpl implements GeneratorService {

    private final QRCodeGenerator qrCodeGenerator;
    @Override
    public String generateQR(String url) {
        return Base64.getEncoder().encodeToString(qrCodeGenerator.generate(url, 150, 150, "png"));
    }
}
