package com.softsquared.template.src.product.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@AllArgsConstructor
@Getter
public class ProductMainInfos {

    private ProductMainInfo productInfo;
    private List<String> thumbnails;

}
