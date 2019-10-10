package com.demo.rxretro;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.demo.rxretro.network.ApiClient;
import com.demo.rxretro.network.ApiService;
import com.demo.rxretro.network.Detail;
import com.demo.rxretro.network.Example;
import com.demo.rxretro.network.User;
import com.demo.rxretro.network.getmodal;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {

    private ApiService apiService;
    private CompositeDisposable disposable = new CompositeDisposable();

    Button button2;
    final String gg = "" ;
    JSONObject obj_result = null;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiService = ApiClient.getClient(getApplicationContext()).create(ApiService.class);


        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick( View view ) {
                fetchAllNotes();
            }
        });

        ArrayList animals = new ArrayList();
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Elephant");
        Observable.just(animals)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new Observer<ArrayList>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                    @Override
                    public void onNext(ArrayList arrayList) {
                        //handling the result
//                        adapter.updateList(animals);
//                        adapter.notifyDataSetChanged();
                    }
                    @Override
                    public void onError(Throwable e) {
                        //error handling made simple
                    }
                    @Override
                    public void onComplete() {
                        //cleaning up tasks
                    }
                });
    }

    private void fetchAllNotes() {

//        Observable.fromCallable(() -> {
//              api_GetCode();
//
//            return false;
//        })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe((result) -> {
//                    //Use result for something
//                    Log.e("res_getntct22: ",obj_result+"");
//                });
        disposable.add(
                apiService.getCountryList()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(new DisposableSingleObserver<getmodal>() {
                            @Override
                            public void onSuccess(getmodal notes) {

                                Log.e("res: ",notes.getStatus()+"");
                            }


                            @Override
                            public void onError(Throwable e) {
                                Log.e("res2: ",e+"");
                            }
                        })
        );
    }

    /***Get Code***/
    private JSONObject api_GetCode(){

        AndroidNetworking.enableLogging();
        AndroidNetworking.get("http://ip-api.com/json")
                .setTag("msg")
                .setPriority(Priority.HIGH).doNotCacheResponse()
                .build()
                .getAsJSONObject(new JSONObjectRequestListener() {
                    @Override
                    public void onResponse(JSONObject result) {
//                        Log.e("res_getntct: ",result+"");
                        obj_result = result;
                        try{
                            String code = result.getString("countryCode");
                            if(code!=null){
                                if(!code.equalsIgnoreCase("")){
                                    Log.e("res_getntct: ",obj_result+"");
                                }
                            }
                        }catch (Exception e){}

                    }
                    @Override
                    public void onError(ANError error) {
                        Log.e("", "---> On error  ");
                        obj_result = null;
                    }
                });
        return obj_result;
    }

}
