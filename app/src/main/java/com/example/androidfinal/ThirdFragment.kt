package com.example.androidfinal

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://saurav.tech/NewsAPI/")
            .addConverterFactory(GsonConverterFactory.create()).client(client).build()

        val apiService = retrofit.create(ApiService::class.java)

        val apiService = retrofit.create(ApiService::class.java)
        apiService.getNews().enqueue(object : Callback<List<Post>> {
            override fun onFailure(call: Call<List<Post>>, t: Throwable){
                Log.e("Error", t.message!!)
            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                Log.e("Response size: ", response.body()!!.size.toString()+"")
            }
        })


        return view
    }

}