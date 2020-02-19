package com.projekt.pakowanie.pakowanie.services;

import com.projekt.pakowanie.pakowanie.klasy.BoxMaterial;
import com.projekt.pakowanie.pakowanie.repository.BoxMatrialRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


        @Service
        @Transactional
        public class BoxMaaterialServiceImpl  implements BoxMaaterialService {
            private BoxMatrialRepository boxMaterialRepository;


            public BoxMaaterialServiceImpl(BoxMatrialRepository boxMaterialRepository) {

                this.boxMaterialRepository = boxMaterialRepository;
            }

            @Override
            public String createBoxMatrial(String nazwa, BoxMaterial rodzaj) {
            BoxMaterial boxmaterial=new BoxMaterial(nazwa, rodzaj);
        boxMaterialRepository.save(boxmaterial);
                return boxmaterial.getNazwaProjektu();
            }

            @Override
            public void remoteBoxMaterial(Long id) {boxMaterialRepository.deleteById(id);

            }
        }

