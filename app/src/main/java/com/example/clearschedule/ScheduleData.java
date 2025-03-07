package com.example.clearschedule;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

/**
 * 予定データクラス（Room）
 */
@Entity(tableName = "account_data") //テーブル名を定義
public class ScheduleData {
    @PrimaryKey(autoGenerate = true)
    public long id;           //「id」カラムを定義
    public String title;   //「タイトル」カラムを定義
    public int color;        //「色// 」カラムを定義
    public int date;        //「日付」カラムを定義
    public int label; //「ラベル」カラムを定義

    /**
     * コンストラクタ
     * @param title タイトル
     * @param color   色
     * @param date    日付
     * @param label   ラベル
     */
    public ScheduleData(String title, int color, int date, int label) {
        this.title = title;  //「タイトル」を設定
        this.color = color;      //「色」を設定
        this.date = date;        //「日付」を設定
        this.label = label; //「ラベル」を設定
    }

    /**
     * 「id」を取得（Getter）
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * 「タイトル」を取得（Getter）
     * @return タイトル
     */
    public String getTitle() {
        return title;
    }

    /**
     * 「価格」を取得（Getter）
     * @return
     */
    public int getColor() {
        return color;
    }

    /**
     *　「日付」を取得（Getter）
     * @return
     */
    public int getDate() {
        return date;
    }

    /**
     *  「ラベル」を取得（Getter）
     * @return
     */

    public int getLabel() {
        return label;
    }

    /**
     * 「予定データ」を更新
     * @param title 更新する「タイトル」
     * @param color   更新する「色」
     * @param date    更新する「日付」
     * @param label 更新する「ラベル」
     * @return 更新した「予定データ」
     */
    public ScheduleData update(String title, int color, int date, int label){
        this.title = title;  //「タイトル」を設定
        this.color = color;      //「色」を設定
        this.date = date;        //「日付」を設定
        this.label = label; //「ラベル」を設定
        return this;
    }
} /*idの型をlong型に、dateの型をDate型にした。
　　問題が出てくれば元に戻す*/