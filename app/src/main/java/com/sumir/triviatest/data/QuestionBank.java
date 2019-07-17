package com.sumir.triviatest.data;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.sumir.triviatest.controller.AppController;
import com.sumir.triviatest.model.Question;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;



public class QuestionBank {
    private ArrayList<Question> questionArrayList =new ArrayList<>();
    private String url="https://raw.githubusercontent.com/curiousily/simple-quiz/master/script/statements-data.json";


    public List<Question> getQuestions(){

        JsonArrayRequest jsonArrayRequest= new JsonArrayRequest(Request.Method.GET,
                url,
                (JSONArray) null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        //Question question = new Question();


                        for (int i=0; i<response.length(); i++){
                            try {

                                //question.setAnswers(response.getJSONArray(i).get(0).toString());
                                //question.setAnsTrue(response.getJSONArray(i).getBoolean(1));

                                //add to ArrayList
                                //questionArrayList.add(question);
                                JSONArray ques = response.getJSONArray(i);
                                //Log.d("JSON", "onResponse: "+ question);

                                Log.d("hello", "onResponse: "+ response);


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }



                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        AppController.getInstance().addToRequestQueue(jsonArrayRequest);

        return null;


    }
}
