/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.trolleyesSBserver.service;

import net.ausiasmarch.trolleyesSBserver.entity.ProductoEntity;
import net.ausiasmarch.trolleyesSBserver.entity.TipoproductoEntity;
import net.ausiasmarch.trolleyesSBserver.helper.RandomHelper;
import net.ausiasmarch.trolleyesSBserver.repository.ProductoRepository;
import net.ausiasmarch.trolleyesSBserver.repository.TipoproductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FillService {

    @Autowired
    TipoproductoRepository oTipoproductoRepository;

    @Autowired
    ProductoRepository oProductoRepository;

    public int tipoproductoFill() {

        TipoproductoEntity oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Limpieza");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Herramienta");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Moda");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Electrónica");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Accesorios");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Juguete");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Alimentación");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Automóvil");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Deporte");
        oTipoproductoRepository.save(oTipoproductoEntity);

        oTipoproductoEntity = new TipoproductoEntity();
        oTipoproductoEntity.setNombre("Hogar");
        oTipoproductoRepository.save(oTipoproductoEntity);

        return 10;

    }

    public void productoFill(Long cantidad) {

        
        for (int i = 1; i <= cantidad; i++) {
            ProductoEntity oProductoEntity = new ProductoEntity();
            oProductoEntity.setCodigo(RandomHelper.getRandomHexString(RandomHelper.getRandomInt(5, 10)).toUpperCase());
            oProductoEntity.setDescuento(RandomHelper.getRandomInt(0, 3));
            oProductoEntity.setExistencias(RandomHelper.getRandomInt(0, 1000));

            String nombre = "";

            switch (RandomHelper.getRandomInt(1, 8)) {
                case 1:
                    nombre = "Producto para ";
                    break;
                case 2:
                    nombre = "Accesorio de ";
                    break;
                case 3:
                    nombre = "Herramienta de ";
                    break;
                case 4:
                    nombre = "Útil para ";
                    break;
                case 5:
                    nombre = "Aperaje para ";
                    break;
                case 6:
                    nombre = "Instrumento de ";
                    break;
                case 7:
                    nombre = "Complemento de ";
                    break;
                case 8:
                    nombre = "Recambio de ";
                    break;
            }
            switch (RandomHelper.getRandomInt(1, 7)) {
                case 1:
                    nombre += "limpieza de ";
                    break;
                case 2:
                    nombre += "reaparación de  ";
                    break;
                case 3:
                    nombre += "mecanizado de ";
                    break;
                case 4:
                    nombre += "medida de ";
                    break;
                case 5:
                    nombre += "expansión de ";
                    break;
                case 6:
                    nombre += "ayuda de ";
                    break;
                case 7:
                    nombre += "instalación de ";
                    break;
            }
            switch (RandomHelper.getRandomInt(1, 7)) {
                case 1:
                    nombre += "animales domésticos";
                    break;
                case 2:
                    nombre += "juguetes";
                    break;
                case 3:
                    nombre += "niños de preescolar";
                    break;
                case 4:
                    nombre += "maquillaje";
                    break;
                case 5:
                    nombre += "automóviles";
                    break;
                case 6:
                    nombre += "ascensores";
                    break;
                case 7:
                    nombre += "libros";
                    break;
            }

            oProductoEntity.setNombre(nombre);
            oProductoEntity.setId_tipoproducto(Long.valueOf(RandomHelper.getRandomInt(1, 10))); //del 1 al 10
            oProductoEntity.setImagen("no-product-image.png");
            oProductoEntity.setPrecio(RandomHelper.getRadomDouble(1, 3000));
            oProductoRepository.save(oProductoEntity);
        }
        
    }

}
