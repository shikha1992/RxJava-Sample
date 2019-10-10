package com.demo.rxretro.network;


import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;


/**
 * Created by Admin on 9/2/2019.
 */

public interface ApiService {
    // Register new user
    @FormUrlEncoded
    @POST("notes/user/register")
    Single<User> register( @Field("device_id") String deviceId);

    // Create note
    @FormUrlEncoded
    @POST("notes/new")
    Single<Detail> createNote( @Field("note") String note);

    // Fetch all notes
    @POST("login")
    Single<Detail> fetchAllNotes( @Query("phone_number")String phone_number, @Query ("device_token")String device_token,
                                  @Query ("device_type")String device_type);

    // Update single note
    @FormUrlEncoded
    @PUT("notes/{id}")
    Completable updateNote( @Path("id") int noteId, @Field("note") String note);

    // Delete note
    @DELETE("notes/{id}")
    Completable deleteNote(@Path("id") int noteId);

    @GET("http://ip-api.com/json")
    Single<List<Example>> fetchAllNotes();

    @POST("gift_extra")
    Single<getmodal> getCountryList();
}
