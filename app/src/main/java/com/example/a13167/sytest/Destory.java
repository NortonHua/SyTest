package com.example.a13167.sytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13167 on 2019/10/4.
 */

public class Destory {
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
