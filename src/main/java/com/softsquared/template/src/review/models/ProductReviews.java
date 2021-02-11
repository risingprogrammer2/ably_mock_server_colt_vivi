package com.softsquared.template.src.review.models;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ProductReviews {

    private ReviewSummary reviewSummary;
    private List<ReviewInfo> reviewInfos;
}
