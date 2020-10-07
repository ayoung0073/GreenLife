package com.moonayoung.greenlife.api;

import android.graphics.Bitmap;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {
    public static final String URL = "";

    @POST("/auth/login") // 로그인
    Call<String> postLogin(@FieldMap HashMap<String,String> param);

    @POST("/auth/signup") // 회원가입
    Call<String> postSignup(@FieldMap HashMap<String,String> param);

    // 여러개 객체 응답?
    @GET("/challenges") // 챌린지목록(추천챌린지포함)
    Call<List<Challenge>> getChallenges();

    @GET("/challenge/{challengeId}") // 챌린지상세
    Call<List<SubChallenge>> getChallenges(@Path("challengedId") String challengeId);

    @PUT("/challenge") // 요청 바디로(참여버튼) -> 해당챌린지Id 보냄
    Call<Challenge> putData(@Body Challenge param);

    @POST("/photo") // 사진업로드 // 아직 사진객체 ?
    Call<String> postPhoto(@Body Bitmap param);

    @GET("/feed") // feed 확인
    Call<Feed> getFeed();

    @GET("/rank") // 명예의 전당
    Call<Rank> getRank();


}