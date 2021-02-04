package com.softsquared.template.src.advertisement;

import com.softsquared.template.config.BaseException;
import com.softsquared.template.config.BaseResponse;
import com.softsquared.template.config.BaseResponseStatus;
import com.softsquared.template.src.advertisement.model.GetAdRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advertisements")
public class AdvertisementController {

    private final AdvertisementProvider advertisementProvider;

    @Autowired
    public AdvertisementController(AdvertisementProvider advertisementProvider){
        this.advertisementProvider = advertisementProvider;
    }

    //홈 화면에 띄울 광고 가져오기
    @ResponseBody
    @GetMapping("")
    public BaseResponse<List<GetAdRes>> getAds(@RequestParam(required = false) String word){
        List<GetAdRes> getAdResList;
        try{
            getAdResList = advertisementProvider.retrieveAd(word);
            return new BaseResponse<>(BaseResponseStatus.SUCCESS,getAdResList);
        }catch (BaseException e){
            e.printStackTrace();
            return new BaseResponse<>(e.getStatus());
        }
    }
}
