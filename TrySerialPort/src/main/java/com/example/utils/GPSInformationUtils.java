package com.example.utils;

import com.example.pojo.GPSInformation;

public class GPSInformationUtils {

    public static GPSInformation formInfo(GPSInformation gpsInformation, String string){
        //GPSInformation gpsInformation = new GPSInformation();

        double lati_cent_tmp;
        double lati_second_tmp;
        double long_cent_tmp;
        double long_second_tmp;
        double speed_tmp;

        //得到数组
        String[] strings = string.split(",");

        //获取定位状态，将string转为char
        gpsInformation.setLocation_status(strings[2].charAt(0));

        //纬度
        gpsInformation.setLatitude(Double.parseDouble(strings[3].toString()));

        //纬度的度
        gpsInformation.setLatitudeDegree((int) (gpsInformation.getLatitude()/100.0));

        //纬度的分
        //double temp = gpsInformation.getLatitude() * 100.0;
        lati_cent_tmp = (gpsInformation.getLatitude() - gpsInformation.getLatitudeDegree()* 100.0);
        gpsInformation.setLatitudeCent((int)lati_cent_tmp);

        //纬度的秒
        lati_second_tmp = (lati_cent_tmp - gpsInformation.getLatitudeCent()) * 60.0;
        gpsInformation.setLatitudeSecond((int)lati_second_tmp);

        //得到精确的纬度
        gpsInformation.setLat(gpsInformation.getLatitudeDegree() + (gpsInformation.getLatitudeCent() + gpsInformation.getLatitudeSecond()/60.0) / 60.0);

        //经度
        gpsInformation.setLongitude(Double.parseDouble(strings[5].toString()));

        //经度的度
        gpsInformation.setLongitudeDegree((int) (gpsInformation.getLongitude()/100.0));

        //经度的分
        //double temp = gpsInformation.getLatitude() * 100.0;
        long_cent_tmp = (gpsInformation.getLongitude() - gpsInformation.getLongitudeDegree()* 100.0);
        gpsInformation.setLongitudeCent((int)long_cent_tmp);

        //经度的秒
        long_second_tmp = (long_cent_tmp - gpsInformation.getLongitudeCent()) * 60.0;
        gpsInformation.setLatitudeSecond((int)long_second_tmp);

        //得到精确的纬度
        gpsInformation.setLng(gpsInformation.getLongitudeDegree() + (gpsInformation.getLongitudeCent() + gpsInformation.getLongitudeSecond()/60.0) / 60.0);

        //速度(单位：海里/时)
        speed_tmp = Double.parseDouble(strings[7]);

        //1海里=1.85公里
        gpsInformation.setSpeed(speed_tmp * 1.852);

        //方向
        gpsInformation.setDirection(Double.parseDouble(strings[8]));

        return gpsInformation;

    }
}
